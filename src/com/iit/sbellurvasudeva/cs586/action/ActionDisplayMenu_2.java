package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This class represents GasPump2 DisplayMenu action responsible for displaying menu
 */
public class ActionDisplayMenu_2 extends ActionDisplayMenu {

	public ActionDisplayMenu_2(DataStore dataStore) {
		super(dataStore);
	}

	/**
	 * Overridden Function used to display menu
	 */
	@Override
	public void displayMenu() {
		GasPump2Data d = (GasPump2Data) dataStore;
        System.out.println("Cash Payment Accepted\n");
        System.out.println("Please select gas type:\n");
        System.out.println("(3) Regular [$" + d.getR_price() + "/gal] " +
                        "\n(4) Super [$" + d.getS_price() + "/gal] "+
        				"\n(5) Premium [$" + d.getP_price() + "/gal]\n");
        System.out.println("Otherwise, select (7) to cancel\n");
	}
}
