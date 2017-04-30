package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * This meta-action is used for pumping Gas Unit
 */
public class ActionPumpGasUnit_2 extends ActionPumpGasUnit {

	public ActionPumpGasUnit_2(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for pumping gas unit.
	 */
	@Override
	public void pumpGasUnit() {
		GasPump2Data d = (GasPump2Data) data;
		/*
		 * Call the subroutine that ACTUALLY pumps gas here Now increment the
		 * appropriate data values
		 */
		d.setL(d.getL()+1);
		d.setTotal(d.getPrice() * d.getL());
	}

}
