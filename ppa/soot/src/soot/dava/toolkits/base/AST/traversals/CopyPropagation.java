/* Soot - a J*va Optimization Framework
 * Copyright (C) 2005 Nomair A. Naeem
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
 * Maintained by Nomair A. Naeem
 */

/*
 * Change log: * November 22nd 2005: Moved this class from structuredAnalysis
 *               package to traversals package. Since this is a traversal not an analysis
 *
 *             * November 23rd 2005. MASSIVE CHANGES
 *                                   Created a Class LocalVariableCleaner which should
 *                                   be run after running copy prop and moved some of the
 *                                   functionality from this class to localVariableCleaner
 */

/*
 * TODO: November 23rd, 2005. What if removeStmt removes a copyStmt and that was the only 
 *       stmt in the stmtSequenceBlock. Shouldnt that block be removed??
 */

package soot.dava.toolkits.base.AST.traversals;

import soot.*;
import java.util.*;
import soot.jimple.*;
import soot.dava.internal.javaRep.*;
import soot.dava.internal.AST.*;
import soot.dava.internal.asg.*;
import soot.dava.toolkits.base.AST.analysis.*;
import soot.dava.toolkits.base.AST.structuredAnalysis.*;

/*
  This analysis uses the results from
      1 ReachingCopies 
      2 uD and dU chains 
  to eliminate extra copies


  ALGORITHM:
  When you encounter a copy stmt (a=b) find all uses of local a (using dU chain)

  if For ALL uses the ReachingCopies set contains copy stmt (a=b)
    Remove Copy Stmt
    Replace use of a with use of b

    Note:
      copy stmts can be encountered in:
        a, ASTStatementSequenceNode
	b, for loop init      -------> dont want to remove this
	c, for loop update   ---------> dont want to remove this

*/

public class CopyPropagation extends DepthFirstAdapter{
    ASTNode AST;
    ASTUsesAndDefs useDefs;
    ReachingCopies reachingCopies;
    ASTParentNodeFinder parentOf;
    
    boolean someCopyStmtModified;

    //need to keep track of whenever we modify the AST
    //this flag is set to true whenever a stmt is removed or a local substituted for another
    boolean ASTMODIFIED;

    public CopyPropagation(ASTNode AST){
	super();
	someCopyStmtModified=false;
	this.AST=AST;
	ASTMODIFIED=false;
	setup();
    }

    public CopyPropagation(boolean verbose,ASTNode AST){
	super(verbose);
	someCopyStmtModified=false;
	this.AST=AST;
	ASTMODIFIED=false;
	setup();
    }



    private void setup(){
	//create the uD and dU chains
	useDefs = new ASTUsesAndDefs(AST);
	AST.apply(useDefs);
	
	//apply the reaching copies Structural flow Analysis
	reachingCopies = new ReachingCopies(AST);

	parentOf = new ASTParentNodeFinder();
	AST.apply(parentOf);
    }


    /*
     * If any copy stmt was removed or any substitution made
     * we might be able to get better results by redoing the analysis
     */
    public void outASTMethodNode(ASTMethodNode node){
	if(ASTMODIFIED){
	    //need to rerun copy prop

	    //before running a structured flow analysis have to do this one
	    AST.apply(ClosestAbruptTargetFinder.v());

	    //System.out.println("\n\n\nCOPY PROP\n\n\n\n");
	
	    CopyPropagation prop1 = new CopyPropagation(AST);
	    AST.apply(prop1);
	}
    }




    public void inASTStatementSequenceNode(ASTStatementSequenceNode node){
	List statements = node.getStatements();
	Iterator it = statements.iterator();
	
	while(it.hasNext()){
	    AugmentedStmt as = (AugmentedStmt)it.next();
	    Stmt s = as.get_Stmt();
	    if(isCopyStmt(s)){
		handleCopyStmt((DefinitionStmt)s);
	    }
	}
    }
    



    public boolean isCopyStmt(Stmt s){
	if(!(s instanceof DefinitionStmt)){
	    //only definition stmts can be copy stmts
	    return false;
	}

	// x = expr;
	//check if expr is a local in which case this is a copy
	Value leftOp = ((DefinitionStmt)s).getLeftOp();
	Value rightOp = ((DefinitionStmt)s).getRightOp();

	if(leftOp instanceof Local && rightOp instanceof Local){
	    //this is a copy statement
	    return true;
	}
	return false;
    }



