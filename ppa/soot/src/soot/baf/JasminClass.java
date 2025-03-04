/* Soot - a J*va Optimization Framework
 * Copyright (C) 1999 Patrick Lam, Patrick Pominville and Raja Vallee-Rai
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

/*
 * Modified by the Sable Research Group and others 1997-1999.  
 * See the 'credits' file distributed with Soot for the complete list of
 * contributors.  (Soot is distributed at http://www.sable.mcgill.ca/soot)
 */





package soot.baf;
import soot.options.*;
import soot.tagkit.*;
import soot.*;
import soot.jimple.*;
import soot.toolkits.graph.*;
import soot.util.*;
import java.util.*;
import java.io.*;

public class JasminClass extends AbstractJasminClass
{
    
    public JasminClass(SootClass sootClass)
    {
        super(sootClass);
    }

    protected void assignColorsToLocals(Body body)
    {
        super.assignColorsToLocals(body);
        
        if(Options.v().time())
            Timers.v().packTimer.end();
                    
    }

    protected void emitMethodBody(SootMethod method)
    {
        if(Options.v().time())
            Timers.v().buildJasminTimer.end();
        
        Body activeBody = method.getActiveBody();
        
        if(!(activeBody instanceof BafBody))
            throw new RuntimeException("method: " + method.getName() + " has an invalid active body!");
        
        BafBody body = (BafBody) activeBody;
        
        if(body == null)
            throw new RuntimeException("method: " + method.getName() + " has no active body!");
            
        if(Options.v().time())
            Timers.v().buildJasminTimer.start();
        
        Chain instList = body.getUnits();

        int stackLimitIndex = -1;
        

        subroutineToReturnAddressSlot = new HashMap(10, 0.7f);

        // Determine the unitToLabel map
        {
            Iterator boxIt = body.getUnitBoxes(true).iterator();

            unitToLabel = new HashMap(instList.size() * 2 + 1, 0.7f);
            labelCount = 0;

            while(boxIt.hasNext())
            {
                // Assign a label for each statement reference
                {
                    InstBox box = (InstBox) boxIt.next();

                    if(!unitToLabel.containsKey(box.getUnit()))
                        unitToLabel.put(box.getUnit(), "label" + labelCount++);
                }
            }
        }




        // Emit the exceptions, recording the Units at the beginning
	// of handlers so that later on we can recognize blocks that 
	// begin with an exception on the stack.
	Set handlerUnits = new ArraySet(body.getTraps().size());
        {
            Iterator trapIt = body.getTraps().iterator();

            while(trapIt.hasNext())
            {
                Trap trap = (Trap) trapIt.next();

		handlerUnits.add(trap.getHandlerUnit());
                if(trap.getBeginUnit() != trap.getEndUnit()) {
                    emit(".catch " + slashify(trap.getException().getName()) + " from " +
                        unitToLabel.get(trap.getBeginUnit()) + " to " + unitToLabel.get(trap.getEndUnit()) +
                        " using " + unitToLabel.get(trap.getHandlerUnit()));
		}
            }
        }

        // Determine where the locals go
        {
            int localCount = 0;
            int[] paramSlots = new int[method.getParameterCount()];
            int thisSlot = 0;
            Set assignedLocals = new HashSet();
            Map groupColorPairToSlot = new HashMap(body.getLocalCount() * 2 + 1, 0.7f);
            
            localToSlot = new HashMap(body.getLocalCount() * 2 + 1, 0.7f);

            //assignColorsToLocals(body);
            
            // Determine slots for 'this' and parameters
            {
                List paramTypes = method.getParameterTypes();

                if(!method.isStatic())
                {
                    thisSlot = 0;
                    localCount++;
                }

                for(int i = 0; i < paramTypes.size(); i++)
                {
                    paramSlots[i] = localCount;
                    localCount += sizeOfType((Type) paramTypes.get(i));
                }
            }

            // Handle identity statements
            {
                Iterator instIt = instList.iterator();

                while(instIt.hasNext())
                {
                    Inst s = (Inst) instIt.next();

                    if(s instanceof IdentityInst && ((IdentityInst) s).getLeftOp() instanceof Local)
                    {
                        Local l = (Local) ((IdentityInst) s).getLeftOp();
                        IdentityRef identity = (IdentityRef) ((IdentityInst) s).getRightOp();

                        int slot = 0;
                                                
                        if(identity instanceof ThisRef)
                        {
                            if(method.isStatic())
                                throw new RuntimeException("Attempting to use 'this' in static method");

                            slot = thisSlot;
                        }
                        else if(identity instanceof ParameterRef)
                            slot = paramSlots[((ParameterRef) identity).getIndex()];
                        else {
                            // Exception ref.  Skip over this
                            continue;
                        }
                        
                        localToSlot.put(l, new Integer(slot));
                        assignedLocals.add(l);
                        
                    }
                }
            }

            // Assign the rest of the locals
            {
                Iterator localIt = body.getLocals().iterator();

                while(localIt.hasNext())
                {
                    Local local = (Local) localIt.next();

                    if(!assignedLocals.contains(local))
                    {
                        localToSlot.put(local, new Integer(localCount));
                        localCount += sizeOfType((Type)local.getType());
                        assignedLocals.add(local);
                    }
                }

                if (!Modifier.isNative(method.getModifiers())
                    && !Modifier.isAbstract(method.getModifiers()))
                  {
                    emit("    .limit stack ?");
                    stackLimitIndex = code.size() - 1;
                    
                    emit("    .limit locals " + localCount);
                  }
            }
        }

        // Emit code in one pass
        {
            Iterator codeIt = instList.iterator();

            isEmittingMethodCode = true;
            maxStackHeight = 0; 
            isNextGotoAJsr = false;

            while(codeIt.hasNext())
            {
                Inst s = (Inst) codeIt.next();

                if(unitToLabel.containsKey(s))
                    emit(unitToLabel.get(s) + ":");

                // emit this statement
                {
                    emitInst(s);
                }
            }

            isEmittingMethodCode = false;
            
            // calculate max stack height
            {
                maxStackHeight = 0;
                if(activeBody.getUnits().size() !=  0 ) {
                    BlockGraph blockGraph = new BriefBlockGraph(activeBody);

                
                    List blocks = blockGraph.getBlocks();
                

                    if(blocks.size() != 0) {
                        // set the stack height of the entry points
                        List entryPoints = ((DirectedGraph)blockGraph).getHeads();                
                        Iterator entryIt = entryPoints.iterator();
                        while(entryIt.hasNext()) {
                            Block entryBlock = (Block) entryIt.next();
                            Integer initialHeight;
                            if(handlerUnits.contains(entryBlock.getHead())) {
                                initialHeight = new Integer(1);
                            } else {
                                initialHeight = new Integer(0);
                            }                                                
                            if (blockToStackHeight == null){
                                blockToStackHeight = new HashMap();
                            }
                            blockToStackHeight.put(entryBlock, initialHeight);
                            if (blockToLogicalStackHeight == null){
                                blockToLogicalStackHeight = new HashMap();
                            }
                            blockToLogicalStackHeight.put(entryBlock, initialHeight); 
                        }                
                                    
                        // dfs the block graph using the blocks in the entryPoints list  as roots 
                        entryIt = entryPoints.iterator();
                        while(entryIt.hasNext()) {
                            Block nextBlock = (Block) entryIt.next();
                            calculateStackHeight(nextBlock);
                            calculateLogicalStackHeightCheck(nextBlock);
                        }                
                    }
                }
            }
            if (!Modifier.isNative(method.getModifiers())
                && !Modifier.isAbstract(method.getModifiers()))
                code.set(stackLimitIndex, "    .limit stack " + maxStackHeight);
        }

	// emit code attributes
	{
	    Iterator it =  body.getTags().iterator();
	    while(it.hasNext()) {
		Tag t = (Tag) it.next();
		if(t instanceof JasminAttribute) {
		    emit(".code_attribute " + t.getName() +" \"" + ((JasminAttribute) t).getJasminValue(unitToLabel) +"\"");
		}		
	    }
	}
    }


