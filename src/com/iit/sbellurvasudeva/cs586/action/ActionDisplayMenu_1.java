package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * GasPump1 DisplayMenu action responsible for displaying menu
 */
public class ActionDisplayMenu_1 extends ActionDisplayMenu {

	public ActionDisplayMenu_1(DataStore dataStore) {
		super(dataStore);
	}

	/**
	 * Overridden Function used to display menu
	 */
	@Override
	public void displayMenu() {
		GasPump1Data d = (GasPump1Data) dataStore;
        System.out.println("CREDIT CARD APPROVED");
        System.out.println("Please select gas type:");
        System.out.println(
                "(5) Regular [$" + d.getR_price() + "/gal] " +
                        "\n(6) Super [$" + d.getS_price() + "/gal]");
        System.out.println("Otherwise, select (7) to cancel");		
	}

}