    /*
     * Given a copy stmt (a=b) find all uses of local a (using dU chain)

     * if For ALL uses the ReachingCopies set contains copy stmt (a=b)
     * Remove Copy Stmt
     * Replace use of a with use of b
    */
    public void handleCopyStmt(DefinitionStmt copyStmt){
	//System.out.println("COPY STMT FOUND-----------------------------------"+copyStmt);

	//get defined local...safe to cast since this is copyStmt
	Local definedLocal = (Local)copyStmt.getLeftOp();

	//get all uses of this local from the dU chain
	Object temp = useDefs.getDUChain(copyStmt);

	ArrayList uses= new ArrayList();
	if(temp != null){
	    uses = (ArrayList)temp;
	}

	//the uses list contains all stmts / nodes which use the definedLocal

	//check if uses is non-empty
	if(uses.size()!=0){
	    
	    //System.out.println(">>>>The defined local:"+definedLocal+" is used in the following");
	    //System.out.println("\n numof uses:"+uses.size()+uses+">>>>>>>>>>>>>>>\n\n");


	    //continuing with copy propagation algorithm
	    
	    //create localPair for copy stmt in question...same to cast as its a copyStmt
	    Local leftLocal = (Local)copyStmt.getLeftOp();
	    Local rightLocal = (Local)copyStmt.getRightOp();

	    ReachingCopies.LocalPair localPair = reachingCopies.new LocalPair(leftLocal,rightLocal);
	    
	    //check for all the non zero uses
	    Iterator useIt = uses.iterator();
	    while(useIt.hasNext()){
		//check that the reaching copies of each use has the copy stmt
		//a use is either a statement or a node(condition, synch, switch , for etc)
		Object tempUse = useIt.next();
		
		DavaFlowSet reaching = reachingCopies.getReachingCopies(tempUse);
		
		if(!reaching.contains(localPair)){
		    //this copy stmt does not reach this use
		    //no copy elimination can be done 
		    return;
		}
	    }

	    //if we get here that means that the copy stmt reached each use
	    
	    //replace each use of a with b
	    useIt = uses.iterator();
	    while(useIt.hasNext()){
		Object tempUse = useIt.next();		
		replace(leftLocal,rightLocal,tempUse);
	    }

	    //remove copy stmt a=b
	    removeStmt(copyStmt);
	   

	    if(someCopyStmtModified){
		//get all the analyses re-set
		setup();
		someCopyStmtModified=false;
	    }
	}
	else{
	    //the copy stmt is usesless since the definedLocal is not being used anywhere after definition
	    //System.out.println("The defined local:"+definedLocal+" is not used anywhere");
	    removeStmt(copyStmt);
	}
    }



    public void removeStmt(Stmt stmt){
	Object tempParent = parentOf.getParentOf(stmt);
	if(tempParent == null){
	    //System.out.println("NO PARENT FOUND CANT DO ANYTHING");
	    return;
	}

	//parents are always ASTNodes, hence safe to cast
	ASTNode parent = (ASTNode)tempParent;

	//REMOVING STMT 
	if(!(parent instanceof ASTStatementSequenceNode)){
	    //parent of a statement should always be a ASTStatementSequenceNode
	    throw new RuntimeException("Found a stmt whose parent is not an ASTStatementSequenceNode");
	}
	ASTStatementSequenceNode parentNode = (ASTStatementSequenceNode)parent;

	ArrayList newSequence = new ArrayList();
	
	Iterator it = parentNode.getStatements().iterator();
	while (it.hasNext()){
	    AugmentedStmt as = (AugmentedStmt)it.next();
	    Stmt s = as.get_Stmt();
	    if(s.toString().compareTo(stmt.toString())!=0){
		//this is not the stmt to be removed
		newSequence.add(as);
	    }
	}
	//System.out.println("STMT REMOVED---------------->"+stmt);
	parentNode.setStatements(newSequence);

	ASTMODIFIED=true;
	return;
    }






    /*
     * If the value inside a useBox is a local with toString giving <from>
     * this is replaced by the local <to>
     */
    public void replaceBoxes(Local from, Local to, List useBoxes){
	Iterator it = useBoxes.iterator();
	while(it.hasNext()){
	    ValueBox valBox =(ValueBox)it.next();
	    Value val = valBox.getValue();
	    if(val instanceof Local){
		Local local = (Local)val;
		if(local.getName().compareTo(from.getName())==0){
		    //replace the name with the one in "to"
		    valBox.setValue(to);
		    ASTMODIFIED=true;
		}
	    }
	}
    }





