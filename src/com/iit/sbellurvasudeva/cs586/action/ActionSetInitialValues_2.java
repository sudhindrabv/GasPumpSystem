package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 *
 * This class meta-action is used for setting initial values of GasPump2
 */
public class ActionSetInitialValues_2 extends ActionSetInitialValues {

	public ActionSetInitialValues_2(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for setting initial values
	 */
	@Override
	public void setInitialValues() {
		GasPump2Data d = (GasPump2Data) data;
		d.setL(0);
		d.setTotal(0);
	}

}
