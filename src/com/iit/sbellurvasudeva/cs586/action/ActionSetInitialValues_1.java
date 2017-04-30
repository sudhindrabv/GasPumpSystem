package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 *  
 * This class meta-action is used for setting initial values of GasPump1
 */
public class ActionSetInitialValues_1 extends ActionSetInitialValues {

	public ActionSetInitialValues_1(DataStore data) {
		super(data);
	}

	/**
	 * This overridden method is used for setting initial values
	 */
	@Override
	public void setInitialValues() {
		GasPump1Data d = (GasPump1Data) data;
		d.setG(0);
		d.setTotal(0);
	}

}
