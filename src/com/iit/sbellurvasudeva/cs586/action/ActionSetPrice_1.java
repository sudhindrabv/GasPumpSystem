package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * Meta-action is used for setting price for a type of gas for GasPump1
 */
public class ActionSetPrice_1 extends ActionSetPrice {

	public ActionSetPrice_1(DataStore data) {
		super(data);
	}

	@Override
	public void setPrice(int g) {
		GasPump1Data d = (GasPump1Data) data;
		if (g == 1) { // Regular selected
			d.setPrice(d.getR_price());
			d.setGasType("Regular");
		} else if (g == 2) { // Super selected
			d.setPrice(d.getS_price());
			d.setGasType("Super");
		}
		System.out.println(d.getGasType() + " gasoline selected @ price of $" + d.getPrice() + "/gallon");
		System.out.println("Select (8) to start the pump");
	}

}
