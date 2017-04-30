package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * This meta-action is used for displaying GasPump1 ready message 
 */
public class ActionReadyMsg_1 extends ActionReadyMsg {

	public ActionReadyMsg_1(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for displaying gas pump ready message
	 */
	@Override
	public void readyMsg() {
		System.out.println("READY TO DISPENSE FUEL");
        GasPump1Data d = (GasPump1Data) data;
        System.out.println("Select (9) to dispense 1 gallon of " + d.getGasType() + " gasoline");
        System.out.println("Otherwise, select (x) to stop");		
	}

}
