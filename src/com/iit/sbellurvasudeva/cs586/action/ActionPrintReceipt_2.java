package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern
 * 
 * This Meta-action is used to for printing receipt of GasPump2
 */
public class ActionPrintReceipt_2 extends ActionPrintReceipt {

	public ActionPrintReceipt_2(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for printing receipt.
	 */
	@Override
	public void printReceipt() {
		System.out.println("Printing receipt ...");
        System.out.println("*********************************************************************");
        GasPump2Data d = (GasPump2Data) data;
        System.out.println(d.getL() + " liters of " + d.getGasType() + " gasoline @ $" + d.getPrice() + "/liter");
        System.out.println("Total: $" + (float) d.getTotal());
        System.out.println("Cash inserted: $" + d.getCash());
        System.out.println("*********************************************************************");			
	}

}
