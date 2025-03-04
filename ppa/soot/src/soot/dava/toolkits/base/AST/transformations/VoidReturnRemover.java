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

package soot.dava.toolkits.base.AST.transformations;

import java.util.*;
import soot.*;
import soot.jimple.*;
import soot.dava.*;
import soot.dava.internal.asg.*;
import soot.dava.internal.AST.*;
import soot.dava.toolkits.base.AST.analysis.*;


public class VoidReturnRemover extends DepthFirstAdapter{
    DavaBody davaBody;

    public VoidReturnRemover(DavaBody davaBody){
	this.davaBody=davaBody;
    }

    public VoidReturnRemover(DavaBody davaBody,boolean verbose){
	super(verbose);
	this.davaBody=davaBody;
    }

    public void caseASTMethodNode(ASTMethodNode node){
	
	// check if this is a void method
	SootMethod method = davaBody.getMethod();
	Type type = method.getReturnType();
	if(type instanceof VoidType){
	    // see if there is a stmtseq node in the end

	    List subBodies = node.get_SubBodies();
	    if(subBodies.size()==1){
		List subBody = (List)subBodies.get(0);
		//see if the last of this is a stmtseq node
		if(subBody.size()==0){
		    //nothing inside subBody
		    return;
		}

		ASTNode last = (ASTNode)subBody.get(subBody.size()-1);
		if(last instanceof ASTStatementSequenceNode){
		    //get last statement

		    List stmts = ((ASTStatementSequenceNode)last).getStatements();
		    if(stmts.size()==0){
			//no stmts inside statement sequence node
			subBody.remove(subBody.size()-1);
			return;
		    }
		    AugmentedStmt lastas = (AugmentedStmt)stmts.get(stmts.size()-1);
		    Stmt lastStmt = lastas.get_Stmt();
		    if(lastStmt instanceof ReturnVoidStmt){

			//we can remove the lastStmt
			stmts.remove(stmts.size()-1);
			/*
			  we need to check if we have made the size 0 in
			  which case the stmtSeq Node should also be removed
			*/
			if(stmts.size()==0){
			    subBody.remove(subBody.size()-1);
			}
			      
		    }
		}
	    }
	}
    }
}