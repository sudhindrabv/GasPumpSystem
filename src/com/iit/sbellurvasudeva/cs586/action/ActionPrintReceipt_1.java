package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern
 * 
 * .This Meta-action is used to for printing receipt of GasPump1
 */
public class ActionPrintReceipt_1 extends ActionPrintReceipt {

	public ActionPrintReceipt_1(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for printing receipt.
	 */
	@Override
	public void printReceipt() {
		System.out.println("Printing receipt ...");
		System.out.println("######################################################################");
		GasPump1Data d = (GasPump1Data) data;
		System.out.println(d.getG() + " gallons of " + d.getGasType() + " gasoline @ $" + d.getPrice() + "/gallon");
		System.out.println("Total: $" + d.getTotal());
		System.out.println("#######################################################################");
		System.out.println("Transaction complete");
	}

}