    void emitInst(Inst inst)
    {
        inst.apply(new InstSwitch()
        {
            public void caseReturnVoidInst(ReturnVoidInst i)
            {
                emit("return");
            }

            public void caseReturnInst(ReturnInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid return type " + t.toString());
                     }

                     public void caseDoubleType(DoubleType t)
                     {
                        emit("dreturn");
                     }

                     public void caseFloatType(FloatType t)
                     {
                        emit("freturn");
                     }

                     public void caseIntType(IntType t)
                     {
                        emit("ireturn");
                     }

                     public void caseByteType(ByteType t)
                     {
                        emit("ireturn");
                     }

                     public void caseShortType(ShortType t)
                     {
                        emit("ireturn");
                     }

                     public void caseCharType(CharType t)
                     {
                        emit("ireturn");
                     }

                     public void caseBooleanType(BooleanType t)
                     {
                        emit("ireturn");
                     }

                     public void caseLongType(LongType t)
                     {
                        emit("lreturn");
                     }

                     public void caseArrayType(ArrayType t)
                     {
                        emit("areturn");
                     }

                     public void caseRefType(RefType t)
                     {
                        emit("areturn");
                     }

                     public void caseNullType(NullType t)
                     {
                        emit("areturn");
                     }

                });
            }

            public void caseNopInst(NopInst i) { emit ("nop"); }

