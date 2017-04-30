package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for returning cash for GasPump2
 */
public class ActionReturnCash_2 extends ActionReturnCash {

	public ActionReturnCash_2(DataStore data) {
        super(data);
    }

	/**
	 * This overridden method is used for displaying for Credit card reject message
	 */
	@Override
	public void returnCash() {
		GasPump2Data d = (GasPump2Data) data;
		float cash_return = d.getCash() - d.getTotal();
		if (cash_return > 0) {
			System.out.println("Cash to return: $" + cash_return);
			System.out.println("Returning $" + cash_return);
		} else {
			System.out.println("No cash to return");
		}
		System.out.println("Transaction finished");
	}

}
