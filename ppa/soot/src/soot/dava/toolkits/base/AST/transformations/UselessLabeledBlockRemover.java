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
import soot.dava.internal.SET.*;
import soot.dava.internal.AST.*;

public class UselessLabeledBlockRemover {

    public static void removeLabeledBlock(ASTNode node, ASTLabeledBlockNode labelBlock, int subBodyNumber, int nodeNumber){
	if(!(node instanceof ASTIfElseNode)){
	    //these are the nodes which always have one subBody
	    List subBodies = node.get_SubBodies();
	    if(subBodies.size()!=1){
		//there is something wrong
		throw new RuntimeException("Please report this benchmark to the programmer");
	    }
	    List onlySubBody = (List)subBodies.get(0);

	    /*
	      The onlySubBody contains the labeledBlockNode to be removed
	      at location given by the nodeNumber variable
	    */
	    List newBody = createNewSubBody(onlySubBody,nodeNumber,labelBlock);
	    if(newBody==null){
		//something went wrong
		return;
	    }
	    if(node instanceof ASTMethodNode){
		((ASTMethodNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTSynchronizedBlockNode){
		((ASTSynchronizedBlockNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTLabeledBlockNode){
		((ASTLabeledBlockNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTUnconditionalLoopNode){
		((ASTUnconditionalLoopNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTIfNode){
		((ASTIfNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTWhileNode){
		((ASTWhileNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else if(node instanceof ASTDoWhileNode){
		((ASTDoWhileNode)node).replaceBody(newBody);
		G.v().ASTTransformations_modified = true;
		//System.out.println("REMOVED LABEL");
	    }
	    else {
		//there is no other case something is wrong if we get here
		return;
	    }
	}
	else{//its an ASTIfElseNode
	    //if its an ASIfElseNode then check which Subbody has the labeledBlock
	    if(subBodyNumber!=0 && subBodyNumber!=1){
		//something bad is happening dont do nothin
		//System.out.println("Error-------not modifying AST");
		return;
	    }
	    List subBodies = node.get_SubBodies();
	    if(subBodies.size()!=2){
		//there is something wrong
		throw new RuntimeException("Please report this benchmark to the programmer");
	    }

	    List toModifySubBody = (List)subBodies.get(subBodyNumber);

	    /*
	      The toModifySubBody contains the labeledBlockNode to be removed
	      at location given by the nodeNumber variable
	    */
	    List newBody = createNewSubBody(toModifySubBody,nodeNumber,labelBlock);
	    if(newBody==null){
		//something went wrong
		return;
	    }
	    if(subBodyNumber==0){
		//the if body was modified
		//System.out.println("REMOVED LABEL");
		G.v().ASTTransformations_modified = true;
		((ASTIfElseNode)node).replaceBody(newBody,(List)subBodies.get(1));
	    }
	    else if(subBodyNumber==1){
		//else body was modified
		//System.out.println("REMOVED LABEL");
		G.v().ASTTransformations_modified = true;
		((ASTIfElseNode)node).replaceBody((List)subBodies.get(0),newBody);
	    }
	    else{//realllly shouldnt come here
		//something bad is happening dont do nothin
		//System.out.println("Error-------not modifying AST");
		return;
	    }

	}//end of ASTIfElseNode
    }





    public static List createNewSubBody(List oldSubBody,int nodeNumber,ASTLabeledBlockNode labelBlock){
	//create a new SubBody
	List newSubBody = new ArrayList();
	
	//this is an iterator of ASTNodes
	Iterator it = oldSubBody.iterator();
	
	//copy to newSubBody all nodes until you get to nodeNumber
	int index=0;
	while(index!=nodeNumber ){
	    if(!it.hasNext()){
		return null;
	    }
	    newSubBody.add(it.next());
	    index++;
	}

	//at this point the iterator is pointing to the ASTLabeledBlock to be removed
	//just to make sure check this
	ASTNode toRemove = (ASTNode)it.next();
	if(!(toRemove instanceof ASTLabeledBlockNode)){
	    //something is wrong 
	    return null;
	}
	else{
	    ASTLabeledBlockNode toRemoveNode = (ASTLabeledBlockNode)toRemove;

	    //just double checking that this is a null label
	    SETNodeLabel label = toRemoveNode.get_Label();
	    if(label.toString()!=null){
		//something is wrong we cant remove a non null label
		return null;
	    }
	    
	    //so this is the label to remove
	    //removing a label means bringing all its bodies one step up the hierarchy
	    List blocksSubBodies = toRemoveNode.get_SubBodies();
	    //we know this is a labeledBlock so it has only one subBody
	    List onlySubBodyOfLabeledBlock = (List)blocksSubBodies.get(0);
	    
	    //all these subBodies should be added to the newSubbody
	    newSubBody.addAll(onlySubBodyOfLabeledBlock);
	}

	//add any remaining nodes in the oldSubBody to the new one
	while(it.hasNext()){
	    newSubBody.add(it.next());
	}

	//newSubBody is ready return it
	return newSubBody;
    }
}