            public void caseEnterMonitorInst(EnterMonitorInst i) 
            { 
                emit ("monitorenter"); 
            }
            
            public void casePopInst(PopInst i) 
                {
                    if(i.getWordCount() == 2) {
                        emit("pop2");
                    }
                    else
                        emit("pop");
                }
                    

            public void caseExitMonitorInst(ExitMonitorInst i) 
            { 
                emit ("monitorexit"); 
            }

            public void caseGotoInst(GotoInst i)
            { 
                emit("goto " + unitToLabel.get(i.getTarget()));
            }

            public void casePushInst(PushInst i)
            {
                if (i.getConstant() instanceof IntConstant)
                {
                    IntConstant v = (IntConstant)(i.getConstant());
                    if(v.value == -1)
                        emit("iconst_m1");
                    else if(v.value >= 0 && v.value <= 5)
                        emit("iconst_" + v.value);
                    else if(v.value >= Byte.MIN_VALUE && 
                            v.value <= Byte.MAX_VALUE)
                        emit("bipush " + v.value);
                    else if(v.value >= Short.MIN_VALUE && 
                            v.value <= Short.MAX_VALUE)
                        emit("sipush " + v.value);
                    else
                        emit("ldc " + v.toString());
                }
                else if (i.getConstant() instanceof StringConstant)
                {
                    emit("ldc " + i.getConstant().toString());
                }
                else if (i.getConstant() instanceof ClassConstant)
                {
                    emit("ldc_w " + ((ClassConstant)i.getConstant()).getValue());
                }
                else if (i.getConstant() instanceof DoubleConstant)
                {
                    DoubleConstant v = (DoubleConstant)(i.getConstant());

                    if((v.value == 0) && ((1.0/v.value) > 0.0))
                        emit("dconst_0");
                    else if(v.value == 1)
                        emit("dconst_1");
                    else {
                        String s = v.toString();
                        
                        if(s.equals("#Infinity"))
                            s="+DoubleInfinity";
                        
                        if(s.equals("#-Infinity"))
                            s="-DoubleInfinity";
                        
                        if(s.equals("#NaN"))
                            s="+DoubleNaN";
                        
                        emit("ldc2_w " + s);
                    }
                }
                else if (i.getConstant() instanceof FloatConstant)
                {
                    FloatConstant v = (FloatConstant)(i.getConstant());
                    if((v.value == 0) && ((1.0f/v.value) > 1.0f))
                        emit("fconst_0");
                    else if(v.value == 1)
                        emit("fconst_1");
                    else if(v.value == 2)
                        emit("fconst_2");
                    else {
                        String s = v.toString();
                        
                        if(s.equals("#InfinityF"))
                            s="+FloatInfinity";
                        if(s.equals("#-InfinityF"))
                            s="-FloatInfinity";
                        
                        if(s.equals("#NaNF"))
                            s="+FloatNaN";
                        
                        emit("ldc " + s);
                    }
                }
                else if (i.getConstant() instanceof LongConstant)
                {
                    LongConstant v = (LongConstant)(i.getConstant());
                    if(v.value == 0)
                        emit("lconst_0");
                    else if(v.value == 1)
                        emit("lconst_1");
                    else
                        emit("ldc2_w " + v.toString());
                }
                else if (i.getConstant() instanceof NullConstant)
                    emit("aconst_null");
                else
                    throw new RuntimeException("unsupported opcode");
            }

            public void caseIdentityInst(IdentityInst i)
            {
                if(i.getRightOp() instanceof CaughtExceptionRef &&
                    i.getLeftOp() instanceof Local)
                {
                    int slot = ((Integer) localToSlot.get(i.getLeftOp())).intValue();

                    if(slot >= 0 && slot <= 3)
                        emit("astore_" + slot);
                    else
                        emit("astore " + slot);
                }
            }

