package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * Meta-action is used for setting price for a type of gas
 */
public abstract class ActionSetPrice {

	DataStore data;

	public ActionSetPrice(DataStore data) {
        this.data = data;
    }

	public abstract void setPrice(int g);

}
