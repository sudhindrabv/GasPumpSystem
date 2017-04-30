package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * Meta-action is used for setting price for a type of gas for GasPump2
 */
public class ActionSetPrice_2 extends ActionSetPrice {

	public ActionSetPrice_2(DataStore data) {
		super(data);
	}

	@Override
	public void setPrice(int g) {
		GasPump2Data d = (GasPump2Data) data;
		if (g == 1) { // Regular selected
			d.setPrice(d.getR_price());
			d.setGasType("Regular");
		} else if (g == 2) { // Super selected
			d.setPrice(d.getS_price());
			d.setGasType("Super");
		} else if (g == 3) { // Premium selected
			d.setPrice(d.getP_price());
			d.setGasType("Premium");
		}
		System.out.println(d.getGasType() + " gasoline selected @ price of $" + d.getPrice() + "/liter");
		System.out.println("Select (7) to start the pump");
	}

}