            public void caseStoreInst(StoreInst i)
            {
                    final int slot = 
                        ((Integer) localToSlot.get(i.getLocal())).intValue();

                    i.getOpType().apply(new TypeSwitch()
                    {
                        public void caseArrayType(ArrayType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("astore_" + slot);
                            else
                                emit("astore " + slot);
                        }

                        public void caseDoubleType(DoubleType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("dstore_" + slot);
                            else
                                emit("dstore " + slot);
                        }

                        public void caseFloatType(FloatType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("fstore_" + slot);
                            else
                                emit("fstore " + slot);
                        }

                        public void caseIntType(IntType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("istore_" + slot);
                            else
                                emit("istore " + slot);
                        }

			public void caseByteType(ByteType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("istore_" + slot);
                            else
                                emit("istore " + slot);
                        }

			public void caseShortType(ShortType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("istore_" + slot);
                            else
                                emit("istore " + slot);
                        }

			public void caseCharType(CharType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("istore_" + slot);
                            else
                                emit("istore " + slot);
                        }

			public void caseBooleanType(BooleanType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("istore_" + slot);
                            else
                                emit("istore " + slot);
                        }

                        public void caseLongType(LongType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("lstore_" + slot);
                            else
                                emit("lstore " + slot);
                        }

                        public void caseRefType(RefType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("astore_" + slot);
                            else
                                emit("astore " + slot);
                        }

                        public void caseStmtAddressType(StmtAddressType t)
                        {
                            isNextGotoAJsr = true;
                            returnAddressSlot = slot;

                                /*
                                  if ( slot >= 0 && slot <= 3)
                                  emit("astore_" + slot,  );
                                  else
                                  emit("astore " + slot,  );

                                */
                        }

                        public void caseNullType(NullType t)
                        {
                            if(slot >= 0 && slot <= 3)
                                emit("astore_" + slot);
                            else
                                emit("astore " + slot);
                        }
                        
                        public void defaultCase(Type t)
                        {
                            throw new RuntimeException("Invalid local type:" 
                                                       + t);
                        }
                    });
            }

