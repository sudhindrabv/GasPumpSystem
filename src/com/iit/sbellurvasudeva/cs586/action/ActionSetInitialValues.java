package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * meta-action is used for setting initial values
 */
public abstract class ActionSetInitialValues {

	DataStore data;

    public ActionSetInitialValues(DataStore data) {
        this.data = data;
    }

    public abstract void setInitialValues();

}
