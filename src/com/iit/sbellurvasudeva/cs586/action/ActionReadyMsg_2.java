package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * This meta-action is used for displaying GasPump2 ready message 
 */
public class ActionReadyMsg_2 extends ActionReadyMsg {

	public ActionReadyMsg_2(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for displaying gas pump ready message
	 */
	@Override
	public void readyMsg() {
		System.out.println("READY TO DISPENSE FUEL");
        GasPump2Data d = (GasPump2Data) data;
        System.out.println("Select (8) to dispense 1 liter of " + d.getGasType() + " gasoline");
        System.out.println("Otherwise, select (9) to stop");				
	}

}