            public void caseLoadInst(LoadInst i)
            {
                final int slot = 
                    ((Integer) localToSlot.get(i.getLocal())).intValue();

                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseArrayType(ArrayType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("aload_" + slot);
                        else
                            emit("aload " + slot);
                    }
            
                    public void defaultCase(Type t)
                    {
                        throw new 
                            RuntimeException("invalid local type to load" + t);
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("dload_" + slot);
                        else
                            emit("dload " + slot);
                    }

                    public void caseFloatType(FloatType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("fload_" + slot);
                        else
                            emit("fload " + slot);
                    }
            
                    public void caseIntType(IntType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("iload_" + slot);
                        else
                            emit("iload " + slot);
                    }

		    public void caseByteType(ByteType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("iload_" + slot);
                        else
                            emit("iload " + slot);
                    }

		    public void caseShortType(ShortType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("iload_" + slot);
                        else
                            emit("iload " + slot);
                    }

		    public void caseCharType(CharType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("iload_" + slot);
                        else
                            emit("iload " + slot);
                    }

		    public void caseBooleanType(BooleanType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("iload_" + slot);
                        else
                            emit("iload " + slot);
                    }

                    public void caseLongType(LongType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("lload_" + slot);
                        else
                            emit("lload " + slot);
                    }

                    public void caseRefType(RefType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("aload_" + slot);
                        else
                            emit("aload " + slot);
                    }

                    public void caseNullType(NullType t)
                    {
                        if(slot >= 0 && slot <= 3)
                            emit("aload_" + slot);
                        else
                            emit("aload " + slot);
                    }
                });
            }

            public void caseArrayWriteInst(ArrayWriteInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseArrayType(ArrayType t)
                    {
                        emit("aastore");
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dastore");
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fastore");
                    }

                    public void caseIntType(IntType t)
                    {
                        emit("iastore");
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lastore");
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("aastore");
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("bastore");
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("bastore");
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("castore");
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("sastore");
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("Invalid type: " + t);
                    }});
                    
                }

            public void caseArrayReadInst(ArrayReadInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseArrayType(ArrayType ty)
                    {
                        emit("aaload");
                    }

                    public void caseBooleanType(BooleanType ty)
                    {
                        emit("baload");
                    }

                    public void caseByteType(ByteType ty)
                    {
                        emit("baload");
                    }

                    public void caseCharType(CharType ty)
                    {
                        emit("caload");
                    }

                    public void defaultCase(Type ty)
                    {
                        throw new RuntimeException("invalid base type");
                    }

                    public void caseDoubleType(DoubleType ty)
                    {
                        emit("daload");
                    }

                    public void caseFloatType(FloatType ty)
                    {
                        emit("faload");
                    }

                    public void caseIntType(IntType ty)
                    {
                        emit("iaload");
                    }

                    public void caseLongType(LongType ty)
                    {
                        emit("laload");
                    }

                    public void caseNullType(NullType ty)
                    {
                        emit("aaload");
                    }
                    public void caseRefType(RefType ty)
                    {
                        emit("aaload");
                    }

                    public void caseShortType(ShortType ty)
                    {
                        emit("saload");
                    }
                });
            }

            public void caseIfNullInst(IfNullInst i)
            {
                emit("ifnull " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfNonNullInst(IfNonNullInst i)
            {
                emit("ifnonnull " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfEqInst(IfEqInst i)
            {
                emit("ifeq " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfNeInst(IfNeInst i)
            {
                emit("ifne " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfGtInst(IfGtInst i)
            {
                emit("ifgt " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfGeInst(IfGeInst i)
            {
                emit("ifge " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfLtInst(IfLtInst i)
            {
                emit("iflt " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfLeInst(IfLeInst i)
            {
                emit("ifle " + unitToLabel.get(i.getTarget()));
            }

            public void caseIfCmpEqInst(final IfCmpEqInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("ifeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("ifeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("ifeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmpeq " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseIfCmpNeInst(final IfCmpNeInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("ifne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("ifne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("ifne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmpne " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseIfCmpGtInst(final IfCmpGtInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("ifgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("ifgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("ifgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmpgt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseIfCmpGeInst(final IfCmpGeInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("ifge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("ifge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("ifge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmpge " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseIfCmpLtInst(final IfCmpLtInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("iflt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("iflt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("iflt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmplt " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseIfCmpLeInst(final IfCmpLeInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    public void caseIntType(IntType t)
                    {
                        emit("if_icmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseBooleanType(BooleanType t)
                    {
                        emit("if_icmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseShortType(ShortType t)
                    {
                        emit("if_icmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseCharType(CharType t)
                    {
                        emit("if_icmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseByteType(ByteType t)
                    {
                        emit("if_icmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("dcmpg");
                        emit("ifle " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseLongType(LongType t)
                    {
                        emit("lcmp");
                        emit("ifle " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("fcmpg");
                        emit("ifle " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseArrayType(ArrayType t)
                    {
                        emit("if_acmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseRefType(RefType t)
                    {
                        emit("if_acmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void caseNullType(NullType t)
                    {
                        emit("if_acmple " + 
                             unitToLabel.get(i.getTarget()));
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("invalid type");
                    }
                });
            }

            public void caseStaticGetInst(StaticGetInst i)
            {
                SootFieldRef field = i.getFieldRef();
                emit("getstatic " + 
                     slashify(field.declaringClass().getName()) + "/" +
                     field.name() + " " + 
                     jasminDescriptorOf(field.type()));
            }

            public void caseStaticPutInst(StaticPutInst i)
            {
                emit("putstatic " + 
                     slashify(i.getFieldRef().declaringClass().getName()) + 
                     "/" + i.getFieldRef().name() + " " + 
                     jasminDescriptorOf(i.getFieldRef().type()));
            }

            public void caseFieldGetInst(FieldGetInst i)
            {
                emit("getfield " + 
                     slashify(i.getFieldRef().declaringClass().getName()) + 
                     "/" + i.getFieldRef().name() + " " + 
                     jasminDescriptorOf(i.getFieldRef().type()));
            }

            public void caseFieldPutInst(FieldPutInst i)
            {
                emit("putfield " + 
                     slashify(i.getFieldRef().declaringClass().getName()) + 
                     "/" + i.getFieldRef().name() + " " + 
                     jasminDescriptorOf(i.getFieldRef().type()));
            }

            public void caseInstanceCastInst(InstanceCastInst i)
            {
                Type castType = i.getCastType();

                if(castType instanceof RefType)
                    emit("checkcast " + slashify(castType.toString()));
                else if(castType instanceof ArrayType)
                    emit("checkcast " + jasminDescriptorOf(castType));
            }

            public void caseInstanceOfInst(InstanceOfInst i)
            {
                Type checkType = i.getCheckType();

                if(checkType instanceof RefType)
                    emit("instanceof " + slashify(checkType.toString()));
                else if(checkType instanceof ArrayType)
                    emit("instanceof " + jasminDescriptorOf(checkType));
            }

            public void caseNewInst(NewInst i)
            {
                emit("new "+slashify(i.getBaseType().toString()));
            }

            public void casePrimitiveCastInst(PrimitiveCastInst i)
            {
                emit(i.toString());
            }

            public void caseStaticInvokeInst(StaticInvokeInst i)
            {
                SootMethodRef m = i.getMethodRef();

                emit("invokestatic " + slashify(m.declaringClass().getName()) + "/" +
                    m.name() + jasminDescriptorOf(m));
            }
            
            public void caseVirtualInvokeInst(VirtualInvokeInst i)
            {
                SootMethodRef m = i.getMethodRef();

                emit("invokevirtual " + slashify(m.declaringClass().getName()) + "/" +
                    m.name() + jasminDescriptorOf(m));
            }

            public void caseInterfaceInvokeInst(InterfaceInvokeInst i)
            {
                SootMethodRef m = i.getMethodRef();

                emit("invokeinterface " + slashify(m.declaringClass().getName()) + "/" +
                    m.name() + jasminDescriptorOf(m) + " " + (argCountOf(m) + 1));
            }

            public void caseSpecialInvokeInst(SpecialInvokeInst i)
            {
                SootMethodRef m = i.getMethodRef();

                emit("invokespecial " + slashify(m.declaringClass().getName()) + "/" +
                    m.name() + jasminDescriptorOf(m));
            }

            public void caseThrowInst(ThrowInst i)
            {
                emit("athrow");
            }

            public void caseCmpInst(CmpInst i)
            {
                emit("lcmp");
            }

            public void caseCmplInst(CmplInst i)
            {
                if(i.getOpType().equals(FloatType.v()))
                    emit("fcmpl");
                else
                    emit("dcmpl");
            }

            public void caseCmpgInst(CmpgInst i)
            {
                if(i.getOpType().equals(FloatType.v()))
                    emit("fcmpg");
                else
                    emit("dcmpg");
            }

            private void emitOpTypeInst(final String s, final OpTypeArgInst i)
            {
                i.getOpType().apply(new TypeSwitch()
                {
                    private void handleIntCase()
                    {
                        emit("i"+s);
                    }

                    public void caseIntType(IntType t) { handleIntCase(); }
                    public void caseBooleanType(BooleanType t) { handleIntCase(); }
                    public void caseShortType(ShortType t) { handleIntCase(); }
                    public void caseCharType(CharType t) { handleIntCase(); }
                    public void caseByteType(ByteType t) { handleIntCase(); }

                    public void caseLongType(LongType t)
                    {
                        emit("l"+s);
                    }

                    public void caseDoubleType(DoubleType t)
                    {
                        emit("d"+s);
                    }

                    public void caseFloatType(FloatType t)
                    {
                        emit("f"+s);
                    }

                    public void defaultCase(Type t)
                    {
                        throw new RuntimeException("Invalid argument type for div");
                    }
                });
            }

            public void caseAddInst(AddInst i)
            {
                emitOpTypeInst("add", i);
            }

            public void caseDivInst(DivInst i)
            {
                emitOpTypeInst("div", i);
            }

            public void caseSubInst(SubInst i)
            {
                emitOpTypeInst("sub", i);
            }

            public void caseMulInst(MulInst i)
            {
                emitOpTypeInst("mul", i);
            }

            public void caseRemInst(RemInst i)
            {
                emitOpTypeInst("rem", i);
            }

            public void caseShlInst(ShlInst i)
            {
                emitOpTypeInst("shl", i);
            }

            public void caseAndInst(AndInst i)
            {
                emitOpTypeInst("and", i);
            }

            public void caseOrInst(OrInst i)
            {
                emitOpTypeInst("or", i);
            }

            public void caseXorInst(XorInst i)
            {
                emitOpTypeInst("xor", i);
            }

            public void caseShrInst(ShrInst i)
            {
                emitOpTypeInst("shr", i);
            }

            public void caseUshrInst(UshrInst i)
            {
                emitOpTypeInst("ushr", i);
            }

            public void caseIncInst(IncInst i)
            {
                if(((ValueBox) i.getUseBoxes().get(0)).getValue() != ((ValueBox) i.getDefBoxes().get(0)).getValue())
                    throw new RuntimeException("iinc def and use boxes don't match");
                    
                emit("iinc " + ((Integer) localToSlot.get(i.getLocal())) + " " + i.getConstant());
            }

            public void caseArrayLengthInst(ArrayLengthInst i)
            {
                emit("arraylength");
            }

            public void caseNegInst(NegInst i)
            {
                emitOpTypeInst("neg", i);
            }

            public void caseNewArrayInst(NewArrayInst i)
            {
                if(i.getBaseType() instanceof RefType)
                    emit("anewarray " + slashify(i.getBaseType().toString()));
                else if(i.getBaseType() instanceof ArrayType)
                    emit("anewarray " + jasminDescriptorOf(i.getBaseType()));
                else
                    emit("newarray " + i.getBaseType().toString());
            }

            public void caseNewMultiArrayInst(NewMultiArrayInst i)
            {
                emit("multianewarray " + jasminDescriptorOf(i.getBaseType()) + " " + 
                     i.getDimensionCount());
            }

            public void caseLookupSwitchInst(LookupSwitchInst i)
            {
                emit("lookupswitch");

                List lookupValues = i.getLookupValues();
                List targets = i.getTargets();

                for(int j = 0; j < lookupValues.size(); j++)
                    emit("  " + lookupValues.get(j) + " : " + 
                         unitToLabel.get(targets.get(j)));

                emit("  default : " + unitToLabel.get(i.getDefaultTarget()));
            }

            public void caseTableSwitchInst(TableSwitchInst i)
                {
                emit("tableswitch " + i.getLowIndex() + " ; high = " + i.getHighIndex());

                List targets = i.getTargets();

                for(int j = 0; j < targets.size(); j++)
                    emit("  " + unitToLabel.get(targets.get(j)));

                emit("default : " + unitToLabel.get(i.getDefaultTarget()));
            }

            private boolean isDwordType(Type t)
            {
                return t instanceof LongType || t instanceof DoubleType
                    || t instanceof DoubleWordType;
            }
            
            public void caseDup1Inst(Dup1Inst i)
            {
                Type firstOpType = i.getOp1Type();
                if (isDwordType(firstOpType))
                    emit("dup2"); // (form 2)
                else
                    emit("dup");
            }

            public void caseDup2Inst(Dup2Inst i)
            {
                Type firstOpType = i.getOp1Type();
                Type secondOpType = i.getOp2Type();
                // The first two cases have no real bytecode equivalents.
                // Use a pair of insts to simulate them.
                if(isDwordType(firstOpType)) {
                    emit("dup2"); // (form 2)
                    if(isDwordType(secondOpType)) {
                        emit("dup2"); // (form 2 -- by simulation)
                    } else 
                        emit("dup"); // also a simulation
                } else if(isDwordType(secondOpType)) {
                    if(isDwordType(firstOpType)) {
                        emit("dup2"); // (form 2)
                    } else 
                        emit("dup");
                    emit("dup2"); // (form 2 -- complete the simulation)
                } else {
                    //delme[
                    G.v().out.println("3000:(JasminClass): dup2 created");
                    //delme
                    emit("dup2"); // form 1
                }
            }

            public void caseDup1_x1Inst(Dup1_x1Inst i)
            {
                Type opType = i.getOp1Type();
                Type underType = i.getUnder1Type();
                
                if(isDwordType(opType)) {
                    if(isDwordType(underType)) {
                        emit("dup2_x2"); // (form 4)
                    } else 
                        emit("dup2_x1"); // (form 2)
                } else {
                    if(isDwordType(underType)) 
                        emit("dup_x2");  // (form 2)
                    else 
                        emit("dup_x1");  // (only one form)
                }        
            }

            public void caseDup1_x2Inst(Dup1_x2Inst i)
            {
                Type opType = i.getOp1Type();
                Type under1Type = i.getUnder1Type();
                Type under2Type = i.getUnder2Type();

                if (isDwordType(opType)) {
                    if (!isDwordType(under1Type) && !isDwordType(under2Type))
                        emit("dup2_x2"); // (form 2)
                    else
                        throw new RuntimeException("magic not implemented yet");
                } else {
                    if (isDwordType(under1Type) || isDwordType(under2Type))
                        throw new RuntimeException("magic not implemented yet");
                }

                emit("dup_x2"); // (form 1)
            }

            public void caseDup2_x1Inst(Dup2_x1Inst i)
            {
                Type op1Type = i.getOp1Type();
                Type op2Type = i.getOp2Type();
                Type under1Type = i.getUnder1Type();

                if (isDwordType(under1Type)) {
                    if (!isDwordType(op1Type) && !isDwordType(op2Type))
                        throw new RuntimeException("magic not implemented yet");
                    else
                        emit("dup2_x2"); // (form 3)
                } else {
                    if (isDwordType(op1Type) || isDwordType(op2Type))
                        throw new RuntimeException("magic not implemented yet");
                }

                emit("dup2_x1"); // (form 1)
            }

           

            public void caseDup2_x2Inst(Dup2_x2Inst i)
            {
                Type op1Type = i.getOp1Type();
                Type op2Type = i.getOp2Type();
                Type under1Type = i.getUnder1Type();
                Type under2Type = i.getUnder2Type();

                if (isDwordType(op1Type) || isDwordType(op2Type) || 
                    isDwordType(under1Type) || isDwordType(under1Type))
                    throw new RuntimeException("magic not implemented yet");

                emit("dup2_x2"); // (form 1)
            }

            public void caseSwapInst(SwapInst i)
                {
                    emit("swap");
                }



        });
    }
   


 
    private void calculateStackHeight(Block aBlock)
    {
        Iterator it = aBlock.iterator();
        int blockHeight =  ((Integer)blockToStackHeight.get(aBlock)).intValue();
        if( blockHeight > maxStackHeight) {
            maxStackHeight = blockHeight;
        }
        
        while(it.hasNext()) {
          Inst nInst = (Inst) it.next();
          
          blockHeight -= nInst.getInMachineCount();
	  
          if(blockHeight < 0 ){            
	      throw new RuntimeException("Negative Stack height has been attained: \n" +
                                       "StackHeight: " + blockHeight + "\n" +
                                       "At instruction:" + nInst + "\n" +
                                       "Block:\n" + aBlock +
                                       "\n\nMethod: " + aBlock.getBody().getMethod().getName() 
                                       + "\n" +  aBlock.getBody().getMethod()                                       
                                       );
          }
          
          blockHeight += nInst.getOutMachineCount();
          if( blockHeight > maxStackHeight) {
            maxStackHeight = blockHeight;
          }
          //G.v().out.println(">>> " + nInst + " " + blockHeight);            
        }
        
        
        Iterator succs = aBlock.getSuccs().iterator();
        while(succs.hasNext()) {
            Block b = (Block) succs.next();
            Integer i = (Integer) blockToStackHeight.get(b);
            if(i != null) {
                if(i.intValue() != blockHeight) {
                    throw new RuntimeException("incoherent stack height at block merge point " + b + aBlock + "\ncomputed blockHeight == " + blockHeight + " recorded blockHeight = " + i.intValue());
                }
                
            } else {
                blockToStackHeight.put(b, new Integer(blockHeight));
                calculateStackHeight(b);
            }            
        }        
    }


    private void calculateLogicalStackHeightCheck(Block aBlock)
    {
        Iterator it = aBlock.iterator();
        int blockHeight =  ((Integer)blockToLogicalStackHeight.get(aBlock)).intValue();
        
        while(it.hasNext()) {
            Inst nInst = (Inst) it.next();
          
            blockHeight -= nInst.getInCount();

            if(blockHeight < 0 ){            
                throw new RuntimeException("Negative Stack Logical height has been attained: \n" +
                                           "StackHeight: " + blockHeight + 
                                           "\nAt instruction:" + nInst +
                                           "\nBlock:\n" + aBlock +
                                           "\n\nMethod: " + aBlock.getBody().getMethod().getName() 
                                           + "\n" +  aBlock.getBody().getMethod()                                       
                                           );
            }          

            blockHeight += nInst.getOutCount();
            
            //G.v().out.println(">>> " + nInst + " " + blockHeight);            
        }
        
        
        Iterator succs = aBlock.getSuccs().iterator();
        while(succs.hasNext()) {
            Block b = (Block) succs.next();
            Integer i = (Integer) blockToLogicalStackHeight.get(b);
            if(i != null) {
                if(i.intValue() != blockHeight) {
                    throw new RuntimeException("incoherent logical stack height at block merge point " + b + aBlock);
                }
                
            } else {
                blockToLogicalStackHeight.put(b, new Integer(blockHeight));
                calculateLogicalStackHeightCheck(b);
            }            
        }        
    }










}

class GroupIntPair
{
    Object group;
    int x;
    
    GroupIntPair(Object group, int x)
    {
        this.group = group;
        this.x = x;
    }
    
    public boolean equals(Object other)
    {
        if(other instanceof GroupIntPair)
            return ((GroupIntPair) other).group.equals(this.group) &&
                    ((GroupIntPair) other).x == this.x;
        else
            return false;
    }
    
    public int hashCode()
    {
        return group.hashCode() + 1013 * x;
    }
    
    
}
