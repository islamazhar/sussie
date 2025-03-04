/* Soot - a J*va Optimization Framework
 * Copyright (C) 2004 Jennifer Lhotak
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

package ca.mcgill.sable.soot.cfg;

import org.eclipse.jface.action.*;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.*;
import org.eclipse.gef.ui.actions.*;

import com.sun.rsasign.t;

import ca.mcgill.sable.graph.actions.*;
import ca.mcgill.sable.soot.cfg.editParts.*;


public class StopAction extends SimpleSelectAction {

	public static final String STOP = "mark stop action";
	

	public StopAction(IWorkbenchPart part) {
		super(part);
	}

	

	
	protected void init(){
		super.init();
		setId(STOP);
		setText("Add Breakpoint");
	}

	public void run(){
		if (!getSelectedObjects().isEmpty() && (getSelectedObjects().get(0) instanceof NodeDataEditPart)){
			NodeDataEditPart cfgPart = (NodeDataEditPart)getSelectedObjects().get(0);
			cfgPart.markStop();
		}
	}
	
	public boolean calculateEnabled(){
		return true;
	}
}
