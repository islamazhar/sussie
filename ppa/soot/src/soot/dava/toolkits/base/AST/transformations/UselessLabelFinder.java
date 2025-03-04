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

import soot.*;
import java.util.*;
import soot.jimple.*;
import soot.dava.internal.asg.*;
import soot.dava.internal.SET.*;
import soot.dava.internal.AST.*;
import soot.dava.internal.javaRep.*;

public class UselessLabelFinder{
    public UselessLabelFinder( Singletons.Global g ) {}
    public static UselessLabelFinder v() { return G.v().soot_dava_toolkits_base_AST_transformations_UselessLabelFinder(); }

	
    //check whether label on a node is useless 
    public void findAndKill(ASTNode node){
	if(!(node instanceof ASTLabeledNode)){
	    return;
	}
	String label = ((ASTLabeledNode)node).get_Label().toString();
	List subBodies = (List)node.get_SubBodies();
	Iterator it = subBodies.iterator();
	while(it.hasNext()){
	    if(node instanceof ASTTryNode){
		ASTTryNode.container subBody = (ASTTryNode.container)it.next();
		if(checkForBreak((List)subBody.o,label)){
		    //true means break was found so we cant remove
		}
		else{
		    ((ASTLabeledNode)node).set_Label(new SETNodeLabel());	    
		    //System.out.println("USELESS LABEL DETECTED");
		    break;
		}
	    }
	    else{//not an astTryNode
		if(checkForBreak((List)it.next(),label)){
		    //true means break was found so we cant remove			    
		}
		else{
		    ((ASTLabeledNode)node).set_Label(new SETNodeLabel());	    
		    //System.out.println("USELESS LABEL DETECTED");
		    break;
		}
	    }
	}
    }

    /*
      Returns True if finds a break for this label
    */
    private boolean checkForBreak(List ASTNodeBody,String outerLabel){
	Iterator it = ASTNodeBody.iterator();
	while(it.hasNext()){
	    ASTNode temp = (ASTNode)it.next();
	    //check if this is ASTStatementSequenceNode
	    if(temp instanceof ASTStatementSequenceNode){
		ASTStatementSequenceNode stmtSeq = (ASTStatementSequenceNode)temp;
		List statements = stmtSeq.getStatements();
		Iterator stmtIt = statements.iterator();
		while(stmtIt.hasNext()){
		    AugmentedStmt as = (AugmentedStmt)stmtIt.next();
		    Stmt s = as.get_Stmt();
		    String labelBroken = breaksLabel(s);
		    if(labelBroken != null && outerLabel!=null){//stmt breaks some label
			if(labelBroken.compareTo(outerLabel)==0){
			    //we have found a break breaking this label
			    return true;
			}
		    }
		}
	    }//if it was a StmtSeq node
	    else{
		//otherwise recursion
		//getSubBodies
		List subBodies=(List)temp.get_SubBodies();
		Iterator subIt = subBodies.iterator();
		while(subIt.hasNext()){
		    if(temp instanceof ASTTryNode){
			ASTTryNode.container subBody = (ASTTryNode.container) subIt.next();
			if(checkForBreak((List)subBody.o,outerLabel)){
			    //if this is true there was a break found
			    return true;
			}
		    }
		    else{
			if(checkForBreak((List)subIt.next(),outerLabel)){
			    //if this is true there was a break found
			    return true;
			}
		    }
		}
	    }
	}
    
	return false;
    }


    /*
      If the stmt is a break/continue stmt then this method
      returns the labels name
      else returns null
    */
    private String breaksLabel(Stmt stmt){
	if(!(stmt instanceof DAbruptStmt)){
	    //this is not a break stmt
	    return null;
	}
	DAbruptStmt abStmt = (DAbruptStmt)stmt;
	if(abStmt.is_Break() || abStmt.is_Continue()){
	    SETNodeLabel label = abStmt.getLabel();
	    return label.toString();
	}
	else
	    return null;
    }
}