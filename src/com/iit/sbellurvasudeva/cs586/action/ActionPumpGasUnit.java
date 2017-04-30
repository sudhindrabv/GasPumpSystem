package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * This meta-action is used for pumping Gas Unit
 */
public abstract class ActionPumpGasUnit {
	DataStore data;

	public ActionPumpGasUnit(DataStore data) {
	        this.data = data;
	    }

	public abstract void pumpGasUnit();

}