    /*
     * Method goes depth first into the condition tree and returns a list of use boxes
     */
    public List getUseList(ASTCondition cond){
	if(cond instanceof ASTAggregatedCondition){
	    ArrayList useList = new ArrayList();
	    useList.addAll(getUseList(((ASTAggregatedCondition)cond).getLeftOp()));
	    useList.addAll(getUseList(((ASTAggregatedCondition)cond).getRightOp()));
	    return useList;
	}
	else if(cond instanceof ASTUnaryCondition){
	    //get uses from unary condition
	    Value val = ((ASTUnaryCondition)cond).getValue();
	    return val.getUseBoxes();
	}
	else if(cond instanceof ASTBinaryCondition){
	    //get uses from binaryCondition
	    Value val = ((ASTBinaryCondition)cond).getConditionExpr();
	    return val.getUseBoxes();
	}
	else{
	    throw new RuntimeException("Method getUseList in CopyPropagation encountered unknown condition type");
	}
    }








    /*
     * Invoked by handleCopyStmt to replace the use of local <from>
     * to the use of local <to> in <use>
     *
     * Notice <use> can be a stmt or an ASTNode
     */

    public void replace(Local from, Local to, Object use){
	if(use instanceof Stmt){
	    Stmt s = (Stmt)use;
	    if(isCopyStmt(s)){
		someCopyStmtModified=true;
	    }
	    List useBoxes = s.getUseBoxes();
	    replaceBoxes(from,to,useBoxes);
	}
	else if (use instanceof ASTNode){
	    if (use instanceof ASTSwitchNode){
		ASTSwitchNode temp = (ASTSwitchNode)use;
		Value val = (Value)temp.get_Key();
		if(val instanceof Local){
		    if(((Local)val).getName().compareTo(from.getName())==0){
			//replace the name with the one in "to"
			ASTMODIFIED=true;
			temp.set_Key(to);
		    }
		}
		else{
		    List useBoxes = val.getUseBoxes();
		    replaceBoxes(from,to,useBoxes);
		}
	    }
	    else if (use instanceof ASTSynchronizedBlockNode){
		ASTSynchronizedBlockNode temp = (ASTSynchronizedBlockNode)use;
		Local local = temp.getLocal();
		if(local.getName().compareTo(from.getName())==0){
		    //replace the name with the one in "to"
		    temp.setLocal(to);
		    ASTMODIFIED=true;
		}
	    }
	    else if(use instanceof ASTIfNode){
		ASTIfNode temp = (ASTIfNode)use;
		ASTCondition cond = temp.get_Condition();
		List useBoxes = getUseList(cond);
		replaceBoxes(from,to,useBoxes);
	    }
	    else if (use instanceof ASTIfElseNode){
		ASTIfElseNode temp = (ASTIfElseNode)use;
		ASTCondition cond = temp.get_Condition();
		List useBoxes = getUseList(cond);
		replaceBoxes(from,to,useBoxes);
	    }
	    else if (use instanceof ASTWhileNode){
		ASTWhileNode temp = (ASTWhileNode)use;
		ASTCondition cond = temp.get_Condition();
		List useBoxes = getUseList(cond);
		replaceBoxes(from,to,useBoxes);
	    }
	    else if (use instanceof ASTDoWhileNode){
		ASTDoWhileNode temp = (ASTDoWhileNode)use;
		ASTCondition cond = temp.get_Condition();
		List useBoxes = getUseList(cond);
		replaceBoxes(from,to,useBoxes);
	    }
	    else if (use instanceof ASTForLoopNode){
		ASTForLoopNode temp = (ASTForLoopNode)use;

		//init
		List init = temp.getInit();
		Iterator it = init.iterator();
		while(it.hasNext()){
		    AugmentedStmt as = (AugmentedStmt)it.next();
		    Stmt s = as.get_Stmt();
		    replace(from,to,s);
		}


		//update	
		List update = temp.getUpdate();
		it = update.iterator();
		while(it.hasNext()){
		    AugmentedStmt as = (AugmentedStmt)it.next();
		    Stmt s = as.get_Stmt();
		    replace(from,to,s);
		}


		//condition
		ASTCondition cond = temp.get_Condition();
		List useBoxes = getUseList(cond);
		replaceBoxes(from,to,useBoxes);
	    }
	    else{
		throw new RuntimeException("Encountered an unknown ASTNode in copyPropagation method replace");
	    }
	}
	else{
	    throw new RuntimeException("Encountered an unknown use in copyPropagation method replace");
	}

    }


}