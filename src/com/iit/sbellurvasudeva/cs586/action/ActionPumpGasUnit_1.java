package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * This meta-action is used for pumping Gas Unit
 */
public class ActionPumpGasUnit_1 extends ActionPumpGasUnit {

	public ActionPumpGasUnit_1(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for pumping gas unit.
	 */
	@Override
	public void pumpGasUnit() {
		GasPump1Data d = (GasPump1Data) data;
		/*
		 * Call the subroutine that ACTUALLY pumps gas here Now increment the
		 * appropriate data values
		 */
		d.setG(d.getG()+1);
		d.setTotal(d.getPrice() * d.getG());

	}

}
