

/*
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
 *
 * This class is generated automajically from xml - DO NOT EDIT - as
 * changes will be over written
 * 
 * The purpose of this class is to automajically generate a options
 * dialog in the event that options change
 * 
 * Taking options away - should not damage the dialog
 * Adding new sections of options - should not damage the dialog
 * Adding new otpions to sections (of known option type) - should not
 * damage the dialog
 *
 * Adding new option types will break the dialog (option type widgets
 * will need to be created)
 *
 */

package ca.mcgill.sable.soot.ui;

//import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.widgets.*;
import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
//import ca.mcgill.sable.soot.SootPlugin;
//import ca.mcgill.sable.soot.util.*;
import ca.mcgill.sable.soot.ui.*;
import java.util.*;
import org.eclipse.swt.events.*;

public class PhaseOptionsDialog extends AbstractOptionsDialog implements SelectionListener {

	public PhaseOptionsDialog(Shell parentShell) {
		super(parentShell);
	}
	
	/**
	 * each section gets initialize as a stack layer in pageContainer
	 * the area containing the options
	 */ 
	protected void initializePageContainer() {


		
Composite General_OptionsChild = General_OptionsCreate(getPageContainer());

Composite Input_OptionsChild = Input_OptionsCreate(getPageContainer());

Composite Output_OptionsChild = Output_OptionsCreate(getPageContainer());

Composite Processing_OptionsChild = Processing_OptionsCreate(getPageContainer());

Composite Application_Mode_OptionsChild = Application_Mode_OptionsCreate(getPageContainer());

Composite Input_Attribute_OptionsChild = Input_Attribute_OptionsCreate(getPageContainer());

Composite Annotation_OptionsChild = Annotation_OptionsCreate(getPageContainer());

Composite Miscellaneous_OptionsChild = Miscellaneous_OptionsCreate(getPageContainer());

Composite jbChild = jbCreate(getPageContainer());

Composite jjChild = jjCreate(getPageContainer());

Composite cgChild = cgCreate(getPageContainer());

Composite wstpChild = wstpCreate(getPageContainer());

Composite wsopChild = wsopCreate(getPageContainer());

Composite wjtpChild = wjtpCreate(getPageContainer());

Composite wjopChild = wjopCreate(getPageContainer());

Composite wjapChild = wjapCreate(getPageContainer());

Composite shimpleChild = shimpleCreate(getPageContainer());

Composite stpChild = stpCreate(getPageContainer());

Composite sopChild = sopCreate(getPageContainer());

Composite jtpChild = jtpCreate(getPageContainer());

Composite jopChild = jopCreate(getPageContainer());

Composite japChild = japCreate(getPageContainer());

Composite gbChild = gbCreate(getPageContainer());

Composite gopChild = gopCreate(getPageContainer());

Composite bbChild = bbCreate(getPageContainer());

Composite bopChild = bopCreate(getPageContainer());

Composite tagChild = tagCreate(getPageContainer());

Composite dbChild = dbCreate(getPageContainer());

Composite jbjb_lsChild = jbjb_lsCreate(getPageContainer());

Composite jbjb_aChild = jbjb_aCreate(getPageContainer());

Composite jbjb_uleChild = jbjb_uleCreate(getPageContainer());

Composite jbjb_trChild = jbjb_trCreate(getPageContainer());

Composite jbjb_ulpChild = jbjb_ulpCreate(getPageContainer());

Composite jbjb_lnsChild = jbjb_lnsCreate(getPageContainer());

Composite jbjb_cpChild = jbjb_cpCreate(getPageContainer());

Composite jbjb_daeChild = jbjb_daeCreate(getPageContainer());

Composite jbjb_cp_uleChild = jbjb_cp_uleCreate(getPageContainer());

Composite jbjb_lpChild = jbjb_lpCreate(getPageContainer());

Composite jbjb_neChild = jbjb_neCreate(getPageContainer());

Composite jbjb_uceChild = jbjb_uceCreate(getPageContainer());

Composite jbjb_ttChild = jbjb_ttCreate(getPageContainer());

Composite jjjj_lsChild = jjjj_lsCreate(getPageContainer());

Composite jjjj_aChild = jjjj_aCreate(getPageContainer());

Composite jjjj_uleChild = jjjj_uleCreate(getPageContainer());

Composite jjjj_trChild = jjjj_trCreate(getPageContainer());

Composite jjjj_ulpChild = jjjj_ulpCreate(getPageContainer());

Composite jjjj_lnsChild = jjjj_lnsCreate(getPageContainer());

Composite jjjj_cpChild = jjjj_cpCreate(getPageContainer());

Composite jjjj_daeChild = jjjj_daeCreate(getPageContainer());

Composite jjjj_cp_uleChild = jjjj_cp_uleCreate(getPageContainer());

Composite jjjj_lpChild = jjjj_lpCreate(getPageContainer());

Composite jjjj_neChild = jjjj_neCreate(getPageContainer());

Composite jjjj_uceChild = jjjj_uceCreate(getPageContainer());

Composite cgcg_chaChild = cgcg_chaCreate(getPageContainer());

Composite cgcg_sparkChild = cgcg_sparkCreate(getPageContainer());

Composite cgcg_paddleChild = cgcg_paddleCreate(getPageContainer());

Composite cgSpark_General_OptionsChild = cgSpark_General_OptionsCreate(getPageContainer());

Composite cgSpark_Pointer_Assignment_Graph_Building_OptionsChild = cgSpark_Pointer_Assignment_Graph_Building_OptionsCreate(getPageContainer());

Composite cgSpark_Pointer_Assignment_Graph_Simplification_OptionsChild = cgSpark_Pointer_Assignment_Graph_Simplification_OptionsCreate(getPageContainer());

Composite cgSpark_Points_To_Set_Flowing_OptionsChild = cgSpark_Points_To_Set_Flowing_OptionsCreate(getPageContainer());

Composite cgSpark_Output_OptionsChild = cgSpark_Output_OptionsCreate(getPageContainer());

Composite cgPaddle_General_OptionsChild = cgPaddle_General_OptionsCreate(getPageContainer());

Composite cgPaddle_Context_Sensitivity_OptionsChild = cgPaddle_Context_Sensitivity_OptionsCreate(getPageContainer());

Composite cgPaddle_Pointer_Assignment_Graph_Building_OptionsChild = cgPaddle_Pointer_Assignment_Graph_Building_OptionsCreate(getPageContainer());

Composite cgPaddle_Points_To_Set_Flowing_OptionsChild = cgPaddle_Points_To_Set_Flowing_OptionsCreate(getPageContainer());

Composite cgPaddle_Output_OptionsChild = cgPaddle_Output_OptionsCreate(getPageContainer());

Composite wjopwjop_smbChild = wjopwjop_smbCreate(getPageContainer());

Composite wjopwjop_siChild = wjopwjop_siCreate(getPageContainer());

Composite wjapwjap_raChild = wjapwjap_raCreate(getPageContainer());

Composite wjapwjap_umtChild = wjapwjap_umtCreate(getPageContainer());

Composite wjapwjap_uftChild = wjapwjap_uftCreate(getPageContainer());

Composite wjapwjap_tqtChild = wjapwjap_tqtCreate(getPageContainer());

Composite wjapwjap_cggChild = wjapwjap_cggCreate(getPageContainer());

Composite wjapwjap_purityChild = wjapwjap_purityCreate(getPageContainer());

Composite sopsop_cpfChild = sopsop_cpfCreate(getPageContainer());

Composite jopjop_cseChild = jopjop_cseCreate(getPageContainer());

Composite jopjop_bcmChild = jopjop_bcmCreate(getPageContainer());

Composite jopjop_lcmChild = jopjop_lcmCreate(getPageContainer());

Composite jopjop_cpChild = jopjop_cpCreate(getPageContainer());

Composite jopjop_cpfChild = jopjop_cpfCreate(getPageContainer());

Composite jopjop_cbfChild = jopjop_cbfCreate(getPageContainer());

Composite jopjop_daeChild = jopjop_daeCreate(getPageContainer());

Composite jopjop_uce1Child = jopjop_uce1Create(getPageContainer());

Composite jopjop_ubf1Child = jopjop_ubf1Create(getPageContainer());

Composite jopjop_uce2Child = jopjop_uce2Create(getPageContainer());

Composite jopjop_ubf2Child = jopjop_ubf2Create(getPageContainer());

Composite jopjop_uleChild = jopjop_uleCreate(getPageContainer());

Composite japjap_npcChild = japjap_npcCreate(getPageContainer());

Composite japjap_npcolorerChild = japjap_npcolorerCreate(getPageContainer());

Composite japjap_abcChild = japjap_abcCreate(getPageContainer());

Composite japjap_profilingChild = japjap_profilingCreate(getPageContainer());

Composite japjap_seaChild = japjap_seaCreate(getPageContainer());

Composite japjap_fieldrwChild = japjap_fieldrwCreate(getPageContainer());

Composite japjap_cgtaggerChild = japjap_cgtaggerCreate(getPageContainer());

Composite japjap_parityChild = japjap_parityCreate(getPageContainer());

Composite japjap_patChild = japjap_patCreate(getPageContainer());

Composite japjap_lvtaggerChild = japjap_lvtaggerCreate(getPageContainer());

Composite japjap_rdtaggerChild = japjap_rdtaggerCreate(getPageContainer());

Composite japjap_cheChild = japjap_cheCreate(getPageContainer());

Composite japjap_umtChild = japjap_umtCreate(getPageContainer());

Composite japjap_litChild = japjap_litCreate(getPageContainer());

Composite japjap_aetChild = japjap_aetCreate(getPageContainer());

Composite japjap_dmtChild = japjap_dmtCreate(getPageContainer());

Composite gbgb_a1Child = gbgb_a1Create(getPageContainer());

Composite gbgb_cfChild = gbgb_cfCreate(getPageContainer());

Composite gbgb_a2Child = gbgb_a2Create(getPageContainer());

Composite gbgb_uleChild = gbgb_uleCreate(getPageContainer());

Composite bbbb_lsoChild = bbbb_lsoCreate(getPageContainer());

Composite bbbb_phoChild = bbbb_phoCreate(getPageContainer());

Composite bbbb_uleChild = bbbb_uleCreate(getPageContainer());

Composite bbbb_lpChild = bbbb_lpCreate(getPageContainer());

Composite tagtag_lnChild = tagtag_lnCreate(getPageContainer());

Composite tagtag_anChild = tagtag_anCreate(getPageContainer());

Composite tagtag_depChild = tagtag_depCreate(getPageContainer());

Composite tagtag_fieldrwChild = tagtag_fieldrwCreate(getPageContainer());

Composite dbdb_transformationsChild = dbdb_transformationsCreate(getPageContainer());

Composite dbdb_renamerChild = dbdb_renamerCreate(getPageContainer());

Composite dbdb_deobfuscateChild = dbdb_deobfuscateCreate(getPageContainer());

Composite dbdb_force_recompileChild = dbdb_force_recompileCreate(getPageContainer());


		addOtherPages(getPageContainer());
		initializeRadioGroups();
		initializeEnableGroups();
		
	}

	private void initializeRadioGroups(){
		setRadioGroups(new HashMap());
		int counter = 0;
		ArrayList buttonList;

		
		buttonList = new ArrayList();

			
		if (isEnableButton("enabled")) {
			buttonList.add(getcgcg_chaenabled_widget());	
			getcgcg_chaenabled_widget().getButton().addSelectionListener(this);
		}

			
		if (isEnableButton("verbose")) {
			buttonList.add(getcgcg_chaverbose_widget());	
			getcgcg_chaverbose_widget().getButton().addSelectionListener(this);
		}

			
		if (isEnableButton("enabled")) {
			buttonList.add(getcgcg_sparkenabled_widget());	
			getcgcg_sparkenabled_widget().getButton().addSelectionListener(this);
		}

			
		if (isEnableButton("enabled")) {
			buttonList.add(getcgcg_paddleenabled_widget());	
			getcgcg_paddleenabled_widget().getButton().addSelectionListener(this);
		}

		
		getRadioGroups().put(new Integer(counter), buttonList);

		counter++;
		
	}

	
	
	private void initializeEnableGroups(){
		setEnableGroups(new ArrayList());
		
		
		
		makeNewEnableGroup("jb");
		
		
		addToEnableGroup("jb", getjbenabled_widget(), "enabled");
		
		
		addToEnableGroup("jb", getjbuse_original_names_widget(), "use-original-names");
		
		
		getjbenabled_widget().getButton().addSelectionListener(this);
		
		getjbuse_original_names_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.ls");
		
		
		addToEnableGroup("jb", "jb.ls", getjbjb_lsenabled_widget(), "enabled");
		
		getjbjb_lsenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.a");
		
		
		addToEnableGroup("jb", "jb.a", getjbjb_aenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.a", getjbjb_aonly_stack_locals_widget(), "only-stack-locals");
		
		getjbjb_aenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_aonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.ule");
		
		
		addToEnableGroup("jb", "jb.ule", getjbjb_uleenabled_widget(), "enabled");
		
		getjbjb_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.tr");
		
		
		addToEnableGroup("jb", "jb.tr", getjbjb_trenabled_widget(), "enabled");
		
		getjbjb_trenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.ulp");
		
		
		addToEnableGroup("jb", "jb.ulp", getjbjb_ulpenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.ulp", getjbjb_ulpunsplit_original_locals_widget(), "unsplit-original-locals");
		
		getjbjb_ulpenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_ulpunsplit_original_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.lns");
		
		
		addToEnableGroup("jb", "jb.lns", getjbjb_lnsenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.lns", getjbjb_lnsonly_stack_locals_widget(), "only-stack-locals");
		
		getjbjb_lnsenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_lnsonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.cp");
		
		
		addToEnableGroup("jb", "jb.cp", getjbjb_cpenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.cp", getjbjb_cponly_regular_locals_widget(), "only-regular-locals");
		
		addToEnableGroup("jb", "jb.cp", getjbjb_cponly_stack_locals_widget(), "only-stack-locals");
		
		getjbjb_cpenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_cponly_regular_locals_widget().getButton().addSelectionListener(this);
		
		getjbjb_cponly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.dae");
		
		
		addToEnableGroup("jb", "jb.dae", getjbjb_daeenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.dae", getjbjb_daeonly_stack_locals_widget(), "only-stack-locals");
		
		getjbjb_daeenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_daeonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.cp-ule");
		
		
		addToEnableGroup("jb", "jb.cp-ule", getjbjb_cp_uleenabled_widget(), "enabled");
		
		getjbjb_cp_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.lp");
		
		
		addToEnableGroup("jb", "jb.lp", getjbjb_lpenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.lp", getjbjb_lpunsplit_original_locals_widget(), "unsplit-original-locals");
		
		getjbjb_lpenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_lpunsplit_original_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.ne");
		
		
		addToEnableGroup("jb", "jb.ne", getjbjb_neenabled_widget(), "enabled");
		
		getjbjb_neenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.uce");
		
		
		addToEnableGroup("jb", "jb.uce", getjbjb_uceenabled_widget(), "enabled");
		
		addToEnableGroup("jb", "jb.uce", getjbjb_uceremove_unreachable_traps_widget(), "remove-unreachable-traps");
		
		getjbjb_uceenabled_widget().getButton().addSelectionListener(this);
		
		getjbjb_uceremove_unreachable_traps_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jb", "jb.tt");
		
		
		addToEnableGroup("jb", "jb.tt", getjbjb_ttenabled_widget(), "enabled");
		
		getjbjb_ttenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj");
		
		
		addToEnableGroup("jj", getjjenabled_widget(), "enabled");
		
		
		addToEnableGroup("jj", getjjuse_original_names_widget(), "use-original-names");
		
		
		getjjenabled_widget().getButton().addSelectionListener(this);
		
		getjjuse_original_names_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.ls");
		
		
		addToEnableGroup("jj", "jj.ls", getjjjj_lsenabled_widget(), "enabled");
		
		getjjjj_lsenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.a");
		
		
		addToEnableGroup("jj", "jj.a", getjjjj_aenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.a", getjjjj_aonly_stack_locals_widget(), "only-stack-locals");
		
		getjjjj_aenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_aonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.ule");
		
		
		addToEnableGroup("jj", "jj.ule", getjjjj_uleenabled_widget(), "enabled");
		
		getjjjj_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.tr");
		
		
		addToEnableGroup("jj", "jj.tr", getjjjj_trenabled_widget(), "enabled");
		
		getjjjj_trenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.ulp");
		
		
		addToEnableGroup("jj", "jj.ulp", getjjjj_ulpenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.ulp", getjjjj_ulpunsplit_original_locals_widget(), "unsplit-original-locals");
		
		getjjjj_ulpenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_ulpunsplit_original_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.lns");
		
		
		addToEnableGroup("jj", "jj.lns", getjjjj_lnsenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.lns", getjjjj_lnsonly_stack_locals_widget(), "only-stack-locals");
		
		getjjjj_lnsenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_lnsonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.cp");
		
		
		addToEnableGroup("jj", "jj.cp", getjjjj_cpenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.cp", getjjjj_cponly_regular_locals_widget(), "only-regular-locals");
		
		addToEnableGroup("jj", "jj.cp", getjjjj_cponly_stack_locals_widget(), "only-stack-locals");
		
		getjjjj_cpenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_cponly_regular_locals_widget().getButton().addSelectionListener(this);
		
		getjjjj_cponly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.dae");
		
		
		addToEnableGroup("jj", "jj.dae", getjjjj_daeenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.dae", getjjjj_daeonly_stack_locals_widget(), "only-stack-locals");
		
		getjjjj_daeenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_daeonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.cp-ule");
		
		
		addToEnableGroup("jj", "jj.cp-ule", getjjjj_cp_uleenabled_widget(), "enabled");
		
		getjjjj_cp_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.lp");
		
		
		addToEnableGroup("jj", "jj.lp", getjjjj_lpenabled_widget(), "enabled");
		
		addToEnableGroup("jj", "jj.lp", getjjjj_lpunsplit_original_locals_widget(), "unsplit-original-locals");
		
		getjjjj_lpenabled_widget().getButton().addSelectionListener(this);
		
		getjjjj_lpunsplit_original_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.ne");
		
		
		addToEnableGroup("jj", "jj.ne", getjjjj_neenabled_widget(), "enabled");
		
		getjjjj_neenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jj", "jj.uce");
		
		
		addToEnableGroup("jj", "jj.uce", getjjjj_uceenabled_widget(), "enabled");
		
		getjjjj_uceenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("cg");
		
		
		addToEnableGroup("cg", getcgenabled_widget(), "enabled");
		
		
		addToEnableGroup("cg", getcgsafe_forname_widget(), "safe-forname");
		
		
		addToEnableGroup("cg", getcgsafe_newinstance_widget(), "safe-newinstance");
		
		
		addToEnableGroup("cg", getcgverbose_widget(), "verbose");
		
		
		addToEnableGroup("cg", getcgjdkver_widget(), "jdkver");
		
		
		addToEnableGroup("cg", getcgall_reachable_widget(), "all-reachable");
		
		
		addToEnableGroup("cg", getcgimplicit_entry_widget(), "implicit-entry");
		
		
		addToEnableGroup("cg", getcgtrim_clinit_widget(), "trim-clinit");
		
		
		getcgenabled_widget().getButton().addSelectionListener(this);
		
		getcgsafe_forname_widget().getButton().addSelectionListener(this);
		
		getcgsafe_newinstance_widget().getButton().addSelectionListener(this);
		
		getcgverbose_widget().getButton().addSelectionListener(this);
		
		getcgall_reachable_widget().getButton().addSelectionListener(this);
		
		getcgimplicit_entry_widget().getButton().addSelectionListener(this);
		
		getcgtrim_clinit_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("cg", "cg.cha");
		
		
		addToEnableGroup("cg", "cg.cha", getcgcg_chaenabled_widget(), "enabled");
		
		addToEnableGroup("cg", "cg.cha", getcgcg_chaverbose_widget(), "verbose");
		
		getcgcg_chaenabled_widget().getButton().addSelectionListener(this);
		
		getcgcg_chaverbose_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("cg", "cg.spark");
		
		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkenabled_widget(), "enabled");
		
		getcgcg_sparkenabled_widget().getButton().addSelectionListener(this);
		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkverbose_widget(), "verbose");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkignore_types_widget(), "ignore-types");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkforce_gc_widget(), "force-gc");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkpre_jimplify_widget(), "pre-jimplify");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkvta_widget(), "vta");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkrta_widget(), "rta");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkfield_based_widget(), "field-based");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparktypes_for_sites_widget(), "types-for-sites");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkmerge_stringbuffer_widget(), "merge-stringbuffer");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkstring_constants_widget(), "string-constants");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparksimulate_natives_widget(), "simulate-natives");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparksimple_edges_bidirectional_widget(), "simple-edges-bidirectional");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkon_fly_cg_widget(), "on-fly-cg");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparksimplify_offline_widget(), "simplify-offline");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparksimplify_sccs_widget(), "simplify-sccs");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkignore_types_for_sccs_widget(), "ignore-types-for-sccs");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkpropagator_widget(), "propagator");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkset_impl_widget(), "set-impl");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdouble_set_old_widget(), "double-set-old");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdouble_set_new_widget(), "double-set-new");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdump_html_widget(), "dump-html");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdump_pag_widget(), "dump-pag");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdump_solution_widget(), "dump-solution");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparktopo_sort_widget(), "topo-sort");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdump_types_widget(), "dump-types");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkclass_method_var_widget(), "class-method-var");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkdump_answer_widget(), "dump-answer");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkadd_tags_widget(), "add-tags");

		
		addToEnableGroup("cg", "cg.spark", getcgcg_sparkset_mass_widget(), "set-mass");

		
		
		makeNewEnableGroup("cg", "cg.paddle");
		
		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleenabled_widget(), "enabled");
		
		getcgcg_paddleenabled_widget().getButton().addSelectionListener(this);
		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleverbose_widget(), "verbose");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleconf_widget(), "conf");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlebdd_widget(), "bdd");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleorder_widget(), "order");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddledynamic_order_widget(), "dynamic-order");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleprofile_widget(), "profile");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleq_widget(), "q");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlebackend_widget(), "backend");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleignore_types_widget(), "ignore-types");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlepre_jimplify_widget(), "pre-jimplify");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlecontext_widget(), "context");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlek_widget(), "k");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlecontext_heap_widget(), "context-heap");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlerta_widget(), "rta");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlefield_based_widget(), "field-based");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddletypes_for_sites_widget(), "types-for-sites");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlemerge_stringbuffer_widget(), "merge-stringbuffer");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlestring_constants_widget(), "string-constants");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlesimulate_natives_widget(), "simulate-natives");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleglobal_nodes_in_natives_widget(), "global-nodes-in-natives");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlesimple_edges_bidirectional_widget(), "simple-edges-bidirectional");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlethis_edges_widget(), "this-edges");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleprecise_newinstance_widget(), "precise-newinstance");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlepropagator_widget(), "propagator");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleset_impl_widget(), "set-impl");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddledouble_set_old_widget(), "double-set-old");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddledouble_set_new_widget(), "double-set-new");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlecontext_counts_widget(), "context-counts");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddletotal_context_counts_widget(), "total-context-counts");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlemethod_context_counts_widget(), "method-context-counts");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddleset_mass_widget(), "set-mass");

		
		addToEnableGroup("cg", "cg.paddle", getcgcg_paddlenumber_nodes_widget(), "number-nodes");

		
		
		makeNewEnableGroup("wstp");
		
		
		addToEnableGroup("wstp", getwstpenabled_widget(), "enabled");
		
		
		getwstpenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wsop");
		
		
		addToEnableGroup("wsop", getwsopenabled_widget(), "enabled");
		
		
		getwsopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjtp");
		
		
		addToEnableGroup("wjtp", getwjtpenabled_widget(), "enabled");
		
		
		getwjtpenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjop");
		
		
		addToEnableGroup("wjop", getwjopenabled_widget(), "enabled");
		
		
		getwjopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjop", "wjop.smb");
		
		
		addToEnableGroup("wjop", "wjop.smb", getwjopwjop_smbenabled_widget(), "enabled");
		
		addToEnableGroup("wjop", "wjop.smb", getwjopwjop_smbinsert_null_checks_widget(), "insert-null-checks");
		
		addToEnableGroup("wjop", "wjop.smb", getwjopwjop_smbinsert_redundant_casts_widget(), "insert-redundant-casts");
		
		addToEnableGroup("wjop", "wjop.smb", getwjopwjop_smballowed_modifier_changes_widget(), "allowed-modifier-changes");
		
		getwjopwjop_smbenabled_widget().getButton().addSelectionListener(this);
		
		getwjopwjop_smbinsert_null_checks_widget().getButton().addSelectionListener(this);
		
		getwjopwjop_smbinsert_redundant_casts_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjop", "wjop.si");
		
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_sienabled_widget(), "enabled");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_sirerun_jb_widget(), "rerun-jb");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_siinsert_null_checks_widget(), "insert-null-checks");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_siinsert_redundant_casts_widget(), "insert-redundant-casts");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_siallowed_modifier_changes_widget(), "allowed-modifier-changes");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_siexpansion_factor_widget(), "expansion-factor");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_simax_container_size_widget(), "max-container-size");
		
		addToEnableGroup("wjop", "wjop.si", getwjopwjop_simax_inlinee_size_widget(), "max-inlinee-size");
		
		getwjopwjop_sienabled_widget().getButton().addSelectionListener(this);
		
		getwjopwjop_sirerun_jb_widget().getButton().addSelectionListener(this);
		
		getwjopwjop_siinsert_null_checks_widget().getButton().addSelectionListener(this);
		
		getwjopwjop_siinsert_redundant_casts_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap");
		
		
		addToEnableGroup("wjap", getwjapenabled_widget(), "enabled");
		
		
		getwjapenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.ra");
		
		
		addToEnableGroup("wjap", "wjap.ra", getwjapwjap_raenabled_widget(), "enabled");
		
		getwjapwjap_raenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.umt");
		
		
		addToEnableGroup("wjap", "wjap.umt", getwjapwjap_umtenabled_widget(), "enabled");
		
		getwjapwjap_umtenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.uft");
		
		
		addToEnableGroup("wjap", "wjap.uft", getwjapwjap_uftenabled_widget(), "enabled");
		
		getwjapwjap_uftenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.tqt");
		
		
		addToEnableGroup("wjap", "wjap.tqt", getwjapwjap_tqtenabled_widget(), "enabled");
		
		getwjapwjap_tqtenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.cgg");
		
		
		addToEnableGroup("wjap", "wjap.cgg", getwjapwjap_cggenabled_widget(), "enabled");
		
		addToEnableGroup("wjap", "wjap.cgg", getwjapwjap_cggshow_lib_meths_widget(), "show-lib-meths");
		
		getwjapwjap_cggenabled_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_cggshow_lib_meths_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("wjap", "wjap.purity");
		
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_purityenabled_widget(), "enabled");
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_puritydump_summaries_widget(), "dump-summaries");
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_puritydump_cg_widget(), "dump-cg");
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_puritydump_intra_widget(), "dump-intra");
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_purityprint_widget(), "print");
		
		addToEnableGroup("wjap", "wjap.purity", getwjapwjap_purityverbose_widget(), "verbose");
		
		getwjapwjap_purityenabled_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_puritydump_summaries_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_puritydump_cg_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_puritydump_intra_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_purityprint_widget().getButton().addSelectionListener(this);
		
		getwjapwjap_purityverbose_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("shimple");
		
		
		addToEnableGroup("shimple", getshimpleenabled_widget(), "enabled");
		
		
		addToEnableGroup("shimple", getshimplenode_elim_opt_widget(), "node-elim-opt");
		
		
		addToEnableGroup("shimple", getshimplestandard_local_names_widget(), "standard-local-names");
		
		
		addToEnableGroup("shimple", getshimpleextended_widget(), "extended");
		
		
		addToEnableGroup("shimple", getshimpledebug_widget(), "debug");
		
		
		getshimpleenabled_widget().getButton().addSelectionListener(this);
		
		getshimplenode_elim_opt_widget().getButton().addSelectionListener(this);
		
		getshimplestandard_local_names_widget().getButton().addSelectionListener(this);
		
		getshimpleextended_widget().getButton().addSelectionListener(this);
		
		getshimpledebug_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("stp");
		
		
		addToEnableGroup("stp", getstpenabled_widget(), "enabled");
		
		
		getstpenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("sop");
		
		
		addToEnableGroup("sop", getsopenabled_widget(), "enabled");
		
		
		getsopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("sop", "sop.cpf");
		
		
		addToEnableGroup("sop", "sop.cpf", getsopsop_cpfenabled_widget(), "enabled");
		
		addToEnableGroup("sop", "sop.cpf", getsopsop_cpfprune_cfg_widget(), "prune-cfg");
		
		getsopsop_cpfenabled_widget().getButton().addSelectionListener(this);
		
		getsopsop_cpfprune_cfg_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jtp");
		
		
		addToEnableGroup("jtp", getjtpenabled_widget(), "enabled");
		
		
		getjtpenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop");
		
		
		addToEnableGroup("jop", getjopenabled_widget(), "enabled");
		
		
		getjopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.cse");
		
		
		addToEnableGroup("jop", "jop.cse", getjopjop_cseenabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.cse", getjopjop_csenaive_side_effect_widget(), "naive-side-effect");
		
		getjopjop_cseenabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_csenaive_side_effect_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.bcm");
		
		
		addToEnableGroup("jop", "jop.bcm", getjopjop_bcmenabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.bcm", getjopjop_bcmnaive_side_effect_widget(), "naive-side-effect");
		
		getjopjop_bcmenabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_bcmnaive_side_effect_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.lcm");
		
		
		addToEnableGroup("jop", "jop.lcm", getjopjop_lcmenabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.lcm", getjopjop_lcmsafety_widget(), "safety");
		
		addToEnableGroup("jop", "jop.lcm", getjopjop_lcmunroll_widget(), "unroll");
		
		addToEnableGroup("jop", "jop.lcm", getjopjop_lcmnaive_side_effect_widget(), "naive-side-effect");
		
		getjopjop_lcmenabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_lcmunroll_widget().getButton().addSelectionListener(this);
		
		getjopjop_lcmnaive_side_effect_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.cp");
		
		
		addToEnableGroup("jop", "jop.cp", getjopjop_cpenabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.cp", getjopjop_cponly_regular_locals_widget(), "only-regular-locals");
		
		addToEnableGroup("jop", "jop.cp", getjopjop_cponly_stack_locals_widget(), "only-stack-locals");
		
		getjopjop_cpenabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_cponly_regular_locals_widget().getButton().addSelectionListener(this);
		
		getjopjop_cponly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.cpf");
		
		
		addToEnableGroup("jop", "jop.cpf", getjopjop_cpfenabled_widget(), "enabled");
		
		getjopjop_cpfenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.cbf");
		
		
		addToEnableGroup("jop", "jop.cbf", getjopjop_cbfenabled_widget(), "enabled");
		
		getjopjop_cbfenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.dae");
		
		
		addToEnableGroup("jop", "jop.dae", getjopjop_daeenabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.dae", getjopjop_daeonly_tag_widget(), "only-tag");
		
		addToEnableGroup("jop", "jop.dae", getjopjop_daeonly_stack_locals_widget(), "only-stack-locals");
		
		getjopjop_daeenabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_daeonly_tag_widget().getButton().addSelectionListener(this);
		
		getjopjop_daeonly_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.uce1");
		
		
		addToEnableGroup("jop", "jop.uce1", getjopjop_uce1enabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.uce1", getjopjop_uce1remove_unreachable_traps_widget(), "remove-unreachable-traps");
		
		getjopjop_uce1enabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_uce1remove_unreachable_traps_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.ubf1");
		
		
		addToEnableGroup("jop", "jop.ubf1", getjopjop_ubf1enabled_widget(), "enabled");
		
		getjopjop_ubf1enabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.uce2");
		
		
		addToEnableGroup("jop", "jop.uce2", getjopjop_uce2enabled_widget(), "enabled");
		
		addToEnableGroup("jop", "jop.uce2", getjopjop_uce2remove_unreachable_traps_widget(), "remove-unreachable-traps");
		
		getjopjop_uce2enabled_widget().getButton().addSelectionListener(this);
		
		getjopjop_uce2remove_unreachable_traps_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.ubf2");
		
		
		addToEnableGroup("jop", "jop.ubf2", getjopjop_ubf2enabled_widget(), "enabled");
		
		getjopjop_ubf2enabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jop", "jop.ule");
		
		
		addToEnableGroup("jop", "jop.ule", getjopjop_uleenabled_widget(), "enabled");
		
		getjopjop_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap");
		
		
		addToEnableGroup("jap", getjapenabled_widget(), "enabled");
		
		
		getjapenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.npc");
		
		
		addToEnableGroup("jap", "jap.npc", getjapjap_npcenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.npc", getjapjap_npconly_array_ref_widget(), "only-array-ref");
		
		addToEnableGroup("jap", "jap.npc", getjapjap_npcprofiling_widget(), "profiling");
		
		getjapjap_npcenabled_widget().getButton().addSelectionListener(this);
		
		getjapjap_npconly_array_ref_widget().getButton().addSelectionListener(this);
		
		getjapjap_npcprofiling_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.npcolorer");
		
		
		addToEnableGroup("jap", "jap.npcolorer", getjapjap_npcolorerenabled_widget(), "enabled");
		
		getjapjap_npcolorerenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.abc");
		
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_all_widget(), "with-all");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_cse_widget(), "with-cse");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_arrayref_widget(), "with-arrayref");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_fieldref_widget(), "with-fieldref");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_classfield_widget(), "with-classfield");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcwith_rectarray_widget(), "with-rectarray");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcprofiling_widget(), "profiling");
		
		addToEnableGroup("jap", "jap.abc", getjapjap_abcadd_color_tags_widget(), "add-color-tags");
		
		getjapjap_abcenabled_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_all_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_cse_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_arrayref_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_fieldref_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_classfield_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcwith_rectarray_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcprofiling_widget().getButton().addSelectionListener(this);
		
		getjapjap_abcadd_color_tags_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.profiling");
		
		
		addToEnableGroup("jap", "jap.profiling", getjapjap_profilingenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.profiling", getjapjap_profilingnotmainentry_widget(), "notmainentry");
		
		getjapjap_profilingenabled_widget().getButton().addSelectionListener(this);
		
		getjapjap_profilingnotmainentry_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.sea");
		
		
		addToEnableGroup("jap", "jap.sea", getjapjap_seaenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.sea", getjapjap_seanaive_widget(), "naive");
		
		getjapjap_seaenabled_widget().getButton().addSelectionListener(this);
		
		getjapjap_seanaive_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.fieldrw");
		
		
		addToEnableGroup("jap", "jap.fieldrw", getjapjap_fieldrwenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.fieldrw", getjapjap_fieldrwthreshold_widget(), "threshold");
		
		getjapjap_fieldrwenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.cgtagger");
		
		
		addToEnableGroup("jap", "jap.cgtagger", getjapjap_cgtaggerenabled_widget(), "enabled");
		
		getjapjap_cgtaggerenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.parity");
		
		
		addToEnableGroup("jap", "jap.parity", getjapjap_parityenabled_widget(), "enabled");
		
		getjapjap_parityenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.pat");
		
		
		addToEnableGroup("jap", "jap.pat", getjapjap_patenabled_widget(), "enabled");
		
		getjapjap_patenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.lvtagger");
		
		
		addToEnableGroup("jap", "jap.lvtagger", getjapjap_lvtaggerenabled_widget(), "enabled");
		
		getjapjap_lvtaggerenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.rdtagger");
		
		
		addToEnableGroup("jap", "jap.rdtagger", getjapjap_rdtaggerenabled_widget(), "enabled");
		
		getjapjap_rdtaggerenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.che");
		
		
		addToEnableGroup("jap", "jap.che", getjapjap_cheenabled_widget(), "enabled");
		
		getjapjap_cheenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.umt");
		
		
		addToEnableGroup("jap", "jap.umt", getjapjap_umtenabled_widget(), "enabled");
		
		getjapjap_umtenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.lit");
		
		
		addToEnableGroup("jap", "jap.lit", getjapjap_litenabled_widget(), "enabled");
		
		getjapjap_litenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.aet");
		
		
		addToEnableGroup("jap", "jap.aet", getjapjap_aetenabled_widget(), "enabled");
		
		addToEnableGroup("jap", "jap.aet", getjapjap_aetkind_widget(), "kind");
		
		getjapjap_aetenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("jap", "jap.dmt");
		
		
		addToEnableGroup("jap", "jap.dmt", getjapjap_dmtenabled_widget(), "enabled");
		
		getjapjap_dmtenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gb");
		
		
		addToEnableGroup("gb", getgbenabled_widget(), "enabled");
		
		
		getgbenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gb", "gb.a1");
		
		
		addToEnableGroup("gb", "gb.a1", getgbgb_a1enabled_widget(), "enabled");
		
		addToEnableGroup("gb", "gb.a1", getgbgb_a1only_stack_locals_widget(), "only-stack-locals");
		
		getgbgb_a1enabled_widget().getButton().addSelectionListener(this);
		
		getgbgb_a1only_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gb", "gb.cf");
		
		
		addToEnableGroup("gb", "gb.cf", getgbgb_cfenabled_widget(), "enabled");
		
		getgbgb_cfenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gb", "gb.a2");
		
		
		addToEnableGroup("gb", "gb.a2", getgbgb_a2enabled_widget(), "enabled");
		
		addToEnableGroup("gb", "gb.a2", getgbgb_a2only_stack_locals_widget(), "only-stack-locals");
		
		getgbgb_a2enabled_widget().getButton().addSelectionListener(this);
		
		getgbgb_a2only_stack_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gb", "gb.ule");
		
		
		addToEnableGroup("gb", "gb.ule", getgbgb_uleenabled_widget(), "enabled");
		
		getgbgb_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("gop");
		
		
		addToEnableGroup("gop", getgopenabled_widget(), "enabled");
		
		
		getgopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bb");
		
		
		addToEnableGroup("bb", getbbenabled_widget(), "enabled");
		
		
		getbbenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bb", "bb.lso");
		
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsoenabled_widget(), "enabled");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsodebug_widget(), "debug");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsointer_widget(), "inter");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsosl_widget(), "sl");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsosl2_widget(), "sl2");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsosll_widget(), "sll");
		
		addToEnableGroup("bb", "bb.lso", getbbbb_lsosll2_widget(), "sll2");
		
		getbbbb_lsoenabled_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsodebug_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsointer_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsosl_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsosl2_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsosll_widget().getButton().addSelectionListener(this);
		
		getbbbb_lsosll2_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bb", "bb.pho");
		
		
		addToEnableGroup("bb", "bb.pho", getbbbb_phoenabled_widget(), "enabled");
		
		getbbbb_phoenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bb", "bb.ule");
		
		
		addToEnableGroup("bb", "bb.ule", getbbbb_uleenabled_widget(), "enabled");
		
		getbbbb_uleenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bb", "bb.lp");
		
		
		addToEnableGroup("bb", "bb.lp", getbbbb_lpenabled_widget(), "enabled");
		
		addToEnableGroup("bb", "bb.lp", getbbbb_lpunsplit_original_locals_widget(), "unsplit-original-locals");
		
		getbbbb_lpenabled_widget().getButton().addSelectionListener(this);
		
		getbbbb_lpunsplit_original_locals_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("bop");
		
		
		addToEnableGroup("bop", getbopenabled_widget(), "enabled");
		
		
		getbopenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("tag");
		
		
		addToEnableGroup("tag", gettagenabled_widget(), "enabled");
		
		
		gettagenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("tag", "tag.ln");
		
		
		addToEnableGroup("tag", "tag.ln", gettagtag_lnenabled_widget(), "enabled");
		
		gettagtag_lnenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("tag", "tag.an");
		
		
		addToEnableGroup("tag", "tag.an", gettagtag_anenabled_widget(), "enabled");
		
		gettagtag_anenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("tag", "tag.dep");
		
		
		addToEnableGroup("tag", "tag.dep", gettagtag_depenabled_widget(), "enabled");
		
		gettagtag_depenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("tag", "tag.fieldrw");
		
		
		addToEnableGroup("tag", "tag.fieldrw", gettagtag_fieldrwenabled_widget(), "enabled");
		
		gettagtag_fieldrwenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("db");
		
		
		addToEnableGroup("db", getdbenabled_widget(), "enabled");
		
		
		getdbenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("db", "db.transformations");
		
		
		addToEnableGroup("db", "db.transformations", getdbdb_transformationsenabled_widget(), "enabled");
		
		getdbdb_transformationsenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("db", "db.renamer");
		
		
		addToEnableGroup("db", "db.renamer", getdbdb_renamerenabled_widget(), "enabled");
		
		addToEnableGroup("db", "db.renamer", getdbdb_renamerremove_fully_qualified_widget(), "remove-fully-qualified");
		
		getdbdb_renamerenabled_widget().getButton().addSelectionListener(this);
		
		getdbdb_renamerremove_fully_qualified_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("db", "db.deobfuscate");
		
		
		addToEnableGroup("db", "db.deobfuscate", getdbdb_deobfuscateenabled_widget(), "enabled");
		
		getdbdb_deobfuscateenabled_widget().getButton().addSelectionListener(this);
		
		
		makeNewEnableGroup("db", "db.force-recompile");
		
		
		addToEnableGroup("db", "db.force-recompile", getdbdb_force_recompileenabled_widget(), "enabled");
		
		getdbdb_force_recompileenabled_widget().getButton().addSelectionListener(this);
		

		updateAllEnableGroups();
	}
	
	public void widgetSelected(SelectionEvent e){
		handleWidgetSelected(e);
	}

	public void widgetDefaultSelected(SelectionEvent e){
	}
	
	/**
	 * all options get saved as <alias, value> pair
	 */ 
	protected void okPressed() {
		createNewConfig();	
		super.okPressed();
	}

	private void createNewConfig() {
	
		setConfig(new HashMap());
		
		boolean boolRes = false;
		String stringRes = "";
		boolean defBoolRes = false;
		String defStringRes = "";
		StringTokenizer listOptTokens;
		String nextListToken;
	
		
		boolRes = getGeneral_Optionshelp_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionshelp_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsphase_list_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsphase_list_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsversion_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsversion_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsinteractive_mode_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsinteractive_mode_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsapp_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsapp_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionswhole_program_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionswhole_program_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionswhole_shimple_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionswhole_shimple_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsvalidate_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsvalidate_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsdebug_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsdebug_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getGeneral_Optionsdebug_resolver_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getGeneral_Optionsdebug_resolver_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getGeneral_Optionsphase_help_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getGeneral_Optionsphase_help_widget().getAlias(), stringRes);
		}
		
		boolRes = getInput_Optionsast_metrics_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Optionsast_metrics_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getInput_Optionsfull_resolver_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Optionsfull_resolver_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getInput_Optionsallow_phantom_refs_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Optionsallow_phantom_refs_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getInput_Optionsuse_old_type_assigner_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Optionsuse_old_type_assigner_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getInput_Optionssoot_classpath_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getInput_Optionssoot_classpath_widget().getAlias(), stringRes);
		}
		
		stringRes = getInput_Optionsprocess_dir_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getInput_Optionsprocess_dir_widget().getAlias(), stringRes);
		}
		
		stringRes = getInput_Optionsmain_class_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getInput_Optionsmain_class_widget().getAlias(), stringRes);
		}
		 
		stringRes = getInput_Optionssrc_prec_widget().getSelectedAlias();

		
		defStringRes = "c";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getInput_Optionssrc_prec_widget().getAlias(), stringRes);
		}
		
		boolRes = getOutput_Optionsoutput_jar_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsoutput_jar_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsxml_attributes_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsxml_attributes_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsprint_tags_in_output_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsprint_tags_in_output_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsno_output_source_file_attribute_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsno_output_source_file_attribute_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsno_output_inner_classes_attribute_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsno_output_inner_classes_attribute_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsshow_exception_dests_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsshow_exception_dests_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getOutput_Optionsgzip_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getOutput_Optionsgzip_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getOutput_Optionsoutput_dir_widget().getText().getText();
		
		defStringRes = "./sootOutput";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getOutput_Optionsoutput_dir_widget().getAlias(), stringRes);
		}
		
		stringRes = getOutput_Optionsdump_body_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getOutput_Optionsdump_body_widget().getAlias(), stringRes);
		}
		
		stringRes = getOutput_Optionsdump_cfg_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getOutput_Optionsdump_cfg_widget().getAlias(), stringRes);
		}
		 
		stringRes = getOutput_Optionsoutput_format_widget().getSelectedAlias();

		
		defStringRes = "c";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getOutput_Optionsoutput_format_widget().getAlias(), stringRes);
		}
		
		boolRes = getProcessing_Optionsoptimize_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionsoptimize_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getProcessing_Optionswhole_optimize_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionswhole_optimize_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getProcessing_Optionsvia_grimp_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionsvia_grimp_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getProcessing_Optionsvia_shimple_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionsvia_shimple_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getProcessing_Optionsomit_excepting_unit_edges_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionsomit_excepting_unit_edges_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getProcessing_Optionstrim_cfgs_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getProcessing_Optionstrim_cfgs_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getProcessing_Optionsthrow_analysis_widget().getSelectedAlias();

		
		defStringRes = "pedantic";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getProcessing_Optionsthrow_analysis_widget().getAlias(), stringRes);
		}
		
		boolRes = getjbenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbuse_original_names_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbuse_original_names_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_lsenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_lsenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_aenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_aenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_aonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_aonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_trenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_trenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_ulpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_ulpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_ulpunsplit_original_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_ulpunsplit_original_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_lnsenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_lnsenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_lnsonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_lnsonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_cpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_cpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_cponly_regular_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_cponly_regular_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_cponly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_cponly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_daeenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_daeenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_daeonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_daeonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_cp_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_cp_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_lpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_lpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_lpunsplit_original_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_lpunsplit_original_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_neenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_neenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_uceenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_uceenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_uceremove_unreachable_traps_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_uceremove_unreachable_traps_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjbjb_ttenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjbjb_ttenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjuse_original_names_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjuse_original_names_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_lsenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_lsenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_aenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_aenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_aonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_aonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_trenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_trenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_ulpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_ulpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_ulpunsplit_original_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_ulpunsplit_original_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_lnsenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_lnsenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_lnsonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_lnsonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_cpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_cpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_cponly_regular_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_cponly_regular_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_cponly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_cponly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_daeenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_daeenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_daeonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_daeonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_cp_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_cp_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_lpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_lpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_lpunsplit_original_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_lpunsplit_original_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_neenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_neenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjjjj_uceenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjjjj_uceenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgsafe_forname_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgsafe_forname_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgsafe_newinstance_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgsafe_newinstance_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgall_reachable_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgall_reachable_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgimplicit_entry_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgimplicit_entry_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgtrim_clinit_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgtrim_clinit_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getcgjdkver_widget().getText().getText();
		
		defStringRes = "3";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getcgjdkver_widget().getAlias(), stringRes);
		}
		
		boolRes = getcgcg_chaenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_chaenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_chaverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_chaverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkignore_types_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkignore_types_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkforce_gc_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkforce_gc_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkpre_jimplify_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkpre_jimplify_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkvta_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkvta_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkrta_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkrta_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkfield_based_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkfield_based_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparktypes_for_sites_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparktypes_for_sites_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkmerge_stringbuffer_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkmerge_stringbuffer_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkstring_constants_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkstring_constants_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparksimulate_natives_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparksimulate_natives_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparksimple_edges_bidirectional_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparksimple_edges_bidirectional_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkon_fly_cg_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkon_fly_cg_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparksimplify_offline_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparksimplify_offline_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparksimplify_sccs_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparksimplify_sccs_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkignore_types_for_sccs_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkignore_types_for_sccs_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getcgcg_sparkpropagator_widget().getSelectedAlias();

		
		defStringRes = "worklist";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_sparkpropagator_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_sparkset_impl_widget().getSelectedAlias();

		
		defStringRes = "double";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_sparkset_impl_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_sparkdouble_set_old_widget().getSelectedAlias();

		
		defStringRes = "hybrid";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_sparkdouble_set_old_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_sparkdouble_set_new_widget().getSelectedAlias();

		
		defStringRes = "hybrid";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_sparkdouble_set_new_widget().getAlias(), stringRes);
		}
		
		boolRes = getcgcg_sparkdump_html_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkdump_html_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkdump_pag_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkdump_pag_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkdump_solution_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkdump_solution_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparktopo_sort_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparktopo_sort_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkdump_types_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkdump_types_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkclass_method_var_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkclass_method_var_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkdump_answer_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkdump_answer_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkadd_tags_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkadd_tags_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_sparkset_mass_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_sparkset_mass_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlebdd_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlebdd_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddledynamic_order_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddledynamic_order_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleprofile_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleprofile_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleignore_types_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleignore_types_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlepre_jimplify_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlepre_jimplify_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getcgcg_paddleorder_widget().getText().getText();
		
		defStringRes = "32";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getcgcg_paddleorder_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddleconf_widget().getSelectedAlias();

		
		defStringRes = "ofcg";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddleconf_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddleq_widget().getSelectedAlias();

		
		defStringRes = "auto";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddleq_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddlebackend_widget().getSelectedAlias();

		
		defStringRes = "buddy";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddlebackend_widget().getAlias(), stringRes);
		}
		
		boolRes = getcgcg_paddlecontext_heap_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlecontext_heap_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getcgcg_paddlek_widget().getText().getText();
		
		defStringRes = "2";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getcgcg_paddlek_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddlecontext_widget().getSelectedAlias();

		
		defStringRes = "insens";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddlecontext_widget().getAlias(), stringRes);
		}
		
		boolRes = getcgcg_paddlerta_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlerta_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlefield_based_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlefield_based_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddletypes_for_sites_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddletypes_for_sites_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlemerge_stringbuffer_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlemerge_stringbuffer_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlestring_constants_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlestring_constants_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlesimulate_natives_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlesimulate_natives_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleglobal_nodes_in_natives_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleglobal_nodes_in_natives_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlesimple_edges_bidirectional_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlesimple_edges_bidirectional_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlethis_edges_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlethis_edges_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleprecise_newinstance_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleprecise_newinstance_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getcgcg_paddlepropagator_widget().getSelectedAlias();

		
		defStringRes = "auto";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddlepropagator_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddleset_impl_widget().getSelectedAlias();

		
		defStringRes = "double";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddleset_impl_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddledouble_set_old_widget().getSelectedAlias();

		
		defStringRes = "hybrid";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddledouble_set_old_widget().getAlias(), stringRes);
		}
		 
		stringRes = getcgcg_paddledouble_set_new_widget().getSelectedAlias();

		
		defStringRes = "hybrid";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getcgcg_paddledouble_set_new_widget().getAlias(), stringRes);
		}
		
		boolRes = getcgcg_paddlecontext_counts_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlecontext_counts_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddletotal_context_counts_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddletotal_context_counts_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlemethod_context_counts_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlemethod_context_counts_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddleset_mass_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddleset_mass_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getcgcg_paddlenumber_nodes_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getcgcg_paddlenumber_nodes_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwstpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwstpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwsopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwsopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjtpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjtpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_smbenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_smbenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_smbinsert_null_checks_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_smbinsert_null_checks_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_smbinsert_redundant_casts_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_smbinsert_redundant_casts_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getwjopwjop_smballowed_modifier_changes_widget().getSelectedAlias();

		
		defStringRes = "unsafe";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getwjopwjop_smballowed_modifier_changes_widget().getAlias(), stringRes);
		}
		
		boolRes = getwjopwjop_sienabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_sienabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_sirerun_jb_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_sirerun_jb_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_siinsert_null_checks_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_siinsert_null_checks_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjopwjop_siinsert_redundant_casts_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjopwjop_siinsert_redundant_casts_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getwjopwjop_siexpansion_factor_widget().getText().getText();
		
		defStringRes = "3";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getwjopwjop_siexpansion_factor_widget().getAlias(), stringRes);
		}
		
		stringRes = getwjopwjop_simax_container_size_widget().getText().getText();
		
		defStringRes = "5000";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getwjopwjop_simax_container_size_widget().getAlias(), stringRes);
		}
		
		stringRes = getwjopwjop_simax_inlinee_size_widget().getText().getText();
		
		defStringRes = "20";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getwjopwjop_simax_inlinee_size_widget().getAlias(), stringRes);
		}
		 
		stringRes = getwjopwjop_siallowed_modifier_changes_widget().getSelectedAlias();

		
		defStringRes = "unsafe";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getwjopwjop_siallowed_modifier_changes_widget().getAlias(), stringRes);
		}
		
		boolRes = getwjapenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_raenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_raenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_umtenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_umtenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_uftenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_uftenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_tqtenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_tqtenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_cggenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_cggenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_cggshow_lib_meths_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_cggshow_lib_meths_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_purityenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_purityenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_puritydump_summaries_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_puritydump_summaries_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_puritydump_cg_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_puritydump_cg_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_puritydump_intra_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_puritydump_intra_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_purityprint_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_purityprint_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getwjapwjap_purityverbose_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getwjapwjap_purityverbose_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getshimpleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getshimpleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getshimplenode_elim_opt_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getshimplenode_elim_opt_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getshimplestandard_local_names_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getshimplestandard_local_names_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getshimpleextended_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getshimpleextended_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getshimpledebug_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getshimpledebug_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getstpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getstpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getsopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getsopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getsopsop_cpfenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getsopsop_cpfenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getsopsop_cpfprune_cfg_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getsopsop_cpfprune_cfg_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjtpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjtpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_cseenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cseenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_csenaive_side_effect_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_csenaive_side_effect_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_bcmenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_bcmenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_bcmnaive_side_effect_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_bcmnaive_side_effect_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_lcmenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_lcmenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_lcmunroll_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_lcmunroll_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_lcmnaive_side_effect_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_lcmnaive_side_effect_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getjopjop_lcmsafety_widget().getSelectedAlias();

		
		defStringRes = "safe";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getjopjop_lcmsafety_widget().getAlias(), stringRes);
		}
		
		boolRes = getjopjop_cpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_cponly_regular_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cponly_regular_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_cponly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cponly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_cpfenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cpfenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_cbfenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_cbfenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_daeenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_daeenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_daeonly_tag_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_daeonly_tag_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_daeonly_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_daeonly_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_uce1enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_uce1enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_uce1remove_unreachable_traps_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_uce1remove_unreachable_traps_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_ubf1enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_ubf1enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_uce2enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_uce2enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_uce2remove_unreachable_traps_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_uce2remove_unreachable_traps_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_ubf2enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_ubf2enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjopjop_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjopjop_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_npcenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_npcenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_npconly_array_ref_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_npconly_array_ref_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_npcprofiling_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_npcprofiling_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_npcolorerenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_npcolorerenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_all_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_all_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_cse_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_cse_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_arrayref_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_arrayref_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_fieldref_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_fieldref_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_classfield_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_classfield_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcwith_rectarray_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcwith_rectarray_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcprofiling_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcprofiling_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_abcadd_color_tags_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_abcadd_color_tags_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_profilingenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_profilingenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_profilingnotmainentry_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_profilingnotmainentry_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_seaenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_seaenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_seanaive_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_seanaive_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_fieldrwenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_fieldrwenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getjapjap_fieldrwthreshold_widget().getText().getText();
		
		defStringRes = "100";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getjapjap_fieldrwthreshold_widget().getAlias(), stringRes);
		}
		
		boolRes = getjapjap_cgtaggerenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_cgtaggerenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_parityenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_parityenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_patenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_patenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_lvtaggerenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_lvtaggerenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_rdtaggerenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_rdtaggerenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_cheenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_cheenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_umtenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_umtenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_litenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_litenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getjapjap_aetenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_aetenabled_widget().getAlias(), new Boolean(boolRes));
		}
		 
		stringRes = getjapjap_aetkind_widget().getSelectedAlias();

		
		defStringRes = "optimistic";
		

		if (!stringRes.equals(defStringRes)) {
			getConfig().put(getjapjap_aetkind_widget().getAlias(), stringRes);
		}
		
		boolRes = getjapjap_dmtenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getjapjap_dmtenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_a1enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_a1enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_a1only_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_a1only_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_cfenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_cfenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_a2enabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_a2enabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_a2only_stack_locals_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_a2only_stack_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgbgb_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgbgb_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getgopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getgopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsoenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsoenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsodebug_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsodebug_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsointer_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsointer_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsosl_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsosl_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsosl2_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsosl2_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsosll_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsosll_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lsosll2_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lsosll2_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_phoenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_phoenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_uleenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_uleenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lpenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lpenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbbbb_lpunsplit_original_locals_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbbbb_lpunsplit_original_locals_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getbopenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getbopenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = gettagenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(gettagenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = gettagtag_lnenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(gettagtag_lnenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = gettagtag_anenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(gettagtag_anenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = gettagtag_depenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(gettagtag_depenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = gettagtag_fieldrwenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(gettagtag_fieldrwenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbdb_transformationsenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbdb_transformationsenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbdb_renamerenabled_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbdb_renamerenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbdb_renamerremove_fully_qualified_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbdb_renamerremove_fully_qualified_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbdb_deobfuscateenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbdb_deobfuscateenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getdbdb_force_recompileenabled_widget().getButton().getSelection();
		
		
		defBoolRes = true;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getdbdb_force_recompileenabled_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getApplication_Mode_Optionsinclude_all_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getApplication_Mode_Optionsinclude_all_widget().getAlias(), new Boolean(boolRes));
		}
		
		stringRes = getApplication_Mode_Optionsinclude_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getApplication_Mode_Optionsinclude_widget().getAlias(), stringRes);
		}
		
		stringRes = getApplication_Mode_Optionsexclude_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getApplication_Mode_Optionsexclude_widget().getAlias(), stringRes);
		}
		
		stringRes = getApplication_Mode_Optionsdynamic_class_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getApplication_Mode_Optionsdynamic_class_widget().getAlias(), stringRes);
		}
		
		stringRes = getApplication_Mode_Optionsdynamic_dir_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getApplication_Mode_Optionsdynamic_dir_widget().getAlias(), stringRes);
		}
		
		stringRes = getApplication_Mode_Optionsdynamic_package_widget().getText().getText();
		
		defStringRes = "";
		

	        if ( (!(stringRes.equals(defStringRes))) && (stringRes != null) && (stringRes.length() != 0)) {
			getConfig().put(getApplication_Mode_Optionsdynamic_package_widget().getAlias(), stringRes);
		}
		
		boolRes = getInput_Attribute_Optionskeep_line_number_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Attribute_Optionskeep_line_number_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getInput_Attribute_Optionskeep_offset_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getInput_Attribute_Optionskeep_offset_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getAnnotation_Optionsannot_purity_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getAnnotation_Optionsannot_purity_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getAnnotation_Optionsannot_nullpointer_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getAnnotation_Optionsannot_nullpointer_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getAnnotation_Optionsannot_arraybounds_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getAnnotation_Optionsannot_arraybounds_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getAnnotation_Optionsannot_side_effect_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getAnnotation_Optionsannot_side_effect_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getAnnotation_Optionsannot_fieldrw_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getAnnotation_Optionsannot_fieldrw_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getMiscellaneous_Optionstime_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getMiscellaneous_Optionstime_widget().getAlias(), new Boolean(boolRes));
		}
		
		boolRes = getMiscellaneous_Optionssubtract_gc_widget().getButton().getSelection();
		
		
		defBoolRes = false;
		

		if (boolRes != defBoolRes) {
			getConfig().put(getMiscellaneous_Optionssubtract_gc_widget().getAlias(), new Boolean(boolRes));
		}
		
		
		setSootMainClass(getSootMainClassWidget().getText().getText());			
	}

	protected HashMap savePressed() {

		createNewConfig();
		
		return getConfig();
	}
	


	/**
	 * the initial input of selection tree corresponds to each section
	 * at some point sections will have sub-sections which will be
	 * children of branches (ie phase - options)
	 */ 
	protected SootOption getInitialInput() {
		SootOption root = new SootOption("", "");
		SootOption parent;
		SootOption subParent;
		SootOption subSectParent;
		

		
		SootOption General_Options_branch = new SootOption("General Options", "General_Options");
		root.addChild(General_Options_branch);
		parent = General_Options_branch;		
		
		SootOption Input_Options_branch = new SootOption("Input Options", "Input_Options");
		root.addChild(Input_Options_branch);
		parent = Input_Options_branch;		
		
		SootOption Output_Options_branch = new SootOption("Output Options", "Output_Options");
		root.addChild(Output_Options_branch);
		parent = Output_Options_branch;		
		
		SootOption Processing_Options_branch = new SootOption("Processing Options", "Processing_Options");
		root.addChild(Processing_Options_branch);
		parent = Processing_Options_branch;		
		
		SootOption Phase_Options_branch = new SootOption("Phase Options", "p");
		root.addChild(Phase_Options_branch);

		parent = Phase_Options_branch;	

		
		
		//Phase Options
			//Jimple Body Creation
			SootOption jb_branch = new SootOption("Jimple Body Creation", "jb");
			parent.addChild(jb_branch);
			subParent = jb_branch;


			
			SootOption jb_jb_ls_branch = new SootOption("Local Splitter", "jbjb_ls");
			subParent.addChild(jb_jb_ls_branch);


			

			
			subSectParent = jb_jb_ls_branch;
			
			
			SootOption jb_jb_a_branch = new SootOption("Jimple Local Aggregator", "jbjb_a");
			subParent.addChild(jb_jb_a_branch);


			

			
			subSectParent = jb_jb_a_branch;
			
			
			SootOption jb_jb_ule_branch = new SootOption("Unused Local Eliminator", "jbjb_ule");
			subParent.addChild(jb_jb_ule_branch);


			

			
			subSectParent = jb_jb_ule_branch;
			
			
			SootOption jb_jb_tr_branch = new SootOption("Type Assigner", "jbjb_tr");
			subParent.addChild(jb_jb_tr_branch);


			

			
			subSectParent = jb_jb_tr_branch;
			
			
			SootOption jb_jb_ulp_branch = new SootOption("Unsplit-originals Local Packer", "jbjb_ulp");
			subParent.addChild(jb_jb_ulp_branch);


			

			
			subSectParent = jb_jb_ulp_branch;
			
			
			SootOption jb_jb_lns_branch = new SootOption("Local Name Standardizer", "jbjb_lns");
			subParent.addChild(jb_jb_lns_branch);


			

			
			subSectParent = jb_jb_lns_branch;
			
			
			SootOption jb_jb_cp_branch = new SootOption("Copy Propagator", "jbjb_cp");
			subParent.addChild(jb_jb_cp_branch);


			

			
			subSectParent = jb_jb_cp_branch;
			
			
			SootOption jb_jb_dae_branch = new SootOption("Dead Assignment Eliminator", "jbjb_dae");
			subParent.addChild(jb_jb_dae_branch);


			

			
			subSectParent = jb_jb_dae_branch;
			
			
			SootOption jb_jb_cp_ule_branch = new SootOption("Post-copy propagation Unused Local Eliminator", "jbjb_cp_ule");
			subParent.addChild(jb_jb_cp_ule_branch);


			

			
			subSectParent = jb_jb_cp_ule_branch;
			
			
			SootOption jb_jb_lp_branch = new SootOption("Local Packer", "jbjb_lp");
			subParent.addChild(jb_jb_lp_branch);


			

			
			subSectParent = jb_jb_lp_branch;
			
			
			SootOption jb_jb_ne_branch = new SootOption("Nop Eliminator", "jbjb_ne");
			subParent.addChild(jb_jb_ne_branch);


			

			
			subSectParent = jb_jb_ne_branch;
			
			
			SootOption jb_jb_uce_branch = new SootOption("Unreachable Code Eliminator", "jbjb_uce");
			subParent.addChild(jb_jb_uce_branch);


			

			
			subSectParent = jb_jb_uce_branch;
			
			
			SootOption jb_jb_tt_branch = new SootOption("Trap Tightener", "jbjb_tt");
			subParent.addChild(jb_jb_tt_branch);


			

			
			subSectParent = jb_jb_tt_branch;
			
			
			//Java To Jimple Body Creation
			SootOption jj_branch = new SootOption("Java To Jimple Body Creation", "jj");
			parent.addChild(jj_branch);
			subParent = jj_branch;


			
			SootOption jj_jj_ls_branch = new SootOption("Local Splitter", "jjjj_ls");
			subParent.addChild(jj_jj_ls_branch);


			

			
			subSectParent = jj_jj_ls_branch;
			
			
			SootOption jj_jj_a_branch = new SootOption("Jimple Local Aggregator", "jjjj_a");
			subParent.addChild(jj_jj_a_branch);


			

			
			subSectParent = jj_jj_a_branch;
			
			
			SootOption jj_jj_ule_branch = new SootOption("Unused Local Eliminator", "jjjj_ule");
			subParent.addChild(jj_jj_ule_branch);


			

			
			subSectParent = jj_jj_ule_branch;
			
			
			SootOption jj_jj_tr_branch = new SootOption("Type Assigner", "jjjj_tr");
			subParent.addChild(jj_jj_tr_branch);


			

			
			subSectParent = jj_jj_tr_branch;
			
			
			SootOption jj_jj_ulp_branch = new SootOption("Unsplit-originals Local Packer", "jjjj_ulp");
			subParent.addChild(jj_jj_ulp_branch);


			

			
			subSectParent = jj_jj_ulp_branch;
			
			
			SootOption jj_jj_lns_branch = new SootOption("Local Name Standardizer", "jjjj_lns");
			subParent.addChild(jj_jj_lns_branch);


			

			
			subSectParent = jj_jj_lns_branch;
			
			
			SootOption jj_jj_cp_branch = new SootOption("Copy Propagator", "jjjj_cp");
			subParent.addChild(jj_jj_cp_branch);


			

			
			subSectParent = jj_jj_cp_branch;
			
			
			SootOption jj_jj_dae_branch = new SootOption("Dead Assignment Eliminator", "jjjj_dae");
			subParent.addChild(jj_jj_dae_branch);


			

			
			subSectParent = jj_jj_dae_branch;
			
			
			SootOption jj_jj_cp_ule_branch = new SootOption("Post-copy propagation Unused Local Eliminator", "jjjj_cp_ule");
			subParent.addChild(jj_jj_cp_ule_branch);


			

			
			subSectParent = jj_jj_cp_ule_branch;
			
			
			SootOption jj_jj_lp_branch = new SootOption("Local Packer", "jjjj_lp");
			subParent.addChild(jj_jj_lp_branch);


			

			
			subSectParent = jj_jj_lp_branch;
			
			
			SootOption jj_jj_ne_branch = new SootOption("Nop Eliminator", "jjjj_ne");
			subParent.addChild(jj_jj_ne_branch);


			

			
			subSectParent = jj_jj_ne_branch;
			
			
			SootOption jj_jj_uce_branch = new SootOption("Unreachable Code Eliminator", "jjjj_uce");
			subParent.addChild(jj_jj_uce_branch);


			

			
			subSectParent = jj_jj_uce_branch;
			
			
			//Call Graph Constructor
			SootOption cg_branch = new SootOption("Call Graph Constructor", "cg");
			parent.addChild(cg_branch);
			subParent = cg_branch;


			
			SootOption cg_cg_cha_branch = new SootOption("Class Hierarchy Analysis", "cgcg_cha");
			subParent.addChild(cg_cg_cha_branch);


			

			
			subSectParent = cg_cg_cha_branch;
			
			
			SootOption cg_cg_spark_branch = new SootOption("Spark", "cgcg_spark");
			subParent.addChild(cg_cg_spark_branch);


			

			
			subSectParent = cg_cg_spark_branch;
			
			
			SootOption cg_Spark_General_Options_branch = new SootOption("Spark General Options", "cgSpark_General_Options");

			subSectParent.addChild(cg_Spark_General_Options_branch);
			
			SootOption cg_Spark_Pointer_Assignment_Graph_Building_Options_branch = new SootOption("Spark Pointer Assignment Graph Building Options", "cgSpark_Pointer_Assignment_Graph_Building_Options");

			subSectParent.addChild(cg_Spark_Pointer_Assignment_Graph_Building_Options_branch);
			
			SootOption cg_Spark_Pointer_Assignment_Graph_Simplification_Options_branch = new SootOption("Spark Pointer Assignment Graph Simplification Options", "cgSpark_Pointer_Assignment_Graph_Simplification_Options");

			subSectParent.addChild(cg_Spark_Pointer_Assignment_Graph_Simplification_Options_branch);
			
			SootOption cg_Spark_Points_To_Set_Flowing_Options_branch = new SootOption("Spark Points-To Set Flowing Options", "cgSpark_Points_To_Set_Flowing_Options");

			subSectParent.addChild(cg_Spark_Points_To_Set_Flowing_Options_branch);
			
			SootOption cg_Spark_Output_Options_branch = new SootOption("Spark Output Options", "cgSpark_Output_Options");

			subSectParent.addChild(cg_Spark_Output_Options_branch);
			
			SootOption cg_cg_paddle_branch = new SootOption("Paddle", "cgcg_paddle");
			subParent.addChild(cg_cg_paddle_branch);


			

			
			subSectParent = cg_cg_paddle_branch;
			
			
			SootOption cg_Paddle_General_Options_branch = new SootOption("Paddle General Options", "cgPaddle_General_Options");

			subSectParent.addChild(cg_Paddle_General_Options_branch);
			
			SootOption cg_Paddle_Context_Sensitivity_Options_branch = new SootOption("Paddle Context Sensitivity Options", "cgPaddle_Context_Sensitivity_Options");

			subSectParent.addChild(cg_Paddle_Context_Sensitivity_Options_branch);
			
			SootOption cg_Paddle_Pointer_Assignment_Graph_Building_Options_branch = new SootOption("Paddle Pointer Assignment Graph Building Options", "cgPaddle_Pointer_Assignment_Graph_Building_Options");

			subSectParent.addChild(cg_Paddle_Pointer_Assignment_Graph_Building_Options_branch);
			
			SootOption cg_Paddle_Points_To_Set_Flowing_Options_branch = new SootOption("Paddle Points-To Set Flowing Options", "cgPaddle_Points_To_Set_Flowing_Options");

			subSectParent.addChild(cg_Paddle_Points_To_Set_Flowing_Options_branch);
			
			SootOption cg_Paddle_Output_Options_branch = new SootOption("Paddle Output Options", "cgPaddle_Output_Options");

			subSectParent.addChild(cg_Paddle_Output_Options_branch);
			
			//Whole Shimple Transformation Pack
			SootOption wstp_branch = new SootOption("Whole Shimple Transformation Pack", "wstp");
			parent.addChild(wstp_branch);
			subParent = wstp_branch;


			
			//Whole Shimple Optimization Pack
			SootOption wsop_branch = new SootOption("Whole Shimple Optimization Pack", "wsop");
			parent.addChild(wsop_branch);
			subParent = wsop_branch;


			
			//Whole-Jimple Transformation Pack
			SootOption wjtp_branch = new SootOption("Whole-Jimple Transformation Pack", "wjtp");
			parent.addChild(wjtp_branch);
			subParent = wjtp_branch;


			
			//Whole-Jimple Optimization Pack
			SootOption wjop_branch = new SootOption("Whole-Jimple Optimization Pack", "wjop");
			parent.addChild(wjop_branch);
			subParent = wjop_branch;


			
			SootOption wjop_wjop_smb_branch = new SootOption("Static Method Binder", "wjopwjop_smb");
			subParent.addChild(wjop_wjop_smb_branch);


			

			
			subSectParent = wjop_wjop_smb_branch;
			
			
			SootOption wjop_wjop_si_branch = new SootOption("Static Inliner", "wjopwjop_si");
			subParent.addChild(wjop_wjop_si_branch);


			

			
			subSectParent = wjop_wjop_si_branch;
			
			
			//Whole-Jimple Annotation Pack
			SootOption wjap_branch = new SootOption("Whole-Jimple Annotation Pack", "wjap");
			parent.addChild(wjap_branch);
			subParent = wjap_branch;


			
			SootOption wjap_wjap_ra_branch = new SootOption("Rectangular Array Finder", "wjapwjap_ra");
			subParent.addChild(wjap_wjap_ra_branch);


			

			
			subSectParent = wjap_wjap_ra_branch;
			
			
			SootOption wjap_wjap_umt_branch = new SootOption("Unreachable Method Tagger", "wjapwjap_umt");
			subParent.addChild(wjap_wjap_umt_branch);


			

			
			subSectParent = wjap_wjap_umt_branch;
			
			
			SootOption wjap_wjap_uft_branch = new SootOption("Unreachable Fields Tagger", "wjapwjap_uft");
			subParent.addChild(wjap_wjap_uft_branch);


			

			
			subSectParent = wjap_wjap_uft_branch;
			
			
			SootOption wjap_wjap_tqt_branch = new SootOption("Tightest Qualifiers Tagger", "wjapwjap_tqt");
			subParent.addChild(wjap_wjap_tqt_branch);


			

			
			subSectParent = wjap_wjap_tqt_branch;
			
			
			SootOption wjap_wjap_cgg_branch = new SootOption("Call Graph Grapher", "wjapwjap_cgg");
			subParent.addChild(wjap_wjap_cgg_branch);


			

			
			subSectParent = wjap_wjap_cgg_branch;
			
			
			SootOption wjap_wjap_purity_branch = new SootOption("Purity Analysis [AM]", "wjapwjap_purity");
			subParent.addChild(wjap_wjap_purity_branch);


			

			
			subSectParent = wjap_wjap_purity_branch;
			
			
			//Shimple Control
			SootOption shimple_branch = new SootOption("Shimple Control", "shimple");
			parent.addChild(shimple_branch);
			subParent = shimple_branch;


			
			//Shimple Transformation Pack
			SootOption stp_branch = new SootOption("Shimple Transformation Pack", "stp");
			parent.addChild(stp_branch);
			subParent = stp_branch;


			
			//Shimple Optimization Pack
			SootOption sop_branch = new SootOption("Shimple Optimization Pack", "sop");
			parent.addChild(sop_branch);
			subParent = sop_branch;


			
			SootOption sop_sop_cpf_branch = new SootOption("Shimple Constant Propagator and Folder", "sopsop_cpf");
			subParent.addChild(sop_sop_cpf_branch);


			

			
			subSectParent = sop_sop_cpf_branch;
			
			
			//Jimple Transformation Pack
			SootOption jtp_branch = new SootOption("Jimple Transformation Pack", "jtp");
			parent.addChild(jtp_branch);
			subParent = jtp_branch;


			
			//Jimple Optimization Pack
			SootOption jop_branch = new SootOption("Jimple Optimization Pack", "jop");
			parent.addChild(jop_branch);
			subParent = jop_branch;


			
			SootOption jop_jop_cse_branch = new SootOption("Common Subexpression Eliminator", "jopjop_cse");
			subParent.addChild(jop_jop_cse_branch);


			

			
			subSectParent = jop_jop_cse_branch;
			
			
			SootOption jop_jop_bcm_branch = new SootOption("Busy Code Motion", "jopjop_bcm");
			subParent.addChild(jop_jop_bcm_branch);


			

			
			subSectParent = jop_jop_bcm_branch;
			
			
			SootOption jop_jop_lcm_branch = new SootOption("Lazy Code Motion", "jopjop_lcm");
			subParent.addChild(jop_jop_lcm_branch);


			

			
			subSectParent = jop_jop_lcm_branch;
			
			
			SootOption jop_jop_cp_branch = new SootOption("Copy Propagator", "jopjop_cp");
			subParent.addChild(jop_jop_cp_branch);


			

			
			subSectParent = jop_jop_cp_branch;
			
			
			SootOption jop_jop_cpf_branch = new SootOption("Jimple Constant Propagator and Folder", "jopjop_cpf");
			subParent.addChild(jop_jop_cpf_branch);


			

			
			subSectParent = jop_jop_cpf_branch;
			
			
			SootOption jop_jop_cbf_branch = new SootOption("Conditional Branch Folder", "jopjop_cbf");
			subParent.addChild(jop_jop_cbf_branch);


			

			
			subSectParent = jop_jop_cbf_branch;
			
			
			SootOption jop_jop_dae_branch = new SootOption("Dead Assignment Eliminator", "jopjop_dae");
			subParent.addChild(jop_jop_dae_branch);


			

			
			subSectParent = jop_jop_dae_branch;
			
			
			SootOption jop_jop_uce1_branch = new SootOption("Unreachable Code Eliminator 1", "jopjop_uce1");
			subParent.addChild(jop_jop_uce1_branch);


			

			
			subSectParent = jop_jop_uce1_branch;
			
			
			SootOption jop_jop_ubf1_branch = new SootOption("Unconditional Branch Folder 1", "jopjop_ubf1");
			subParent.addChild(jop_jop_ubf1_branch);


			

			
			subSectParent = jop_jop_ubf1_branch;
			
			
			SootOption jop_jop_uce2_branch = new SootOption("Unreachable Code Eliminator 2", "jopjop_uce2");
			subParent.addChild(jop_jop_uce2_branch);


			

			
			subSectParent = jop_jop_uce2_branch;
			
			
			SootOption jop_jop_ubf2_branch = new SootOption("Unconditional Branch Folder 2", "jopjop_ubf2");
			subParent.addChild(jop_jop_ubf2_branch);


			

			
			subSectParent = jop_jop_ubf2_branch;
			
			
			SootOption jop_jop_ule_branch = new SootOption("Unused Local Eliminator", "jopjop_ule");
			subParent.addChild(jop_jop_ule_branch);


			

			
			subSectParent = jop_jop_ule_branch;
			
			
			//Jimple Annotation Pack
			SootOption jap_branch = new SootOption("Jimple Annotation Pack", "jap");
			parent.addChild(jap_branch);
			subParent = jap_branch;


			
			SootOption jap_jap_npc_branch = new SootOption("Null Pointer Checker", "japjap_npc");
			subParent.addChild(jap_jap_npc_branch);


			

			
			subSectParent = jap_jap_npc_branch;
			
			
			SootOption jap_jap_npcolorer_branch = new SootOption("Null Pointer Colourer", "japjap_npcolorer");
			subParent.addChild(jap_jap_npcolorer_branch);


			

			
			subSectParent = jap_jap_npcolorer_branch;
			
			
			SootOption jap_jap_abc_branch = new SootOption("Array Bound Checker", "japjap_abc");
			subParent.addChild(jap_jap_abc_branch);


			

			
			subSectParent = jap_jap_abc_branch;
			
			
			SootOption jap_jap_profiling_branch = new SootOption("Profiling Generator", "japjap_profiling");
			subParent.addChild(jap_jap_profiling_branch);


			

			
			subSectParent = jap_jap_profiling_branch;
			
			
			SootOption jap_jap_sea_branch = new SootOption("Side Effect tagger", "japjap_sea");
			subParent.addChild(jap_jap_sea_branch);


			

			
			subSectParent = jap_jap_sea_branch;
			
			
			SootOption jap_jap_fieldrw_branch = new SootOption("Field Read/Write Tagger", "japjap_fieldrw");
			subParent.addChild(jap_jap_fieldrw_branch);


			

			
			subSectParent = jap_jap_fieldrw_branch;
			
			
			SootOption jap_jap_cgtagger_branch = new SootOption("Call Graph Tagger", "japjap_cgtagger");
			subParent.addChild(jap_jap_cgtagger_branch);


			

			
			subSectParent = jap_jap_cgtagger_branch;
			
			
			SootOption jap_jap_parity_branch = new SootOption("Parity Tagger", "japjap_parity");
			subParent.addChild(jap_jap_parity_branch);


			

			
			subSectParent = jap_jap_parity_branch;
			
			
			SootOption jap_jap_pat_branch = new SootOption("Parameter Alias Tagger", "japjap_pat");
			subParent.addChild(jap_jap_pat_branch);


			

			
			subSectParent = jap_jap_pat_branch;
			
			
			SootOption jap_jap_lvtagger_branch = new SootOption("Live Variables Tagger", "japjap_lvtagger");
			subParent.addChild(jap_jap_lvtagger_branch);


			

			
			subSectParent = jap_jap_lvtagger_branch;
			
			
			SootOption jap_jap_rdtagger_branch = new SootOption("Reaching Defs Tagger", "japjap_rdtagger");
			subParent.addChild(jap_jap_rdtagger_branch);


			

			
			subSectParent = jap_jap_rdtagger_branch;
			
			
			SootOption jap_jap_che_branch = new SootOption("Cast Elimination Check Tagger", "japjap_che");
			subParent.addChild(jap_jap_che_branch);


			

			
			subSectParent = jap_jap_che_branch;
			
			
			SootOption jap_jap_umt_branch = new SootOption("Unreachable Method Transformer", "japjap_umt");
			subParent.addChild(jap_jap_umt_branch);


			

			
			subSectParent = jap_jap_umt_branch;
			
			
			SootOption jap_jap_lit_branch = new SootOption("Loop Invariant Tagger", "japjap_lit");
			subParent.addChild(jap_jap_lit_branch);


			

			
			subSectParent = jap_jap_lit_branch;
			
			
			SootOption jap_jap_aet_branch = new SootOption("Available Expressions Tagger", "japjap_aet");
			subParent.addChild(jap_jap_aet_branch);


			

			
			subSectParent = jap_jap_aet_branch;
			
			
			SootOption jap_jap_dmt_branch = new SootOption("Dominators Tagger", "japjap_dmt");
			subParent.addChild(jap_jap_dmt_branch);


			

			
			subSectParent = jap_jap_dmt_branch;
			
			
			//Grimp Body Creation
			SootOption gb_branch = new SootOption("Grimp Body Creation", "gb");
			parent.addChild(gb_branch);
			subParent = gb_branch;


			
			SootOption gb_gb_a1_branch = new SootOption("Grimp Pre-folding Aggregator", "gbgb_a1");
			subParent.addChild(gb_gb_a1_branch);


			

			
			subSectParent = gb_gb_a1_branch;
			
			
			SootOption gb_gb_cf_branch = new SootOption("Grimp Constructor Folder", "gbgb_cf");
			subParent.addChild(gb_gb_cf_branch);


			

			
			subSectParent = gb_gb_cf_branch;
			
			
			SootOption gb_gb_a2_branch = new SootOption("Grimp Post-folding Aggregator", "gbgb_a2");
			subParent.addChild(gb_gb_a2_branch);


			

			
			subSectParent = gb_gb_a2_branch;
			
			
			SootOption gb_gb_ule_branch = new SootOption("Grimp Unused Local Eliminator", "gbgb_ule");
			subParent.addChild(gb_gb_ule_branch);


			

			
			subSectParent = gb_gb_ule_branch;
			
			
			//Grimp Optimization
			SootOption gop_branch = new SootOption("Grimp Optimization", "gop");
			parent.addChild(gop_branch);
			subParent = gop_branch;


			
			//Baf Body Creation
			SootOption bb_branch = new SootOption("Baf Body Creation", "bb");
			parent.addChild(bb_branch);
			subParent = bb_branch;


			
			SootOption bb_bb_lso_branch = new SootOption("Load Store Optimizer", "bbbb_lso");
			subParent.addChild(bb_bb_lso_branch);


			

			
			subSectParent = bb_bb_lso_branch;
			
			
			SootOption bb_bb_pho_branch = new SootOption("Peephole Optimizer", "bbbb_pho");
			subParent.addChild(bb_bb_pho_branch);


			

			
			subSectParent = bb_bb_pho_branch;
			
			
			SootOption bb_bb_ule_branch = new SootOption("Unused Local Eliminator", "bbbb_ule");
			subParent.addChild(bb_bb_ule_branch);


			

			
			subSectParent = bb_bb_ule_branch;
			
			
			SootOption bb_bb_lp_branch = new SootOption("Local Packer", "bbbb_lp");
			subParent.addChild(bb_bb_lp_branch);


			

			
			subSectParent = bb_bb_lp_branch;
			
			
			//Baf Optimization
			SootOption bop_branch = new SootOption("Baf Optimization", "bop");
			parent.addChild(bop_branch);
			subParent = bop_branch;


			
			//Tag Aggregator
			SootOption tag_branch = new SootOption("Tag Aggregator", "tag");
			parent.addChild(tag_branch);
			subParent = tag_branch;


			
			SootOption tag_tag_ln_branch = new SootOption("Line Number Tag Aggregator", "tagtag_ln");
			subParent.addChild(tag_tag_ln_branch);


			

			
			subSectParent = tag_tag_ln_branch;
			
			
			SootOption tag_tag_an_branch = new SootOption("Array Bounds and Null Pointer Check Tag Aggregator", "tagtag_an");
			subParent.addChild(tag_tag_an_branch);


			

			
			subSectParent = tag_tag_an_branch;
			
			
			SootOption tag_tag_dep_branch = new SootOption("Dependence Tag Aggregator", "tagtag_dep");
			subParent.addChild(tag_tag_dep_branch);


			

			
			subSectParent = tag_tag_dep_branch;
			
			
			SootOption tag_tag_fieldrw_branch = new SootOption("Field Read/Write Tag Aggregator", "tagtag_fieldrw");
			subParent.addChild(tag_tag_fieldrw_branch);


			

			
			subSectParent = tag_tag_fieldrw_branch;
			
			
			//Dava Body Creation
			SootOption db_branch = new SootOption("Dava Body Creation", "db");
			parent.addChild(db_branch);
			subParent = db_branch;


			
			SootOption db_db_transformations_branch = new SootOption("Transformations", "dbdb_transformations");
			subParent.addChild(db_db_transformations_branch);


			

			
			subSectParent = db_db_transformations_branch;
			
			
			SootOption db_db_renamer_branch = new SootOption("Renamer", "dbdb_renamer");
			subParent.addChild(db_db_renamer_branch);


			

			
			subSectParent = db_db_renamer_branch;
			
			
			SootOption db_db_deobfuscate_branch = new SootOption("De-obfuscate", "dbdb_deobfuscate");
			subParent.addChild(db_db_deobfuscate_branch);


			

			
			subSectParent = db_db_deobfuscate_branch;
			
			
			SootOption db_db_force_recompile_branch = new SootOption("Force Recompilability", "dbdb_force_recompile");
			subParent.addChild(db_db_force_recompile_branch);


			

			
			subSectParent = db_db_force_recompile_branch;
			
			
		SootOption Application_Mode_Options_branch = new SootOption("Application Mode Options", "Application_Mode_Options");
		root.addChild(Application_Mode_Options_branch);
		parent = Application_Mode_Options_branch;		
		
		SootOption Input_Attribute_Options_branch = new SootOption("Input Attribute Options", "Input_Attribute_Options");
		root.addChild(Input_Attribute_Options_branch);
		parent = Input_Attribute_Options_branch;		
		
		SootOption Annotation_Options_branch = new SootOption("Annotation Options", "Annotation_Options");
		root.addChild(Annotation_Options_branch);
		parent = Annotation_Options_branch;		
		
		SootOption Miscellaneous_Options_branch = new SootOption("Miscellaneous Options", "Miscellaneous_Options");
		root.addChild(Miscellaneous_Options_branch);
		parent = Miscellaneous_Options_branch;		
		

		addOtherBranches(root);
		return root;
	
	}


		
		
	private BooleanOptionWidget General_Optionshelp_widget;
	
	private void setGeneral_Optionshelp_widget(BooleanOptionWidget widget) {
		General_Optionshelp_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionshelp_widget() {
		return General_Optionshelp_widget;
	}	
	
	private BooleanOptionWidget General_Optionsphase_list_widget;
	
	private void setGeneral_Optionsphase_list_widget(BooleanOptionWidget widget) {
		General_Optionsphase_list_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsphase_list_widget() {
		return General_Optionsphase_list_widget;
	}	
	
	private BooleanOptionWidget General_Optionsversion_widget;
	
	private void setGeneral_Optionsversion_widget(BooleanOptionWidget widget) {
		General_Optionsversion_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsversion_widget() {
		return General_Optionsversion_widget;
	}	
	
	private BooleanOptionWidget General_Optionsverbose_widget;
	
	private void setGeneral_Optionsverbose_widget(BooleanOptionWidget widget) {
		General_Optionsverbose_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsverbose_widget() {
		return General_Optionsverbose_widget;
	}	
	
	private BooleanOptionWidget General_Optionsinteractive_mode_widget;
	
	private void setGeneral_Optionsinteractive_mode_widget(BooleanOptionWidget widget) {
		General_Optionsinteractive_mode_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsinteractive_mode_widget() {
		return General_Optionsinteractive_mode_widget;
	}	
	
	private BooleanOptionWidget General_Optionsapp_widget;
	
	private void setGeneral_Optionsapp_widget(BooleanOptionWidget widget) {
		General_Optionsapp_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsapp_widget() {
		return General_Optionsapp_widget;
	}	
	
	private BooleanOptionWidget General_Optionswhole_program_widget;
	
	private void setGeneral_Optionswhole_program_widget(BooleanOptionWidget widget) {
		General_Optionswhole_program_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionswhole_program_widget() {
		return General_Optionswhole_program_widget;
	}	
	
	private BooleanOptionWidget General_Optionswhole_shimple_widget;
	
	private void setGeneral_Optionswhole_shimple_widget(BooleanOptionWidget widget) {
		General_Optionswhole_shimple_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionswhole_shimple_widget() {
		return General_Optionswhole_shimple_widget;
	}	
	
	private BooleanOptionWidget General_Optionsvalidate_widget;
	
	private void setGeneral_Optionsvalidate_widget(BooleanOptionWidget widget) {
		General_Optionsvalidate_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsvalidate_widget() {
		return General_Optionsvalidate_widget;
	}	
	
	private BooleanOptionWidget General_Optionsdebug_widget;
	
	private void setGeneral_Optionsdebug_widget(BooleanOptionWidget widget) {
		General_Optionsdebug_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsdebug_widget() {
		return General_Optionsdebug_widget;
	}	
	
	private BooleanOptionWidget General_Optionsdebug_resolver_widget;
	
	private void setGeneral_Optionsdebug_resolver_widget(BooleanOptionWidget widget) {
		General_Optionsdebug_resolver_widget = widget;
	}
	
	public BooleanOptionWidget getGeneral_Optionsdebug_resolver_widget() {
		return General_Optionsdebug_resolver_widget;
	}	
	

	private ListOptionWidget General_Optionsphase_help_widget;
	
	private void setGeneral_Optionsphase_help_widget(ListOptionWidget widget) {
		General_Optionsphase_help_widget = widget;
	}
	
	public ListOptionWidget getGeneral_Optionsphase_help_widget() {
		return General_Optionsphase_help_widget;
	}	
	
	
	private BooleanOptionWidget Input_Optionsast_metrics_widget;
	
	private void setInput_Optionsast_metrics_widget(BooleanOptionWidget widget) {
		Input_Optionsast_metrics_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Optionsast_metrics_widget() {
		return Input_Optionsast_metrics_widget;
	}	
	
	private BooleanOptionWidget Input_Optionsfull_resolver_widget;
	
	private void setInput_Optionsfull_resolver_widget(BooleanOptionWidget widget) {
		Input_Optionsfull_resolver_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Optionsfull_resolver_widget() {
		return Input_Optionsfull_resolver_widget;
	}	
	
	private BooleanOptionWidget Input_Optionsallow_phantom_refs_widget;
	
	private void setInput_Optionsallow_phantom_refs_widget(BooleanOptionWidget widget) {
		Input_Optionsallow_phantom_refs_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Optionsallow_phantom_refs_widget() {
		return Input_Optionsallow_phantom_refs_widget;
	}	
	
	private BooleanOptionWidget Input_Optionsuse_old_type_assigner_widget;
	
	private void setInput_Optionsuse_old_type_assigner_widget(BooleanOptionWidget widget) {
		Input_Optionsuse_old_type_assigner_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Optionsuse_old_type_assigner_widget() {
		return Input_Optionsuse_old_type_assigner_widget;
	}	
	

	private ListOptionWidget Input_Optionsprocess_dir_widget;
	
	private void setInput_Optionsprocess_dir_widget(ListOptionWidget widget) {
		Input_Optionsprocess_dir_widget = widget;
	}
	
	public ListOptionWidget getInput_Optionsprocess_dir_widget() {
		return Input_Optionsprocess_dir_widget;
	}	
	
	
	
	private StringOptionWidget Input_Optionssoot_classpath_widget;
	
	private void setInput_Optionssoot_classpath_widget(StringOptionWidget widget) {
		Input_Optionssoot_classpath_widget = widget;
	}
	
	public StringOptionWidget getInput_Optionssoot_classpath_widget() {
		return Input_Optionssoot_classpath_widget;
	}
	
	
	
	private StringOptionWidget Input_Optionsmain_class_widget;
	
	private void setInput_Optionsmain_class_widget(StringOptionWidget widget) {
		Input_Optionsmain_class_widget = widget;
	}
	
	public StringOptionWidget getInput_Optionsmain_class_widget() {
		return Input_Optionsmain_class_widget;
	}
	
	
	
	private MultiOptionWidget Input_Optionssrc_prec_widget;
	
	private void setInput_Optionssrc_prec_widget(MultiOptionWidget widget) {
		Input_Optionssrc_prec_widget = widget;
	}
	
	public MultiOptionWidget getInput_Optionssrc_prec_widget() {
		return Input_Optionssrc_prec_widget;
	}	
	
	
	private BooleanOptionWidget Output_Optionsoutput_jar_widget;
	
	private void setOutput_Optionsoutput_jar_widget(BooleanOptionWidget widget) {
		Output_Optionsoutput_jar_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsoutput_jar_widget() {
		return Output_Optionsoutput_jar_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsxml_attributes_widget;
	
	private void setOutput_Optionsxml_attributes_widget(BooleanOptionWidget widget) {
		Output_Optionsxml_attributes_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsxml_attributes_widget() {
		return Output_Optionsxml_attributes_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsprint_tags_in_output_widget;
	
	private void setOutput_Optionsprint_tags_in_output_widget(BooleanOptionWidget widget) {
		Output_Optionsprint_tags_in_output_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsprint_tags_in_output_widget() {
		return Output_Optionsprint_tags_in_output_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsno_output_source_file_attribute_widget;
	
	private void setOutput_Optionsno_output_source_file_attribute_widget(BooleanOptionWidget widget) {
		Output_Optionsno_output_source_file_attribute_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsno_output_source_file_attribute_widget() {
		return Output_Optionsno_output_source_file_attribute_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsno_output_inner_classes_attribute_widget;
	
	private void setOutput_Optionsno_output_inner_classes_attribute_widget(BooleanOptionWidget widget) {
		Output_Optionsno_output_inner_classes_attribute_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsno_output_inner_classes_attribute_widget() {
		return Output_Optionsno_output_inner_classes_attribute_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsshow_exception_dests_widget;
	
	private void setOutput_Optionsshow_exception_dests_widget(BooleanOptionWidget widget) {
		Output_Optionsshow_exception_dests_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsshow_exception_dests_widget() {
		return Output_Optionsshow_exception_dests_widget;
	}	
	
	private BooleanOptionWidget Output_Optionsgzip_widget;
	
	private void setOutput_Optionsgzip_widget(BooleanOptionWidget widget) {
		Output_Optionsgzip_widget = widget;
	}
	
	public BooleanOptionWidget getOutput_Optionsgzip_widget() {
		return Output_Optionsgzip_widget;
	}	
	

	private ListOptionWidget Output_Optionsdump_body_widget;
	
	private void setOutput_Optionsdump_body_widget(ListOptionWidget widget) {
		Output_Optionsdump_body_widget = widget;
	}
	
	public ListOptionWidget getOutput_Optionsdump_body_widget() {
		return Output_Optionsdump_body_widget;
	}	
	
	

	private ListOptionWidget Output_Optionsdump_cfg_widget;
	
	private void setOutput_Optionsdump_cfg_widget(ListOptionWidget widget) {
		Output_Optionsdump_cfg_widget = widget;
	}
	
	public ListOptionWidget getOutput_Optionsdump_cfg_widget() {
		return Output_Optionsdump_cfg_widget;
	}	
	
	
	
	private StringOptionWidget Output_Optionsoutput_dir_widget;
	
	private void setOutput_Optionsoutput_dir_widget(StringOptionWidget widget) {
		Output_Optionsoutput_dir_widget = widget;
	}
	
	public StringOptionWidget getOutput_Optionsoutput_dir_widget() {
		return Output_Optionsoutput_dir_widget;
	}
	
	
	
	private MultiOptionWidget Output_Optionsoutput_format_widget;
	
	private void setOutput_Optionsoutput_format_widget(MultiOptionWidget widget) {
		Output_Optionsoutput_format_widget = widget;
	}
	
	public MultiOptionWidget getOutput_Optionsoutput_format_widget() {
		return Output_Optionsoutput_format_widget;
	}	
	
	
	private BooleanOptionWidget Processing_Optionsoptimize_widget;
	
	private void setProcessing_Optionsoptimize_widget(BooleanOptionWidget widget) {
		Processing_Optionsoptimize_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionsoptimize_widget() {
		return Processing_Optionsoptimize_widget;
	}	
	
	private BooleanOptionWidget Processing_Optionswhole_optimize_widget;
	
	private void setProcessing_Optionswhole_optimize_widget(BooleanOptionWidget widget) {
		Processing_Optionswhole_optimize_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionswhole_optimize_widget() {
		return Processing_Optionswhole_optimize_widget;
	}	
	
	private BooleanOptionWidget Processing_Optionsvia_grimp_widget;
	
	private void setProcessing_Optionsvia_grimp_widget(BooleanOptionWidget widget) {
		Processing_Optionsvia_grimp_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionsvia_grimp_widget() {
		return Processing_Optionsvia_grimp_widget;
	}	
	
	private BooleanOptionWidget Processing_Optionsvia_shimple_widget;
	
	private void setProcessing_Optionsvia_shimple_widget(BooleanOptionWidget widget) {
		Processing_Optionsvia_shimple_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionsvia_shimple_widget() {
		return Processing_Optionsvia_shimple_widget;
	}	
	
	private BooleanOptionWidget Processing_Optionsomit_excepting_unit_edges_widget;
	
	private void setProcessing_Optionsomit_excepting_unit_edges_widget(BooleanOptionWidget widget) {
		Processing_Optionsomit_excepting_unit_edges_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionsomit_excepting_unit_edges_widget() {
		return Processing_Optionsomit_excepting_unit_edges_widget;
	}	
	
	private BooleanOptionWidget Processing_Optionstrim_cfgs_widget;
	
	private void setProcessing_Optionstrim_cfgs_widget(BooleanOptionWidget widget) {
		Processing_Optionstrim_cfgs_widget = widget;
	}
	
	public BooleanOptionWidget getProcessing_Optionstrim_cfgs_widget() {
		return Processing_Optionstrim_cfgs_widget;
	}	
	
	
	private MultiOptionWidget Processing_Optionsthrow_analysis_widget;
	
	private void setProcessing_Optionsthrow_analysis_widget(MultiOptionWidget widget) {
		Processing_Optionsthrow_analysis_widget = widget;
	}
	
	public MultiOptionWidget getProcessing_Optionsthrow_analysis_widget() {
		return Processing_Optionsthrow_analysis_widget;
	}	
	
	
	private BooleanOptionWidget jbenabled_widget;
	
	private void setjbenabled_widget(BooleanOptionWidget widget) {
		jbenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbenabled_widget() {
		return jbenabled_widget;
	}	
	
	private BooleanOptionWidget jbuse_original_names_widget;
	
	private void setjbuse_original_names_widget(BooleanOptionWidget widget) {
		jbuse_original_names_widget = widget;
	}
	
	public BooleanOptionWidget getjbuse_original_names_widget() {
		return jbuse_original_names_widget;
	}	
	
	private BooleanOptionWidget jbjb_lsenabled_widget;
	
	private void setjbjb_lsenabled_widget(BooleanOptionWidget widget) {
		jbjb_lsenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_lsenabled_widget() {
		return jbjb_lsenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_aenabled_widget;
	
	private void setjbjb_aenabled_widget(BooleanOptionWidget widget) {
		jbjb_aenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_aenabled_widget() {
		return jbjb_aenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_aonly_stack_locals_widget;
	
	private void setjbjb_aonly_stack_locals_widget(BooleanOptionWidget widget) {
		jbjb_aonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_aonly_stack_locals_widget() {
		return jbjb_aonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_uleenabled_widget;
	
	private void setjbjb_uleenabled_widget(BooleanOptionWidget widget) {
		jbjb_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_uleenabled_widget() {
		return jbjb_uleenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_trenabled_widget;
	
	private void setjbjb_trenabled_widget(BooleanOptionWidget widget) {
		jbjb_trenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_trenabled_widget() {
		return jbjb_trenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_ulpenabled_widget;
	
	private void setjbjb_ulpenabled_widget(BooleanOptionWidget widget) {
		jbjb_ulpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_ulpenabled_widget() {
		return jbjb_ulpenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_ulpunsplit_original_locals_widget;
	
	private void setjbjb_ulpunsplit_original_locals_widget(BooleanOptionWidget widget) {
		jbjb_ulpunsplit_original_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_ulpunsplit_original_locals_widget() {
		return jbjb_ulpunsplit_original_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_lnsenabled_widget;
	
	private void setjbjb_lnsenabled_widget(BooleanOptionWidget widget) {
		jbjb_lnsenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_lnsenabled_widget() {
		return jbjb_lnsenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_lnsonly_stack_locals_widget;
	
	private void setjbjb_lnsonly_stack_locals_widget(BooleanOptionWidget widget) {
		jbjb_lnsonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_lnsonly_stack_locals_widget() {
		return jbjb_lnsonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_cpenabled_widget;
	
	private void setjbjb_cpenabled_widget(BooleanOptionWidget widget) {
		jbjb_cpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_cpenabled_widget() {
		return jbjb_cpenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_cponly_regular_locals_widget;
	
	private void setjbjb_cponly_regular_locals_widget(BooleanOptionWidget widget) {
		jbjb_cponly_regular_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_cponly_regular_locals_widget() {
		return jbjb_cponly_regular_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_cponly_stack_locals_widget;
	
	private void setjbjb_cponly_stack_locals_widget(BooleanOptionWidget widget) {
		jbjb_cponly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_cponly_stack_locals_widget() {
		return jbjb_cponly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_daeenabled_widget;
	
	private void setjbjb_daeenabled_widget(BooleanOptionWidget widget) {
		jbjb_daeenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_daeenabled_widget() {
		return jbjb_daeenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_daeonly_stack_locals_widget;
	
	private void setjbjb_daeonly_stack_locals_widget(BooleanOptionWidget widget) {
		jbjb_daeonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_daeonly_stack_locals_widget() {
		return jbjb_daeonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_cp_uleenabled_widget;
	
	private void setjbjb_cp_uleenabled_widget(BooleanOptionWidget widget) {
		jbjb_cp_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_cp_uleenabled_widget() {
		return jbjb_cp_uleenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_lpenabled_widget;
	
	private void setjbjb_lpenabled_widget(BooleanOptionWidget widget) {
		jbjb_lpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_lpenabled_widget() {
		return jbjb_lpenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_lpunsplit_original_locals_widget;
	
	private void setjbjb_lpunsplit_original_locals_widget(BooleanOptionWidget widget) {
		jbjb_lpunsplit_original_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_lpunsplit_original_locals_widget() {
		return jbjb_lpunsplit_original_locals_widget;
	}	
	
	private BooleanOptionWidget jbjb_neenabled_widget;
	
	private void setjbjb_neenabled_widget(BooleanOptionWidget widget) {
		jbjb_neenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_neenabled_widget() {
		return jbjb_neenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_uceenabled_widget;
	
	private void setjbjb_uceenabled_widget(BooleanOptionWidget widget) {
		jbjb_uceenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_uceenabled_widget() {
		return jbjb_uceenabled_widget;
	}	
	
	private BooleanOptionWidget jbjb_uceremove_unreachable_traps_widget;
	
	private void setjbjb_uceremove_unreachable_traps_widget(BooleanOptionWidget widget) {
		jbjb_uceremove_unreachable_traps_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_uceremove_unreachable_traps_widget() {
		return jbjb_uceremove_unreachable_traps_widget;
	}	
	
	private BooleanOptionWidget jbjb_ttenabled_widget;
	
	private void setjbjb_ttenabled_widget(BooleanOptionWidget widget) {
		jbjb_ttenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjbjb_ttenabled_widget() {
		return jbjb_ttenabled_widget;
	}	
	
	private BooleanOptionWidget jjenabled_widget;
	
	private void setjjenabled_widget(BooleanOptionWidget widget) {
		jjenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjenabled_widget() {
		return jjenabled_widget;
	}	
	
	private BooleanOptionWidget jjuse_original_names_widget;
	
	private void setjjuse_original_names_widget(BooleanOptionWidget widget) {
		jjuse_original_names_widget = widget;
	}
	
	public BooleanOptionWidget getjjuse_original_names_widget() {
		return jjuse_original_names_widget;
	}	
	
	private BooleanOptionWidget jjjj_lsenabled_widget;
	
	private void setjjjj_lsenabled_widget(BooleanOptionWidget widget) {
		jjjj_lsenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_lsenabled_widget() {
		return jjjj_lsenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_aenabled_widget;
	
	private void setjjjj_aenabled_widget(BooleanOptionWidget widget) {
		jjjj_aenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_aenabled_widget() {
		return jjjj_aenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_aonly_stack_locals_widget;
	
	private void setjjjj_aonly_stack_locals_widget(BooleanOptionWidget widget) {
		jjjj_aonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_aonly_stack_locals_widget() {
		return jjjj_aonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_uleenabled_widget;
	
	private void setjjjj_uleenabled_widget(BooleanOptionWidget widget) {
		jjjj_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_uleenabled_widget() {
		return jjjj_uleenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_trenabled_widget;
	
	private void setjjjj_trenabled_widget(BooleanOptionWidget widget) {
		jjjj_trenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_trenabled_widget() {
		return jjjj_trenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_ulpenabled_widget;
	
	private void setjjjj_ulpenabled_widget(BooleanOptionWidget widget) {
		jjjj_ulpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_ulpenabled_widget() {
		return jjjj_ulpenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_ulpunsplit_original_locals_widget;
	
	private void setjjjj_ulpunsplit_original_locals_widget(BooleanOptionWidget widget) {
		jjjj_ulpunsplit_original_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_ulpunsplit_original_locals_widget() {
		return jjjj_ulpunsplit_original_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_lnsenabled_widget;
	
	private void setjjjj_lnsenabled_widget(BooleanOptionWidget widget) {
		jjjj_lnsenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_lnsenabled_widget() {
		return jjjj_lnsenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_lnsonly_stack_locals_widget;
	
	private void setjjjj_lnsonly_stack_locals_widget(BooleanOptionWidget widget) {
		jjjj_lnsonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_lnsonly_stack_locals_widget() {
		return jjjj_lnsonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_cpenabled_widget;
	
	private void setjjjj_cpenabled_widget(BooleanOptionWidget widget) {
		jjjj_cpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_cpenabled_widget() {
		return jjjj_cpenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_cponly_regular_locals_widget;
	
	private void setjjjj_cponly_regular_locals_widget(BooleanOptionWidget widget) {
		jjjj_cponly_regular_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_cponly_regular_locals_widget() {
		return jjjj_cponly_regular_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_cponly_stack_locals_widget;
	
	private void setjjjj_cponly_stack_locals_widget(BooleanOptionWidget widget) {
		jjjj_cponly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_cponly_stack_locals_widget() {
		return jjjj_cponly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_daeenabled_widget;
	
	private void setjjjj_daeenabled_widget(BooleanOptionWidget widget) {
		jjjj_daeenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_daeenabled_widget() {
		return jjjj_daeenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_daeonly_stack_locals_widget;
	
	private void setjjjj_daeonly_stack_locals_widget(BooleanOptionWidget widget) {
		jjjj_daeonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_daeonly_stack_locals_widget() {
		return jjjj_daeonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_cp_uleenabled_widget;
	
	private void setjjjj_cp_uleenabled_widget(BooleanOptionWidget widget) {
		jjjj_cp_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_cp_uleenabled_widget() {
		return jjjj_cp_uleenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_lpenabled_widget;
	
	private void setjjjj_lpenabled_widget(BooleanOptionWidget widget) {
		jjjj_lpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_lpenabled_widget() {
		return jjjj_lpenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_lpunsplit_original_locals_widget;
	
	private void setjjjj_lpunsplit_original_locals_widget(BooleanOptionWidget widget) {
		jjjj_lpunsplit_original_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_lpunsplit_original_locals_widget() {
		return jjjj_lpunsplit_original_locals_widget;
	}	
	
	private BooleanOptionWidget jjjj_neenabled_widget;
	
	private void setjjjj_neenabled_widget(BooleanOptionWidget widget) {
		jjjj_neenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_neenabled_widget() {
		return jjjj_neenabled_widget;
	}	
	
	private BooleanOptionWidget jjjj_uceenabled_widget;
	
	private void setjjjj_uceenabled_widget(BooleanOptionWidget widget) {
		jjjj_uceenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjjjj_uceenabled_widget() {
		return jjjj_uceenabled_widget;
	}	
	
	private BooleanOptionWidget cgenabled_widget;
	
	private void setcgenabled_widget(BooleanOptionWidget widget) {
		cgenabled_widget = widget;
	}
	
	public BooleanOptionWidget getcgenabled_widget() {
		return cgenabled_widget;
	}	
	
	private BooleanOptionWidget cgsafe_forname_widget;
	
	private void setcgsafe_forname_widget(BooleanOptionWidget widget) {
		cgsafe_forname_widget = widget;
	}
	
	public BooleanOptionWidget getcgsafe_forname_widget() {
		return cgsafe_forname_widget;
	}	
	
	private BooleanOptionWidget cgsafe_newinstance_widget;
	
	private void setcgsafe_newinstance_widget(BooleanOptionWidget widget) {
		cgsafe_newinstance_widget = widget;
	}
	
	public BooleanOptionWidget getcgsafe_newinstance_widget() {
		return cgsafe_newinstance_widget;
	}	
	
	private BooleanOptionWidget cgverbose_widget;
	
	private void setcgverbose_widget(BooleanOptionWidget widget) {
		cgverbose_widget = widget;
	}
	
	public BooleanOptionWidget getcgverbose_widget() {
		return cgverbose_widget;
	}	
	
	private BooleanOptionWidget cgall_reachable_widget;
	
	private void setcgall_reachable_widget(BooleanOptionWidget widget) {
		cgall_reachable_widget = widget;
	}
	
	public BooleanOptionWidget getcgall_reachable_widget() {
		return cgall_reachable_widget;
	}	
	
	private BooleanOptionWidget cgimplicit_entry_widget;
	
	private void setcgimplicit_entry_widget(BooleanOptionWidget widget) {
		cgimplicit_entry_widget = widget;
	}
	
	public BooleanOptionWidget getcgimplicit_entry_widget() {
		return cgimplicit_entry_widget;
	}	
	
	private BooleanOptionWidget cgtrim_clinit_widget;
	
	private void setcgtrim_clinit_widget(BooleanOptionWidget widget) {
		cgtrim_clinit_widget = widget;
	}
	
	public BooleanOptionWidget getcgtrim_clinit_widget() {
		return cgtrim_clinit_widget;
	}	
	
	
	private StringOptionWidget cgjdkver_widget;
	
	private void setcgjdkver_widget(StringOptionWidget widget) {
		cgjdkver_widget = widget;
	}
	
	public StringOptionWidget getcgjdkver_widget() {
		return cgjdkver_widget;
	}
	
	
	private BooleanOptionWidget cgcg_chaenabled_widget;
	
	private void setcgcg_chaenabled_widget(BooleanOptionWidget widget) {
		cgcg_chaenabled_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_chaenabled_widget() {
		return cgcg_chaenabled_widget;
	}	
	
	private BooleanOptionWidget cgcg_chaverbose_widget;
	
	private void setcgcg_chaverbose_widget(BooleanOptionWidget widget) {
		cgcg_chaverbose_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_chaverbose_widget() {
		return cgcg_chaverbose_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkenabled_widget;
	
	private void setcgcg_sparkenabled_widget(BooleanOptionWidget widget) {
		cgcg_sparkenabled_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkenabled_widget() {
		return cgcg_sparkenabled_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkverbose_widget;
	
	private void setcgcg_sparkverbose_widget(BooleanOptionWidget widget) {
		cgcg_sparkverbose_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkverbose_widget() {
		return cgcg_sparkverbose_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkignore_types_widget;
	
	private void setcgcg_sparkignore_types_widget(BooleanOptionWidget widget) {
		cgcg_sparkignore_types_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkignore_types_widget() {
		return cgcg_sparkignore_types_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkforce_gc_widget;
	
	private void setcgcg_sparkforce_gc_widget(BooleanOptionWidget widget) {
		cgcg_sparkforce_gc_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkforce_gc_widget() {
		return cgcg_sparkforce_gc_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkpre_jimplify_widget;
	
	private void setcgcg_sparkpre_jimplify_widget(BooleanOptionWidget widget) {
		cgcg_sparkpre_jimplify_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkpre_jimplify_widget() {
		return cgcg_sparkpre_jimplify_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkvta_widget;
	
	private void setcgcg_sparkvta_widget(BooleanOptionWidget widget) {
		cgcg_sparkvta_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkvta_widget() {
		return cgcg_sparkvta_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkrta_widget;
	
	private void setcgcg_sparkrta_widget(BooleanOptionWidget widget) {
		cgcg_sparkrta_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkrta_widget() {
		return cgcg_sparkrta_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkfield_based_widget;
	
	private void setcgcg_sparkfield_based_widget(BooleanOptionWidget widget) {
		cgcg_sparkfield_based_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkfield_based_widget() {
		return cgcg_sparkfield_based_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparktypes_for_sites_widget;
	
	private void setcgcg_sparktypes_for_sites_widget(BooleanOptionWidget widget) {
		cgcg_sparktypes_for_sites_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparktypes_for_sites_widget() {
		return cgcg_sparktypes_for_sites_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkmerge_stringbuffer_widget;
	
	private void setcgcg_sparkmerge_stringbuffer_widget(BooleanOptionWidget widget) {
		cgcg_sparkmerge_stringbuffer_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkmerge_stringbuffer_widget() {
		return cgcg_sparkmerge_stringbuffer_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkstring_constants_widget;
	
	private void setcgcg_sparkstring_constants_widget(BooleanOptionWidget widget) {
		cgcg_sparkstring_constants_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkstring_constants_widget() {
		return cgcg_sparkstring_constants_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparksimulate_natives_widget;
	
	private void setcgcg_sparksimulate_natives_widget(BooleanOptionWidget widget) {
		cgcg_sparksimulate_natives_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparksimulate_natives_widget() {
		return cgcg_sparksimulate_natives_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparksimple_edges_bidirectional_widget;
	
	private void setcgcg_sparksimple_edges_bidirectional_widget(BooleanOptionWidget widget) {
		cgcg_sparksimple_edges_bidirectional_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparksimple_edges_bidirectional_widget() {
		return cgcg_sparksimple_edges_bidirectional_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkon_fly_cg_widget;
	
	private void setcgcg_sparkon_fly_cg_widget(BooleanOptionWidget widget) {
		cgcg_sparkon_fly_cg_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkon_fly_cg_widget() {
		return cgcg_sparkon_fly_cg_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparksimplify_offline_widget;
	
	private void setcgcg_sparksimplify_offline_widget(BooleanOptionWidget widget) {
		cgcg_sparksimplify_offline_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparksimplify_offline_widget() {
		return cgcg_sparksimplify_offline_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparksimplify_sccs_widget;
	
	private void setcgcg_sparksimplify_sccs_widget(BooleanOptionWidget widget) {
		cgcg_sparksimplify_sccs_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparksimplify_sccs_widget() {
		return cgcg_sparksimplify_sccs_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkignore_types_for_sccs_widget;
	
	private void setcgcg_sparkignore_types_for_sccs_widget(BooleanOptionWidget widget) {
		cgcg_sparkignore_types_for_sccs_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkignore_types_for_sccs_widget() {
		return cgcg_sparkignore_types_for_sccs_widget;
	}	
	
	
	private MultiOptionWidget cgcg_sparkpropagator_widget;
	
	private void setcgcg_sparkpropagator_widget(MultiOptionWidget widget) {
		cgcg_sparkpropagator_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_sparkpropagator_widget() {
		return cgcg_sparkpropagator_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_sparkset_impl_widget;
	
	private void setcgcg_sparkset_impl_widget(MultiOptionWidget widget) {
		cgcg_sparkset_impl_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_sparkset_impl_widget() {
		return cgcg_sparkset_impl_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_sparkdouble_set_old_widget;
	
	private void setcgcg_sparkdouble_set_old_widget(MultiOptionWidget widget) {
		cgcg_sparkdouble_set_old_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_sparkdouble_set_old_widget() {
		return cgcg_sparkdouble_set_old_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_sparkdouble_set_new_widget;
	
	private void setcgcg_sparkdouble_set_new_widget(MultiOptionWidget widget) {
		cgcg_sparkdouble_set_new_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_sparkdouble_set_new_widget() {
		return cgcg_sparkdouble_set_new_widget;
	}	
	
	
	private BooleanOptionWidget cgcg_sparkdump_html_widget;
	
	private void setcgcg_sparkdump_html_widget(BooleanOptionWidget widget) {
		cgcg_sparkdump_html_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkdump_html_widget() {
		return cgcg_sparkdump_html_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkdump_pag_widget;
	
	private void setcgcg_sparkdump_pag_widget(BooleanOptionWidget widget) {
		cgcg_sparkdump_pag_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkdump_pag_widget() {
		return cgcg_sparkdump_pag_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkdump_solution_widget;
	
	private void setcgcg_sparkdump_solution_widget(BooleanOptionWidget widget) {
		cgcg_sparkdump_solution_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkdump_solution_widget() {
		return cgcg_sparkdump_solution_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparktopo_sort_widget;
	
	private void setcgcg_sparktopo_sort_widget(BooleanOptionWidget widget) {
		cgcg_sparktopo_sort_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparktopo_sort_widget() {
		return cgcg_sparktopo_sort_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkdump_types_widget;
	
	private void setcgcg_sparkdump_types_widget(BooleanOptionWidget widget) {
		cgcg_sparkdump_types_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkdump_types_widget() {
		return cgcg_sparkdump_types_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkclass_method_var_widget;
	
	private void setcgcg_sparkclass_method_var_widget(BooleanOptionWidget widget) {
		cgcg_sparkclass_method_var_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkclass_method_var_widget() {
		return cgcg_sparkclass_method_var_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkdump_answer_widget;
	
	private void setcgcg_sparkdump_answer_widget(BooleanOptionWidget widget) {
		cgcg_sparkdump_answer_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkdump_answer_widget() {
		return cgcg_sparkdump_answer_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkadd_tags_widget;
	
	private void setcgcg_sparkadd_tags_widget(BooleanOptionWidget widget) {
		cgcg_sparkadd_tags_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkadd_tags_widget() {
		return cgcg_sparkadd_tags_widget;
	}	
	
	private BooleanOptionWidget cgcg_sparkset_mass_widget;
	
	private void setcgcg_sparkset_mass_widget(BooleanOptionWidget widget) {
		cgcg_sparkset_mass_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_sparkset_mass_widget() {
		return cgcg_sparkset_mass_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleenabled_widget;
	
	private void setcgcg_paddleenabled_widget(BooleanOptionWidget widget) {
		cgcg_paddleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleenabled_widget() {
		return cgcg_paddleenabled_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleverbose_widget;
	
	private void setcgcg_paddleverbose_widget(BooleanOptionWidget widget) {
		cgcg_paddleverbose_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleverbose_widget() {
		return cgcg_paddleverbose_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlebdd_widget;
	
	private void setcgcg_paddlebdd_widget(BooleanOptionWidget widget) {
		cgcg_paddlebdd_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlebdd_widget() {
		return cgcg_paddlebdd_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddledynamic_order_widget;
	
	private void setcgcg_paddledynamic_order_widget(BooleanOptionWidget widget) {
		cgcg_paddledynamic_order_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddledynamic_order_widget() {
		return cgcg_paddledynamic_order_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleprofile_widget;
	
	private void setcgcg_paddleprofile_widget(BooleanOptionWidget widget) {
		cgcg_paddleprofile_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleprofile_widget() {
		return cgcg_paddleprofile_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleignore_types_widget;
	
	private void setcgcg_paddleignore_types_widget(BooleanOptionWidget widget) {
		cgcg_paddleignore_types_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleignore_types_widget() {
		return cgcg_paddleignore_types_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlepre_jimplify_widget;
	
	private void setcgcg_paddlepre_jimplify_widget(BooleanOptionWidget widget) {
		cgcg_paddlepre_jimplify_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlepre_jimplify_widget() {
		return cgcg_paddlepre_jimplify_widget;
	}	
	
	
	private StringOptionWidget cgcg_paddleorder_widget;
	
	private void setcgcg_paddleorder_widget(StringOptionWidget widget) {
		cgcg_paddleorder_widget = widget;
	}
	
	public StringOptionWidget getcgcg_paddleorder_widget() {
		return cgcg_paddleorder_widget;
	}
	
	
	
	private MultiOptionWidget cgcg_paddleconf_widget;
	
	private void setcgcg_paddleconf_widget(MultiOptionWidget widget) {
		cgcg_paddleconf_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddleconf_widget() {
		return cgcg_paddleconf_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_paddleq_widget;
	
	private void setcgcg_paddleq_widget(MultiOptionWidget widget) {
		cgcg_paddleq_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddleq_widget() {
		return cgcg_paddleq_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_paddlebackend_widget;
	
	private void setcgcg_paddlebackend_widget(MultiOptionWidget widget) {
		cgcg_paddlebackend_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddlebackend_widget() {
		return cgcg_paddlebackend_widget;
	}	
	
	
	private BooleanOptionWidget cgcg_paddlecontext_heap_widget;
	
	private void setcgcg_paddlecontext_heap_widget(BooleanOptionWidget widget) {
		cgcg_paddlecontext_heap_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlecontext_heap_widget() {
		return cgcg_paddlecontext_heap_widget;
	}	
	
	
	private StringOptionWidget cgcg_paddlek_widget;
	
	private void setcgcg_paddlek_widget(StringOptionWidget widget) {
		cgcg_paddlek_widget = widget;
	}
	
	public StringOptionWidget getcgcg_paddlek_widget() {
		return cgcg_paddlek_widget;
	}
	
	
	
	private MultiOptionWidget cgcg_paddlecontext_widget;
	
	private void setcgcg_paddlecontext_widget(MultiOptionWidget widget) {
		cgcg_paddlecontext_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddlecontext_widget() {
		return cgcg_paddlecontext_widget;
	}	
	
	
	private BooleanOptionWidget cgcg_paddlerta_widget;
	
	private void setcgcg_paddlerta_widget(BooleanOptionWidget widget) {
		cgcg_paddlerta_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlerta_widget() {
		return cgcg_paddlerta_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlefield_based_widget;
	
	private void setcgcg_paddlefield_based_widget(BooleanOptionWidget widget) {
		cgcg_paddlefield_based_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlefield_based_widget() {
		return cgcg_paddlefield_based_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddletypes_for_sites_widget;
	
	private void setcgcg_paddletypes_for_sites_widget(BooleanOptionWidget widget) {
		cgcg_paddletypes_for_sites_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddletypes_for_sites_widget() {
		return cgcg_paddletypes_for_sites_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlemerge_stringbuffer_widget;
	
	private void setcgcg_paddlemerge_stringbuffer_widget(BooleanOptionWidget widget) {
		cgcg_paddlemerge_stringbuffer_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlemerge_stringbuffer_widget() {
		return cgcg_paddlemerge_stringbuffer_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlestring_constants_widget;
	
	private void setcgcg_paddlestring_constants_widget(BooleanOptionWidget widget) {
		cgcg_paddlestring_constants_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlestring_constants_widget() {
		return cgcg_paddlestring_constants_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlesimulate_natives_widget;
	
	private void setcgcg_paddlesimulate_natives_widget(BooleanOptionWidget widget) {
		cgcg_paddlesimulate_natives_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlesimulate_natives_widget() {
		return cgcg_paddlesimulate_natives_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleglobal_nodes_in_natives_widget;
	
	private void setcgcg_paddleglobal_nodes_in_natives_widget(BooleanOptionWidget widget) {
		cgcg_paddleglobal_nodes_in_natives_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleglobal_nodes_in_natives_widget() {
		return cgcg_paddleglobal_nodes_in_natives_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlesimple_edges_bidirectional_widget;
	
	private void setcgcg_paddlesimple_edges_bidirectional_widget(BooleanOptionWidget widget) {
		cgcg_paddlesimple_edges_bidirectional_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlesimple_edges_bidirectional_widget() {
		return cgcg_paddlesimple_edges_bidirectional_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlethis_edges_widget;
	
	private void setcgcg_paddlethis_edges_widget(BooleanOptionWidget widget) {
		cgcg_paddlethis_edges_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlethis_edges_widget() {
		return cgcg_paddlethis_edges_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleprecise_newinstance_widget;
	
	private void setcgcg_paddleprecise_newinstance_widget(BooleanOptionWidget widget) {
		cgcg_paddleprecise_newinstance_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleprecise_newinstance_widget() {
		return cgcg_paddleprecise_newinstance_widget;
	}	
	
	
	private MultiOptionWidget cgcg_paddlepropagator_widget;
	
	private void setcgcg_paddlepropagator_widget(MultiOptionWidget widget) {
		cgcg_paddlepropagator_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddlepropagator_widget() {
		return cgcg_paddlepropagator_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_paddleset_impl_widget;
	
	private void setcgcg_paddleset_impl_widget(MultiOptionWidget widget) {
		cgcg_paddleset_impl_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddleset_impl_widget() {
		return cgcg_paddleset_impl_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_paddledouble_set_old_widget;
	
	private void setcgcg_paddledouble_set_old_widget(MultiOptionWidget widget) {
		cgcg_paddledouble_set_old_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddledouble_set_old_widget() {
		return cgcg_paddledouble_set_old_widget;
	}	
	
	
	
	private MultiOptionWidget cgcg_paddledouble_set_new_widget;
	
	private void setcgcg_paddledouble_set_new_widget(MultiOptionWidget widget) {
		cgcg_paddledouble_set_new_widget = widget;
	}
	
	public MultiOptionWidget getcgcg_paddledouble_set_new_widget() {
		return cgcg_paddledouble_set_new_widget;
	}	
	
	
	private BooleanOptionWidget cgcg_paddlecontext_counts_widget;
	
	private void setcgcg_paddlecontext_counts_widget(BooleanOptionWidget widget) {
		cgcg_paddlecontext_counts_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlecontext_counts_widget() {
		return cgcg_paddlecontext_counts_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddletotal_context_counts_widget;
	
	private void setcgcg_paddletotal_context_counts_widget(BooleanOptionWidget widget) {
		cgcg_paddletotal_context_counts_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddletotal_context_counts_widget() {
		return cgcg_paddletotal_context_counts_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlemethod_context_counts_widget;
	
	private void setcgcg_paddlemethod_context_counts_widget(BooleanOptionWidget widget) {
		cgcg_paddlemethod_context_counts_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlemethod_context_counts_widget() {
		return cgcg_paddlemethod_context_counts_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddleset_mass_widget;
	
	private void setcgcg_paddleset_mass_widget(BooleanOptionWidget widget) {
		cgcg_paddleset_mass_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddleset_mass_widget() {
		return cgcg_paddleset_mass_widget;
	}	
	
	private BooleanOptionWidget cgcg_paddlenumber_nodes_widget;
	
	private void setcgcg_paddlenumber_nodes_widget(BooleanOptionWidget widget) {
		cgcg_paddlenumber_nodes_widget = widget;
	}
	
	public BooleanOptionWidget getcgcg_paddlenumber_nodes_widget() {
		return cgcg_paddlenumber_nodes_widget;
	}	
	
	private BooleanOptionWidget wstpenabled_widget;
	
	private void setwstpenabled_widget(BooleanOptionWidget widget) {
		wstpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwstpenabled_widget() {
		return wstpenabled_widget;
	}	
	
	private BooleanOptionWidget wsopenabled_widget;
	
	private void setwsopenabled_widget(BooleanOptionWidget widget) {
		wsopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwsopenabled_widget() {
		return wsopenabled_widget;
	}	
	
	private BooleanOptionWidget wjtpenabled_widget;
	
	private void setwjtpenabled_widget(BooleanOptionWidget widget) {
		wjtpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjtpenabled_widget() {
		return wjtpenabled_widget;
	}	
	
	private BooleanOptionWidget wjopenabled_widget;
	
	private void setwjopenabled_widget(BooleanOptionWidget widget) {
		wjopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjopenabled_widget() {
		return wjopenabled_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_smbenabled_widget;
	
	private void setwjopwjop_smbenabled_widget(BooleanOptionWidget widget) {
		wjopwjop_smbenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_smbenabled_widget() {
		return wjopwjop_smbenabled_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_smbinsert_null_checks_widget;
	
	private void setwjopwjop_smbinsert_null_checks_widget(BooleanOptionWidget widget) {
		wjopwjop_smbinsert_null_checks_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_smbinsert_null_checks_widget() {
		return wjopwjop_smbinsert_null_checks_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_smbinsert_redundant_casts_widget;
	
	private void setwjopwjop_smbinsert_redundant_casts_widget(BooleanOptionWidget widget) {
		wjopwjop_smbinsert_redundant_casts_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_smbinsert_redundant_casts_widget() {
		return wjopwjop_smbinsert_redundant_casts_widget;
	}	
	
	
	private MultiOptionWidget wjopwjop_smballowed_modifier_changes_widget;
	
	private void setwjopwjop_smballowed_modifier_changes_widget(MultiOptionWidget widget) {
		wjopwjop_smballowed_modifier_changes_widget = widget;
	}
	
	public MultiOptionWidget getwjopwjop_smballowed_modifier_changes_widget() {
		return wjopwjop_smballowed_modifier_changes_widget;
	}	
	
	
	private BooleanOptionWidget wjopwjop_sienabled_widget;
	
	private void setwjopwjop_sienabled_widget(BooleanOptionWidget widget) {
		wjopwjop_sienabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_sienabled_widget() {
		return wjopwjop_sienabled_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_sirerun_jb_widget;
	
	private void setwjopwjop_sirerun_jb_widget(BooleanOptionWidget widget) {
		wjopwjop_sirerun_jb_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_sirerun_jb_widget() {
		return wjopwjop_sirerun_jb_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_siinsert_null_checks_widget;
	
	private void setwjopwjop_siinsert_null_checks_widget(BooleanOptionWidget widget) {
		wjopwjop_siinsert_null_checks_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_siinsert_null_checks_widget() {
		return wjopwjop_siinsert_null_checks_widget;
	}	
	
	private BooleanOptionWidget wjopwjop_siinsert_redundant_casts_widget;
	
	private void setwjopwjop_siinsert_redundant_casts_widget(BooleanOptionWidget widget) {
		wjopwjop_siinsert_redundant_casts_widget = widget;
	}
	
	public BooleanOptionWidget getwjopwjop_siinsert_redundant_casts_widget() {
		return wjopwjop_siinsert_redundant_casts_widget;
	}	
	
	
	private StringOptionWidget wjopwjop_siexpansion_factor_widget;
	
	private void setwjopwjop_siexpansion_factor_widget(StringOptionWidget widget) {
		wjopwjop_siexpansion_factor_widget = widget;
	}
	
	public StringOptionWidget getwjopwjop_siexpansion_factor_widget() {
		return wjopwjop_siexpansion_factor_widget;
	}
	
	
	
	private StringOptionWidget wjopwjop_simax_container_size_widget;
	
	private void setwjopwjop_simax_container_size_widget(StringOptionWidget widget) {
		wjopwjop_simax_container_size_widget = widget;
	}
	
	public StringOptionWidget getwjopwjop_simax_container_size_widget() {
		return wjopwjop_simax_container_size_widget;
	}
	
	
	
	private StringOptionWidget wjopwjop_simax_inlinee_size_widget;
	
	private void setwjopwjop_simax_inlinee_size_widget(StringOptionWidget widget) {
		wjopwjop_simax_inlinee_size_widget = widget;
	}
	
	public StringOptionWidget getwjopwjop_simax_inlinee_size_widget() {
		return wjopwjop_simax_inlinee_size_widget;
	}
	
	
	
	private MultiOptionWidget wjopwjop_siallowed_modifier_changes_widget;
	
	private void setwjopwjop_siallowed_modifier_changes_widget(MultiOptionWidget widget) {
		wjopwjop_siallowed_modifier_changes_widget = widget;
	}
	
	public MultiOptionWidget getwjopwjop_siallowed_modifier_changes_widget() {
		return wjopwjop_siallowed_modifier_changes_widget;
	}	
	
	
	private BooleanOptionWidget wjapenabled_widget;
	
	private void setwjapenabled_widget(BooleanOptionWidget widget) {
		wjapenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapenabled_widget() {
		return wjapenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_raenabled_widget;
	
	private void setwjapwjap_raenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_raenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_raenabled_widget() {
		return wjapwjap_raenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_umtenabled_widget;
	
	private void setwjapwjap_umtenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_umtenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_umtenabled_widget() {
		return wjapwjap_umtenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_uftenabled_widget;
	
	private void setwjapwjap_uftenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_uftenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_uftenabled_widget() {
		return wjapwjap_uftenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_tqtenabled_widget;
	
	private void setwjapwjap_tqtenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_tqtenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_tqtenabled_widget() {
		return wjapwjap_tqtenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_cggenabled_widget;
	
	private void setwjapwjap_cggenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_cggenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_cggenabled_widget() {
		return wjapwjap_cggenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_cggshow_lib_meths_widget;
	
	private void setwjapwjap_cggshow_lib_meths_widget(BooleanOptionWidget widget) {
		wjapwjap_cggshow_lib_meths_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_cggshow_lib_meths_widget() {
		return wjapwjap_cggshow_lib_meths_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_purityenabled_widget;
	
	private void setwjapwjap_purityenabled_widget(BooleanOptionWidget widget) {
		wjapwjap_purityenabled_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_purityenabled_widget() {
		return wjapwjap_purityenabled_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_puritydump_summaries_widget;
	
	private void setwjapwjap_puritydump_summaries_widget(BooleanOptionWidget widget) {
		wjapwjap_puritydump_summaries_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_puritydump_summaries_widget() {
		return wjapwjap_puritydump_summaries_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_puritydump_cg_widget;
	
	private void setwjapwjap_puritydump_cg_widget(BooleanOptionWidget widget) {
		wjapwjap_puritydump_cg_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_puritydump_cg_widget() {
		return wjapwjap_puritydump_cg_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_puritydump_intra_widget;
	
	private void setwjapwjap_puritydump_intra_widget(BooleanOptionWidget widget) {
		wjapwjap_puritydump_intra_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_puritydump_intra_widget() {
		return wjapwjap_puritydump_intra_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_purityprint_widget;
	
	private void setwjapwjap_purityprint_widget(BooleanOptionWidget widget) {
		wjapwjap_purityprint_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_purityprint_widget() {
		return wjapwjap_purityprint_widget;
	}	
	
	private BooleanOptionWidget wjapwjap_purityverbose_widget;
	
	private void setwjapwjap_purityverbose_widget(BooleanOptionWidget widget) {
		wjapwjap_purityverbose_widget = widget;
	}
	
	public BooleanOptionWidget getwjapwjap_purityverbose_widget() {
		return wjapwjap_purityverbose_widget;
	}	
	
	private BooleanOptionWidget shimpleenabled_widget;
	
	private void setshimpleenabled_widget(BooleanOptionWidget widget) {
		shimpleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getshimpleenabled_widget() {
		return shimpleenabled_widget;
	}	
	
	private BooleanOptionWidget shimplenode_elim_opt_widget;
	
	private void setshimplenode_elim_opt_widget(BooleanOptionWidget widget) {
		shimplenode_elim_opt_widget = widget;
	}
	
	public BooleanOptionWidget getshimplenode_elim_opt_widget() {
		return shimplenode_elim_opt_widget;
	}	
	
	private BooleanOptionWidget shimplestandard_local_names_widget;
	
	private void setshimplestandard_local_names_widget(BooleanOptionWidget widget) {
		shimplestandard_local_names_widget = widget;
	}
	
	public BooleanOptionWidget getshimplestandard_local_names_widget() {
		return shimplestandard_local_names_widget;
	}	
	
	private BooleanOptionWidget shimpleextended_widget;
	
	private void setshimpleextended_widget(BooleanOptionWidget widget) {
		shimpleextended_widget = widget;
	}
	
	public BooleanOptionWidget getshimpleextended_widget() {
		return shimpleextended_widget;
	}	
	
	private BooleanOptionWidget shimpledebug_widget;
	
	private void setshimpledebug_widget(BooleanOptionWidget widget) {
		shimpledebug_widget = widget;
	}
	
	public BooleanOptionWidget getshimpledebug_widget() {
		return shimpledebug_widget;
	}	
	
	private BooleanOptionWidget stpenabled_widget;
	
	private void setstpenabled_widget(BooleanOptionWidget widget) {
		stpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getstpenabled_widget() {
		return stpenabled_widget;
	}	
	
	private BooleanOptionWidget sopenabled_widget;
	
	private void setsopenabled_widget(BooleanOptionWidget widget) {
		sopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getsopenabled_widget() {
		return sopenabled_widget;
	}	
	
	private BooleanOptionWidget sopsop_cpfenabled_widget;
	
	private void setsopsop_cpfenabled_widget(BooleanOptionWidget widget) {
		sopsop_cpfenabled_widget = widget;
	}
	
	public BooleanOptionWidget getsopsop_cpfenabled_widget() {
		return sopsop_cpfenabled_widget;
	}	
	
	private BooleanOptionWidget sopsop_cpfprune_cfg_widget;
	
	private void setsopsop_cpfprune_cfg_widget(BooleanOptionWidget widget) {
		sopsop_cpfprune_cfg_widget = widget;
	}
	
	public BooleanOptionWidget getsopsop_cpfprune_cfg_widget() {
		return sopsop_cpfprune_cfg_widget;
	}	
	
	private BooleanOptionWidget jtpenabled_widget;
	
	private void setjtpenabled_widget(BooleanOptionWidget widget) {
		jtpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjtpenabled_widget() {
		return jtpenabled_widget;
	}	
	
	private BooleanOptionWidget jopenabled_widget;
	
	private void setjopenabled_widget(BooleanOptionWidget widget) {
		jopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopenabled_widget() {
		return jopenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_cseenabled_widget;
	
	private void setjopjop_cseenabled_widget(BooleanOptionWidget widget) {
		jopjop_cseenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cseenabled_widget() {
		return jopjop_cseenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_csenaive_side_effect_widget;
	
	private void setjopjop_csenaive_side_effect_widget(BooleanOptionWidget widget) {
		jopjop_csenaive_side_effect_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_csenaive_side_effect_widget() {
		return jopjop_csenaive_side_effect_widget;
	}	
	
	private BooleanOptionWidget jopjop_bcmenabled_widget;
	
	private void setjopjop_bcmenabled_widget(BooleanOptionWidget widget) {
		jopjop_bcmenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_bcmenabled_widget() {
		return jopjop_bcmenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_bcmnaive_side_effect_widget;
	
	private void setjopjop_bcmnaive_side_effect_widget(BooleanOptionWidget widget) {
		jopjop_bcmnaive_side_effect_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_bcmnaive_side_effect_widget() {
		return jopjop_bcmnaive_side_effect_widget;
	}	
	
	private BooleanOptionWidget jopjop_lcmenabled_widget;
	
	private void setjopjop_lcmenabled_widget(BooleanOptionWidget widget) {
		jopjop_lcmenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_lcmenabled_widget() {
		return jopjop_lcmenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_lcmunroll_widget;
	
	private void setjopjop_lcmunroll_widget(BooleanOptionWidget widget) {
		jopjop_lcmunroll_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_lcmunroll_widget() {
		return jopjop_lcmunroll_widget;
	}	
	
	private BooleanOptionWidget jopjop_lcmnaive_side_effect_widget;
	
	private void setjopjop_lcmnaive_side_effect_widget(BooleanOptionWidget widget) {
		jopjop_lcmnaive_side_effect_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_lcmnaive_side_effect_widget() {
		return jopjop_lcmnaive_side_effect_widget;
	}	
	
	
	private MultiOptionWidget jopjop_lcmsafety_widget;
	
	private void setjopjop_lcmsafety_widget(MultiOptionWidget widget) {
		jopjop_lcmsafety_widget = widget;
	}
	
	public MultiOptionWidget getjopjop_lcmsafety_widget() {
		return jopjop_lcmsafety_widget;
	}	
	
	
	private BooleanOptionWidget jopjop_cpenabled_widget;
	
	private void setjopjop_cpenabled_widget(BooleanOptionWidget widget) {
		jopjop_cpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cpenabled_widget() {
		return jopjop_cpenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_cponly_regular_locals_widget;
	
	private void setjopjop_cponly_regular_locals_widget(BooleanOptionWidget widget) {
		jopjop_cponly_regular_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cponly_regular_locals_widget() {
		return jopjop_cponly_regular_locals_widget;
	}	
	
	private BooleanOptionWidget jopjop_cponly_stack_locals_widget;
	
	private void setjopjop_cponly_stack_locals_widget(BooleanOptionWidget widget) {
		jopjop_cponly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cponly_stack_locals_widget() {
		return jopjop_cponly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jopjop_cpfenabled_widget;
	
	private void setjopjop_cpfenabled_widget(BooleanOptionWidget widget) {
		jopjop_cpfenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cpfenabled_widget() {
		return jopjop_cpfenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_cbfenabled_widget;
	
	private void setjopjop_cbfenabled_widget(BooleanOptionWidget widget) {
		jopjop_cbfenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_cbfenabled_widget() {
		return jopjop_cbfenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_daeenabled_widget;
	
	private void setjopjop_daeenabled_widget(BooleanOptionWidget widget) {
		jopjop_daeenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_daeenabled_widget() {
		return jopjop_daeenabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_daeonly_tag_widget;
	
	private void setjopjop_daeonly_tag_widget(BooleanOptionWidget widget) {
		jopjop_daeonly_tag_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_daeonly_tag_widget() {
		return jopjop_daeonly_tag_widget;
	}	
	
	private BooleanOptionWidget jopjop_daeonly_stack_locals_widget;
	
	private void setjopjop_daeonly_stack_locals_widget(BooleanOptionWidget widget) {
		jopjop_daeonly_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_daeonly_stack_locals_widget() {
		return jopjop_daeonly_stack_locals_widget;
	}	
	
	private BooleanOptionWidget jopjop_uce1enabled_widget;
	
	private void setjopjop_uce1enabled_widget(BooleanOptionWidget widget) {
		jopjop_uce1enabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_uce1enabled_widget() {
		return jopjop_uce1enabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_uce1remove_unreachable_traps_widget;
	
	private void setjopjop_uce1remove_unreachable_traps_widget(BooleanOptionWidget widget) {
		jopjop_uce1remove_unreachable_traps_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_uce1remove_unreachable_traps_widget() {
		return jopjop_uce1remove_unreachable_traps_widget;
	}	
	
	private BooleanOptionWidget jopjop_ubf1enabled_widget;
	
	private void setjopjop_ubf1enabled_widget(BooleanOptionWidget widget) {
		jopjop_ubf1enabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_ubf1enabled_widget() {
		return jopjop_ubf1enabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_uce2enabled_widget;
	
	private void setjopjop_uce2enabled_widget(BooleanOptionWidget widget) {
		jopjop_uce2enabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_uce2enabled_widget() {
		return jopjop_uce2enabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_uce2remove_unreachable_traps_widget;
	
	private void setjopjop_uce2remove_unreachable_traps_widget(BooleanOptionWidget widget) {
		jopjop_uce2remove_unreachable_traps_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_uce2remove_unreachable_traps_widget() {
		return jopjop_uce2remove_unreachable_traps_widget;
	}	
	
	private BooleanOptionWidget jopjop_ubf2enabled_widget;
	
	private void setjopjop_ubf2enabled_widget(BooleanOptionWidget widget) {
		jopjop_ubf2enabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_ubf2enabled_widget() {
		return jopjop_ubf2enabled_widget;
	}	
	
	private BooleanOptionWidget jopjop_uleenabled_widget;
	
	private void setjopjop_uleenabled_widget(BooleanOptionWidget widget) {
		jopjop_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjopjop_uleenabled_widget() {
		return jopjop_uleenabled_widget;
	}	
	
	private BooleanOptionWidget japenabled_widget;
	
	private void setjapenabled_widget(BooleanOptionWidget widget) {
		japenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapenabled_widget() {
		return japenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_npcenabled_widget;
	
	private void setjapjap_npcenabled_widget(BooleanOptionWidget widget) {
		japjap_npcenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_npcenabled_widget() {
		return japjap_npcenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_npconly_array_ref_widget;
	
	private void setjapjap_npconly_array_ref_widget(BooleanOptionWidget widget) {
		japjap_npconly_array_ref_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_npconly_array_ref_widget() {
		return japjap_npconly_array_ref_widget;
	}	
	
	private BooleanOptionWidget japjap_npcprofiling_widget;
	
	private void setjapjap_npcprofiling_widget(BooleanOptionWidget widget) {
		japjap_npcprofiling_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_npcprofiling_widget() {
		return japjap_npcprofiling_widget;
	}	
	
	private BooleanOptionWidget japjap_npcolorerenabled_widget;
	
	private void setjapjap_npcolorerenabled_widget(BooleanOptionWidget widget) {
		japjap_npcolorerenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_npcolorerenabled_widget() {
		return japjap_npcolorerenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_abcenabled_widget;
	
	private void setjapjap_abcenabled_widget(BooleanOptionWidget widget) {
		japjap_abcenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcenabled_widget() {
		return japjap_abcenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_all_widget;
	
	private void setjapjap_abcwith_all_widget(BooleanOptionWidget widget) {
		japjap_abcwith_all_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_all_widget() {
		return japjap_abcwith_all_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_cse_widget;
	
	private void setjapjap_abcwith_cse_widget(BooleanOptionWidget widget) {
		japjap_abcwith_cse_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_cse_widget() {
		return japjap_abcwith_cse_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_arrayref_widget;
	
	private void setjapjap_abcwith_arrayref_widget(BooleanOptionWidget widget) {
		japjap_abcwith_arrayref_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_arrayref_widget() {
		return japjap_abcwith_arrayref_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_fieldref_widget;
	
	private void setjapjap_abcwith_fieldref_widget(BooleanOptionWidget widget) {
		japjap_abcwith_fieldref_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_fieldref_widget() {
		return japjap_abcwith_fieldref_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_classfield_widget;
	
	private void setjapjap_abcwith_classfield_widget(BooleanOptionWidget widget) {
		japjap_abcwith_classfield_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_classfield_widget() {
		return japjap_abcwith_classfield_widget;
	}	
	
	private BooleanOptionWidget japjap_abcwith_rectarray_widget;
	
	private void setjapjap_abcwith_rectarray_widget(BooleanOptionWidget widget) {
		japjap_abcwith_rectarray_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcwith_rectarray_widget() {
		return japjap_abcwith_rectarray_widget;
	}	
	
	private BooleanOptionWidget japjap_abcprofiling_widget;
	
	private void setjapjap_abcprofiling_widget(BooleanOptionWidget widget) {
		japjap_abcprofiling_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcprofiling_widget() {
		return japjap_abcprofiling_widget;
	}	
	
	private BooleanOptionWidget japjap_abcadd_color_tags_widget;
	
	private void setjapjap_abcadd_color_tags_widget(BooleanOptionWidget widget) {
		japjap_abcadd_color_tags_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_abcadd_color_tags_widget() {
		return japjap_abcadd_color_tags_widget;
	}	
	
	private BooleanOptionWidget japjap_profilingenabled_widget;
	
	private void setjapjap_profilingenabled_widget(BooleanOptionWidget widget) {
		japjap_profilingenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_profilingenabled_widget() {
		return japjap_profilingenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_profilingnotmainentry_widget;
	
	private void setjapjap_profilingnotmainentry_widget(BooleanOptionWidget widget) {
		japjap_profilingnotmainentry_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_profilingnotmainentry_widget() {
		return japjap_profilingnotmainentry_widget;
	}	
	
	private BooleanOptionWidget japjap_seaenabled_widget;
	
	private void setjapjap_seaenabled_widget(BooleanOptionWidget widget) {
		japjap_seaenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_seaenabled_widget() {
		return japjap_seaenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_seanaive_widget;
	
	private void setjapjap_seanaive_widget(BooleanOptionWidget widget) {
		japjap_seanaive_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_seanaive_widget() {
		return japjap_seanaive_widget;
	}	
	
	private BooleanOptionWidget japjap_fieldrwenabled_widget;
	
	private void setjapjap_fieldrwenabled_widget(BooleanOptionWidget widget) {
		japjap_fieldrwenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_fieldrwenabled_widget() {
		return japjap_fieldrwenabled_widget;
	}	
	
	
	private StringOptionWidget japjap_fieldrwthreshold_widget;
	
	private void setjapjap_fieldrwthreshold_widget(StringOptionWidget widget) {
		japjap_fieldrwthreshold_widget = widget;
	}
	
	public StringOptionWidget getjapjap_fieldrwthreshold_widget() {
		return japjap_fieldrwthreshold_widget;
	}
	
	
	private BooleanOptionWidget japjap_cgtaggerenabled_widget;
	
	private void setjapjap_cgtaggerenabled_widget(BooleanOptionWidget widget) {
		japjap_cgtaggerenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_cgtaggerenabled_widget() {
		return japjap_cgtaggerenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_parityenabled_widget;
	
	private void setjapjap_parityenabled_widget(BooleanOptionWidget widget) {
		japjap_parityenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_parityenabled_widget() {
		return japjap_parityenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_patenabled_widget;
	
	private void setjapjap_patenabled_widget(BooleanOptionWidget widget) {
		japjap_patenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_patenabled_widget() {
		return japjap_patenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_lvtaggerenabled_widget;
	
	private void setjapjap_lvtaggerenabled_widget(BooleanOptionWidget widget) {
		japjap_lvtaggerenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_lvtaggerenabled_widget() {
		return japjap_lvtaggerenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_rdtaggerenabled_widget;
	
	private void setjapjap_rdtaggerenabled_widget(BooleanOptionWidget widget) {
		japjap_rdtaggerenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_rdtaggerenabled_widget() {
		return japjap_rdtaggerenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_cheenabled_widget;
	
	private void setjapjap_cheenabled_widget(BooleanOptionWidget widget) {
		japjap_cheenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_cheenabled_widget() {
		return japjap_cheenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_umtenabled_widget;
	
	private void setjapjap_umtenabled_widget(BooleanOptionWidget widget) {
		japjap_umtenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_umtenabled_widget() {
		return japjap_umtenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_litenabled_widget;
	
	private void setjapjap_litenabled_widget(BooleanOptionWidget widget) {
		japjap_litenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_litenabled_widget() {
		return japjap_litenabled_widget;
	}	
	
	private BooleanOptionWidget japjap_aetenabled_widget;
	
	private void setjapjap_aetenabled_widget(BooleanOptionWidget widget) {
		japjap_aetenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_aetenabled_widget() {
		return japjap_aetenabled_widget;
	}	
	
	
	private MultiOptionWidget japjap_aetkind_widget;
	
	private void setjapjap_aetkind_widget(MultiOptionWidget widget) {
		japjap_aetkind_widget = widget;
	}
	
	public MultiOptionWidget getjapjap_aetkind_widget() {
		return japjap_aetkind_widget;
	}	
	
	
	private BooleanOptionWidget japjap_dmtenabled_widget;
	
	private void setjapjap_dmtenabled_widget(BooleanOptionWidget widget) {
		japjap_dmtenabled_widget = widget;
	}
	
	public BooleanOptionWidget getjapjap_dmtenabled_widget() {
		return japjap_dmtenabled_widget;
	}	
	
	private BooleanOptionWidget gbenabled_widget;
	
	private void setgbenabled_widget(BooleanOptionWidget widget) {
		gbenabled_widget = widget;
	}
	
	public BooleanOptionWidget getgbenabled_widget() {
		return gbenabled_widget;
	}	
	
	private BooleanOptionWidget gbgb_a1enabled_widget;
	
	private void setgbgb_a1enabled_widget(BooleanOptionWidget widget) {
		gbgb_a1enabled_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_a1enabled_widget() {
		return gbgb_a1enabled_widget;
	}	
	
	private BooleanOptionWidget gbgb_a1only_stack_locals_widget;
	
	private void setgbgb_a1only_stack_locals_widget(BooleanOptionWidget widget) {
		gbgb_a1only_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_a1only_stack_locals_widget() {
		return gbgb_a1only_stack_locals_widget;
	}	
	
	private BooleanOptionWidget gbgb_cfenabled_widget;
	
	private void setgbgb_cfenabled_widget(BooleanOptionWidget widget) {
		gbgb_cfenabled_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_cfenabled_widget() {
		return gbgb_cfenabled_widget;
	}	
	
	private BooleanOptionWidget gbgb_a2enabled_widget;
	
	private void setgbgb_a2enabled_widget(BooleanOptionWidget widget) {
		gbgb_a2enabled_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_a2enabled_widget() {
		return gbgb_a2enabled_widget;
	}	
	
	private BooleanOptionWidget gbgb_a2only_stack_locals_widget;
	
	private void setgbgb_a2only_stack_locals_widget(BooleanOptionWidget widget) {
		gbgb_a2only_stack_locals_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_a2only_stack_locals_widget() {
		return gbgb_a2only_stack_locals_widget;
	}	
	
	private BooleanOptionWidget gbgb_uleenabled_widget;
	
	private void setgbgb_uleenabled_widget(BooleanOptionWidget widget) {
		gbgb_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getgbgb_uleenabled_widget() {
		return gbgb_uleenabled_widget;
	}	
	
	private BooleanOptionWidget gopenabled_widget;
	
	private void setgopenabled_widget(BooleanOptionWidget widget) {
		gopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getgopenabled_widget() {
		return gopenabled_widget;
	}	
	
	private BooleanOptionWidget bbenabled_widget;
	
	private void setbbenabled_widget(BooleanOptionWidget widget) {
		bbenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbbenabled_widget() {
		return bbenabled_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsoenabled_widget;
	
	private void setbbbb_lsoenabled_widget(BooleanOptionWidget widget) {
		bbbb_lsoenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsoenabled_widget() {
		return bbbb_lsoenabled_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsodebug_widget;
	
	private void setbbbb_lsodebug_widget(BooleanOptionWidget widget) {
		bbbb_lsodebug_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsodebug_widget() {
		return bbbb_lsodebug_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsointer_widget;
	
	private void setbbbb_lsointer_widget(BooleanOptionWidget widget) {
		bbbb_lsointer_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsointer_widget() {
		return bbbb_lsointer_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsosl_widget;
	
	private void setbbbb_lsosl_widget(BooleanOptionWidget widget) {
		bbbb_lsosl_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsosl_widget() {
		return bbbb_lsosl_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsosl2_widget;
	
	private void setbbbb_lsosl2_widget(BooleanOptionWidget widget) {
		bbbb_lsosl2_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsosl2_widget() {
		return bbbb_lsosl2_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsosll_widget;
	
	private void setbbbb_lsosll_widget(BooleanOptionWidget widget) {
		bbbb_lsosll_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsosll_widget() {
		return bbbb_lsosll_widget;
	}	
	
	private BooleanOptionWidget bbbb_lsosll2_widget;
	
	private void setbbbb_lsosll2_widget(BooleanOptionWidget widget) {
		bbbb_lsosll2_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lsosll2_widget() {
		return bbbb_lsosll2_widget;
	}	
	
	private BooleanOptionWidget bbbb_phoenabled_widget;
	
	private void setbbbb_phoenabled_widget(BooleanOptionWidget widget) {
		bbbb_phoenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_phoenabled_widget() {
		return bbbb_phoenabled_widget;
	}	
	
	private BooleanOptionWidget bbbb_uleenabled_widget;
	
	private void setbbbb_uleenabled_widget(BooleanOptionWidget widget) {
		bbbb_uleenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_uleenabled_widget() {
		return bbbb_uleenabled_widget;
	}	
	
	private BooleanOptionWidget bbbb_lpenabled_widget;
	
	private void setbbbb_lpenabled_widget(BooleanOptionWidget widget) {
		bbbb_lpenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lpenabled_widget() {
		return bbbb_lpenabled_widget;
	}	
	
	private BooleanOptionWidget bbbb_lpunsplit_original_locals_widget;
	
	private void setbbbb_lpunsplit_original_locals_widget(BooleanOptionWidget widget) {
		bbbb_lpunsplit_original_locals_widget = widget;
	}
	
	public BooleanOptionWidget getbbbb_lpunsplit_original_locals_widget() {
		return bbbb_lpunsplit_original_locals_widget;
	}	
	
	private BooleanOptionWidget bopenabled_widget;
	
	private void setbopenabled_widget(BooleanOptionWidget widget) {
		bopenabled_widget = widget;
	}
	
	public BooleanOptionWidget getbopenabled_widget() {
		return bopenabled_widget;
	}	
	
	private BooleanOptionWidget tagenabled_widget;
	
	private void settagenabled_widget(BooleanOptionWidget widget) {
		tagenabled_widget = widget;
	}
	
	public BooleanOptionWidget gettagenabled_widget() {
		return tagenabled_widget;
	}	
	
	private BooleanOptionWidget tagtag_lnenabled_widget;
	
	private void settagtag_lnenabled_widget(BooleanOptionWidget widget) {
		tagtag_lnenabled_widget = widget;
	}
	
	public BooleanOptionWidget gettagtag_lnenabled_widget() {
		return tagtag_lnenabled_widget;
	}	
	
	private BooleanOptionWidget tagtag_anenabled_widget;
	
	private void settagtag_anenabled_widget(BooleanOptionWidget widget) {
		tagtag_anenabled_widget = widget;
	}
	
	public BooleanOptionWidget gettagtag_anenabled_widget() {
		return tagtag_anenabled_widget;
	}	
	
	private BooleanOptionWidget tagtag_depenabled_widget;
	
	private void settagtag_depenabled_widget(BooleanOptionWidget widget) {
		tagtag_depenabled_widget = widget;
	}
	
	public BooleanOptionWidget gettagtag_depenabled_widget() {
		return tagtag_depenabled_widget;
	}	
	
	private BooleanOptionWidget tagtag_fieldrwenabled_widget;
	
	private void settagtag_fieldrwenabled_widget(BooleanOptionWidget widget) {
		tagtag_fieldrwenabled_widget = widget;
	}
	
	public BooleanOptionWidget gettagtag_fieldrwenabled_widget() {
		return tagtag_fieldrwenabled_widget;
	}	
	
	private BooleanOptionWidget dbenabled_widget;
	
	private void setdbenabled_widget(BooleanOptionWidget widget) {
		dbenabled_widget = widget;
	}
	
	public BooleanOptionWidget getdbenabled_widget() {
		return dbenabled_widget;
	}	
	
	private BooleanOptionWidget dbdb_transformationsenabled_widget;
	
	private void setdbdb_transformationsenabled_widget(BooleanOptionWidget widget) {
		dbdb_transformationsenabled_widget = widget;
	}
	
	public BooleanOptionWidget getdbdb_transformationsenabled_widget() {
		return dbdb_transformationsenabled_widget;
	}	
	
	private BooleanOptionWidget dbdb_renamerenabled_widget;
	
	private void setdbdb_renamerenabled_widget(BooleanOptionWidget widget) {
		dbdb_renamerenabled_widget = widget;
	}
	
	public BooleanOptionWidget getdbdb_renamerenabled_widget() {
		return dbdb_renamerenabled_widget;
	}	
	
	private BooleanOptionWidget dbdb_renamerremove_fully_qualified_widget;
	
	private void setdbdb_renamerremove_fully_qualified_widget(BooleanOptionWidget widget) {
		dbdb_renamerremove_fully_qualified_widget = widget;
	}
	
	public BooleanOptionWidget getdbdb_renamerremove_fully_qualified_widget() {
		return dbdb_renamerremove_fully_qualified_widget;
	}	
	
	private BooleanOptionWidget dbdb_deobfuscateenabled_widget;
	
	private void setdbdb_deobfuscateenabled_widget(BooleanOptionWidget widget) {
		dbdb_deobfuscateenabled_widget = widget;
	}
	
	public BooleanOptionWidget getdbdb_deobfuscateenabled_widget() {
		return dbdb_deobfuscateenabled_widget;
	}	
	
	private BooleanOptionWidget dbdb_force_recompileenabled_widget;
	
	private void setdbdb_force_recompileenabled_widget(BooleanOptionWidget widget) {
		dbdb_force_recompileenabled_widget = widget;
	}
	
	public BooleanOptionWidget getdbdb_force_recompileenabled_widget() {
		return dbdb_force_recompileenabled_widget;
	}	
	
	private BooleanOptionWidget Application_Mode_Optionsinclude_all_widget;
	
	private void setApplication_Mode_Optionsinclude_all_widget(BooleanOptionWidget widget) {
		Application_Mode_Optionsinclude_all_widget = widget;
	}
	
	public BooleanOptionWidget getApplication_Mode_Optionsinclude_all_widget() {
		return Application_Mode_Optionsinclude_all_widget;
	}	
	

	private ListOptionWidget Application_Mode_Optionsinclude_widget;
	
	private void setApplication_Mode_Optionsinclude_widget(ListOptionWidget widget) {
		Application_Mode_Optionsinclude_widget = widget;
	}
	
	public ListOptionWidget getApplication_Mode_Optionsinclude_widget() {
		return Application_Mode_Optionsinclude_widget;
	}	
	
	

	private ListOptionWidget Application_Mode_Optionsexclude_widget;
	
	private void setApplication_Mode_Optionsexclude_widget(ListOptionWidget widget) {
		Application_Mode_Optionsexclude_widget = widget;
	}
	
	public ListOptionWidget getApplication_Mode_Optionsexclude_widget() {
		return Application_Mode_Optionsexclude_widget;
	}	
	
	

	private ListOptionWidget Application_Mode_Optionsdynamic_class_widget;
	
	private void setApplication_Mode_Optionsdynamic_class_widget(ListOptionWidget widget) {
		Application_Mode_Optionsdynamic_class_widget = widget;
	}
	
	public ListOptionWidget getApplication_Mode_Optionsdynamic_class_widget() {
		return Application_Mode_Optionsdynamic_class_widget;
	}	
	
	

	private ListOptionWidget Application_Mode_Optionsdynamic_dir_widget;
	
	private void setApplication_Mode_Optionsdynamic_dir_widget(ListOptionWidget widget) {
		Application_Mode_Optionsdynamic_dir_widget = widget;
	}
	
	public ListOptionWidget getApplication_Mode_Optionsdynamic_dir_widget() {
		return Application_Mode_Optionsdynamic_dir_widget;
	}	
	
	

	private ListOptionWidget Application_Mode_Optionsdynamic_package_widget;
	
	private void setApplication_Mode_Optionsdynamic_package_widget(ListOptionWidget widget) {
		Application_Mode_Optionsdynamic_package_widget = widget;
	}
	
	public ListOptionWidget getApplication_Mode_Optionsdynamic_package_widget() {
		return Application_Mode_Optionsdynamic_package_widget;
	}	
	
	
	private BooleanOptionWidget Input_Attribute_Optionskeep_line_number_widget;
	
	private void setInput_Attribute_Optionskeep_line_number_widget(BooleanOptionWidget widget) {
		Input_Attribute_Optionskeep_line_number_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Attribute_Optionskeep_line_number_widget() {
		return Input_Attribute_Optionskeep_line_number_widget;
	}	
	
	private BooleanOptionWidget Input_Attribute_Optionskeep_offset_widget;
	
	private void setInput_Attribute_Optionskeep_offset_widget(BooleanOptionWidget widget) {
		Input_Attribute_Optionskeep_offset_widget = widget;
	}
	
	public BooleanOptionWidget getInput_Attribute_Optionskeep_offset_widget() {
		return Input_Attribute_Optionskeep_offset_widget;
	}	
	
	private BooleanOptionWidget Annotation_Optionsannot_purity_widget;
	
	private void setAnnotation_Optionsannot_purity_widget(BooleanOptionWidget widget) {
		Annotation_Optionsannot_purity_widget = widget;
	}
	
	public BooleanOptionWidget getAnnotation_Optionsannot_purity_widget() {
		return Annotation_Optionsannot_purity_widget;
	}	
	
	private BooleanOptionWidget Annotation_Optionsannot_nullpointer_widget;
	
	private void setAnnotation_Optionsannot_nullpointer_widget(BooleanOptionWidget widget) {
		Annotation_Optionsannot_nullpointer_widget = widget;
	}
	
	public BooleanOptionWidget getAnnotation_Optionsannot_nullpointer_widget() {
		return Annotation_Optionsannot_nullpointer_widget;
	}	
	
	private BooleanOptionWidget Annotation_Optionsannot_arraybounds_widget;
	
	private void setAnnotation_Optionsannot_arraybounds_widget(BooleanOptionWidget widget) {
		Annotation_Optionsannot_arraybounds_widget = widget;
	}
	
	public BooleanOptionWidget getAnnotation_Optionsannot_arraybounds_widget() {
		return Annotation_Optionsannot_arraybounds_widget;
	}	
	
	private BooleanOptionWidget Annotation_Optionsannot_side_effect_widget;
	
	private void setAnnotation_Optionsannot_side_effect_widget(BooleanOptionWidget widget) {
		Annotation_Optionsannot_side_effect_widget = widget;
	}
	
	public BooleanOptionWidget getAnnotation_Optionsannot_side_effect_widget() {
		return Annotation_Optionsannot_side_effect_widget;
	}	
	
	private BooleanOptionWidget Annotation_Optionsannot_fieldrw_widget;
	
	private void setAnnotation_Optionsannot_fieldrw_widget(BooleanOptionWidget widget) {
		Annotation_Optionsannot_fieldrw_widget = widget;
	}
	
	public BooleanOptionWidget getAnnotation_Optionsannot_fieldrw_widget() {
		return Annotation_Optionsannot_fieldrw_widget;
	}	
	
	private BooleanOptionWidget Miscellaneous_Optionstime_widget;
	
	private void setMiscellaneous_Optionstime_widget(BooleanOptionWidget widget) {
		Miscellaneous_Optionstime_widget = widget;
	}
	
	public BooleanOptionWidget getMiscellaneous_Optionstime_widget() {
		return Miscellaneous_Optionstime_widget;
	}	
	
	private BooleanOptionWidget Miscellaneous_Optionssubtract_gc_widget;
	
	private void setMiscellaneous_Optionssubtract_gc_widget(BooleanOptionWidget widget) {
		Miscellaneous_Optionssubtract_gc_widget = widget;
	}
	
	public BooleanOptionWidget getMiscellaneous_Optionssubtract_gc_widget() {
		return Miscellaneous_Optionssubtract_gc_widget;
	}	
	

	private Composite General_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupGeneral_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupGeneral_Options.setLayout(layout);
	
	 	editGroupGeneral_Options.setText("General Options");
	 	
		editGroupGeneral_Options.setData("id", "General_Options");
		
		String descGeneral_Options = "";	
		if (descGeneral_Options.length() > 0) {
			Label descLabelGeneral_Options = new Label(editGroupGeneral_Options, SWT.WRAP);
			descLabelGeneral_Options.setText(descGeneral_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"h";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionshelp_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Help", "", "","h", "\nDisplay the textual help message and exit immediately without \nfurther processing. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"pl";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsphase_list_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Phase List", "", "","pl", "\nPrint a list of the available phases and sub-phases, then exit. \n", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"version";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsversion_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Version", "", "","version", "\nDisplay information about the version of Soot being run, then \nexit without further processing. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"v";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsverbose_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Verbose", "", "","v", "\nProvide detailed information about what Soot is doing as it \nruns. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"interactive-mode";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsinteractive_mode_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Interactive Mode", "", "","interactive-mode", "\nRuns interactively, with Soot providing detailed information as \nit iterates through intra-procedural analyses. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"app";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsapp_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Application Mode", "", "","app", "\nRun in application mode, processing all classes referenced by \nargument classes.", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"w";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionswhole_program_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Whole-Program Mode", "", "","w", "\nRun in whole program mode, taking into consideration the whole \nprogram when performing analyses and transformations. Soot uses \nthe Call Graph Constructor to build a call graph for the \nprogram, then applies enabled transformations in the \nWhole-Jimple Transformation, Whole-Jimple Optimization, and \nWhole-Jimple Annotation packs before applying enabled \nintraprocedural transformations. Note that the Whole-Jimple \nOptimization pack is normally disabled (and thus not applied by \nwhole program mode), unless you also specify the Whole Program \nOptimize option.", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"ws";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionswhole_shimple_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Whole-Shimple Mode", "", "","ws", "\nRun in whole shimple mode, taking into consideration the whole \nprogram when performing Shimple analyses and transformations. \nSoot uses the Call Graph Constructor to build a call graph for \nthe program, then applies enabled transformations in the \nWhole-Shimple Transformation and Whole-Shimple Optimization \nbefore applying enabled intraprocedural transformations. Note \nthat the Whole-Shimple Optimization pack is normally disabled \n(and thus not applied by whole shimple mode), unless you also \nspecify the Whole Program Optimize option.", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"validate";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsvalidate_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Validate", "", "","validate", "\nCauses internal checks to be done on bodies in the various Soot \nIRs, to make sure the transformations have not done something \nstrange. This option may degrade Soot's performance. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"debug";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsdebug_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Debug", "", "","debug", "\nPrint various debugging information as Soot runs, particularly \nfrom the Baf Body Phase and the Jimple Annotation Pack Phase. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"debug-resolver";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setGeneral_Optionsdebug_resolver_widget(new BooleanOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Debug Resolver", "", "","debug-resolver", "\nPrint debugging information about class resolving. ", defaultBool)));
		
		

		defKey = ""+" "+""+" "+"ph";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setGeneral_Optionsphase_help_widget(new ListOptionWidget(editGroupGeneral_Options, SWT.NONE, new OptionData("Phase Help",  "", "","ph", "\nPrint a help message about the phase or sub-phase named PHASE, \nthen exit. To see the help message of more than one phase, \nspecify multiple phase-help options. ", defaultString)));
		

		
		return editGroupGeneral_Options;
	}



	private Composite Input_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupInput_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupInput_Options.setLayout(layout);
	
	 	editGroupInput_Options.setText("Input Options");
	 	
		editGroupInput_Options.setData("id", "Input_Options");
		
		String descInput_Options = "";	
		if (descInput_Options.length() > 0) {
			Label descLabelInput_Options = new Label(editGroupInput_Options, SWT.WRAP);
			descLabelInput_Options.setText(descInput_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"ast-metrics";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Optionsast_metrics_widget(new BooleanOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Compute AST Metrics", "", "","ast-metrics", "\n			If this flag is set and soot converts java to jimple then \nAST metrics will be computed. 	", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"full-resolver";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Optionsfull_resolver_widget(new BooleanOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Force complete resolver", "", "","full-resolver", "\nNormally, Soot resolves only that application classes and any \nclasses that they refer to, along with any classes it needs for \nthe Jimple typing, but it does not transitively resolve \nreferences in these additional classes that were resolved only \nbecause they were referenced. This switch forces full transitive \nresolution of all references found in all classes that are \nresolved, regardless of why they were resolved. In \nwhole-program mode, class resolution is always fully transitive. \nTherefore, in whole-program mode, this switch has no effect, and \nclass resolution is always performed as if it were turned on. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"allow-phantom-refs";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Optionsallow_phantom_refs_widget(new BooleanOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Allow Phantom References", "", "","allow-phantom-refs", "\nAllow Soot to process a class even if it cannot find all \nclasses referenced by that class. This may cause Soot to produce \nincorrect results. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"use-old-type-assigner";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Optionsuse_old_type_assigner_widget(new BooleanOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Use old Type Assigner ", "", "","use-old-type-assigner", "\nDisable the reimplemented type assigner. This uses improved \ndata structures to provide a significant performance benefit, \nbut has not yet been thoroughly tested. ", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Class File",
		"c",
		"\nTry to resolve classes first from .class files found in the \nSoot classpath. Fall back to .jimple files only when unable to \nfind a .class file. ",
		
		true),
		
		new OptionData("Only Class File",
		"only-class",
		"\nTry to resolve classes first from .class files found in the \nSoot classpath. Do not try any other types of files even when \nunable to find a .class file. ",
		
		false),
		
		new OptionData("Jimple File",
		"J",
		"\nTry to resolve classes first from .jimple files found in the \nSoot classpath. Fall back to .class files only when unable to \nfind a .jimple file. ",
		
		false),
		
		new OptionData("Java File",
		"java",
		"\nTry to resolve classes first from .java files found in the Soot \nclasspath. Fall back to .class files only when unable to find a \n.java file. ",
		
		false),
		
		};
		
										
		setInput_Optionssrc_prec_widget(new MultiOptionWidget(editGroupInput_Options, SWT.NONE, data, new OptionData("Input Source Precedence", "", "","src-prec", "\nSets FORMAT as Soot's preference for the type of source files \nto read when it looks for a class. ")));
		
		defKey = ""+" "+""+" "+"src-prec";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getInput_Optionssrc_prec_widget().setDef(defaultString);
		}
		
		

		defKey = ""+" "+""+" "+"process-dir";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setInput_Optionsprocess_dir_widget(new ListOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Process Directories",  "", "","process-dir", "\nAdd all classes found in DIR to the set of argument classes \nwhich is analyzed and transformed by Soot. You can specify the \noption more than once, to add argument classes from multiple \ndirectories. If subdirectories of DIR contain .class or .jimple \nfiles, Soot assumes that the subdirectory names correspond to \ncomponents of the classes' package names. If DIR contains \nsubA/subB/MyClass.class, for instance, then Soot assumes MyClass \nis in package subA.subB.", defaultString)));
		
		
		defKey = ""+" "+""+" "+"cp";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setInput_Optionssoot_classpath_widget(new StringOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Soot Classpath",  "", "","cp", "\nUse PATH as the list of directories in which Soot should search \nfor classes. PATH should be a series of directories, separated \nby the path separator character for your system. If no classpath \nis set on the command line, but the system property \nsoot.class.path has been set, Soot uses its value as the \nclasspath. If neither the command line nor the system properties \nspecify a Soot classpath, Soot falls back on a default classpath \nconsisting of the value of the system property java.class.path \nfollowed java.home/lib/rt.jar, where java.home stands for the \ncontents of the system property java.home and / stands for the \nsystem file separator.", defaultString)));
		
		
		defKey = ""+" "+""+" "+"main-class";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setInput_Optionsmain_class_widget(new StringOptionWidget(editGroupInput_Options, SWT.NONE, new OptionData("Main Class",  "", "","main-class", "\nBy default, the first class mentioned on the command-line is \ntreated as the main class (entry point) in whole-program \nanalysis. This option overrides this default. ", defaultString)));
		

		
		return editGroupInput_Options;
	}



	private Composite Output_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupOutput_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupOutput_Options.setLayout(layout);
	
	 	editGroupOutput_Options.setText("Output Options");
	 	
		editGroupOutput_Options.setData("id", "Output_Options");
		
		String descOutput_Options = "";	
		if (descOutput_Options.length() > 0) {
			Label descLabelOutput_Options = new Label(editGroupOutput_Options, SWT.WRAP);
			descLabelOutput_Options.setText(descOutput_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"outjar";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsoutput_jar_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Output Jar File", "", "","outjar", "\nSaves output files into a Jar file instead of a directory. The \noutput Jar file name should be specified using the Output \nDirectory (output-dir) option. Note that if the output Jar file \nexists before Soot runs, any files inside it will first be \nremoved. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"xml-attributes";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsxml_attributes_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Save Tags to XML", "", "","xml-attributes", "\nSave in XML format a variety of tags which Soot has attached to \nits internal representations of the application classes. The XML \nfile can then be read by the Soot plug-in for the Eclipse IDE, \nwhich can display the annotations together with the program \nsource, to aid program understanding. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"print-tags";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsprint_tags_in_output_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Print Tags in Output", "", "","print-tags", "\nPrint in output files (either in Jimple or Dave) a variety of \ntags which Soot has attached to its internal representations of \nthe application classes. The tags will be printed on the line \nsucceeding the stmt that they are attached to. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"no-output-source-file-attribute";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsno_output_source_file_attribute_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Don't Output Source File Attribute", "", "","no-output-source-file-attribute", "\nDon't output Source File Attribute when producing class files. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"no-output-inner-classes-attribute";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsno_output_inner_classes_attribute_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Don't Output Inner Classes Attribute", "", "","no-output-inner-classes-attribute", "\nDon't output inner classes attribute in class \nfiles. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"show-exception-dests";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setOutput_Optionsshow_exception_dests_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Show Exception Destinations", "", "","show-exception-dests", "\nIndicate whether to show exception destination edges as well as \ncontrol flow edges in dumps of exceptional control flow graphs. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"gzip";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setOutput_Optionsgzip_widget(new BooleanOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("GZipped IR output", "", "","gzip", "\nThis option causes Soot to compress output files of \nintermediate representations with GZip. It does not apply to \nclass files output by Soot. ", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Jimple File",
		"J",
		"\nProduce .jimple files, which contain a textual form of Soot's \nJimple internal representation. ",
		
		false),
		
		new OptionData("Jimp File",
		"j",
		"\nProduce .jimp files, which contain an abbreviated form of \nJimple. ",
		
		false),
		
		new OptionData("Shimple File",
		"S",
		"\nProduce .shimple files, containing a textual form of Soot's SSA \nShimple internal representation. Shimple adds Phi nodes to \nJimple. ",
		
		false),
		
		new OptionData("Shimp File",
		"s",
		"\nProduce .shimp files, which contain an abbreviated form of \nShimple. ",
		
		false),
		
		new OptionData("Baf File",
		"B",
		"\nProduce .baf files, which contain a textual form of Soot's Baf \ninternal representation. ",
		
		false),
		
		new OptionData("Abbreviated Baf File",
		"b",
		"\nProduce .b files, which contain an abbreviated form of Baf. ",
		
		false),
		
		new OptionData("Grimp File",
		"G",
		"\nProduce .grimple files, which contain a textual form of Soot's \nGrimp internal representation. ",
		
		false),
		
		new OptionData("Abbreviated Grimp File",
		"g",
		"\nProduce .grimp files, which contain an abbreviated form of \nGrimp. ",
		
		false),
		
		new OptionData("Xml File",
		"X",
		"\nProduce .xml files containing an annotated version of the \nSoot's Jimple internal representation. ",
		
		false),
		
		new OptionData("No Output File",
		"n",
		"\nProduce no output files. ",
		
		false),
		
		new OptionData("Jasmin File",
		"jasmin",
		"\nProduce .jasmin files, suitable as input to the jasmin bytecode \nassembler. ",
		
		false),
		
		new OptionData("Class File",
		"c",
		"\nProduce Java .class files, executable by any Java Virtual \nMachine. ",
		
		true),
		
		new OptionData("Dava Decompiled File",
		"d",
		"\nProduce .java files generated by the Dava decompiler. ",
		
		false),
		
		};
		
										
		setOutput_Optionsoutput_format_widget(new MultiOptionWidget(editGroupOutput_Options, SWT.NONE, data, new OptionData("Output Format", "", "","f", "\nSpecify the format of output files Soot should produce, if any. \nNote that while the abbreviated formats (jimp, shimp, b, and \ngrimp) are easier to read than their unabbreviated counterparts \n(jimple, shimple, baf, and grimple), they may contain \nambiguities. Method signatures in the abbreviated formats, for \ninstance, are not uniquely determined.")));
		
		defKey = ""+" "+""+" "+"f";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getOutput_Optionsoutput_format_widget().setDef(defaultString);
		}
		
		

		defKey = ""+" "+""+" "+"dump-body";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setOutput_Optionsdump_body_widget(new ListOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Body Dumping Phases",  "", "","dump-body", "\nSpecify that PHASENAME is one of the phases to be dumped. For \nexample -dump-body jb -dump-body jb.a would dump each method \nbefore and after the jb and jb.a phases. The pseudo phase name \n``ALL'' causes all phases to be dumped. Output files appear in \nsubdirectories under the soot output directory, with names like \nclassName/methodSignature/phasename-graphType-number.in and \nclassName/methodSignature/phasename-graphType-number.out. The \n``in'' and ``out'' suffixes distinguish the internal \nrepresentations of the method before and after the phase \nexecuted.", defaultString)));
		

		defKey = ""+" "+""+" "+"dump-cfg";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setOutput_Optionsdump_cfg_widget(new ListOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("CFG Dumping Phases",  "", "","dump-cfg", "\nSpecify that any control flow graphs constructed during the \nPHASENAME phases should be dumped. For example -dump-cfg jb \n-dump-cfg bb.lso would dump all CFGs constructed during the jb \nand bb.lso phases. The pseudo phase name ``ALL'' causes CFGs \nconstructed in all phases to be dumped.The control flow graphs \nare dumped in the form of a file containing input to dot graph \nvisualization tool. Output dot files are stored beneath the \nsoot output directory, in files with names like: \nclassName/methodSignature/phasename-graphType-number.dot, where \nnumber serves to distinguish graphs in phases that produce more \nthan one (for example, the Aggregator may produce multiple \nExceptionalUnitGraphs).", defaultString)));
		
		
		defKey = ""+" "+""+" "+"d";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "./sootOutput";
			
		}

		setOutput_Optionsoutput_dir_widget(new StringOptionWidget(editGroupOutput_Options, SWT.NONE, new OptionData("Output Directory",  "", "","d", "\nStore output files in DIR. DIR may be relative to the working \ndirectory. ", defaultString)));
		

		
		return editGroupOutput_Options;
	}



	private Composite Processing_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupProcessing_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupProcessing_Options.setLayout(layout);
	
	 	editGroupProcessing_Options.setText("Processing Options");
	 	
		editGroupProcessing_Options.setData("id", "Processing_Options");
		
		String descProcessing_Options = "";	
		if (descProcessing_Options.length() > 0) {
			Label descLabelProcessing_Options = new Label(editGroupProcessing_Options, SWT.WRAP);
			descLabelProcessing_Options.setText(descProcessing_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"O";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionsoptimize_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Optimize", "", "","O", "\nPerform intraprocedural optimizations on the application \nclasses. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"W";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionswhole_optimize_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Whole Program Optimize", "", "","W", "\nPerform whole program optimizations on the application classes. \nThis enables the Whole-Jimple Optimization pack as well as whole \nprogram mode and intraprocedural optimizations. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"via-grimp";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionsvia_grimp_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Via Grimp", "", "","via-grimp", "\nConvert Jimple to bytecode via the Grimp intermediate \nrepresentation instead of via the Baf intermediate \nrepresentation. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"via-shimple";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionsvia_shimple_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Via Shimple", "", "","via-shimple", "\nEnable Shimple, Soot's SSA representation. This generates \nShimple bodies for the application classes, optionally \ntransforms them with analyses that run on SSA form, then turns \nthem back into Jimple for processing by the rest of Soot. For \nmore information, see the documentation for the shimp, stp, and \nsop phases. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"omit-excepting-unit-edges";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionsomit_excepting_unit_edges_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Omit Excepting Unit Edges", "", "","omit-excepting-unit-edges", "\nWhen constructing an ExceptionalUnitGraph or \nExceptionalBlockGraph, include edges to an exception handler \nonly from the predecessors of an instruction which may throw an \nexception to the handler, and not from the excepting instruction \nitself, unless the excepting instruction has potential side \neffects. Omitting edges from excepting units allows more \naccurate flow analyses (since if an instruction without side \neffects throws an exception, it has not changed the state of the \ncomputation). This accuracy, though, could lead optimizations to \ngenerate unverifiable code, since the dataflow analyses \nperformed by bytecode verifiers might include paths to exception \nhandlers from all protected instructions, regardless of whether \nthe instructions have side effects. (In practice, the pedantic \nthrow analysis suffices to pass verification in all VMs tested \nwith Soot to date, but the JVM specification does allow for less \ndiscriminating verifiers which would reject some code that might \nbe generated using the pedantic throw analysis without also \nadding edges from all excepting units.)", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"trim-cfgs";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setProcessing_Optionstrim_cfgs_widget(new BooleanOptionWidget(editGroupProcessing_Options, SWT.NONE, new OptionData("Trim CFGs", "", "","trim-cfgs", "\nWhen constructing CFGs which include exceptional edges, \nminimize the number of edges leading to exception handlers by \nanalyzing which instructions might actually be executed before \nan exception is thrown, instead of assuming that every \ninstruction protected by a handler has the potential to throw an \nexception the handler catches. -trim-cfgs is shorthand for \n-throw-analysis unit -omit-excepting-unit-edges -p jb.tt \nenabled:true.", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Pedantic",
		"pedantic",
		"\nSays that any instruction may throw any Throwable whatsoever. \nStrictly speaking this is correct, since the Java libraries \ninclude the Thread.stop(Throwable) method, which allows other \nthreads to cause arbitrary exceptions to occur at arbitrary \npoints in the execution of a victim thread. ",
		
		true),
		
		new OptionData("Unit",
		"unit",
		"\nSays that each statement in the intermediate representation may \nthrow those exception types associated with the corresponding \nJava bytecode instructions in the JVM Specification. The \nanalysis deals with each statement in isolation, without regard \nto the surrounding program. ",
		
		false),
		
		};
		
										
		setProcessing_Optionsthrow_analysis_widget(new MultiOptionWidget(editGroupProcessing_Options, SWT.NONE, data, new OptionData("Default ThrowAnalysis", "", "","throw-analysis", "\nThis option specifies how to estimate the exceptions which each \nstatement may throw when constructing exceptional CFGs. ")));
		
		defKey = ""+" "+""+" "+"throw-analysis";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getProcessing_Optionsthrow_analysis_widget().setDef(defaultString);
		}
		
		

		
		return editGroupProcessing_Options;
	}



	private Composite jbCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjb = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjb.setLayout(layout);
	
	 	editGroupjb.setText("Jimple Body Creation");
	 	
		editGroupjb.setData("id", "jb");
		
		String descjb = "Creates a JimpleBody for each method";	
		if (descjb.length() > 0) {
			Label descLabeljb = new Label(editGroupjb, SWT.WRAP);
			descLabeljb.setText(descjb);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbenabled_widget(new BooleanOptionWidget(editGroupjb, SWT.NONE, new OptionData("Enabled", "p", "jb","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb"+" "+"use-original-names";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbuse_original_names_widget(new BooleanOptionWidget(editGroupjb, SWT.NONE, new OptionData("Use Original Names", "p", "jb","use-original-names", "\nRetain the original names for local variables when the source \nincludes those names. Otherwise, Soot gives variables generic \nnames based on their types. ", defaultBool)));
		
		

		
		return editGroupjb;
	}



	private Composite jbjb_lsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_ls = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_ls.setLayout(layout);
	
	 	editGroupjbjb_ls.setText("Local Splitter");
	 	
		editGroupjbjb_ls.setData("id", "jbjb_ls");
		
		String descjbjb_ls = "Local splitter: one local per DU-UD web";	
		if (descjbjb_ls.length() > 0) {
			Label descLabeljbjb_ls = new Label(editGroupjbjb_ls, SWT.WRAP);
			descLabeljbjb_ls.setText(descjbjb_ls);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.ls"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_lsenabled_widget(new BooleanOptionWidget(editGroupjbjb_ls, SWT.NONE, new OptionData("Enabled", "p", "jb.ls","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_ls;
	}



	private Composite jbjb_aCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_a = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_a.setLayout(layout);
	
	 	editGroupjbjb_a.setText("Jimple Local Aggregator");
	 	
		editGroupjbjb_a.setData("id", "jbjb_a");
		
		String descjbjb_a = "Aggregator: removes some unnecessary copies";	
		if (descjbjb_a.length() > 0) {
			Label descLabeljbjb_a = new Label(editGroupjbjb_a, SWT.WRAP);
			descLabeljbjb_a.setText(descjbjb_a);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.a"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_aenabled_widget(new BooleanOptionWidget(editGroupjbjb_a, SWT.NONE, new OptionData("Enabled", "p", "jb.a","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.a"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_aonly_stack_locals_widget(new BooleanOptionWidget(editGroupjbjb_a, SWT.NONE, new OptionData("Only Stack Locals", "p", "jb.a","only-stack-locals", "\nOnly aggregate locals that represent stack locations in the \noriginal bytecode. (Stack locals can be distinguished in Jimple \nby the character with which their names begin.) ", defaultBool)));
		
		

		
		return editGroupjbjb_a;
	}



	private Composite jbjb_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_ule.setLayout(layout);
	
	 	editGroupjbjb_ule.setText("Unused Local Eliminator");
	 	
		editGroupjbjb_ule.setData("id", "jbjb_ule");
		
		String descjbjb_ule = "Unused local eliminator";	
		if (descjbjb_ule.length() > 0) {
			Label descLabeljbjb_ule = new Label(editGroupjbjb_ule, SWT.WRAP);
			descLabeljbjb_ule.setText(descjbjb_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_uleenabled_widget(new BooleanOptionWidget(editGroupjbjb_ule, SWT.NONE, new OptionData("Enabled", "p", "jb.ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_ule;
	}



	private Composite jbjb_trCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_tr = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_tr.setLayout(layout);
	
	 	editGroupjbjb_tr.setText("Type Assigner");
	 	
		editGroupjbjb_tr.setData("id", "jbjb_tr");
		
		String descjbjb_tr = "Assigns types to locals";	
		if (descjbjb_tr.length() > 0) {
			Label descLabeljbjb_tr = new Label(editGroupjbjb_tr, SWT.WRAP);
			descLabeljbjb_tr.setText(descjbjb_tr);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.tr"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_trenabled_widget(new BooleanOptionWidget(editGroupjbjb_tr, SWT.NONE, new OptionData("Enabled", "p", "jb.tr","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_tr;
	}



	private Composite jbjb_ulpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_ulp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_ulp.setLayout(layout);
	
	 	editGroupjbjb_ulp.setText("Unsplit-originals Local Packer");
	 	
		editGroupjbjb_ulp.setData("id", "jbjb_ulp");
		
		String descjbjb_ulp = "Local packer: minimizes number of locals";	
		if (descjbjb_ulp.length() > 0) {
			Label descLabeljbjb_ulp = new Label(editGroupjbjb_ulp, SWT.WRAP);
			descLabeljbjb_ulp.setText(descjbjb_ulp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.ulp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_ulpenabled_widget(new BooleanOptionWidget(editGroupjbjb_ulp, SWT.NONE, new OptionData("Enabled", "p", "jb.ulp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.ulp"+" "+"unsplit-original-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_ulpunsplit_original_locals_widget(new BooleanOptionWidget(editGroupjbjb_ulp, SWT.NONE, new OptionData("Unsplit Original Locals", "p", "jb.ulp","unsplit-original-locals", "\nUse the variable names in the original source as a guide when \ndetermining how to share local variables among non-interfering \nvariable usages. This recombines named locals which were split \nby the Local Splitter. ", defaultBool)));
		
		

		
		return editGroupjbjb_ulp;
	}



	private Composite jbjb_lnsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_lns = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_lns.setLayout(layout);
	
	 	editGroupjbjb_lns.setText("Local Name Standardizer");
	 	
		editGroupjbjb_lns.setData("id", "jbjb_lns");
		
		String descjbjb_lns = "Local name standardizer";	
		if (descjbjb_lns.length() > 0) {
			Label descLabeljbjb_lns = new Label(editGroupjbjb_lns, SWT.WRAP);
			descLabeljbjb_lns.setText(descjbjb_lns);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.lns"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_lnsenabled_widget(new BooleanOptionWidget(editGroupjbjb_lns, SWT.NONE, new OptionData("Enabled", "p", "jb.lns","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.lns"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_lnsonly_stack_locals_widget(new BooleanOptionWidget(editGroupjbjb_lns, SWT.NONE, new OptionData("Only Stack Locals", "p", "jb.lns","only-stack-locals", "\nOnly standardizes the names of variables that represent stack \nlocations in the original bytecode. This becomes the default \nwhen the `use-original-names' option is specified for the `jb' \nphase. ", defaultBool)));
		
		

		
		return editGroupjbjb_lns;
	}



	private Composite jbjb_cpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_cp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_cp.setLayout(layout);
	
	 	editGroupjbjb_cp.setText("Copy Propagator");
	 	
		editGroupjbjb_cp.setData("id", "jbjb_cp");
		
		String descjbjb_cp = "Copy propagator";	
		if (descjbjb_cp.length() > 0) {
			Label descLabeljbjb_cp = new Label(editGroupjbjb_cp, SWT.WRAP);
			descLabeljbjb_cp.setText(descjbjb_cp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.cp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_cpenabled_widget(new BooleanOptionWidget(editGroupjbjb_cp, SWT.NONE, new OptionData("Enabled", "p", "jb.cp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.cp"+" "+"only-regular-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_cponly_regular_locals_widget(new BooleanOptionWidget(editGroupjbjb_cp, SWT.NONE, new OptionData("Only Regular Locals", "p", "jb.cp","only-regular-locals", "\nOnly propagate copies through ``regular'' locals, that is, \nthose declared in the source bytecode. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.cp"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_cponly_stack_locals_widget(new BooleanOptionWidget(editGroupjbjb_cp, SWT.NONE, new OptionData("Only Stack Locals", "p", "jb.cp","only-stack-locals", "\nOnly propagate copies through locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjbjb_cp;
	}



	private Composite jbjb_daeCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_dae = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_dae.setLayout(layout);
	
	 	editGroupjbjb_dae.setText("Dead Assignment Eliminator");
	 	
		editGroupjbjb_dae.setData("id", "jbjb_dae");
		
		String descjbjb_dae = "Dead assignment eliminator";	
		if (descjbjb_dae.length() > 0) {
			Label descLabeljbjb_dae = new Label(editGroupjbjb_dae, SWT.WRAP);
			descLabeljbjb_dae.setText(descjbjb_dae);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.dae"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_daeenabled_widget(new BooleanOptionWidget(editGroupjbjb_dae, SWT.NONE, new OptionData("Enabled", "p", "jb.dae","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.dae"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_daeonly_stack_locals_widget(new BooleanOptionWidget(editGroupjbjb_dae, SWT.NONE, new OptionData("Only Stack Locals", "p", "jb.dae","only-stack-locals", "\nOnly eliminate dead assignments to locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjbjb_dae;
	}



	private Composite jbjb_cp_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_cp_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_cp_ule.setLayout(layout);
	
	 	editGroupjbjb_cp_ule.setText("Post-copy propagation Unused Local Eliminator");
	 	
		editGroupjbjb_cp_ule.setData("id", "jbjb_cp_ule");
		
		String descjbjb_cp_ule = "Post-copy propagation unused local eliminator";	
		if (descjbjb_cp_ule.length() > 0) {
			Label descLabeljbjb_cp_ule = new Label(editGroupjbjb_cp_ule, SWT.WRAP);
			descLabeljbjb_cp_ule.setText(descjbjb_cp_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.cp-ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_cp_uleenabled_widget(new BooleanOptionWidget(editGroupjbjb_cp_ule, SWT.NONE, new OptionData("Enabled", "p", "jb.cp-ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_cp_ule;
	}



	private Composite jbjb_lpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_lp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_lp.setLayout(layout);
	
	 	editGroupjbjb_lp.setText("Local Packer");
	 	
		editGroupjbjb_lp.setData("id", "jbjb_lp");
		
		String descjbjb_lp = "Local packer: minimizes number of locals";	
		if (descjbjb_lp.length() > 0) {
			Label descLabeljbjb_lp = new Label(editGroupjbjb_lp, SWT.WRAP);
			descLabeljbjb_lp.setText(descjbjb_lp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.lp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_lpenabled_widget(new BooleanOptionWidget(editGroupjbjb_lp, SWT.NONE, new OptionData("Enabled", "p", "jb.lp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.lp"+" "+"unsplit-original-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_lpunsplit_original_locals_widget(new BooleanOptionWidget(editGroupjbjb_lp, SWT.NONE, new OptionData("Unsplit Original Locals", "p", "jb.lp","unsplit-original-locals", "\nUse the variable names in the original source as a guide when \ndetermining how to share local variables across non-interfering \nvariable usages. This recombines named locals which were split \nby the Local Splitter. ", defaultBool)));
		
		

		
		return editGroupjbjb_lp;
	}



	private Composite jbjb_neCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_ne = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_ne.setLayout(layout);
	
	 	editGroupjbjb_ne.setText("Nop Eliminator");
	 	
		editGroupjbjb_ne.setData("id", "jbjb_ne");
		
		String descjbjb_ne = "Nop eliminator";	
		if (descjbjb_ne.length() > 0) {
			Label descLabeljbjb_ne = new Label(editGroupjbjb_ne, SWT.WRAP);
			descLabeljbjb_ne.setText(descjbjb_ne);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.ne"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_neenabled_widget(new BooleanOptionWidget(editGroupjbjb_ne, SWT.NONE, new OptionData("Enabled", "p", "jb.ne","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_ne;
	}



	private Composite jbjb_uceCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_uce = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_uce.setLayout(layout);
	
	 	editGroupjbjb_uce.setText("Unreachable Code Eliminator");
	 	
		editGroupjbjb_uce.setData("id", "jbjb_uce");
		
		String descjbjb_uce = "Unreachable code eliminator";	
		if (descjbjb_uce.length() > 0) {
			Label descLabeljbjb_uce = new Label(editGroupjbjb_uce, SWT.WRAP);
			descLabeljbjb_uce.setText(descjbjb_uce);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.uce"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjbjb_uceenabled_widget(new BooleanOptionWidget(editGroupjbjb_uce, SWT.NONE, new OptionData("Enabled", "p", "jb.uce","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jb.uce"+" "+"remove-unreachable-traps";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_uceremove_unreachable_traps_widget(new BooleanOptionWidget(editGroupjbjb_uce, SWT.NONE, new OptionData("Remove unreachable traps", "p", "jb.uce","remove-unreachable-traps", "\nRemove exception table entries when none of the protected \ninstructions can throw the exception being caught. ", defaultBool)));
		
		

		
		return editGroupjbjb_uce;
	}



	private Composite jbjb_ttCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjbjb_tt = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjbjb_tt.setLayout(layout);
	
	 	editGroupjbjb_tt.setText("Trap Tightener");
	 	
		editGroupjbjb_tt.setData("id", "jbjb_tt");
		
		String descjbjb_tt = "Trap Tightener";	
		if (descjbjb_tt.length() > 0) {
			Label descLabeljbjb_tt = new Label(editGroupjbjb_tt, SWT.WRAP);
			descLabeljbjb_tt.setText(descjbjb_tt);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jb.tt"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjbjb_ttenabled_widget(new BooleanOptionWidget(editGroupjbjb_tt, SWT.NONE, new OptionData("Enabled", "p", "jb.tt","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjbjb_tt;
	}



	private Composite jjCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjj = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjj.setLayout(layout);
	
	 	editGroupjj.setText("Java To Jimple Body Creation");
	 	
		editGroupjj.setData("id", "jj");
		
		String descjj = "Creates a JimpleBody for each method directly from source";	
		if (descjj.length() > 0) {
			Label descLabeljj = new Label(editGroupjj, SWT.WRAP);
			descLabeljj.setText(descjj);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjenabled_widget(new BooleanOptionWidget(editGroupjj, SWT.NONE, new OptionData("Enabled", "p", "jj","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj"+" "+"use-original-names";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjuse_original_names_widget(new BooleanOptionWidget(editGroupjj, SWT.NONE, new OptionData("Use Original Names", "p", "jj","use-original-names", "\nRetain the original names for local variables when the source \nincludes those names. Otherwise, Soot gives variables generic \nnames based on their types. ", defaultBool)));
		
		

		
		return editGroupjj;
	}



	private Composite jjjj_lsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_ls = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_ls.setLayout(layout);
	
	 	editGroupjjjj_ls.setText("Local Splitter");
	 	
		editGroupjjjj_ls.setData("id", "jjjj_ls");
		
		String descjjjj_ls = "Local splitter: one local per DU-UD web";	
		if (descjjjj_ls.length() > 0) {
			Label descLabeljjjj_ls = new Label(editGroupjjjj_ls, SWT.WRAP);
			descLabeljjjj_ls.setText(descjjjj_ls);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.ls"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_lsenabled_widget(new BooleanOptionWidget(editGroupjjjj_ls, SWT.NONE, new OptionData("Enabled", "p", "jj.ls","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_ls;
	}



	private Composite jjjj_aCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_a = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_a.setLayout(layout);
	
	 	editGroupjjjj_a.setText("Jimple Local Aggregator");
	 	
		editGroupjjjj_a.setData("id", "jjjj_a");
		
		String descjjjj_a = "Aggregator: removes some unnecessary copies";	
		if (descjjjj_a.length() > 0) {
			Label descLabeljjjj_a = new Label(editGroupjjjj_a, SWT.WRAP);
			descLabeljjjj_a.setText(descjjjj_a);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.a"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_aenabled_widget(new BooleanOptionWidget(editGroupjjjj_a, SWT.NONE, new OptionData("Enabled", "p", "jj.a","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.a"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_aonly_stack_locals_widget(new BooleanOptionWidget(editGroupjjjj_a, SWT.NONE, new OptionData("Only Stack Locals", "p", "jj.a","only-stack-locals", "\nOnly aggregate locals that represent stack locations in the \noriginal bytecode. (Stack locals can be distinguished in Jimple \nby the character with which their names begin.) ", defaultBool)));
		
		

		
		return editGroupjjjj_a;
	}



	private Composite jjjj_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_ule.setLayout(layout);
	
	 	editGroupjjjj_ule.setText("Unused Local Eliminator");
	 	
		editGroupjjjj_ule.setData("id", "jjjj_ule");
		
		String descjjjj_ule = "Unused local eliminator";	
		if (descjjjj_ule.length() > 0) {
			Label descLabeljjjj_ule = new Label(editGroupjjjj_ule, SWT.WRAP);
			descLabeljjjj_ule.setText(descjjjj_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_uleenabled_widget(new BooleanOptionWidget(editGroupjjjj_ule, SWT.NONE, new OptionData("Enabled", "p", "jj.ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_ule;
	}



	private Composite jjjj_trCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_tr = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_tr.setLayout(layout);
	
	 	editGroupjjjj_tr.setText("Type Assigner");
	 	
		editGroupjjjj_tr.setData("id", "jjjj_tr");
		
		String descjjjj_tr = "Assigns types to locals";	
		if (descjjjj_tr.length() > 0) {
			Label descLabeljjjj_tr = new Label(editGroupjjjj_tr, SWT.WRAP);
			descLabeljjjj_tr.setText(descjjjj_tr);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.tr"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_trenabled_widget(new BooleanOptionWidget(editGroupjjjj_tr, SWT.NONE, new OptionData("Enabled", "p", "jj.tr","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_tr;
	}



	private Composite jjjj_ulpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_ulp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_ulp.setLayout(layout);
	
	 	editGroupjjjj_ulp.setText("Unsplit-originals Local Packer");
	 	
		editGroupjjjj_ulp.setData("id", "jjjj_ulp");
		
		String descjjjj_ulp = "Local packer: minimizes number of locals";	
		if (descjjjj_ulp.length() > 0) {
			Label descLabeljjjj_ulp = new Label(editGroupjjjj_ulp, SWT.WRAP);
			descLabeljjjj_ulp.setText(descjjjj_ulp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.ulp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_ulpenabled_widget(new BooleanOptionWidget(editGroupjjjj_ulp, SWT.NONE, new OptionData("Enabled", "p", "jj.ulp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.ulp"+" "+"unsplit-original-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_ulpunsplit_original_locals_widget(new BooleanOptionWidget(editGroupjjjj_ulp, SWT.NONE, new OptionData("Unsplit Original Locals", "p", "jj.ulp","unsplit-original-locals", "\nUse the variable names in the original source as a guide when \ndetermining how to share local variables among non-interfering \nvariable usages. This recombines named locals which were split \nby the Local Splitter. ", defaultBool)));
		
		

		
		return editGroupjjjj_ulp;
	}



	private Composite jjjj_lnsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_lns = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_lns.setLayout(layout);
	
	 	editGroupjjjj_lns.setText("Local Name Standardizer");
	 	
		editGroupjjjj_lns.setData("id", "jjjj_lns");
		
		String descjjjj_lns = "Local name standardizer";	
		if (descjjjj_lns.length() > 0) {
			Label descLabeljjjj_lns = new Label(editGroupjjjj_lns, SWT.WRAP);
			descLabeljjjj_lns.setText(descjjjj_lns);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.lns"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_lnsenabled_widget(new BooleanOptionWidget(editGroupjjjj_lns, SWT.NONE, new OptionData("Enabled", "p", "jj.lns","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.lns"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_lnsonly_stack_locals_widget(new BooleanOptionWidget(editGroupjjjj_lns, SWT.NONE, new OptionData("Only Stack Locals", "p", "jj.lns","only-stack-locals", "\nOnly standardizes the names of variables that represent stack \nlocations in the original bytecode. This becomes the default \nwhen the `use-original-names' option is specified for the `jb' \nphase. ", defaultBool)));
		
		

		
		return editGroupjjjj_lns;
	}



	private Composite jjjj_cpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_cp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_cp.setLayout(layout);
	
	 	editGroupjjjj_cp.setText("Copy Propagator");
	 	
		editGroupjjjj_cp.setData("id", "jjjj_cp");
		
		String descjjjj_cp = "Copy propagator";	
		if (descjjjj_cp.length() > 0) {
			Label descLabeljjjj_cp = new Label(editGroupjjjj_cp, SWT.WRAP);
			descLabeljjjj_cp.setText(descjjjj_cp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.cp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_cpenabled_widget(new BooleanOptionWidget(editGroupjjjj_cp, SWT.NONE, new OptionData("Enabled", "p", "jj.cp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.cp"+" "+"only-regular-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_cponly_regular_locals_widget(new BooleanOptionWidget(editGroupjjjj_cp, SWT.NONE, new OptionData("Only Regular Locals", "p", "jj.cp","only-regular-locals", "\nOnly propagate copies through ``regular'' locals, that is, \nthose declared in the source bytecode. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.cp"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_cponly_stack_locals_widget(new BooleanOptionWidget(editGroupjjjj_cp, SWT.NONE, new OptionData("Only Stack Locals", "p", "jj.cp","only-stack-locals", "\nOnly propagate copies through locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjjjj_cp;
	}



	private Composite jjjj_daeCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_dae = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_dae.setLayout(layout);
	
	 	editGroupjjjj_dae.setText("Dead Assignment Eliminator");
	 	
		editGroupjjjj_dae.setData("id", "jjjj_dae");
		
		String descjjjj_dae = "Dead assignment eliminator";	
		if (descjjjj_dae.length() > 0) {
			Label descLabeljjjj_dae = new Label(editGroupjjjj_dae, SWT.WRAP);
			descLabeljjjj_dae.setText(descjjjj_dae);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.dae"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_daeenabled_widget(new BooleanOptionWidget(editGroupjjjj_dae, SWT.NONE, new OptionData("Enabled", "p", "jj.dae","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.dae"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_daeonly_stack_locals_widget(new BooleanOptionWidget(editGroupjjjj_dae, SWT.NONE, new OptionData("Only Stack Locals", "p", "jj.dae","only-stack-locals", "\nOnly eliminate dead assignments to locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjjjj_dae;
	}



	private Composite jjjj_cp_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_cp_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_cp_ule.setLayout(layout);
	
	 	editGroupjjjj_cp_ule.setText("Post-copy propagation Unused Local Eliminator");
	 	
		editGroupjjjj_cp_ule.setData("id", "jjjj_cp_ule");
		
		String descjjjj_cp_ule = "Post-copy propagation unused local eliminator";	
		if (descjjjj_cp_ule.length() > 0) {
			Label descLabeljjjj_cp_ule = new Label(editGroupjjjj_cp_ule, SWT.WRAP);
			descLabeljjjj_cp_ule.setText(descjjjj_cp_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.cp-ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_cp_uleenabled_widget(new BooleanOptionWidget(editGroupjjjj_cp_ule, SWT.NONE, new OptionData("Enabled", "p", "jj.cp-ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_cp_ule;
	}



	private Composite jjjj_lpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_lp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_lp.setLayout(layout);
	
	 	editGroupjjjj_lp.setText("Local Packer");
	 	
		editGroupjjjj_lp.setData("id", "jjjj_lp");
		
		String descjjjj_lp = "Local packer: minimizes number of locals";	
		if (descjjjj_lp.length() > 0) {
			Label descLabeljjjj_lp = new Label(editGroupjjjj_lp, SWT.WRAP);
			descLabeljjjj_lp.setText(descjjjj_lp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.lp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_lpenabled_widget(new BooleanOptionWidget(editGroupjjjj_lp, SWT.NONE, new OptionData("Enabled", "p", "jj.lp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jj.lp"+" "+"unsplit-original-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjjjj_lpunsplit_original_locals_widget(new BooleanOptionWidget(editGroupjjjj_lp, SWT.NONE, new OptionData("Unsplit Original Locals", "p", "jj.lp","unsplit-original-locals", "\nUse the variable names in the original source as a guide when \ndetermining how to share local variables across non-interfering \nvariable usages. This recombines named locals which were split \nby the Local Splitter. ", defaultBool)));
		
		

		
		return editGroupjjjj_lp;
	}



	private Composite jjjj_neCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_ne = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_ne.setLayout(layout);
	
	 	editGroupjjjj_ne.setText("Nop Eliminator");
	 	
		editGroupjjjj_ne.setData("id", "jjjj_ne");
		
		String descjjjj_ne = "Nop eliminator";	
		if (descjjjj_ne.length() > 0) {
			Label descLabeljjjj_ne = new Label(editGroupjjjj_ne, SWT.WRAP);
			descLabeljjjj_ne.setText(descjjjj_ne);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.ne"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_neenabled_widget(new BooleanOptionWidget(editGroupjjjj_ne, SWT.NONE, new OptionData("Enabled", "p", "jj.ne","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_ne;
	}



	private Composite jjjj_uceCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjjjj_uce = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjjjj_uce.setLayout(layout);
	
	 	editGroupjjjj_uce.setText("Unreachable Code Eliminator");
	 	
		editGroupjjjj_uce.setData("id", "jjjj_uce");
		
		String descjjjj_uce = "Unreachable code eliminator";	
		if (descjjjj_uce.length() > 0) {
			Label descLabeljjjj_uce = new Label(editGroupjjjj_uce, SWT.WRAP);
			descLabeljjjj_uce.setText(descjjjj_uce);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jj.uce"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjjjj_uceenabled_widget(new BooleanOptionWidget(editGroupjjjj_uce, SWT.NONE, new OptionData("Enabled", "p", "jj.uce","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjjjj_uce;
	}



	private Composite cgCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcg = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcg.setLayout(layout);
	
	 	editGroupcg.setText("Call Graph Constructor");
	 	
		editGroupcg.setData("id", "cg");
		
		String desccg = "Call graph constructor";	
		if (desccg.length() > 0) {
			Label descLabelcg = new Label(editGroupcg, SWT.WRAP);
			descLabelcg.setText(desccg);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgenabled_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Enabled", "p", "cg","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"safe-forname";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgsafe_forname_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Safe forName", "p", "cg","safe-forname", "\nWhen a program calls Class.forName(), the named class is \nresolved, and its static initializer executed. In many cases, it \ncannot be determined statically which class will be loaded, and \nwhich static initializer executed. When this option is set to \ntrue, Soot will conservatively assume that any static \ninitializer could be executed. This may make the call graph very \nlarge. When this option is set to false, any calls to \nClass.forName() for which the class cannot be determined \nstatically are assumed to call no static initializers. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"safe-newinstance";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgsafe_newinstance_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Safe newInstance", "p", "cg","safe-newinstance", "\nWhen a program calls Class.newInstance(), a new object is \ncreated and its constructor executed. Soot does not determine \nstatically which type of object will be created, and which \nconstructor executed. When this option is set to true, Soot will \nconservatively assume that any constructor could be executed. \nThis may make the call graph very large. When this option is set \nto false, any calls to Class.newInstance() are assumed not to \ncall the constructor of the created object. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"verbose";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgverbose_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Verbose", "p", "cg","verbose", "\nDue to the effects of native methods and reflection, it may not \nalways be possible to construct a fully conservative call graph. \nSetting this option to true causes Soot to point out the parts \nof the call graph that may be incomplete, so that they can be \nchecked by hand. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"all-reachable";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgall_reachable_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("All Application Class Methods Reachable", "p", "cg","all-reachable", "\nWhen this option is false, the call graph is built starting at a \nset of entry points, and only methods reachable from those entry \npoints are processed. Unreachable methods will not have any call \ngraph edges generated out of them. Setting this option to true \nmakes Soot consider all methods of application classes to be \nreachable, so call edges are generated for all of them. This \nleads to a larger call graph. For program visualization \npurposes, it is sometimes desirable to include edges from \nunreachable methods; although these methods are unreachable in \nthe version being analyzed, they may become reachable if the \nprogram is modified.", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"implicit-entry";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgimplicit_entry_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Implicit Entry Points", "p", "cg","implicit-entry", "\nWhen this option is true, methods that are called implicitly by \nthe VM are considered entry points of the call graph. When it is \nfalse, these methods are not considered entry points, leading to \na possibly incomplete call graph.", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"trim-clinit";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgtrim_clinit_widget(new BooleanOptionWidget(editGroupcg, SWT.NONE, new OptionData("Trim Static Initializer Edges", "p", "cg","trim-clinit", "\nThe call graph contains an edge from each statement that could \ntrigger execution of a static initializer to that static \ninitializer. However, each static initializer is triggered only \nonce. When this option is enabled, after the call graph is \nbuilt, an intra-procedural analysis is performed to detect \nstatic initializer edges leading to methods that must have \nalready been executed. Since these static initializers cannot be \nexecuted again, the corresponding call graph edges are removed \nfrom the call graph. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg"+" "+"jdkver";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "3";
			
		}

		setcgjdkver_widget(new StringOptionWidget(editGroupcg, SWT.NONE, new OptionData("JDK version",  "p", "cg","jdkver", "\nThis option sets the JDK version of the standard library being \nanalyzed so that Soot can simulate the native methods in the \nspecific version of the library. The default, 3, refers to Java \n1.3.x.", defaultString)));
		

		
		return editGroupcg;
	}



	private Composite cgcg_chaCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgcg_cha = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgcg_cha.setLayout(layout);
	
	 	editGroupcgcg_cha.setText("Class Hierarchy Analysis");
	 	
		editGroupcgcg_cha.setData("id", "cgcg_cha");
		
		String desccgcg_cha = "Builds call graph using Class Hierarchy Analysis";	
		if (desccgcg_cha.length() > 0) {
			Label descLabelcgcg_cha = new Label(editGroupcgcg_cha, SWT.WRAP);
			descLabelcgcg_cha.setText(desccgcg_cha);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.cha"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_chaenabled_widget(new BooleanOptionWidget(editGroupcgcg_cha, SWT.NONE, new OptionData("Enabled", "p", "cg.cha","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.cha"+" "+"verbose";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_chaverbose_widget(new BooleanOptionWidget(editGroupcgcg_cha, SWT.NONE, new OptionData("Verbose", "p", "cg.cha","verbose", "\nSetting this option to true causes Soot to print out statistics \nabout the call graph computed by this phase, such as the number \nof methods determined to be reachable.", defaultBool)));
		
		

		
		return editGroupcgcg_cha;
	}



	private Composite cgcg_sparkCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgcg_spark = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgcg_spark.setLayout(layout);
	
	 	editGroupcgcg_spark.setText("Spark");
	 	
		editGroupcgcg_spark.setData("id", "cgcg_spark");
		
		String desccgcg_spark = "Spark points-to analysis framework";	
		if (desccgcg_spark.length() > 0) {
			Label descLabelcgcg_spark = new Label(editGroupcgcg_spark, SWT.WRAP);
			descLabelcgcg_spark.setText(desccgcg_spark);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkenabled_widget(new BooleanOptionWidget(editGroupcgcg_spark, SWT.NONE, new OptionData("Enabled", "p", "cg.spark","enabled", "\n", defaultBool)));
		
		

		
		return editGroupcgcg_spark;
	}



	private Composite cgSpark_General_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgSpark_General_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgSpark_General_Options.setLayout(layout);
	
	 	editGroupcgSpark_General_Options.setText("Spark General Options");
	 	
		editGroupcgSpark_General_Options.setData("id", "cgSpark_General_Options");
		
		String desccgSpark_General_Options = "";	
		if (desccgSpark_General_Options.length() > 0) {
			Label descLabelcgSpark_General_Options = new Label(editGroupcgSpark_General_Options, SWT.WRAP);
			descLabelcgSpark_General_Options.setText(desccgSpark_General_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"verbose";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkverbose_widget(new BooleanOptionWidget(editGroupcgSpark_General_Options, SWT.NONE, new OptionData("Verbose", "p", "cg.spark","verbose", "\nWhen this option is set to true, Spark prints detailed \ninformation about its execution. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"ignore-types";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkignore_types_widget(new BooleanOptionWidget(editGroupcgSpark_General_Options, SWT.NONE, new OptionData("Ignore Types Entirely", "p", "cg.spark","ignore-types", "\nWhen this option is set to true, all parts of Spark completely \nignore declared types of variables and casts. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"force-gc";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkforce_gc_widget(new BooleanOptionWidget(editGroupcgSpark_General_Options, SWT.NONE, new OptionData("Force Garbage Collections", "p", "cg.spark","force-gc", "\nWhen this option is set to true, calls to System.gc() will be \nmade at various points to allow memory usage to be measured. \n", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"pre-jimplify";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkpre_jimplify_widget(new BooleanOptionWidget(editGroupcgSpark_General_Options, SWT.NONE, new OptionData("Pre Jimplify", "p", "cg.spark","pre-jimplify", "\nWhen this option is set to true, Spark converts all available \nmethods to Jimple before starting the points-to analysis. This \nallows the Jimplification time to be separated from the \npoints-to time. However, it increases the total time and memory \nrequirement, because all methods are Jimplified, rather than \nonly those deemed reachable by the points-to analysis. ", defaultBool)));
		
		

		
		return editGroupcgSpark_General_Options;
	}



	private Composite cgSpark_Pointer_Assignment_Graph_Building_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgSpark_Pointer_Assignment_Graph_Building_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgSpark_Pointer_Assignment_Graph_Building_Options.setLayout(layout);
	
	 	editGroupcgSpark_Pointer_Assignment_Graph_Building_Options.setText("Spark Pointer Assignment Graph Building Options");
	 	
		editGroupcgSpark_Pointer_Assignment_Graph_Building_Options.setData("id", "cgSpark_Pointer_Assignment_Graph_Building_Options");
		
		String desccgSpark_Pointer_Assignment_Graph_Building_Options = "";	
		if (desccgSpark_Pointer_Assignment_Graph_Building_Options.length() > 0) {
			Label descLabelcgSpark_Pointer_Assignment_Graph_Building_Options = new Label(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.WRAP);
			descLabelcgSpark_Pointer_Assignment_Graph_Building_Options.setText(desccgSpark_Pointer_Assignment_Graph_Building_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"vta";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkvta_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("VTA", "p", "cg.spark","vta", "\nSetting VTA to true has the effect of setting field-based, \ntypes-for-sites, and simplify-sccs to true, and on-fly-cg to \nfalse, to simulate Variable Type Analysis, described in our \nOOPSLA 2000 paper. Note that the algorithm differs from the \noriginal VTA in that it handles array elements more precisely. \n", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"rta";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkrta_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("RTA", "p", "cg.spark","rta", "\nSetting RTA to true sets types-for-sites to true, and causes \nSpark to use a single points-to set for all variables, giving \nRapid Type Analysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"field-based";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkfield_based_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Field Based", "p", "cg.spark","field-based", "\nWhen this option is set to true, fields are represented by \nvariable (Green) nodes, and the object that the field belongs to \nis ignored (all objects are lumped together), giving a \nfield-based analysis. Otherwise, fields are represented by field \nreference (Red) nodes, and the objects that they belong to are \ndistinguished, giving a field-sensitive analysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"types-for-sites";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparktypes_for_sites_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Types For Sites", "p", "cg.spark","types-for-sites", "\nWhen this option is set to true, types rather than allocation \nsites are used as the elements of the points-to sets. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"merge-stringbuffer";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_sparkmerge_stringbuffer_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Merge String Buffer", "p", "cg.spark","merge-stringbuffer", "\nWhen this option is set to true, all allocation sites creating \njava.lang.StringBuffer objects are grouped together as a single \nallocation site. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"string-constants";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkstring_constants_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Propagate All String Constants", "p", "cg.spark","string-constants", "\nWhen this option is set to false, Spark only distinguishes \nstring constants that may be the name of a class loaded \ndynamically using reflection, and all other string constants are \nlumped together into a single string constant node. Setting this \noption to true causes all string constants to be propagated \nindividually. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"simulate-natives";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_sparksimulate_natives_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Simulate Natives", "p", "cg.spark","simulate-natives", "\nWhen this option is set to true, the effects of native methods \nin the standard Java class library are simulated. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"simple-edges-bidirectional";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparksimple_edges_bidirectional_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Simple Edges Bidirectional", "p", "cg.spark","simple-edges-bidirectional", "\nWhen this option is set to true, all edges connecting variable \n(Green) nodes are made bidirectional, as in Steensgaard's \nanalysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"on-fly-cg";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_sparkon_fly_cg_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("On Fly Call Graph", "p", "cg.spark","on-fly-cg", "\nWhen this option is set to true, the call graph is computed \non-the-fly as points-to information is computed. Otherwise, an \ninitial CHA approximation to the call graph is used. ", defaultBool)));
		
		

		
		return editGroupcgSpark_Pointer_Assignment_Graph_Building_Options;
	}



	private Composite cgSpark_Pointer_Assignment_Graph_Simplification_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options.setLayout(layout);
	
	 	editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options.setText("Spark Pointer Assignment Graph Simplification Options");
	 	
		editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options.setData("id", "cgSpark_Pointer_Assignment_Graph_Simplification_Options");
		
		String desccgSpark_Pointer_Assignment_Graph_Simplification_Options = "";	
		if (desccgSpark_Pointer_Assignment_Graph_Simplification_Options.length() > 0) {
			Label descLabelcgSpark_Pointer_Assignment_Graph_Simplification_Options = new Label(editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options, SWT.WRAP);
			descLabelcgSpark_Pointer_Assignment_Graph_Simplification_Options.setText(desccgSpark_Pointer_Assignment_Graph_Simplification_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"simplify-offline";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparksimplify_offline_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options, SWT.NONE, new OptionData("Simplify Offline", "p", "cg.spark","simplify-offline", "\nWhen this option is set to true, variable (Green) nodes which \nform single-entry subgraphs (so they must have the same \npoints-to set) are merged before propagation begins. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"simplify-sccs";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparksimplify_sccs_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options, SWT.NONE, new OptionData("Simplify SCCs", "p", "cg.spark","simplify-sccs", "\nWhen this option is set to true, variable (Green) nodes which \nform strongly-connected components (so they must have the same \npoints-to set) are merged before propagation begins. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"ignore-types-for-sccs";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkignore_types_for_sccs_widget(new BooleanOptionWidget(editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options, SWT.NONE, new OptionData("Ignore Types For SCCs", "p", "cg.spark","ignore-types-for-sccs", "\nWhen this option is set to true, when collapsing \nstrongly-connected components, nodes forming SCCs are collapsed \nregardless of their declared type. The collapsed SCC is given \nthe most general type of all the nodes in the component. When \nthis option is set to false, only edges connecting nodes of the \nsame type are considered when detecting SCCs. This option has \nno effect unless simplify-sccs is true. ", defaultBool)));
		
		

		
		return editGroupcgSpark_Pointer_Assignment_Graph_Simplification_Options;
	}



	private Composite cgSpark_Points_To_Set_Flowing_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgSpark_Points_To_Set_Flowing_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgSpark_Points_To_Set_Flowing_Options.setLayout(layout);
	
	 	editGroupcgSpark_Points_To_Set_Flowing_Options.setText("Spark Points-To Set Flowing Options");
	 	
		editGroupcgSpark_Points_To_Set_Flowing_Options.setData("id", "cgSpark_Points_To_Set_Flowing_Options");
		
		String desccgSpark_Points_To_Set_Flowing_Options = "";	
		if (desccgSpark_Points_To_Set_Flowing_Options.length() > 0) {
			Label descLabelcgSpark_Points_To_Set_Flowing_Options = new Label(editGroupcgSpark_Points_To_Set_Flowing_Options, SWT.WRAP);
			descLabelcgSpark_Points_To_Set_Flowing_Options.setText(desccgSpark_Points_To_Set_Flowing_Options);
		}
		OptionData [] data;	
		
		
		
		
		data = new OptionData [] {
		
		new OptionData("Iter",
		"iter",
		"\nIter is a simple, iterative algorithm, which propagates \neverything until the graph does not change. ",
		
		false),
		
		new OptionData("Worklist",
		"worklist",
		"\nWorklist is a worklist-based algorithm that tries to do as \nlittle work as possible. This is currently the fastest \nalgorithm. ",
		
		true),
		
		new OptionData("Cycle",
		"cycle",
		"\nThis algorithm finds cycles in the PAG on-the-fly. It is not yet \nfinished.",
		
		false),
		
		new OptionData("Merge",
		"merge",
		"\nMerge is an algorithm that merges all concrete field (yellow) \nnodes with their corresponding field reference (red) nodes. This \nalgorithm is not yet finished. ",
		
		false),
		
		new OptionData("Alias",
		"alias",
		"\nAlias is an alias-edge based algorithm. This algorithm tends to \ntake the least memory for very large problems, because it does \nnot represent explicitly points-to sets of fields of heap \nobjects. ",
		
		false),
		
		new OptionData("None",
		"none",
		"\nNone means that propagation is not done; the graph is only \nbuilt and simplified. This is useful if an external solver is \nbeing used to perform the propagation. ",
		
		false),
		
		};
		
										
		setcgcg_sparkpropagator_widget(new MultiOptionWidget(editGroupcgSpark_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Propagator", "p", "cg.spark","propagator", "\nThis option tells Spark which propagation algorithm to use. \n")));
		
		defKey = "p"+" "+"cg.spark"+" "+"propagator";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_sparkpropagator_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		false),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		new OptionData("Double",
		"double",
		"\nDouble is an implementation that itself uses a pair of sets for \neach points-to set. The first set in the pair stores new \npointed-to objects that have not yet been propagated, while the \nsecond set stores old pointed-to objects that have been \npropagated and need not be reconsidered. This allows the \npropagation algorithms to be incremental, often speeding them up \nsignificantly. ",
		
		true),
		
		new OptionData("Shared bit-vector",
		"shared",
		"\nThis is a bit-vector representation, in which duplicate \nbit-vectors are found and stored only once to save memory.",
		
		false),
		
		};
		
										
		setcgcg_sparkset_impl_widget(new MultiOptionWidget(editGroupcgSpark_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Set Implementation", "p", "cg.spark","set-impl", "\nSelect an implementation of points-to sets for Spark to use. ")));
		
		defKey = "p"+" "+"cg.spark"+" "+"set-impl";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_sparkset_impl_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		true),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		new OptionData("Shared bit-vector",
		"shared",
		"\nThis is a bit-vector representation, in which duplicate \nbit-vectors are found and stored only once to save memory.",
		
		false),
		
		};
		
										
		setcgcg_sparkdouble_set_old_widget(new MultiOptionWidget(editGroupcgSpark_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Double Set Old", "p", "cg.spark","double-set-old", "\nSelect an implementation for sets of old objects in the double \npoints-to set implementation. This option has no effect unless \nSet Implementation is set to double. ")));
		
		defKey = "p"+" "+"cg.spark"+" "+"double-set-old";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_sparkdouble_set_old_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		true),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		new OptionData("Shared bit-vector",
		"shared",
		"\nThis is a bit-vector representation, in which duplicate \nbit-vectors are found and stored only once to save memory.",
		
		false),
		
		};
		
										
		setcgcg_sparkdouble_set_new_widget(new MultiOptionWidget(editGroupcgSpark_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Double Set New", "p", "cg.spark","double-set-new", "\nSelect an implementation for sets of new objects in the double \npoints-to set implementation. This option has no effect unless \nSet Implementation is set to double. ")));
		
		defKey = "p"+" "+"cg.spark"+" "+"double-set-new";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_sparkdouble_set_new_widget().setDef(defaultString);
		}
		
		

		
		return editGroupcgSpark_Points_To_Set_Flowing_Options;
	}



	private Composite cgSpark_Output_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgSpark_Output_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgSpark_Output_Options.setLayout(layout);
	
	 	editGroupcgSpark_Output_Options.setText("Spark Output Options");
	 	
		editGroupcgSpark_Output_Options.setData("id", "cgSpark_Output_Options");
		
		String desccgSpark_Output_Options = "";	
		if (desccgSpark_Output_Options.length() > 0) {
			Label descLabelcgSpark_Output_Options = new Label(editGroupcgSpark_Output_Options, SWT.WRAP);
			descLabelcgSpark_Output_Options.setText(desccgSpark_Output_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"dump-html";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkdump_html_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Dump HTML", "p", "cg.spark","dump-html", "\nWhen this option is set to true, a browseable HTML \nrepresentation of the pointer assignment graph is output to a \nfile called pag.jar after the analysis completes. Note that this \nrepresentation is typically very large. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"dump-pag";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkdump_pag_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Dump PAG", "p", "cg.spark","dump-pag", "\nWhen this option is set to true, a representation of the \npointer assignment graph suitable for processing with other \nsolvers (such as the BDD-based solver) is output before the \nanalysis begins. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"dump-solution";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkdump_solution_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Dump Solution", "p", "cg.spark","dump-solution", "\nWhen this option is set to true, a representation of the \nresulting points-to sets is dumped. The format is similar to \nthat of the Dump PAG option, and is therefore suitable for \ncomparison with the results of other solvers. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"topo-sort";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparktopo_sort_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Topological Sort", "p", "cg.spark","topo-sort", "\nWhen this option is set to true, the representation dumped by \nthe Dump PAG option is dumped with the variable (green) nodes in \n(pseudo-)topological order. This option has no effect unless \nDump PAG is true. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"dump-types";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_sparkdump_types_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Dump Types", "p", "cg.spark","dump-types", "\nWhen this option is set to true, the representation dumped by \nthe Dump PAG option includes type information for all nodes. \nThis option has no effect unless Dump PAG is true. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"class-method-var";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_sparkclass_method_var_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Class Method Var", "p", "cg.spark","class-method-var", "\nWhen this option is set to true, the representation dumped by \nthe Dump PAG option represents nodes by numbering each class, \nmethod, and variable within the method separately, rather than \nassigning a single integer to each node. This option has no \neffect unless Dump PAG is true. Setting Class Method Var to \ntrue has the effect of setting Topological Sort to false. \n", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"dump-answer";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkdump_answer_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Dump Answer", "p", "cg.spark","dump-answer", "\nWhen this option is set to true, the computed reaching types \nfor each variable are dumped to a file, so that they can be \ncompared with the results of other analyses (such as the old \nVTA). ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"add-tags";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkadd_tags_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Add Tags", "p", "cg.spark","add-tags", "\nWhen this option is set to true, the results of the \nanalysis are encoded within tags and printed with the resulting \nJimple code. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.spark"+" "+"set-mass";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_sparkset_mass_widget(new BooleanOptionWidget(editGroupcgSpark_Output_Options, SWT.NONE, new OptionData("Calculate Set Mass", "p", "cg.spark","set-mass", "\nWhen this option is set to true, Spark computes and prints \nvarious cryptic statistics about the size of the points-to sets \ncomputed. ", defaultBool)));
		
		

		
		return editGroupcgSpark_Output_Options;
	}



	private Composite cgcg_paddleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgcg_paddle = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgcg_paddle.setLayout(layout);
	
	 	editGroupcgcg_paddle.setText("Paddle");
	 	
		editGroupcgcg_paddle.setData("id", "cgcg_paddle");
		
		String desccgcg_paddle = "Paddle points-to analysis framework";	
		if (desccgcg_paddle.length() > 0) {
			Label descLabelcgcg_paddle = new Label(editGroupcgcg_paddle, SWT.WRAP);
			descLabelcgcg_paddle.setText(desccgcg_paddle);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleenabled_widget(new BooleanOptionWidget(editGroupcgcg_paddle, SWT.NONE, new OptionData("Enabled", "p", "cg.paddle","enabled", "\n", defaultBool)));
		
		

		
		return editGroupcgcg_paddle;
	}



	private Composite cgPaddle_General_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgPaddle_General_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgPaddle_General_Options.setLayout(layout);
	
	 	editGroupcgPaddle_General_Options.setText("Paddle General Options");
	 	
		editGroupcgPaddle_General_Options.setData("id", "cgPaddle_General_Options");
		
		String desccgPaddle_General_Options = "";	
		if (desccgPaddle_General_Options.length() > 0) {
			Label descLabelcgPaddle_General_Options = new Label(editGroupcgPaddle_General_Options, SWT.WRAP);
			descLabelcgPaddle_General_Options.setText(desccgPaddle_General_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"verbose";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleverbose_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Verbose", "p", "cg.paddle","verbose", "\nWhen this option is set to true, Paddle prints detailed \ninformation about its execution. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"bdd";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlebdd_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Use BDDs", "p", "cg.paddle","bdd", "\nCauses \nPaddle to use BDD versions of its components ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"dynamic-order";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddledynamic_order_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Dynamic reordering", "p", "cg.paddle","dynamic-order", "\nAllows the BDD package \nto perform dynamic variable ordering. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"profile";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleprofile_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Profile", "p", "cg.paddle","profile", "\nTurns on JeddProfiler for profiling BDD operations. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"ignore-types";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleignore_types_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Ignore Types Entirely", "p", "cg.paddle","ignore-types", "\nWhen this option is set to true, all parts of Paddle completely \nignore declared types of variables and casts. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"pre-jimplify";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlepre_jimplify_widget(new BooleanOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Pre Jimplify", "p", "cg.paddle","pre-jimplify", "\nWhen this option is set to true, Paddle converts all available \nmethods to Jimple before starting the points-to analysis. This \nallows the Jimplification time to be separated from the \npoints-to time. However, it increases the total time and memory \nrequirement, because all methods are Jimplified, rather than \nonly those deemed reachable by the points-to analysis. ", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("On-the fly call graph",
		"ofcg",
		"\nPerforms points-to analysis and builds call graph together, \non-the-fly. ",
		
		true),
		
		new OptionData("CHA only",
		"cha",
		"\nBuilds only a call graph using Class Hieararchy Analysis, and \nperforms no points-to analysis. ",
		
		false),
		
		new OptionData("CHA ahead-of-time call graph",
		"cha-aot",
		"\nFirst builds a call graph using CHA, then uses the call graph \nin a fixed-call-graph points-to analysis. ",
		
		false),
		
		new OptionData("OFCG-AOT",
		"ofcg-aot",
		"\nFirst builds a call graph on-the-fly during a points-to \nanalysis, then uses the resulting call graph to perform a second \npoints-to analysis with a fixed call graph. ",
		
		false),
		
		new OptionData("CHA-Context-AOT call graph",
		"cha-context-aot",
		"\nFirst builds a call graph using CHA, then makes it \ncontext-sensitive using the technique described by Calman and \nZhu in PLDI 04, then uses the call graph in a fixed-call-graph \npoints-to analysis. ",
		
		false),
		
		new OptionData("OFCG-Context-AOT",
		"ofcg-context-aot",
		"\nFirst builds a call graph on-the-fly during a points-to \nanalysis, then makes it context-sensitive using the technique \ndescribed by Calman and Zhu in PLDI 04, then uses the resulting \ncall graph to perform a second points-to analysis with a fixed \ncall graph. ",
		
		false),
		
		new OptionData("CHA-Context call graph",
		"cha-context",
		"\nFirst builds a call graph using CHA, then makes it \ncontext-sensitive using the technique described by Calman and \nZhu in PLDI 04. Does not produce points-to information. ",
		
		false),
		
		new OptionData("OFCG-Context",
		"ofcg-context",
		"\nFirst builds a call graph on-the-fly during a points-to \nanalysis, then makes it context-sensitive using the technique \ndescribed by Calman and Zhu in PLDI 04. Does not perform a \nsubsequent points-to analysis. ",
		
		false),
		
		};
		
										
		setcgcg_paddleconf_widget(new MultiOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, data, new OptionData("Configuration", "p", "cg.paddle","conf", "\nSelects the configuration of points-to analysis and call graph \nconstruction to be used in Paddle. ")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"conf";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddleconf_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Select Automatically",
		"auto",
		"\nWhen the bdd option is true, the BDD-based worklist \nimplementation will be used. When the bdd option is false, the \nTraditional worklist implementation will be used. ",
		
		true),
		
		new OptionData("Traditional",
		"trad",
		"\nNormal worklist queue implementation ",
		
		false),
		
		new OptionData("BDD",
		"bdd",
		"\nBDD-based queue implementation ",
		
		false),
		
		new OptionData("Debug",
		"debug",
		"\nAn implementation of worklists that includes both traditional \nand BDD-based implementations, and signals an error whenever \ntheir contents differ. ",
		
		false),
		
		new OptionData("Trace",
		"trace",
		"\nA worklist implementation that prints out all tuples added to \nevery worklist. ",
		
		false),
		
		new OptionData("Number Trace",
		"numtrace",
		"\nA worklist implementation that prints out the number of tuples \nadded to each worklist after each operation. ",
		
		false),
		
		};
		
										
		setcgcg_paddleq_widget(new MultiOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, data, new OptionData("Worklist Implementation", "p", "cg.paddle","q", "\nSelect the implementation of worklists to be used in Paddle. \n")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"q";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddleq_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("BuDDy",
		"buddy",
		"\nUse BuDDy implementation of BDDs. ",
		
		true),
		
		new OptionData("CUDD",
		"cudd",
		"\nUse CUDD implementation of BDDs. ",
		
		false),
		
		new OptionData("SableJBDD",
		"sable",
		"\nUse SableJBDD implementation of BDDs.",
		
		false),
		
		new OptionData("JavaBDD",
		"javabdd",
		"\nUse JavaBDD implementation of BDDs. ",
		
		false),
		
		new OptionData("None",
		"none",
		"\nDon't use any BDD backend. Any attempted use of BDDs will cause \nPaddle to crash. ",
		
		false),
		
		};
		
										
		setcgcg_paddlebackend_widget(new MultiOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, data, new OptionData("Backend", "p", "cg.paddle","backend", "\nThis option tells Paddle which implementation of BDDs to use. \n")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"backend";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddlebackend_widget().setDef(defaultString);
		}
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"order";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "32";
			
		}

		setcgcg_paddleorder_widget(new StringOptionWidget(editGroupcgPaddle_General_Options, SWT.NONE, new OptionData("Variable ordering",  "p", "cg.paddle","order", "\nSelects one of the BDD \nvariable orderings hard-coded in Paddle. ", defaultString)));
		

		
		return editGroupcgPaddle_General_Options;
	}



	private Composite cgPaddle_Context_Sensitivity_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgPaddle_Context_Sensitivity_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgPaddle_Context_Sensitivity_Options.setLayout(layout);
	
	 	editGroupcgPaddle_Context_Sensitivity_Options.setText("Paddle Context Sensitivity Options");
	 	
		editGroupcgPaddle_Context_Sensitivity_Options.setData("id", "cgPaddle_Context_Sensitivity_Options");
		
		String desccgPaddle_Context_Sensitivity_Options = "";	
		if (desccgPaddle_Context_Sensitivity_Options.length() > 0) {
			Label descLabelcgPaddle_Context_Sensitivity_Options = new Label(editGroupcgPaddle_Context_Sensitivity_Options, SWT.WRAP);
			descLabelcgPaddle_Context_Sensitivity_Options.setText(desccgPaddle_Context_Sensitivity_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"context-heap";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlecontext_heap_widget(new BooleanOptionWidget(editGroupcgPaddle_Context_Sensitivity_Options, SWT.NONE, new OptionData("Context-sensitive Heap Locations", "p", "cg.paddle","context-heap", "\nWhen this option is set to true, the context-sensitivity level \nthat is set for the context-sensitive call graph and for pointer \nvariables is also used to model heap locations \ncontext-sensitively. When this option is false, heap locations \nare modelled context-insensitively regardless of the \ncontext-sensitivity level. ", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Context-insensitive",
		"insens",
		"\nBuilds a context-insensitive call graph. ",
		
		true),
		
		new OptionData("1-CFA",
		"1cfa",
		"\nBuilds a 1-CFA call graph. ",
		
		false),
		
		new OptionData("k-CFA",
		"kcfa",
		"\nBuilds a k-CFA call graph. ",
		
		false),
		
		new OptionData("Object Sensitive",
		"objsens",
		"\nBuilds an object-sensitive call graph. ",
		
		false),
		
		new OptionData("k-Object Sensitive",
		"kobjsens",
		"\nBuilds a context-sensitive call graph where the context is a \nstring of up to k receiver objects. ",
		
		false),
		
		new OptionData("Unique k-Object Sensitive",
		"uniqkobjsens",
		"\nBuilds a context-sensitive call graph where the context is a \nstring of up to k unique receiver objects. If the receiver of a \ncall already appears in the context string, the context string \nis just reused as is. ",
		
		false),
		
		};
		
										
		setcgcg_paddlecontext_widget(new MultiOptionWidget(editGroupcgPaddle_Context_Sensitivity_Options, SWT.NONE, data, new OptionData("Context abstraction", "p", "cg.paddle","context", "\nThis option tells Paddle which level of context-sensitivity to \nuse in constructing the call graph. ")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"context";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddlecontext_widget().setDef(defaultString);
		}
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"k";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "2";
			
		}

		setcgcg_paddlek_widget(new StringOptionWidget(editGroupcgPaddle_Context_Sensitivity_Options, SWT.NONE, new OptionData("Context length (k)",  "p", "cg.paddle","k", "\nThe maximum length of \ncall string or receiver object string used as context. \n", defaultString)));
		

		
		return editGroupcgPaddle_Context_Sensitivity_Options;
	}



	private Composite cgPaddle_Pointer_Assignment_Graph_Building_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options.setLayout(layout);
	
	 	editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options.setText("Paddle Pointer Assignment Graph Building Options");
	 	
		editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options.setData("id", "cgPaddle_Pointer_Assignment_Graph_Building_Options");
		
		String desccgPaddle_Pointer_Assignment_Graph_Building_Options = "";	
		if (desccgPaddle_Pointer_Assignment_Graph_Building_Options.length() > 0) {
			Label descLabelcgPaddle_Pointer_Assignment_Graph_Building_Options = new Label(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.WRAP);
			descLabelcgPaddle_Pointer_Assignment_Graph_Building_Options.setText(desccgPaddle_Pointer_Assignment_Graph_Building_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"rta";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlerta_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("RTA", "p", "cg.paddle","rta", "\nSetting RTA to true sets types-for-sites to true, and causes \nPaddle to use a single points-to set for all variables, giving \nRapid Type Analysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"field-based";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlefield_based_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Field Based", "p", "cg.paddle","field-based", "\nWhen this option is set to true, fields are represented by \nvariable (Green) nodes, and the object that the field belongs to \nis ignored (all objects are lumped together), giving a \nfield-based analysis. Otherwise, fields are represented by field \nreference (Red) nodes, and the objects that they belong to are \ndistinguished, giving a field-sensitive analysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"types-for-sites";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddletypes_for_sites_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Types For Sites", "p", "cg.paddle","types-for-sites", "\nWhen this option is set to true, types rather than allocation \nsites are used as the elements of the points-to sets. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"merge-stringbuffer";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_paddlemerge_stringbuffer_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Merge String Buffer", "p", "cg.paddle","merge-stringbuffer", "\nWhen this option is set to true, all allocation sites creating \njava.lang.StringBuffer objects are grouped together as a single \nallocation site. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"string-constants";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlestring_constants_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Propagate All String Constants", "p", "cg.paddle","string-constants", "\nWhen this option is set to false, Paddle only distinguishes \nstring constants that may be the name of a class loaded \ndynamically using reflection, and all other string constants are \nlumped together into a single string constant node. Setting this \noption to true causes all string constants to be propagated \nindividually. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"simulate-natives";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_paddlesimulate_natives_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Simulate Natives", "p", "cg.paddle","simulate-natives", "\nWhen this option is set to true, the effects of native methods \nin the standard Java class library are simulated. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"global-nodes-in-natives";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleglobal_nodes_in_natives_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Global Nodes in Simulated Natives", "p", "cg.paddle","global-nodes-in-natives", "\nThe simulations of native methods such as System.arraycopy() \nuse temporary local variable nodes. Setting this switch to true \ncauses them to use global variable nodes instead, reducing \nprecision. The switch exists only to make it possible to measure \nthis effect on precision; there is no other practical reason to \nset it to true. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"simple-edges-bidirectional";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlesimple_edges_bidirectional_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Simple Edges Bidirectional", "p", "cg.paddle","simple-edges-bidirectional", "\nWhen this option is set to true, all edges connecting variable \n(Green) nodes are made bidirectional, as in Steensgaard's \nanalysis. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"this-edges";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlethis_edges_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("this Pointer Assignment Edge", "p", "cg.paddle","this-edges", "\nWhen constructing a call graph on-the-fly during points-to \nanalysis, Paddle normally propagates only those receivers that \ncause a method to be invoked to the this pointer of the method. \nWhen this option is set to true, however, Paddle instead models \nflow of receivers as an assignnment edge from the receiver at \nthe call site to the this pointer of the method, reducing \nprecision. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"precise-newinstance";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_paddleprecise_newinstance_widget(new BooleanOptionWidget(editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options, SWT.NONE, new OptionData("Precise newInstance", "p", "cg.paddle","precise-newinstance", "\nNormally, newInstance() calls are treated as if they may \nreturn an object of any type. Setting this option to true \ncauses them to be treated as if they return only objects of \nthe type of some dynamic class. ", defaultBool)));
		
		

		
		return editGroupcgPaddle_Pointer_Assignment_Graph_Building_Options;
	}



	private Composite cgPaddle_Points_To_Set_Flowing_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgPaddle_Points_To_Set_Flowing_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgPaddle_Points_To_Set_Flowing_Options.setLayout(layout);
	
	 	editGroupcgPaddle_Points_To_Set_Flowing_Options.setText("Paddle Points-To Set Flowing Options");
	 	
		editGroupcgPaddle_Points_To_Set_Flowing_Options.setData("id", "cgPaddle_Points_To_Set_Flowing_Options");
		
		String desccgPaddle_Points_To_Set_Flowing_Options = "";	
		if (desccgPaddle_Points_To_Set_Flowing_Options.length() > 0) {
			Label descLabelcgPaddle_Points_To_Set_Flowing_Options = new Label(editGroupcgPaddle_Points_To_Set_Flowing_Options, SWT.WRAP);
			descLabelcgPaddle_Points_To_Set_Flowing_Options.setText(desccgPaddle_Points_To_Set_Flowing_Options);
		}
		OptionData [] data;	
		
		
		
		
		data = new OptionData [] {
		
		new OptionData("Select Automatically",
		"auto",
		"\nWhen the bdd option is true, the Incremental BDD propagation \nalgorithm will be used. When the bdd option is false, the \nWorklist propagation algorithm will be used. ",
		
		true),
		
		new OptionData("Iter",
		"iter",
		"\nIter is a simple, iterative algorithm, which propagates \neverything until the graph does not change. ",
		
		false),
		
		new OptionData("Worklist",
		"worklist",
		"\nWorklist is a worklist-based algorithm that tries to do as \nlittle work as possible. This is currently the fastest \nalgorithm. ",
		
		false),
		
		new OptionData("Alias",
		"alias",
		"\nAlias is an alias-edge based algorithm. This algorithm tends to \ntake the least memory for very large problems, because it does \nnot represent explicitly points-to sets of fields of heap \nobjects. ",
		
		false),
		
		new OptionData("BDD",
		"bdd",
		"\nBDD is a propagator that stores points-to sets in binary \ndecision diagrams. ",
		
		false),
		
		new OptionData("Incrementalized BDD",
		"incbdd",
		"\nA propagator that stores points-to sets in binary decision \ndiagrams, and propagates them incrementally. ",
		
		false),
		
		};
		
										
		setcgcg_paddlepropagator_widget(new MultiOptionWidget(editGroupcgPaddle_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Propagator", "p", "cg.paddle","propagator", "\nThis option tells Paddle which propagation algorithm to use. \n")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"propagator";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddlepropagator_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		false),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		new OptionData("Double",
		"double",
		"\nDouble is an implementation that itself uses a pair of sets for \neach points-to set. The first set in the pair stores new \npointed-to objects that have not yet been propagated, while the \nsecond set stores old pointed-to objects that have been \npropagated and need not be reconsidered. This allows the \npropagation algorithms to be incremental, often speeding them up \nsignificantly. ",
		
		true),
		
		};
		
										
		setcgcg_paddleset_impl_widget(new MultiOptionWidget(editGroupcgPaddle_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Set Implementation", "p", "cg.paddle","set-impl", "\nSelect an implementation of points-to sets for Paddle to use. ")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"set-impl";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddleset_impl_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		true),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		};
		
										
		setcgcg_paddledouble_set_old_widget(new MultiOptionWidget(editGroupcgPaddle_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Double Set Old", "p", "cg.paddle","double-set-old", "\nSelect an implementation for sets of old objects in the double \npoints-to set implementation. This option has no effect unless \nSet Implementation is set to double. ")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"double-set-old";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddledouble_set_old_widget().setDef(defaultString);
		}
		
		
		
		data = new OptionData [] {
		
		new OptionData("Hash set",
		"hash",
		"\nHash is an implementation based on Java's built-in hash-set. ",
		
		false),
		
		new OptionData("Bit-vector",
		"bit",
		"\nBit is an implementation using a bit vector. ",
		
		false),
		
		new OptionData("Hybrid",
		"hybrid",
		"\nHybrid is an implementation that keeps an explicit list of up \nto 16 elements, and switches to a bit-vector when the set gets \nlarger than this. ",
		
		true),
		
		new OptionData("Sorted array",
		"array",
		"\nArray is an implementation that keeps the elements of the \npoints-to set in a sorted array. Set membership is tested using \nbinary search, and set union and intersection are computed using \nan algorithm based on the merge step from merge sort. ",
		
		false),
		
		};
		
										
		setcgcg_paddledouble_set_new_widget(new MultiOptionWidget(editGroupcgPaddle_Points_To_Set_Flowing_Options, SWT.NONE, data, new OptionData("Double Set New", "p", "cg.paddle","double-set-new", "\nSelect an implementation for sets of new objects in the double \npoints-to set implementation. This option has no effect unless \nSet Implementation is set to double. ")));
		
		defKey = "p"+" "+"cg.paddle"+" "+"double-set-new";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getcgcg_paddledouble_set_new_widget().setDef(defaultString);
		}
		
		

		
		return editGroupcgPaddle_Points_To_Set_Flowing_Options;
	}



	private Composite cgPaddle_Output_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupcgPaddle_Output_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupcgPaddle_Output_Options.setLayout(layout);
	
	 	editGroupcgPaddle_Output_Options.setText("Paddle Output Options");
	 	
		editGroupcgPaddle_Output_Options.setData("id", "cgPaddle_Output_Options");
		
		String desccgPaddle_Output_Options = "";	
		if (desccgPaddle_Output_Options.length() > 0) {
			Label descLabelcgPaddle_Output_Options = new Label(editGroupcgPaddle_Output_Options, SWT.WRAP);
			descLabelcgPaddle_Output_Options.setText(desccgPaddle_Output_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"context-counts";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlecontext_counts_widget(new BooleanOptionWidget(editGroupcgPaddle_Output_Options, SWT.NONE, new OptionData("Print Context Counts", "p", "cg.paddle","context-counts", "\nCauses Paddle to print the number of contexts for each method \nand call edge, and the number of equivalence classes of contexts \nfor each variable node. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"total-context-counts";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddletotal_context_counts_widget(new BooleanOptionWidget(editGroupcgPaddle_Output_Options, SWT.NONE, new OptionData("Print Context Counts (Totals only)", "p", "cg.paddle","total-context-counts", "\nCauses Paddle to print the number of contexts and number of \ncontext equivalence classes. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"method-context-counts";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddlemethod_context_counts_widget(new BooleanOptionWidget(editGroupcgPaddle_Output_Options, SWT.NONE, new OptionData("Method Context Counts (Totals only)", "p", "cg.paddle","method-context-counts", "\nCauses Paddle to print the number of contexts and number of \ncontext equivalence classes split out by method. Requires \ntotal-context-counts to also be turned on. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"set-mass";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setcgcg_paddleset_mass_widget(new BooleanOptionWidget(editGroupcgPaddle_Output_Options, SWT.NONE, new OptionData("Calculate Set Mass", "p", "cg.paddle","set-mass", "\nWhen this option is set to true, Paddle computes and prints \nvarious cryptic statistics about the size of the points-to sets \ncomputed. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"cg.paddle"+" "+"number-nodes";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setcgcg_paddlenumber_nodes_widget(new BooleanOptionWidget(editGroupcgPaddle_Output_Options, SWT.NONE, new OptionData("Number nodes", "p", "cg.paddle","number-nodes", "\nWhen printing debug information about nodes, this option causes \nthe node number of each node to be printed. ", defaultBool)));
		
		

		
		return editGroupcgPaddle_Output_Options;
	}



	private Composite wstpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwstp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwstp.setLayout(layout);
	
	 	editGroupwstp.setText("Whole Shimple Transformation Pack");
	 	
		editGroupwstp.setData("id", "wstp");
		
		String descwstp = "Whole-shimple transformation pack";	
		if (descwstp.length() > 0) {
			Label descLabelwstp = new Label(editGroupwstp, SWT.WRAP);
			descLabelwstp.setText(descwstp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wstp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwstpenabled_widget(new BooleanOptionWidget(editGroupwstp, SWT.NONE, new OptionData("Enabled", "p", "wstp","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwstp;
	}



	private Composite wsopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwsop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwsop.setLayout(layout);
	
	 	editGroupwsop.setText("Whole Shimple Optimization Pack");
	 	
		editGroupwsop.setData("id", "wsop");
		
		String descwsop = "Whole-shimple optimization pack";	
		if (descwsop.length() > 0) {
			Label descLabelwsop = new Label(editGroupwsop, SWT.WRAP);
			descLabelwsop.setText(descwsop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wsop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwsopenabled_widget(new BooleanOptionWidget(editGroupwsop, SWT.NONE, new OptionData("Enabled", "p", "wsop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwsop;
	}



	private Composite wjtpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjtp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjtp.setLayout(layout);
	
	 	editGroupwjtp.setText("Whole-Jimple Transformation Pack");
	 	
		editGroupwjtp.setData("id", "wjtp");
		
		String descwjtp = "Whole-jimple transformation pack";	
		if (descwjtp.length() > 0) {
			Label descLabelwjtp = new Label(editGroupwjtp, SWT.WRAP);
			descLabelwjtp.setText(descwjtp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjtp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjtpenabled_widget(new BooleanOptionWidget(editGroupwjtp, SWT.NONE, new OptionData("Enabled", "p", "wjtp","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjtp;
	}



	private Composite wjopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjop.setLayout(layout);
	
	 	editGroupwjop.setText("Whole-Jimple Optimization Pack");
	 	
		editGroupwjop.setData("id", "wjop");
		
		String descwjop = "Whole-jimple optimization pack";	
		if (descwjop.length() > 0) {
			Label descLabelwjop = new Label(editGroupwjop, SWT.WRAP);
			descLabelwjop.setText(descwjop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjopenabled_widget(new BooleanOptionWidget(editGroupwjop, SWT.NONE, new OptionData("Enabled", "p", "wjop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjop;
	}



	private Composite wjopwjop_smbCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjopwjop_smb = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjopwjop_smb.setLayout(layout);
	
	 	editGroupwjopwjop_smb.setText("Static Method Binder");
	 	
		editGroupwjopwjop_smb.setData("id", "wjopwjop_smb");
		
		String descwjopwjop_smb = "Static method binder: Devirtualizes monomorphic calls";	
		if (descwjopwjop_smb.length() > 0) {
			Label descLabelwjopwjop_smb = new Label(editGroupwjopwjop_smb, SWT.WRAP);
			descLabelwjopwjop_smb.setText(descwjopwjop_smb);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjop.smb"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjopwjop_smbenabled_widget(new BooleanOptionWidget(editGroupwjopwjop_smb, SWT.NONE, new OptionData("Enabled", "p", "wjop.smb","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjop.smb"+" "+"insert-null-checks";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_smbinsert_null_checks_widget(new BooleanOptionWidget(editGroupwjopwjop_smb, SWT.NONE, new OptionData("Insert Null Checks", "p", "wjop.smb","insert-null-checks", "\nInsert a check that, before invoking the static copy of the \ntarget method, throws a NullPointerException if the receiver \nobject is null. This ensures that static method binding does \nnot eliminate exceptions which would have occurred in its \nabsence. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjop.smb"+" "+"insert-redundant-casts";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_smbinsert_redundant_casts_widget(new BooleanOptionWidget(editGroupwjopwjop_smb, SWT.NONE, new OptionData("Insert Redundant Casts", "p", "wjop.smb","insert-redundant-casts", "\nInsert extra casts for the Java bytecode verifier. If the \ntarget method uses its this parameter, a reference to the \nreceiver object must be passed to the static copy of the target \nmethod. The verifier may complain if the declared type of the \nreceiver parameter does not match the type implementing the \ntarget method. Say, for example, that Singer is an interface \ndeclaring the sing() method and that the call graph shows all \nreceiver objects at a particular call site, singer.sing() (with \nsinger declared as a Singer) are in fact Bird objects (Bird \nbeing a class that implements Singer). The virtual call \nsinger.sing() is effectively replaced with the static call \nBird.staticsing(singer). Bird.staticsing() may perform \noperations on its parameter which are only allowed on Birds, \nrather than Singers. The Insert Redundant Casts option inserts \na cast of singer to the Bird type, to prevent complaints from \nthe verifier.", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Unsafe",
		"unsafe",
		"\nModify the visibility on code so that all inlining is \npermitted. ",
		
		true),
		
		new OptionData("Safe",
		"safe",
		"\nPreserve the exact meaning of the analyzed program. ",
		
		false),
		
		new OptionData("None",
		"none",
		"\nChange no modifiers whatsoever. ",
		
		false),
		
		};
		
										
		setwjopwjop_smballowed_modifier_changes_widget(new MultiOptionWidget(editGroupwjopwjop_smb, SWT.NONE, data, new OptionData("Allowed Modifier Changes", "p", "wjop.smb","allowed-modifier-changes", "\nSpecify which changes in visibility modifiers are allowed. ")));
		
		defKey = "p"+" "+"wjop.smb"+" "+"allowed-modifier-changes";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getwjopwjop_smballowed_modifier_changes_widget().setDef(defaultString);
		}
		
		

		
		return editGroupwjopwjop_smb;
	}



	private Composite wjopwjop_siCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjopwjop_si = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjopwjop_si.setLayout(layout);
	
	 	editGroupwjopwjop_si.setText("Static Inliner");
	 	
		editGroupwjopwjop_si.setData("id", "wjopwjop_si");
		
		String descwjopwjop_si = "Static inliner: inlines monomorphic calls";	
		if (descwjopwjop_si.length() > 0) {
			Label descLabelwjopwjop_si = new Label(editGroupwjopwjop_si, SWT.WRAP);
			descLabelwjopwjop_si.setText(descwjopwjop_si);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjop.si"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_sienabled_widget(new BooleanOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Enabled", "p", "wjop.si","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjop.si"+" "+"rerun-jb";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_sirerun_jb_widget(new BooleanOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Reconstruct Jimple body after inlining", "p", "wjop.si","rerun-jb", "\nWhen a method with array parameters is inlined, its variables \nmay need to be assigned different types than they had in the \noriginal method to produce compilable code. When this option is \nset, Soot re-runs the Jimple Body pack on each method body which \nhas had another method inlined into it so that the typing \nalgorithm can reassign the types. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjop.si"+" "+"insert-null-checks";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_siinsert_null_checks_widget(new BooleanOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Insert Null Checks", "p", "wjop.si","insert-null-checks", "\nInsert, before the inlined body of the target method, a check \nthat throws a NullPointerException if the receiver object is \nnull. This ensures that inlining will not eliminate exceptions \nwhich would have occurred in its absence. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjop.si"+" "+"insert-redundant-casts";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjopwjop_siinsert_redundant_casts_widget(new BooleanOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Insert Redundant Casts", "p", "wjop.si","insert-redundant-casts", "\nInsert extra casts for the Java bytecode verifier. The \nverifier may complain if the inlined method uses this and the \ndeclared type of the receiver of the call being inlined is \ndifferent from the type implementing the target method being \ninlined. Say, for example, that Singer is an interface declaring \nthe sing() method and that the call graph shows that all \nreceiver objects at a particular call site, singer.sing() (with \nsinger declared as a Singer) are in fact Bird objects (Bird \nbeing a class that implements Singer). The implementation of \nBird.sing() may perform operations on this which are only \nallowed on Birds, rather than Singers. The Insert Redundant \nCasts option ensures that this cannot lead to verification \nerrors, by inserting a cast of bird to the Bird type before \ninlining the body of Bird.sing().", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Unsafe",
		"unsafe",
		"\nModify the visibility on code so that all inlining is \npermitted. ",
		
		true),
		
		new OptionData("Safe",
		"safe",
		"\nPreserve the exact meaning of the analyzed program. ",
		
		false),
		
		new OptionData("None",
		"none",
		"\nChange no modifiers whatsoever. ",
		
		false),
		
		};
		
										
		setwjopwjop_siallowed_modifier_changes_widget(new MultiOptionWidget(editGroupwjopwjop_si, SWT.NONE, data, new OptionData("Allowed Modifier Changes", "p", "wjop.si","allowed-modifier-changes", "\nSpecify which changes in visibility modifiers are allowed. ")));
		
		defKey = "p"+" "+"wjop.si"+" "+"allowed-modifier-changes";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getwjopwjop_siallowed_modifier_changes_widget().setDef(defaultString);
		}
		
		
		
		defKey = "p"+" "+"wjop.si"+" "+"expansion-factor";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "3";
			
		}

		setwjopwjop_siexpansion_factor_widget(new StringOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Expansion Factor",  "p", "wjop.si","expansion-factor", "\nDetermines the maximum allowed expansion of a method. Inlining \nwill cause the method to grow by a factor of no more than the \nExpansion Factor. ", defaultString)));
		
		
		defKey = "p"+" "+"wjop.si"+" "+"max-container-size";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "5000";
			
		}

		setwjopwjop_simax_container_size_widget(new StringOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Max Container Size",  "p", "wjop.si","max-container-size", "\nDetermines the maximum number of Jimple statements for a \ncontainer method. If a method has more than this number of \nJimple statements, then no methods will be inlined into it. \n", defaultString)));
		
		
		defKey = "p"+" "+"wjop.si"+" "+"max-inlinee-size";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "20";
			
		}

		setwjopwjop_simax_inlinee_size_widget(new StringOptionWidget(editGroupwjopwjop_si, SWT.NONE, new OptionData("Max Inlinee Size",  "p", "wjop.si","max-inlinee-size", "\nDetermines the maximum number of Jimple statements for an \ninlinee method. If a method has more than this number of Jimple \nstatements, then it will not be inlined into other methods. \n", defaultString)));
		

		
		return editGroupwjopwjop_si;
	}



	private Composite wjapCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjap = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjap.setLayout(layout);
	
	 	editGroupwjap.setText("Whole-Jimple Annotation Pack");
	 	
		editGroupwjap.setData("id", "wjap");
		
		String descwjap = "Whole-jimple annotation pack: adds interprocedural tags";	
		if (descwjap.length() > 0) {
			Label descLabelwjap = new Label(editGroupwjap, SWT.WRAP);
			descLabelwjap.setText(descwjap);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjapenabled_widget(new BooleanOptionWidget(editGroupwjap, SWT.NONE, new OptionData("Enabled", "p", "wjap","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjap;
	}



	private Composite wjapwjap_raCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_ra = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_ra.setLayout(layout);
	
	 	editGroupwjapwjap_ra.setText("Rectangular Array Finder");
	 	
		editGroupwjapwjap_ra.setData("id", "wjapwjap_ra");
		
		String descwjapwjap_ra = "Rectangular array finder";	
		if (descwjapwjap_ra.length() > 0) {
			Label descLabelwjapwjap_ra = new Label(editGroupwjapwjap_ra, SWT.WRAP);
			descLabelwjapwjap_ra.setText(descwjapwjap_ra);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.ra"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_raenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_ra, SWT.NONE, new OptionData("Enabled", "p", "wjap.ra","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_ra;
	}



	private Composite wjapwjap_umtCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_umt = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_umt.setLayout(layout);
	
	 	editGroupwjapwjap_umt.setText("Unreachable Method Tagger");
	 	
		editGroupwjapwjap_umt.setData("id", "wjapwjap_umt");
		
		String descwjapwjap_umt = "Tags all unreachable methods";	
		if (descwjapwjap_umt.length() > 0) {
			Label descLabelwjapwjap_umt = new Label(editGroupwjapwjap_umt, SWT.WRAP);
			descLabelwjapwjap_umt.setText(descwjapwjap_umt);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.umt"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_umtenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_umt, SWT.NONE, new OptionData("Enabled", "p", "wjap.umt","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_umt;
	}



	private Composite wjapwjap_uftCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_uft = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_uft.setLayout(layout);
	
	 	editGroupwjapwjap_uft.setText("Unreachable Fields Tagger");
	 	
		editGroupwjapwjap_uft.setData("id", "wjapwjap_uft");
		
		String descwjapwjap_uft = "Tags all unreachable fields";	
		if (descwjapwjap_uft.length() > 0) {
			Label descLabelwjapwjap_uft = new Label(editGroupwjapwjap_uft, SWT.WRAP);
			descLabelwjapwjap_uft.setText(descwjapwjap_uft);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.uft"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_uftenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_uft, SWT.NONE, new OptionData("Enabled", "p", "wjap.uft","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_uft;
	}



	private Composite wjapwjap_tqtCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_tqt = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_tqt.setLayout(layout);
	
	 	editGroupwjapwjap_tqt.setText("Tightest Qualifiers Tagger");
	 	
		editGroupwjapwjap_tqt.setData("id", "wjapwjap_tqt");
		
		String descwjapwjap_tqt = "Tags all qualifiers that could be tighter";	
		if (descwjapwjap_tqt.length() > 0) {
			Label descLabelwjapwjap_tqt = new Label(editGroupwjapwjap_tqt, SWT.WRAP);
			descLabelwjapwjap_tqt.setText(descwjapwjap_tqt);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.tqt"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_tqtenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_tqt, SWT.NONE, new OptionData("Enabled", "p", "wjap.tqt","enabled", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_tqt;
	}



	private Composite wjapwjap_cggCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_cgg = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_cgg.setLayout(layout);
	
	 	editGroupwjapwjap_cgg.setText("Call Graph Grapher");
	 	
		editGroupwjapwjap_cgg.setData("id", "wjapwjap_cgg");
		
		String descwjapwjap_cgg = "Creates graphical call graph.";	
		if (descwjapwjap_cgg.length() > 0) {
			Label descLabelwjapwjap_cgg = new Label(editGroupwjapwjap_cgg, SWT.WRAP);
			descLabelwjapwjap_cgg.setText(descwjapwjap_cgg);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.cgg"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_cggenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_cgg, SWT.NONE, new OptionData("Enabled", "p", "wjap.cgg","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.cgg"+" "+"show-lib-meths";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_cggshow_lib_meths_widget(new BooleanOptionWidget(editGroupwjapwjap_cgg, SWT.NONE, new OptionData("Show Library Methods", "p", "wjap.cgg","show-lib-meths", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_cgg;
	}



	private Composite wjapwjap_purityCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupwjapwjap_purity = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupwjapwjap_purity.setLayout(layout);
	
	 	editGroupwjapwjap_purity.setText("Purity Analysis [AM]");
	 	
		editGroupwjapwjap_purity.setData("id", "wjapwjap_purity");
		
		String descwjapwjap_purity = "Emit purity attributes";	
		if (descwjapwjap_purity.length() > 0) {
			Label descLabelwjapwjap_purity = new Label(editGroupwjapwjap_purity, SWT.WRAP);
			descLabelwjapwjap_purity.setText(descwjapwjap_purity);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_purityenabled_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Enabled", "p", "wjap.purity","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"dump-summaries";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjapwjap_puritydump_summaries_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Dump one .dot files for each method summary", "p", "wjap.purity","dump-summaries", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"dump-cg";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_puritydump_cg_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Dump .dot call-graph annotated with method summaries (huge)", "p", "wjap.purity","dump-cg", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"dump-intra";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_puritydump_intra_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Dump one .dot for each intra-procedural method analysis (long)", "p", "wjap.purity","dump-intra", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"print";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setwjapwjap_purityprint_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Print analysis results", "p", "wjap.purity","print", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"wjap.purity"+" "+"verbose";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setwjapwjap_purityverbose_widget(new BooleanOptionWidget(editGroupwjapwjap_purity, SWT.NONE, new OptionData("Be (quite) verbose", "p", "wjap.purity","verbose", "\n", defaultBool)));
		
		

		
		return editGroupwjapwjap_purity;
	}



	private Composite shimpleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupshimple = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupshimple.setLayout(layout);
	
	 	editGroupshimple.setText("Shimple Control");
	 	
		editGroupshimple.setData("id", "shimple");
		
		String descshimple = "Sets parameters for Shimple SSA form";	
		if (descshimple.length() > 0) {
			Label descLabelshimple = new Label(editGroupshimple, SWT.WRAP);
			descLabelshimple.setText(descshimple);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"shimple"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setshimpleenabled_widget(new BooleanOptionWidget(editGroupshimple, SWT.NONE, new OptionData("Enabled", "p", "shimple","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"shimple"+" "+"node-elim-opt";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setshimplenode_elim_opt_widget(new BooleanOptionWidget(editGroupshimple, SWT.NONE, new OptionData("Shimple Node Elimination Optimizations", "p", "shimple","node-elim-opt", "\nPerform some optimizations, such as dead code \nelimination and local aggregation, before/after \neliminating nodes. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"shimple"+" "+"standard-local-names";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setshimplestandard_local_names_widget(new BooleanOptionWidget(editGroupshimple, SWT.NONE, new OptionData("Local Name Standardization", "p", "shimple","standard-local-names", "\nIf enabled, the Local Name Standardizer is applied \nwhenever Shimple creates new locals. Normally, \nShimple will retain the original local names as far \nas possible and use an underscore notation to denote \nSSA subscripts. This transformation does not \notherwise affect Shimple behaviour. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"shimple"+" "+"extended";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setshimpleextended_widget(new BooleanOptionWidget(editGroupshimple, SWT.NONE, new OptionData("Extended SSA (SSI)", "p", "shimple","extended", "\nIf enabled, Shimple will created extended SSA (SSI) \nform. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"shimple"+" "+"debug";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setshimpledebug_widget(new BooleanOptionWidget(editGroupshimple, SWT.NONE, new OptionData("Debugging Output", "p", "shimple","debug", "\nIf enabled, Soot may print out warnings and \nmessages useful for debugging the Shimple module. \nAutomatically enabled by the global debug switch. \n", defaultBool)));
		
		

		
		return editGroupshimple;
	}



	private Composite stpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupstp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupstp.setLayout(layout);
	
	 	editGroupstp.setText("Shimple Transformation Pack");
	 	
		editGroupstp.setData("id", "stp");
		
		String descstp = "Shimple transformation pack";	
		if (descstp.length() > 0) {
			Label descLabelstp = new Label(editGroupstp, SWT.WRAP);
			descLabelstp.setText(descstp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"stp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setstpenabled_widget(new BooleanOptionWidget(editGroupstp, SWT.NONE, new OptionData("Enabled", "p", "stp","enabled", "\n", defaultBool)));
		
		

		
		return editGroupstp;
	}



	private Composite sopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupsop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupsop.setLayout(layout);
	
	 	editGroupsop.setText("Shimple Optimization Pack");
	 	
		editGroupsop.setData("id", "sop");
		
		String descsop = "Shimple optimization pack";	
		if (descsop.length() > 0) {
			Label descLabelsop = new Label(editGroupsop, SWT.WRAP);
			descLabelsop.setText(descsop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"sop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setsopenabled_widget(new BooleanOptionWidget(editGroupsop, SWT.NONE, new OptionData("Enabled", "p", "sop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupsop;
	}



	private Composite sopsop_cpfCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupsopsop_cpf = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupsopsop_cpf.setLayout(layout);
	
	 	editGroupsopsop_cpf.setText("Shimple Constant Propagator and Folder");
	 	
		editGroupsopsop_cpf.setData("id", "sopsop_cpf");
		
		String descsopsop_cpf = "Shimple constant propagator and folder";	
		if (descsopsop_cpf.length() > 0) {
			Label descLabelsopsop_cpf = new Label(editGroupsopsop_cpf, SWT.WRAP);
			descLabelsopsop_cpf.setText(descsopsop_cpf);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"sop.cpf"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setsopsop_cpfenabled_widget(new BooleanOptionWidget(editGroupsopsop_cpf, SWT.NONE, new OptionData("Enabled", "p", "sop.cpf","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"sop.cpf"+" "+"prune-cfg";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setsopsop_cpfprune_cfg_widget(new BooleanOptionWidget(editGroupsopsop_cpf, SWT.NONE, new OptionData("Prune Control Flow Graph", "p", "sop.cpf","prune-cfg", "\nConditional branching statements that are found \nto branch unconditionally (or fall through) are \nreplaced with unconditional branches (or \nremoved). This transformation exposes more \nopportunities for dead code removal. \n", defaultBool)));
		
		

		
		return editGroupsopsop_cpf;
	}



	private Composite jtpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjtp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjtp.setLayout(layout);
	
	 	editGroupjtp.setText("Jimple Transformation Pack");
	 	
		editGroupjtp.setData("id", "jtp");
		
		String descjtp = "Jimple transformation pack: intraprocedural analyses added to Soot";	
		if (descjtp.length() > 0) {
			Label descLabeljtp = new Label(editGroupjtp, SWT.WRAP);
			descLabeljtp.setText(descjtp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jtp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjtpenabled_widget(new BooleanOptionWidget(editGroupjtp, SWT.NONE, new OptionData("Enabled", "p", "jtp","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjtp;
	}



	private Composite jopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjop.setLayout(layout);
	
	 	editGroupjop.setText("Jimple Optimization Pack");
	 	
		editGroupjop.setData("id", "jop");
		
		String descjop = "Jimple optimization pack (intraprocedural)";	
		if (descjop.length() > 0) {
			Label descLabeljop = new Label(editGroupjop, SWT.WRAP);
			descLabeljop.setText(descjop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopenabled_widget(new BooleanOptionWidget(editGroupjop, SWT.NONE, new OptionData("Enabled", "p", "jop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjop;
	}



	private Composite jopjop_cseCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_cse = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_cse.setLayout(layout);
	
	 	editGroupjopjop_cse.setText("Common Subexpression Eliminator");
	 	
		editGroupjopjop_cse.setData("id", "jopjop_cse");
		
		String descjopjop_cse = "Common subexpression eliminator";	
		if (descjopjop_cse.length() > 0) {
			Label descLabeljopjop_cse = new Label(editGroupjopjop_cse, SWT.WRAP);
			descLabeljopjop_cse.setText(descjopjop_cse);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.cse"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_cseenabled_widget(new BooleanOptionWidget(editGroupjopjop_cse, SWT.NONE, new OptionData("Enabled", "p", "jop.cse","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.cse"+" "+"naive-side-effect";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_csenaive_side_effect_widget(new BooleanOptionWidget(editGroupjopjop_cse, SWT.NONE, new OptionData("Naive Side Effect Tester", "p", "jop.cse","naive-side-effect", "\nIf Naive Side Effect Tester is true, the Common Subexpression \nEliminator uses the conservative side effect information \nprovided by the NaiveSideEffectTester class, even if \ninterprocedural information about side effects is available. The \nnaive side effect analysis is based solely on the information \navailable locally about a statement. It assumes, for example, \nthat any method call has the potential to write and read all \ninstance and static fields in the program. If Naive Side Effect \nTester is set to false and Soot is in whole program mode, then \nthe Common Subexpression Eliminator uses the side effect \ninformation provided by the PASideEffectTester class. \nPASideEffectTester uses a points-to analysis to determine which \nfields and statics may be written or read by a given statement. \nIf whole program analysis is not performed, naive side effect \ninformation is used regardless of the setting of Naive Side \nEffect Tester. ", defaultBool)));
		
		

		
		return editGroupjopjop_cse;
	}



	private Composite jopjop_bcmCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_bcm = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_bcm.setLayout(layout);
	
	 	editGroupjopjop_bcm.setText("Busy Code Motion");
	 	
		editGroupjopjop_bcm.setData("id", "jopjop_bcm");
		
		String descjopjop_bcm = "Busy code motion: unaggressive partial redundancy elimination";	
		if (descjopjop_bcm.length() > 0) {
			Label descLabeljopjop_bcm = new Label(editGroupjopjop_bcm, SWT.WRAP);
			descLabeljopjop_bcm.setText(descjopjop_bcm);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.bcm"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_bcmenabled_widget(new BooleanOptionWidget(editGroupjopjop_bcm, SWT.NONE, new OptionData("Enabled", "p", "jop.bcm","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.bcm"+" "+"naive-side-effect";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_bcmnaive_side_effect_widget(new BooleanOptionWidget(editGroupjopjop_bcm, SWT.NONE, new OptionData("Naive Side Effect Tester", "p", "jop.bcm","naive-side-effect", "\nIf Naive Side Effect Tester is set to true, Busy Code Motion \nuses the conservative side effect information provided by the \nNaiveSideEffectTester class, even if interprocedural information \nabout side effects is available. The naive side effect analysis \nis based solely on the information available locally about a \nstatement. It assumes, for example, that any method call has the \npotential to write and read all instance and static fields in \nthe program. If Naive Side Effect Tester is set to false and \nSoot is in whole program mode, then Busy Code Motion uses the \nside effect information provided by the PASideEffectTester \nclass. PASideEffectTester uses a points-to analysis to determine \nwhich fields and statics may be written or read by a given \nstatement. If whole program analysis is not performed, naive \nside effect information is used regardless of the setting of \nNaive Side Effect Tester. ", defaultBool)));
		
		

		
		return editGroupjopjop_bcm;
	}



	private Composite jopjop_lcmCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_lcm = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_lcm.setLayout(layout);
	
	 	editGroupjopjop_lcm.setText("Lazy Code Motion");
	 	
		editGroupjopjop_lcm.setData("id", "jopjop_lcm");
		
		String descjopjop_lcm = "Lazy code motion: aggressive partial redundancy elimination";	
		if (descjopjop_lcm.length() > 0) {
			Label descLabeljopjop_lcm = new Label(editGroupjopjop_lcm, SWT.WRAP);
			descLabeljopjop_lcm.setText(descjopjop_lcm);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.lcm"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_lcmenabled_widget(new BooleanOptionWidget(editGroupjopjop_lcm, SWT.NONE, new OptionData("Enabled", "p", "jop.lcm","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.lcm"+" "+"unroll";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_lcmunroll_widget(new BooleanOptionWidget(editGroupjopjop_lcm, SWT.NONE, new OptionData("Unroll", "p", "jop.lcm","unroll", "\nIf true, perform loop inversion before doing the \ntransformation. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.lcm"+" "+"naive-side-effect";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_lcmnaive_side_effect_widget(new BooleanOptionWidget(editGroupjopjop_lcm, SWT.NONE, new OptionData("Naive Side Effect Tester", "p", "jop.lcm","naive-side-effect", "\nIf Naive Side Effect Tester is set to true, Lazy Code Motion \nuses the conservative side effect information provided by the \nNaiveSideEffectTester class, even if interprocedural information \nabout side effects is available. The naive side effect analysis \nis based solely on the information available locally about a \nstatement. It assumes, for example, that any method call has the \npotential to write and read all instance and static fields in \nthe program. If Naive Side Effect Tester is set to false and \nSoot is in whole program mode, then Lazy Code Motion uses the \nside effect information provided by the PASideEffectTester \nclass. PASideEffectTester uses a points-to analysis to determine \nwhich fields and statics may be written or read by a given \nstatement. If whole program analysis is not performed, naive \nside effect information is used regardless of the setting of \nNaive Side Effect Tester. ", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Safe",
		"safe",
		"\nSafe, but only considers moving additions, subtractions and \nmultiplications. ",
		
		true),
		
		new OptionData("Medium",
		"medium",
		"\nUnsafe in multi-threaded programs, as it may reuse the values \nread from field accesses. ",
		
		false),
		
		new OptionData("Unsafe",
		"unsafe",
		"\nMay violate Java's exception semantics, as it may move or \nreorder exception-throwing statements, potentially outside of \ntry-catch blocks. ",
		
		false),
		
		};
		
										
		setjopjop_lcmsafety_widget(new MultiOptionWidget(editGroupjopjop_lcm, SWT.NONE, data, new OptionData("Safety", "p", "jop.lcm","safety", "\nThis option controls which fields and statements are candidates \nfor code motion. ")));
		
		defKey = "p"+" "+"jop.lcm"+" "+"safety";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getjopjop_lcmsafety_widget().setDef(defaultString);
		}
		
		

		
		return editGroupjopjop_lcm;
	}



	private Composite jopjop_cpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_cp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_cp.setLayout(layout);
	
	 	editGroupjopjop_cp.setText("Copy Propagator");
	 	
		editGroupjopjop_cp.setData("id", "jopjop_cp");
		
		String descjopjop_cp = "Copy propagator";	
		if (descjopjop_cp.length() > 0) {
			Label descLabeljopjop_cp = new Label(editGroupjopjop_cp, SWT.WRAP);
			descLabeljopjop_cp.setText(descjopjop_cp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.cp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_cpenabled_widget(new BooleanOptionWidget(editGroupjopjop_cp, SWT.NONE, new OptionData("Enabled", "p", "jop.cp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.cp"+" "+"only-regular-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_cponly_regular_locals_widget(new BooleanOptionWidget(editGroupjopjop_cp, SWT.NONE, new OptionData("Only Regular Locals", "p", "jop.cp","only-regular-locals", "\nOnly propagate copies through ``regular'' locals, that is, \nthose declared in the source bytecode. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.cp"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_cponly_stack_locals_widget(new BooleanOptionWidget(editGroupjopjop_cp, SWT.NONE, new OptionData("Only Stack Locals", "p", "jop.cp","only-stack-locals", "\nOnly propagate copies through locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjopjop_cp;
	}



	private Composite jopjop_cpfCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_cpf = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_cpf.setLayout(layout);
	
	 	editGroupjopjop_cpf.setText("Jimple Constant Propagator and Folder");
	 	
		editGroupjopjop_cpf.setData("id", "jopjop_cpf");
		
		String descjopjop_cpf = "Constant propagator and folder";	
		if (descjopjop_cpf.length() > 0) {
			Label descLabeljopjop_cpf = new Label(editGroupjopjop_cpf, SWT.WRAP);
			descLabeljopjop_cpf.setText(descjopjop_cpf);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.cpf"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_cpfenabled_widget(new BooleanOptionWidget(editGroupjopjop_cpf, SWT.NONE, new OptionData("Enabled", "p", "jop.cpf","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjopjop_cpf;
	}



	private Composite jopjop_cbfCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_cbf = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_cbf.setLayout(layout);
	
	 	editGroupjopjop_cbf.setText("Conditional Branch Folder");
	 	
		editGroupjopjop_cbf.setData("id", "jopjop_cbf");
		
		String descjopjop_cbf = "Conditional branch folder";	
		if (descjopjop_cbf.length() > 0) {
			Label descLabeljopjop_cbf = new Label(editGroupjopjop_cbf, SWT.WRAP);
			descLabeljopjop_cbf.setText(descjopjop_cbf);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.cbf"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_cbfenabled_widget(new BooleanOptionWidget(editGroupjopjop_cbf, SWT.NONE, new OptionData("Enabled", "p", "jop.cbf","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjopjop_cbf;
	}



	private Composite jopjop_daeCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_dae = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_dae.setLayout(layout);
	
	 	editGroupjopjop_dae.setText("Dead Assignment Eliminator");
	 	
		editGroupjopjop_dae.setData("id", "jopjop_dae");
		
		String descjopjop_dae = "Dead assignment eliminator";	
		if (descjopjop_dae.length() > 0) {
			Label descLabeljopjop_dae = new Label(editGroupjopjop_dae, SWT.WRAP);
			descLabeljopjop_dae.setText(descjopjop_dae);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.dae"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_daeenabled_widget(new BooleanOptionWidget(editGroupjopjop_dae, SWT.NONE, new OptionData("Enabled", "p", "jop.dae","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.dae"+" "+"only-tag";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_daeonly_tag_widget(new BooleanOptionWidget(editGroupjopjop_dae, SWT.NONE, new OptionData("Only Tag Dead Code", "p", "jop.dae","only-tag", "\nOnly tag dead assignment statements instead of eliminaing them. \n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.dae"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_daeonly_stack_locals_widget(new BooleanOptionWidget(editGroupjopjop_dae, SWT.NONE, new OptionData("Only Stack Locals", "p", "jop.dae","only-stack-locals", "\nOnly eliminate dead assignments to locals that represent stack \nlocations in the original bytecode. ", defaultBool)));
		
		

		
		return editGroupjopjop_dae;
	}



	private Composite jopjop_uce1Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_uce1 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_uce1.setLayout(layout);
	
	 	editGroupjopjop_uce1.setText("Unreachable Code Eliminator 1");
	 	
		editGroupjopjop_uce1.setData("id", "jopjop_uce1");
		
		String descjopjop_uce1 = "Unreachable code eliminator, pass 1";	
		if (descjopjop_uce1.length() > 0) {
			Label descLabeljopjop_uce1 = new Label(editGroupjopjop_uce1, SWT.WRAP);
			descLabeljopjop_uce1.setText(descjopjop_uce1);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.uce1"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_uce1enabled_widget(new BooleanOptionWidget(editGroupjopjop_uce1, SWT.NONE, new OptionData("Enabled", "p", "jop.uce1","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.uce1"+" "+"remove-unreachable-traps";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_uce1remove_unreachable_traps_widget(new BooleanOptionWidget(editGroupjopjop_uce1, SWT.NONE, new OptionData("Remove unreachable traps", "p", "jop.uce1","remove-unreachable-traps", "\nRemove exception table entries when none of the protected \ninstructions can throw the exception being caught. ", defaultBool)));
		
		

		
		return editGroupjopjop_uce1;
	}



	private Composite jopjop_ubf1Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_ubf1 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_ubf1.setLayout(layout);
	
	 	editGroupjopjop_ubf1.setText("Unconditional Branch Folder 1");
	 	
		editGroupjopjop_ubf1.setData("id", "jopjop_ubf1");
		
		String descjopjop_ubf1 = "Unconditional branch folder, pass 1";	
		if (descjopjop_ubf1.length() > 0) {
			Label descLabeljopjop_ubf1 = new Label(editGroupjopjop_ubf1, SWT.WRAP);
			descLabeljopjop_ubf1.setText(descjopjop_ubf1);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.ubf1"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_ubf1enabled_widget(new BooleanOptionWidget(editGroupjopjop_ubf1, SWT.NONE, new OptionData("Enabled", "p", "jop.ubf1","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjopjop_ubf1;
	}



	private Composite jopjop_uce2Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_uce2 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_uce2.setLayout(layout);
	
	 	editGroupjopjop_uce2.setText("Unreachable Code Eliminator 2");
	 	
		editGroupjopjop_uce2.setData("id", "jopjop_uce2");
		
		String descjopjop_uce2 = "Unreachable code eliminator, pass 2";	
		if (descjopjop_uce2.length() > 0) {
			Label descLabeljopjop_uce2 = new Label(editGroupjopjop_uce2, SWT.WRAP);
			descLabeljopjop_uce2.setText(descjopjop_uce2);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.uce2"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_uce2enabled_widget(new BooleanOptionWidget(editGroupjopjop_uce2, SWT.NONE, new OptionData("Enabled", "p", "jop.uce2","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jop.uce2"+" "+"remove-unreachable-traps";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjopjop_uce2remove_unreachable_traps_widget(new BooleanOptionWidget(editGroupjopjop_uce2, SWT.NONE, new OptionData("Remove unreachable traps", "p", "jop.uce2","remove-unreachable-traps", "\nRemove exception table entries when none of the protected \ninstructions can throw the exception being caught. ", defaultBool)));
		
		

		
		return editGroupjopjop_uce2;
	}



	private Composite jopjop_ubf2Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_ubf2 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_ubf2.setLayout(layout);
	
	 	editGroupjopjop_ubf2.setText("Unconditional Branch Folder 2");
	 	
		editGroupjopjop_ubf2.setData("id", "jopjop_ubf2");
		
		String descjopjop_ubf2 = "Unconditional branch folder, pass 2";	
		if (descjopjop_ubf2.length() > 0) {
			Label descLabeljopjop_ubf2 = new Label(editGroupjopjop_ubf2, SWT.WRAP);
			descLabeljopjop_ubf2.setText(descjopjop_ubf2);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.ubf2"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_ubf2enabled_widget(new BooleanOptionWidget(editGroupjopjop_ubf2, SWT.NONE, new OptionData("Enabled", "p", "jop.ubf2","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjopjop_ubf2;
	}



	private Composite jopjop_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjopjop_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjopjop_ule.setLayout(layout);
	
	 	editGroupjopjop_ule.setText("Unused Local Eliminator");
	 	
		editGroupjopjop_ule.setData("id", "jopjop_ule");
		
		String descjopjop_ule = "Unused local eliminator";	
		if (descjopjop_ule.length() > 0) {
			Label descLabeljopjop_ule = new Label(editGroupjopjop_ule, SWT.WRAP);
			descLabeljopjop_ule.setText(descjopjop_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jop.ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjopjop_uleenabled_widget(new BooleanOptionWidget(editGroupjopjop_ule, SWT.NONE, new OptionData("Enabled", "p", "jop.ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjopjop_ule;
	}



	private Composite japCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjap = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjap.setLayout(layout);
	
	 	editGroupjap.setText("Jimple Annotation Pack");
	 	
		editGroupjap.setData("id", "jap");
		
		String descjap = "Jimple annotation pack: adds intraprocedural tags";	
		if (descjap.length() > 0) {
			Label descLabeljap = new Label(editGroupjap, SWT.WRAP);
			descLabeljap.setText(descjap);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setjapenabled_widget(new BooleanOptionWidget(editGroupjap, SWT.NONE, new OptionData("Enabled", "p", "jap","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjap;
	}



	private Composite japjap_npcCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_npc = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_npc.setLayout(layout);
	
	 	editGroupjapjap_npc.setText("Null Pointer Checker");
	 	
		editGroupjapjap_npc.setData("id", "japjap_npc");
		
		String descjapjap_npc = "Null pointer checker";	
		if (descjapjap_npc.length() > 0) {
			Label descLabeljapjap_npc = new Label(editGroupjapjap_npc, SWT.WRAP);
			descLabeljapjap_npc.setText(descjapjap_npc);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.npc"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_npcenabled_widget(new BooleanOptionWidget(editGroupjapjap_npc, SWT.NONE, new OptionData("Enabled", "p", "jap.npc","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.npc"+" "+"only-array-ref";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_npconly_array_ref_widget(new BooleanOptionWidget(editGroupjapjap_npc, SWT.NONE, new OptionData("Only Array Ref", "p", "jap.npc","only-array-ref", "\nAnnotate only array-referencing instructions, instead of all \ninstructions that need null pointer checks. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.npc"+" "+"profiling";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_npcprofiling_widget(new BooleanOptionWidget(editGroupjapjap_npc, SWT.NONE, new OptionData("Profiling", "p", "jap.npc","profiling", "\nInsert profiling instructions that at runtime count the number \nof eliminated safe null pointer checks. The inserted profiling \ncode assumes the existence of a MultiCounter class implementing \nthe methods invoked. For details, see the NullPointerChecker \nsource code.", defaultBool)));
		
		

		
		return editGroupjapjap_npc;
	}



	private Composite japjap_npcolorerCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_npcolorer = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_npcolorer.setLayout(layout);
	
	 	editGroupjapjap_npcolorer.setText("Null Pointer Colourer");
	 	
		editGroupjapjap_npcolorer.setData("id", "japjap_npcolorer");
		
		String descjapjap_npcolorer = "Null pointer colourer: tags references for eclipse";	
		if (descjapjap_npcolorer.length() > 0) {
			Label descLabeljapjap_npcolorer = new Label(editGroupjapjap_npcolorer, SWT.WRAP);
			descLabeljapjap_npcolorer.setText(descjapjap_npcolorer);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.npcolorer"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_npcolorerenabled_widget(new BooleanOptionWidget(editGroupjapjap_npcolorer, SWT.NONE, new OptionData("Enabled", "p", "jap.npcolorer","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_npcolorer;
	}



	private Composite japjap_abcCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_abc = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_abc.setLayout(layout);
	
	 	editGroupjapjap_abc.setText("Array Bound Checker");
	 	
		editGroupjapjap_abc.setData("id", "japjap_abc");
		
		String descjapjap_abc = "Array bound checker";	
		if (descjapjap_abc.length() > 0) {
			Label descLabeljapjap_abc = new Label(editGroupjapjap_abc, SWT.WRAP);
			descLabeljapjap_abc.setText(descjapjap_abc);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcenabled_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("Enabled", "p", "jap.abc","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-all";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_all_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With All", "p", "jap.abc","with-all", "\nSetting the With All option to true is equivalent to setting \neach of With CSE, With Array Ref, With Field Ref, With Class \nField, and With Rectangular Array to true.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-cse";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_cse_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With Common Sub-expressions", "p", "jap.abc","with-cse", "\nThe analysis will consider common subexpressions. For example, \nconsider the situation where r1 is assigned a*b; later, r2 is \nassigned a*b, where neither a nor b have changed between the two \nstatements. The analysis can conclude that r2 has the same value \nas r1. Experiments show that this option can improve the result \nslightly.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-arrayref";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_arrayref_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With Array References", "p", "jap.abc","with-arrayref", "\nWith this option enabled, array references can be considered as \ncommon subexpressions; however, we are more conservative when \nwriting into an array, because array objects may be aliased. We \nalso assume that the application is single-threaded or that the \narray references occur in a synchronized block. That is, we \nassume that an array element may not be changed by other threads \nbetween two array references.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-fieldref";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_fieldref_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With Field References", "p", "jap.abc","with-fieldref", "\nThe analysis treats field references (static and instance) as \ncommon subexpressions; however, we are more conservative when \nwriting to a field, because the base of the field reference may \nbe aliased. We also assume that the application is \nsingle-threaded or that the field references occur in a \nsynchronized block. That is, we assume that a field may not be \nchanged by other threads between two field references.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-classfield";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_classfield_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With Class Field", "p", "jap.abc","with-classfield", "\nThis option makes the analysis work on the class level. The \nalgorithm analyzes final or private class fields first. It can \nrecognize the fields that hold array objects of constant length. \nIn an application using lots of array fields, this option can \nimprove the analysis results dramatically.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"with-rectarray";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcwith_rectarray_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("With Rectangular Array", "p", "jap.abc","with-rectarray", "\nThis option is used together with wjap.ra to make Soot run the \nwhole-program analysis for rectangular array objects. This \nanalysis is based on the call graph, and it usually takes a long \ntime. If the application uses rectangular arrays, these options \ncan improve the analysis result. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"profiling";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcprofiling_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("Profiling", "p", "jap.abc","profiling", "\nProfile the results of array bounds check analysis. The \ninserted profiling code assumes the existence of a MultiCounter \nclass implementing the methods invoked. For details, see the \nArrayBoundsChecker source code.", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.abc"+" "+"add-color-tags";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_abcadd_color_tags_widget(new BooleanOptionWidget(editGroupjapjap_abc, SWT.NONE, new OptionData("Add Color Tags", "p", "jap.abc","add-color-tags", "\nAdd color tags to the results of the array bounds check \nanalysis.", defaultBool)));
		
		

		
		return editGroupjapjap_abc;
	}



	private Composite japjap_profilingCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_profiling = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_profiling.setLayout(layout);
	
	 	editGroupjapjap_profiling.setText("Profiling Generator");
	 	
		editGroupjapjap_profiling.setData("id", "japjap_profiling");
		
		String descjapjap_profiling = "Instruments null pointer and array checks";	
		if (descjapjap_profiling.length() > 0) {
			Label descLabeljapjap_profiling = new Label(editGroupjapjap_profiling, SWT.WRAP);
			descLabeljapjap_profiling.setText(descjapjap_profiling);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.profiling"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_profilingenabled_widget(new BooleanOptionWidget(editGroupjapjap_profiling, SWT.NONE, new OptionData("Enabled", "p", "jap.profiling","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.profiling"+" "+"notmainentry";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_profilingnotmainentry_widget(new BooleanOptionWidget(editGroupjapjap_profiling, SWT.NONE, new OptionData("Not Main Entry", "p", "jap.profiling","notmainentry", "\nInsert the calls to the MultiCounter at the beginning and end \nof methods with the signature long \nrunBenchmark(java.lang.String[]) instead of the signature void \nmain(java.lang.String[]).", defaultBool)));
		
		

		
		return editGroupjapjap_profiling;
	}



	private Composite japjap_seaCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_sea = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_sea.setLayout(layout);
	
	 	editGroupjapjap_sea.setText("Side Effect tagger");
	 	
		editGroupjapjap_sea.setData("id", "japjap_sea");
		
		String descjapjap_sea = "Side effect tagger";	
		if (descjapjap_sea.length() > 0) {
			Label descLabeljapjap_sea = new Label(editGroupjapjap_sea, SWT.WRAP);
			descLabeljapjap_sea.setText(descjapjap_sea);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.sea"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_seaenabled_widget(new BooleanOptionWidget(editGroupjapjap_sea, SWT.NONE, new OptionData("Enabled", "p", "jap.sea","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.sea"+" "+"naive";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_seanaive_widget(new BooleanOptionWidget(editGroupjapjap_sea, SWT.NONE, new OptionData("Build naive dependence graph", "p", "jap.sea","naive", "\nWhen set to true, the dependence graph is built with a node for \neach statement, without merging the nodes for equivalent \nstatements. This makes it possible to measure the effect of \nmerging nodes for equivalent statements on the size of the \ndependence graph.", defaultBool)));
		
		

		
		return editGroupjapjap_sea;
	}



	private Composite japjap_fieldrwCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_fieldrw = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_fieldrw.setLayout(layout);
	
	 	editGroupjapjap_fieldrw.setText("Field Read/Write Tagger");
	 	
		editGroupjapjap_fieldrw.setData("id", "japjap_fieldrw");
		
		String descjapjap_fieldrw = "Field read/write tagger";	
		if (descjapjap_fieldrw.length() > 0) {
			Label descLabeljapjap_fieldrw = new Label(editGroupjapjap_fieldrw, SWT.WRAP);
			descLabeljapjap_fieldrw.setText(descjapjap_fieldrw);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.fieldrw"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_fieldrwenabled_widget(new BooleanOptionWidget(editGroupjapjap_fieldrw, SWT.NONE, new OptionData("Enabled", "p", "jap.fieldrw","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"jap.fieldrw"+" "+"threshold";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);	
		}
		else {
			
			defaultString = "100";
			
		}

		setjapjap_fieldrwthreshold_widget(new StringOptionWidget(editGroupjapjap_fieldrw, SWT.NONE, new OptionData("Maximum number of fields",  "p", "jap.fieldrw","threshold", "\nIf a statement reads/writes more than this number of fields, no \ntag will be produced for it, in order to keep the size of the \ntags reasonable. ", defaultString)));
		

		
		return editGroupjapjap_fieldrw;
	}



	private Composite japjap_cgtaggerCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_cgtagger = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_cgtagger.setLayout(layout);
	
	 	editGroupjapjap_cgtagger.setText("Call Graph Tagger");
	 	
		editGroupjapjap_cgtagger.setData("id", "japjap_cgtagger");
		
		String descjapjap_cgtagger = "Call graph tagger";	
		if (descjapjap_cgtagger.length() > 0) {
			Label descLabeljapjap_cgtagger = new Label(editGroupjapjap_cgtagger, SWT.WRAP);
			descLabeljapjap_cgtagger.setText(descjapjap_cgtagger);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.cgtagger"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_cgtaggerenabled_widget(new BooleanOptionWidget(editGroupjapjap_cgtagger, SWT.NONE, new OptionData("Enabled", "p", "jap.cgtagger","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_cgtagger;
	}



	private Composite japjap_parityCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_parity = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_parity.setLayout(layout);
	
	 	editGroupjapjap_parity.setText("Parity Tagger");
	 	
		editGroupjapjap_parity.setData("id", "japjap_parity");
		
		String descjapjap_parity = "Parity tagger";	
		if (descjapjap_parity.length() > 0) {
			Label descLabeljapjap_parity = new Label(editGroupjapjap_parity, SWT.WRAP);
			descLabeljapjap_parity.setText(descjapjap_parity);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.parity"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_parityenabled_widget(new BooleanOptionWidget(editGroupjapjap_parity, SWT.NONE, new OptionData("Enabled", "p", "jap.parity","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_parity;
	}



	private Composite japjap_patCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_pat = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_pat.setLayout(layout);
	
	 	editGroupjapjap_pat.setText("Parameter Alias Tagger");
	 	
		editGroupjapjap_pat.setData("id", "japjap_pat");
		
		String descjapjap_pat = "Colour-codes method parameters that may be aliased";	
		if (descjapjap_pat.length() > 0) {
			Label descLabeljapjap_pat = new Label(editGroupjapjap_pat, SWT.WRAP);
			descLabeljapjap_pat.setText(descjapjap_pat);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.pat"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_patenabled_widget(new BooleanOptionWidget(editGroupjapjap_pat, SWT.NONE, new OptionData("Enabled", "p", "jap.pat","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_pat;
	}



	private Composite japjap_lvtaggerCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_lvtagger = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_lvtagger.setLayout(layout);
	
	 	editGroupjapjap_lvtagger.setText("Live Variables Tagger");
	 	
		editGroupjapjap_lvtagger.setData("id", "japjap_lvtagger");
		
		String descjapjap_lvtagger = "Creates color tags for live variables";	
		if (descjapjap_lvtagger.length() > 0) {
			Label descLabeljapjap_lvtagger = new Label(editGroupjapjap_lvtagger, SWT.WRAP);
			descLabeljapjap_lvtagger.setText(descjapjap_lvtagger);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.lvtagger"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_lvtaggerenabled_widget(new BooleanOptionWidget(editGroupjapjap_lvtagger, SWT.NONE, new OptionData("Enabled", "p", "jap.lvtagger","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_lvtagger;
	}



	private Composite japjap_rdtaggerCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_rdtagger = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_rdtagger.setLayout(layout);
	
	 	editGroupjapjap_rdtagger.setText("Reaching Defs Tagger");
	 	
		editGroupjapjap_rdtagger.setData("id", "japjap_rdtagger");
		
		String descjapjap_rdtagger = "Creates link tags for reaching defs";	
		if (descjapjap_rdtagger.length() > 0) {
			Label descLabeljapjap_rdtagger = new Label(editGroupjapjap_rdtagger, SWT.WRAP);
			descLabeljapjap_rdtagger.setText(descjapjap_rdtagger);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.rdtagger"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_rdtaggerenabled_widget(new BooleanOptionWidget(editGroupjapjap_rdtagger, SWT.NONE, new OptionData("Enabled", "p", "jap.rdtagger","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_rdtagger;
	}



	private Composite japjap_cheCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_che = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_che.setLayout(layout);
	
	 	editGroupjapjap_che.setText("Cast Elimination Check Tagger");
	 	
		editGroupjapjap_che.setData("id", "japjap_che");
		
		String descjapjap_che = "Indicates whether cast checks can be eliminated";	
		if (descjapjap_che.length() > 0) {
			Label descLabeljapjap_che = new Label(editGroupjapjap_che, SWT.WRAP);
			descLabeljapjap_che.setText(descjapjap_che);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.che"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_cheenabled_widget(new BooleanOptionWidget(editGroupjapjap_che, SWT.NONE, new OptionData("Enabled", "p", "jap.che","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_che;
	}



	private Composite japjap_umtCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_umt = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_umt.setLayout(layout);
	
	 	editGroupjapjap_umt.setText("Unreachable Method Transformer");
	 	
		editGroupjapjap_umt.setData("id", "japjap_umt");
		
		String descjapjap_umt = "Inserts assertions into unreachable methods";	
		if (descjapjap_umt.length() > 0) {
			Label descLabeljapjap_umt = new Label(editGroupjapjap_umt, SWT.WRAP);
			descLabeljapjap_umt.setText(descjapjap_umt);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.umt"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_umtenabled_widget(new BooleanOptionWidget(editGroupjapjap_umt, SWT.NONE, new OptionData("Enabled", "p", "jap.umt","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_umt;
	}



	private Composite japjap_litCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_lit = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_lit.setLayout(layout);
	
	 	editGroupjapjap_lit.setText("Loop Invariant Tagger");
	 	
		editGroupjapjap_lit.setData("id", "japjap_lit");
		
		String descjapjap_lit = "Tags loop invariants";	
		if (descjapjap_lit.length() > 0) {
			Label descLabeljapjap_lit = new Label(editGroupjapjap_lit, SWT.WRAP);
			descLabeljapjap_lit.setText(descjapjap_lit);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.lit"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_litenabled_widget(new BooleanOptionWidget(editGroupjapjap_lit, SWT.NONE, new OptionData("Enabled", "p", "jap.lit","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_lit;
	}



	private Composite japjap_aetCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_aet = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_aet.setLayout(layout);
	
	 	editGroupjapjap_aet.setText("Available Expressions Tagger");
	 	
		editGroupjapjap_aet.setData("id", "japjap_aet");
		
		String descjapjap_aet = "Tags statements with sets of available expressions";	
		if (descjapjap_aet.length() > 0) {
			Label descLabeljapjap_aet = new Label(editGroupjapjap_aet, SWT.WRAP);
			descLabeljapjap_aet.setText(descjapjap_aet);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.aet"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_aetenabled_widget(new BooleanOptionWidget(editGroupjapjap_aet, SWT.NONE, new OptionData("Enabled", "p", "jap.aet","enabled", "\n", defaultBool)));
		
		
		
		data = new OptionData [] {
		
		new OptionData("Optimistic",
		"optimistic",
		"\n",
		
		true),
		
		new OptionData("Pessimistic",
		"pessimistic",
		"\n",
		
		false),
		
		};
		
										
		setjapjap_aetkind_widget(new MultiOptionWidget(editGroupjapjap_aet, SWT.NONE, data, new OptionData("Kind", "p", "jap.aet","kind", "\n")));
		
		defKey = "p"+" "+"jap.aet"+" "+"kind";
		defKey = defKey.trim();
		
		if (isInDefList(defKey)) {
			defaultString = getStringDef(defKey);
		
			getjapjap_aetkind_widget().setDef(defaultString);
		}
		
		

		
		return editGroupjapjap_aet;
	}



	private Composite japjap_dmtCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupjapjap_dmt = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupjapjap_dmt.setLayout(layout);
	
	 	editGroupjapjap_dmt.setText("Dominators Tagger");
	 	
		editGroupjapjap_dmt.setData("id", "japjap_dmt");
		
		String descjapjap_dmt = "Tags dominators of statement";	
		if (descjapjap_dmt.length() > 0) {
			Label descLabeljapjap_dmt = new Label(editGroupjapjap_dmt, SWT.WRAP);
			descLabeljapjap_dmt.setText(descjapjap_dmt);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"jap.dmt"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setjapjap_dmtenabled_widget(new BooleanOptionWidget(editGroupjapjap_dmt, SWT.NONE, new OptionData("Enabled", "p", "jap.dmt","enabled", "\n", defaultBool)));
		
		

		
		return editGroupjapjap_dmt;
	}



	private Composite gbCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgb = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgb.setLayout(layout);
	
	 	editGroupgb.setText("Grimp Body Creation");
	 	
		editGroupgb.setData("id", "gb");
		
		String descgb = "Creates a GrimpBody for each method";	
		if (descgb.length() > 0) {
			Label descLabelgb = new Label(editGroupgb, SWT.WRAP);
			descLabelgb.setText(descgb);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gb"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbenabled_widget(new BooleanOptionWidget(editGroupgb, SWT.NONE, new OptionData("Enabled", "p", "gb","enabled", "\n", defaultBool)));
		
		

		
		return editGroupgb;
	}



	private Composite gbgb_a1Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgbgb_a1 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgbgb_a1.setLayout(layout);
	
	 	editGroupgbgb_a1.setText("Grimp Pre-folding Aggregator");
	 	
		editGroupgbgb_a1.setData("id", "gbgb_a1");
		
		String descgbgb_a1 = "Aggregator: removes some copies, pre-folding";	
		if (descgbgb_a1.length() > 0) {
			Label descLabelgbgb_a1 = new Label(editGroupgbgb_a1, SWT.WRAP);
			descLabelgbgb_a1.setText(descgbgb_a1);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gb.a1"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_a1enabled_widget(new BooleanOptionWidget(editGroupgbgb_a1, SWT.NONE, new OptionData("Enabled", "p", "gb.a1","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"gb.a1"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_a1only_stack_locals_widget(new BooleanOptionWidget(editGroupgbgb_a1, SWT.NONE, new OptionData("Only Stack Locals", "p", "gb.a1","only-stack-locals", "\nAggregate only values stored in stack locals. ", defaultBool)));
		
		

		
		return editGroupgbgb_a1;
	}



	private Composite gbgb_cfCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgbgb_cf = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgbgb_cf.setLayout(layout);
	
	 	editGroupgbgb_cf.setText("Grimp Constructor Folder");
	 	
		editGroupgbgb_cf.setData("id", "gbgb_cf");
		
		String descgbgb_cf = "Constructor folder";	
		if (descgbgb_cf.length() > 0) {
			Label descLabelgbgb_cf = new Label(editGroupgbgb_cf, SWT.WRAP);
			descLabelgbgb_cf.setText(descgbgb_cf);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gb.cf"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_cfenabled_widget(new BooleanOptionWidget(editGroupgbgb_cf, SWT.NONE, new OptionData("Enabled", "p", "gb.cf","enabled", "\n", defaultBool)));
		
		

		
		return editGroupgbgb_cf;
	}



	private Composite gbgb_a2Create(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgbgb_a2 = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgbgb_a2.setLayout(layout);
	
	 	editGroupgbgb_a2.setText("Grimp Post-folding Aggregator");
	 	
		editGroupgbgb_a2.setData("id", "gbgb_a2");
		
		String descgbgb_a2 = "Aggregator: removes some copies, post-folding";	
		if (descgbgb_a2.length() > 0) {
			Label descLabelgbgb_a2 = new Label(editGroupgbgb_a2, SWT.WRAP);
			descLabelgbgb_a2.setText(descgbgb_a2);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gb.a2"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_a2enabled_widget(new BooleanOptionWidget(editGroupgbgb_a2, SWT.NONE, new OptionData("Enabled", "p", "gb.a2","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"gb.a2"+" "+"only-stack-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_a2only_stack_locals_widget(new BooleanOptionWidget(editGroupgbgb_a2, SWT.NONE, new OptionData("Only Stack Locals", "p", "gb.a2","only-stack-locals", "\nAggregate only values stored in stack locals. ", defaultBool)));
		
		

		
		return editGroupgbgb_a2;
	}



	private Composite gbgb_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgbgb_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgbgb_ule.setLayout(layout);
	
	 	editGroupgbgb_ule.setText("Grimp Unused Local Eliminator");
	 	
		editGroupgbgb_ule.setData("id", "gbgb_ule");
		
		String descgbgb_ule = "Unused local eliminator";	
		if (descgbgb_ule.length() > 0) {
			Label descLabelgbgb_ule = new Label(editGroupgbgb_ule, SWT.WRAP);
			descLabelgbgb_ule.setText(descgbgb_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gb.ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setgbgb_uleenabled_widget(new BooleanOptionWidget(editGroupgbgb_ule, SWT.NONE, new OptionData("Enabled", "p", "gb.ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupgbgb_ule;
	}



	private Composite gopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupgop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupgop.setLayout(layout);
	
	 	editGroupgop.setText("Grimp Optimization");
	 	
		editGroupgop.setData("id", "gop");
		
		String descgop = "Grimp optimization pack";	
		if (descgop.length() > 0) {
			Label descLabelgop = new Label(editGroupgop, SWT.WRAP);
			descLabelgop.setText(descgop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"gop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setgopenabled_widget(new BooleanOptionWidget(editGroupgop, SWT.NONE, new OptionData("Enabled", "p", "gop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupgop;
	}



	private Composite bbCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbb = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbb.setLayout(layout);
	
	 	editGroupbb.setText("Baf Body Creation");
	 	
		editGroupbb.setData("id", "bb");
		
		String descbb = "Creates Baf bodies";	
		if (descbb.length() > 0) {
			Label descLabelbb = new Label(editGroupbb, SWT.WRAP);
			descLabelbb.setText(descbb);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bb"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbenabled_widget(new BooleanOptionWidget(editGroupbb, SWT.NONE, new OptionData("Enabled", "p", "bb","enabled", "\n", defaultBool)));
		
		

		
		return editGroupbb;
	}



	private Composite bbbb_lsoCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbbbb_lso = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbbbb_lso.setLayout(layout);
	
	 	editGroupbbbb_lso.setText("Load Store Optimizer");
	 	
		editGroupbbbb_lso.setData("id", "bbbb_lso");
		
		String descbbbb_lso = "Load store optimizer";	
		if (descbbbb_lso.length() > 0) {
			Label descLabelbbbb_lso = new Label(editGroupbbbb_lso, SWT.WRAP);
			descLabelbbbb_lso.setText(descbbbb_lso);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_lsoenabled_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("Enabled", "p", "bb.lso","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"debug";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbbbb_lsodebug_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("Debug", "p", "bb.lso","debug", "\nProduces voluminous debugging output describing the progress of \nthe load store optimizer. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"inter";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbbbb_lsointer_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("Inter", "p", "bb.lso","inter", "\nEnables two simple inter-block optimizations which attempt to \nkeep some variables on the stack between blocks. Both are \nintended to catch if-like constructions where control flow \nbranches temporarily into two paths that converge at a later \npoint. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"sl";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_lsosl_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("sl", "p", "bb.lso","sl", "\nEnables an optimization which attempts to eliminate store/load \npairs. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"sl2";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbbbb_lsosl2_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("sl2", "p", "bb.lso","sl2", "\nEnables an a second pass of the optimization which attempts to \neliminate store/load pairs. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"sll";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_lsosll_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("sll", "p", "bb.lso","sll", "\nEnables an optimization which attempts to eliminate \nstore/load/load trios with some variant of dup. ", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lso"+" "+"sll2";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbbbb_lsosll2_widget(new BooleanOptionWidget(editGroupbbbb_lso, SWT.NONE, new OptionData("sll2", "p", "bb.lso","sll2", "\nEnables an a second pass of the optimization which attempts to \neliminate store/load/load trios with some variant of dup. ", defaultBool)));
		
		

		
		return editGroupbbbb_lso;
	}



	private Composite bbbb_phoCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbbbb_pho = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbbbb_pho.setLayout(layout);
	
	 	editGroupbbbb_pho.setText("Peephole Optimizer");
	 	
		editGroupbbbb_pho.setData("id", "bbbb_pho");
		
		String descbbbb_pho = "Peephole optimizer";	
		if (descbbbb_pho.length() > 0) {
			Label descLabelbbbb_pho = new Label(editGroupbbbb_pho, SWT.WRAP);
			descLabelbbbb_pho.setText(descbbbb_pho);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bb.pho"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_phoenabled_widget(new BooleanOptionWidget(editGroupbbbb_pho, SWT.NONE, new OptionData("Enabled", "p", "bb.pho","enabled", "\n", defaultBool)));
		
		

		
		return editGroupbbbb_pho;
	}



	private Composite bbbb_uleCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbbbb_ule = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbbbb_ule.setLayout(layout);
	
	 	editGroupbbbb_ule.setText("Unused Local Eliminator");
	 	
		editGroupbbbb_ule.setData("id", "bbbb_ule");
		
		String descbbbb_ule = "Unused local eliminator";	
		if (descbbbb_ule.length() > 0) {
			Label descLabelbbbb_ule = new Label(editGroupbbbb_ule, SWT.WRAP);
			descLabelbbbb_ule.setText(descbbbb_ule);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bb.ule"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_uleenabled_widget(new BooleanOptionWidget(editGroupbbbb_ule, SWT.NONE, new OptionData("Enabled", "p", "bb.ule","enabled", "\n", defaultBool)));
		
		

		
		return editGroupbbbb_ule;
	}



	private Composite bbbb_lpCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbbbb_lp = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbbbb_lp.setLayout(layout);
	
	 	editGroupbbbb_lp.setText("Local Packer");
	 	
		editGroupbbbb_lp.setData("id", "bbbb_lp");
		
		String descbbbb_lp = "Local packer: minimizes number of locals";	
		if (descbbbb_lp.length() > 0) {
			Label descLabelbbbb_lp = new Label(editGroupbbbb_lp, SWT.WRAP);
			descLabelbbbb_lp.setText(descbbbb_lp);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bb.lp"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setbbbb_lpenabled_widget(new BooleanOptionWidget(editGroupbbbb_lp, SWT.NONE, new OptionData("Enabled", "p", "bb.lp","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"bb.lp"+" "+"unsplit-original-locals";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbbbb_lpunsplit_original_locals_widget(new BooleanOptionWidget(editGroupbbbb_lp, SWT.NONE, new OptionData("Unsplit Original Locals", "p", "bb.lp","unsplit-original-locals", "\nUse the variable names in the original source as a guide when \ndetermining how to share local variables across non-interfering \nvariable usages. This recombines named locals which were split \nby the Local Splitter. ", defaultBool)));
		
		

		
		return editGroupbbbb_lp;
	}



	private Composite bopCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupbop = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupbop.setLayout(layout);
	
	 	editGroupbop.setText("Baf Optimization");
	 	
		editGroupbop.setData("id", "bop");
		
		String descbop = "Baf optimization pack";	
		if (descbop.length() > 0) {
			Label descLabelbop = new Label(editGroupbop, SWT.WRAP);
			descLabelbop.setText(descbop);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"bop"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setbopenabled_widget(new BooleanOptionWidget(editGroupbop, SWT.NONE, new OptionData("Enabled", "p", "bop","enabled", "\n", defaultBool)));
		
		

		
		return editGroupbop;
	}



	private Composite tagCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGrouptag = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGrouptag.setLayout(layout);
	
	 	editGrouptag.setText("Tag Aggregator");
	 	
		editGrouptag.setData("id", "tag");
		
		String desctag = "Tag aggregator: turns tags into attributes";	
		if (desctag.length() > 0) {
			Label descLabeltag = new Label(editGrouptag, SWT.WRAP);
			descLabeltag.setText(desctag);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"tag"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		settagenabled_widget(new BooleanOptionWidget(editGrouptag, SWT.NONE, new OptionData("Enabled", "p", "tag","enabled", "\n", defaultBool)));
		
		

		
		return editGrouptag;
	}



	private Composite tagtag_lnCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGrouptagtag_ln = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGrouptagtag_ln.setLayout(layout);
	
	 	editGrouptagtag_ln.setText("Line Number Tag Aggregator");
	 	
		editGrouptagtag_ln.setData("id", "tagtag_ln");
		
		String desctagtag_ln = "Line number aggregator";	
		if (desctagtag_ln.length() > 0) {
			Label descLabeltagtag_ln = new Label(editGrouptagtag_ln, SWT.WRAP);
			descLabeltagtag_ln.setText(desctagtag_ln);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"tag.ln"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		settagtag_lnenabled_widget(new BooleanOptionWidget(editGrouptagtag_ln, SWT.NONE, new OptionData("Enabled", "p", "tag.ln","enabled", "\n", defaultBool)));
		
		

		
		return editGrouptagtag_ln;
	}



	private Composite tagtag_anCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGrouptagtag_an = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGrouptagtag_an.setLayout(layout);
	
	 	editGrouptagtag_an.setText("Array Bounds and Null Pointer Check Tag Aggregator");
	 	
		editGrouptagtag_an.setData("id", "tagtag_an");
		
		String desctagtag_an = "Array bounds and null pointer check aggregator";	
		if (desctagtag_an.length() > 0) {
			Label descLabeltagtag_an = new Label(editGrouptagtag_an, SWT.WRAP);
			descLabeltagtag_an.setText(desctagtag_an);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"tag.an"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		settagtag_anenabled_widget(new BooleanOptionWidget(editGrouptagtag_an, SWT.NONE, new OptionData("Enabled", "p", "tag.an","enabled", "\n", defaultBool)));
		
		

		
		return editGrouptagtag_an;
	}



	private Composite tagtag_depCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGrouptagtag_dep = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGrouptagtag_dep.setLayout(layout);
	
	 	editGrouptagtag_dep.setText("Dependence Tag Aggregator");
	 	
		editGrouptagtag_dep.setData("id", "tagtag_dep");
		
		String desctagtag_dep = "Dependence aggregator";	
		if (desctagtag_dep.length() > 0) {
			Label descLabeltagtag_dep = new Label(editGrouptagtag_dep, SWT.WRAP);
			descLabeltagtag_dep.setText(desctagtag_dep);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"tag.dep"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		settagtag_depenabled_widget(new BooleanOptionWidget(editGrouptagtag_dep, SWT.NONE, new OptionData("Enabled", "p", "tag.dep","enabled", "\n", defaultBool)));
		
		

		
		return editGrouptagtag_dep;
	}



	private Composite tagtag_fieldrwCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGrouptagtag_fieldrw = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGrouptagtag_fieldrw.setLayout(layout);
	
	 	editGrouptagtag_fieldrw.setText("Field Read/Write Tag Aggregator");
	 	
		editGrouptagtag_fieldrw.setData("id", "tagtag_fieldrw");
		
		String desctagtag_fieldrw = "Field read/write aggregator";	
		if (desctagtag_fieldrw.length() > 0) {
			Label descLabeltagtag_fieldrw = new Label(editGrouptagtag_fieldrw, SWT.WRAP);
			descLabeltagtag_fieldrw.setText(desctagtag_fieldrw);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"tag.fieldrw"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		settagtag_fieldrwenabled_widget(new BooleanOptionWidget(editGrouptagtag_fieldrw, SWT.NONE, new OptionData("Enabled", "p", "tag.fieldrw","enabled", "\n", defaultBool)));
		
		

		
		return editGrouptagtag_fieldrw;
	}



	private Composite dbCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupdb = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupdb.setLayout(layout);
	
	 	editGroupdb.setText("Dava Body Creation");
	 	
		editGroupdb.setData("id", "db");
		
		String descdb = "Dummy phase to store options for Dava";	
		if (descdb.length() > 0) {
			Label descLabeldb = new Label(editGroupdb, SWT.WRAP);
			descLabeldb.setText(descdb);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"db"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setdbenabled_widget(new BooleanOptionWidget(editGroupdb, SWT.NONE, new OptionData("Enabled", "p", "db","enabled", "\n", defaultBool)));
		
		

		
		return editGroupdb;
	}



	private Composite dbdb_transformationsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupdbdb_transformations = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupdbdb_transformations.setLayout(layout);
	
	 	editGroupdbdb_transformations.setText("Transformations");
	 	
		editGroupdbdb_transformations.setData("id", "dbdb_transformations");
		
		String descdbdb_transformations = "The Dava back-end with all its transformations";	
		if (descdbdb_transformations.length() > 0) {
			Label descLabeldbdb_transformations = new Label(editGroupdbdb_transformations, SWT.WRAP);
			descLabeldbdb_transformations.setText(descdbdb_transformations);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"db.transformations"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setdbdb_transformationsenabled_widget(new BooleanOptionWidget(editGroupdbdb_transformations, SWT.NONE, new OptionData("Enabled", "p", "db.transformations","enabled", "\n", defaultBool)));
		
		

		
		return editGroupdbdb_transformations;
	}



	private Composite dbdb_renamerCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupdbdb_renamer = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupdbdb_renamer.setLayout(layout);
	
	 	editGroupdbdb_renamer.setText("Renamer");
	 	
		editGroupdbdb_renamer.setData("id", "dbdb_renamer");
		
		String descdbdb_renamer = "Apply heuristics based naming of local variables";	
		if (descdbdb_renamer.length() > 0) {
			Label descLabeldbdb_renamer = new Label(editGroupdbdb_renamer, SWT.WRAP);
			descLabeldbdb_renamer.setText(descdbdb_renamer);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"db.renamer"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setdbdb_renamerenabled_widget(new BooleanOptionWidget(editGroupdbdb_renamer, SWT.NONE, new OptionData("Enabled", "p", "db.renamer","enabled", "\n", defaultBool)));
		
		
		
		defKey = "p"+" "+"db.renamer"+" "+"remove-fully-qualified";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setdbdb_renamerremove_fully_qualified_widget(new BooleanOptionWidget(editGroupdbdb_renamer, SWT.NONE, new OptionData("Remove Fully Qualified Names", "p", "db.renamer","remove-fully-qualified", "\nThe conversion works to remove java.lang. from java.lang.String \netc. However this might not always be \ncorrect and might cause recompilability errors in which case the \nflag should be turned off.", defaultBool)));
		
		

		
		return editGroupdbdb_renamer;
	}



	private Composite dbdb_deobfuscateCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupdbdb_deobfuscate = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupdbdb_deobfuscate.setLayout(layout);
	
	 	editGroupdbdb_deobfuscate.setText("De-obfuscate");
	 	
		editGroupdbdb_deobfuscate.setData("id", "dbdb_deobfuscate");
		
		String descdbdb_deobfuscate = " Apply de-obfuscation analyses";	
		if (descdbdb_deobfuscate.length() > 0) {
			Label descLabeldbdb_deobfuscate = new Label(editGroupdbdb_deobfuscate, SWT.WRAP);
			descLabeldbdb_deobfuscate.setText(descdbdb_deobfuscate);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"db.deobfuscate"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setdbdb_deobfuscateenabled_widget(new BooleanOptionWidget(editGroupdbdb_deobfuscate, SWT.NONE, new OptionData("Enabled", "p", "db.deobfuscate","enabled", "\n", defaultBool)));
		
		

		
		return editGroupdbdb_deobfuscate;
	}



	private Composite dbdb_force_recompileCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupdbdb_force_recompile = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupdbdb_force_recompile.setLayout(layout);
	
	 	editGroupdbdb_force_recompile.setText("Force Recompilability");
	 	
		editGroupdbdb_force_recompile.setData("id", "dbdb_force_recompile");
		
		String descdbdb_force_recompile = " Try to get recompilable code.";	
		if (descdbdb_force_recompile.length() > 0) {
			Label descLabeldbdb_force_recompile = new Label(editGroupdbdb_force_recompile, SWT.WRAP);
			descLabeldbdb_force_recompile.setText(descdbdb_force_recompile);
		}
		OptionData [] data;	
		
		
		
		
		defKey = "p"+" "+"db.force-recompile"+" "+"enabled";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = true;
			
		}

		setdbdb_force_recompileenabled_widget(new BooleanOptionWidget(editGroupdbdb_force_recompile, SWT.NONE, new OptionData("Enabled", "p", "db.force-recompile","enabled", "\n", defaultBool)));
		
		

		
		return editGroupdbdb_force_recompile;
	}



	private Composite Application_Mode_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupApplication_Mode_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupApplication_Mode_Options.setLayout(layout);
	
	 	editGroupApplication_Mode_Options.setText("Application Mode Options");
	 	
		editGroupApplication_Mode_Options.setData("id", "Application_Mode_Options");
		
		String descApplication_Mode_Options = "";	
		if (descApplication_Mode_Options.length() > 0) {
			Label descLabelApplication_Mode_Options = new Label(editGroupApplication_Mode_Options, SWT.WRAP);
			descLabelApplication_Mode_Options.setText(descApplication_Mode_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"include-all";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setApplication_Mode_Optionsinclude_all_widget(new BooleanOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Include All Packages", "", "","include-all", "\nSoot uses a default list of packages (such as java.) which are \ndeemed to contain library classes. This switch removes the \ndefault packages from the list of packages containing library \nclasses. Individual packages can then be added using the exclude \noption. ", defaultBool)));
		
		

		defKey = ""+" "+""+" "+"i";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setApplication_Mode_Optionsinclude_widget(new ListOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Include Package",  "", "","i", "\nDesignate classes in packages whose names begin with PKG (e.g. \njava.util.) as application classes which should be analyzed and \noutput. This option allows you to selectively analyze classes in \nsome packages that Soot normally treats as library classes. You \ncan use the include option multiple times, to designate the \nclasses of multiple packages as application classes. If you \nspecify both include and exclude options, first the classes from \nall excluded packages are marked as library classes, then the \nclasses from all included packages are marked as application \nclasses.", defaultString)));
		

		defKey = ""+" "+""+" "+"x";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setApplication_Mode_Optionsexclude_widget(new ListOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Exclude Package",  "", "","x", "\nExcludes any classes in packages whose names begin with PKG \nfrom the set of application classes which are analyzed and \noutput, treating them as library classes instead. This option \nallows you to selectively exclude classes which would normally \nbe treated as application classes You can use the exclude \noption multiple times, to designate the classes of multiple \npackages as library classes. If you specify both include and \nexclude options, first the classes from all excluded packages \nare marked as library classes, then the classes from all \nincluded packages are marked as application classes.", defaultString)));
		

		defKey = ""+" "+""+" "+"dynamic-class";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setApplication_Mode_Optionsdynamic_class_widget(new ListOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Dynamic Classes",  "", "","dynamic-class", "\nMark CLASS as a class which the application may load \ndynamically. Soot will read it as a library class even if it is \nnot referenced from the argument classes. This permits whole \nprogram optimizations on programs which load classes dynamically \nif the set of classes that can be loaded is known at compile \ntime. You can use the dynamic class option multiple times to \nspecify more than one dynamic class.", defaultString)));
		

		defKey = ""+" "+""+" "+"dynamic-dir";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setApplication_Mode_Optionsdynamic_dir_widget(new ListOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Dynamic Directories",  "", "","dynamic-dir", "\nMark all class files in DIR as classes that may be loaded \ndynamically. Soot will read them as library classes even if they \nare not referenced from the argument classes. You can specify \nmore than one directory of potentially dynamic classes by \nspecifying multiple dynamic directory options.", defaultString)));
		

		defKey = ""+" "+""+" "+"dynamic-package";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultString = getArrayDef(defKey);	
		}
		else {
			
			defaultString = "";
			
		}

		setApplication_Mode_Optionsdynamic_package_widget(new ListOptionWidget(editGroupApplication_Mode_Options, SWT.NONE, new OptionData("Dynamic Package",  "", "","dynamic-package", "\nMarks all class files belonging to the package PKG or any of \nits subpackages as classes which the application may load \ndynamically. Soot will read all classes in PKG as library \nclasses, even if they are not referenced by any of the argument \nclasses.To specify more than one dynamic package, use the \ndynamic package option multiple times.", defaultString)));
		

		
		return editGroupApplication_Mode_Options;
	}



	private Composite Input_Attribute_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupInput_Attribute_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupInput_Attribute_Options.setLayout(layout);
	
	 	editGroupInput_Attribute_Options.setText("Input Attribute Options");
	 	
		editGroupInput_Attribute_Options.setData("id", "Input_Attribute_Options");
		
		String descInput_Attribute_Options = "";	
		if (descInput_Attribute_Options.length() > 0) {
			Label descLabelInput_Attribute_Options = new Label(editGroupInput_Attribute_Options, SWT.WRAP);
			descLabelInput_Attribute_Options.setText(descInput_Attribute_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"keep-line-number";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Attribute_Optionskeep_line_number_widget(new BooleanOptionWidget(editGroupInput_Attribute_Options, SWT.NONE, new OptionData("Keep Line Number", "", "","keep-line-number", "\nPreserve line number tables for class files throughout the \ntransformations. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"keep-bytecode-offset";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setInput_Attribute_Optionskeep_offset_widget(new BooleanOptionWidget(editGroupInput_Attribute_Options, SWT.NONE, new OptionData("Keep Bytecode Offset", "", "","keep-bytecode-offset", "\nMaintain bytecode offset tables for class files throughout the \ntransformations.", defaultBool)));
		
		

		
		return editGroupInput_Attribute_Options;
	}



	private Composite Annotation_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupAnnotation_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupAnnotation_Options.setLayout(layout);
	
	 	editGroupAnnotation_Options.setText("Annotation Options");
	 	
		editGroupAnnotation_Options.setData("id", "Annotation_Options");
		
		String descAnnotation_Options = "";	
		if (descAnnotation_Options.length() > 0) {
			Label descLabelAnnotation_Options = new Label(editGroupAnnotation_Options, SWT.WRAP);
			descLabelAnnotation_Options.setText(descAnnotation_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"annot-purity";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setAnnotation_Optionsannot_purity_widget(new BooleanOptionWidget(editGroupAnnotation_Options, SWT.NONE, new OptionData("Purity Annotation [AM]", "", "","annot-purity", "\nPurity anaysis implemented by Antoine Mine and based on the \npaper A Combined Pointer and Purity Analysis Java Programs by \nAlexandru Salcianu and Martin Rinard. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"annot-nullpointer";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setAnnotation_Optionsannot_nullpointer_widget(new BooleanOptionWidget(editGroupAnnotation_Options, SWT.NONE, new OptionData("Null Pointer Annotation", "", "","annot-nullpointer", "\nPerform a static analysis of which dereferenced pointers may \nhave null values, and annotate class files with attributes \nencoding the results of the analysis. For details, see the \ndocumentation for Null Pointer Annotation and for the Array \nBounds and Null Pointer Check Tag Aggregator. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"annot-arraybounds";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setAnnotation_Optionsannot_arraybounds_widget(new BooleanOptionWidget(editGroupAnnotation_Options, SWT.NONE, new OptionData("Array Bounds Annotation", "", "","annot-arraybounds", "\nPerform a static analysis of which array bounds checks may \nsafely be eliminated and annotate output class files with \nattributes encoding the results of the analysis. For details, \nsee the documentation for Array Bounds Annotation and for the \nArray Bounds and Null Pointer Check Tag Aggregator. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"annot-side-effect";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setAnnotation_Optionsannot_side_effect_widget(new BooleanOptionWidget(editGroupAnnotation_Options, SWT.NONE, new OptionData("Side effect annotation", "", "","annot-side-effect", "\nEnable the generation of side-effect attributes. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"annot-fieldrw";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setAnnotation_Optionsannot_fieldrw_widget(new BooleanOptionWidget(editGroupAnnotation_Options, SWT.NONE, new OptionData("Field read/write annotation", "", "","annot-fieldrw", "\nEnable the generation of field read/write attributes.", defaultBool)));
		
		

		
		return editGroupAnnotation_Options;
	}



	private Composite Miscellaneous_OptionsCreate(Composite parent) {
		String defKey;
		String defaultString;
		boolean defaultBool = false;
	    String defaultArray;
       
		Group editGroupMiscellaneous_Options = new Group(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		editGroupMiscellaneous_Options.setLayout(layout);
	
	 	editGroupMiscellaneous_Options.setText("Miscellaneous Options");
	 	
		editGroupMiscellaneous_Options.setData("id", "Miscellaneous_Options");
		
		String descMiscellaneous_Options = "";	
		if (descMiscellaneous_Options.length() > 0) {
			Label descLabelMiscellaneous_Options = new Label(editGroupMiscellaneous_Options, SWT.WRAP);
			descLabelMiscellaneous_Options.setText(descMiscellaneous_Options);
		}
		OptionData [] data;	
		
		
		
		
		defKey = ""+" "+""+" "+"time";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setMiscellaneous_Optionstime_widget(new BooleanOptionWidget(editGroupMiscellaneous_Options, SWT.NONE, new OptionData("Time", "", "","time", "\nReport the time required to perform some of Soot's \ntransformations. ", defaultBool)));
		
		
		
		defKey = ""+" "+""+" "+"subtract-gc";
		defKey = defKey.trim();

		if (isInDefList(defKey)) {
			defaultBool = getBoolDef(defKey);	
		}
		else {
			
			defaultBool = false;
			
		}

		setMiscellaneous_Optionssubtract_gc_widget(new BooleanOptionWidget(editGroupMiscellaneous_Options, SWT.NONE, new OptionData("Subtract Garbage Collection Time", "", "","subtract-gc", "\nAttempt to subtract time spent in garbage collection from the \nreports of times required for transformations. ", defaultBool)));
		
		

		
		return editGroupMiscellaneous_Options;
	}




}

