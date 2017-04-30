package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for storing cash into DataStore objects for GasPump2
 */
public class ActionStoreCash_2 extends ActionStoreCash {

	public ActionStoreCash_2(DataStore data) {
		super(data);
	}

	@Override
	public void storeCash() {
		GasPump2Data d = (GasPump2Data) data;
		d.setCash(d.getTemp_cash());
		System.out.println("Amount of cash inserted: $" + d.getCash());
	}

}
