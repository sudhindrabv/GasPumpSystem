package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * This class represents GasPump2 ActionGasPumpedMsg action responsible for displaying gas pumped message
 */
public class ActionGasPumpedMsg_2 extends ActionGasPumpedMsg {

	public ActionGasPumpedMsg_2(DataStore data) {
		super(data);
	}

	/**
	 *  This overridden function used to show gas pumped message 
	 */
	@Override
	public void gasPumpedMsg() {
		GasPump2Data d = (GasPump2Data) data;
		System.out.println("Pumped 1 liter of " + d.getGasType() + " gasoline");
		System.out.println("Total # of liters pumped: " + d.getL());	
	}

}
