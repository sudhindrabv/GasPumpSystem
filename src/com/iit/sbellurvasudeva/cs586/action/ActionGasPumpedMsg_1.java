package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 *  This class represents GasPump1 ActionGasPumpedMsgaction responsible for gas pumped message
 */
public class ActionGasPumpedMsg_1 extends ActionGasPumpedMsg {

	public ActionGasPumpedMsg_1(DataStore data) {
		super(data);
	}

	/**
	 *  This overridden function used to show gas pumped message 
	 */
	@Override
	public void gasPumpedMsg() {
		GasPump1Data d = (GasPump1Data) data;
		System.out.println("Pumped 1 gallon of " + d.getGasType() + " gasoline");
		System.out.println("Total # of gallons pumped: " + d.getG());
	}

}
