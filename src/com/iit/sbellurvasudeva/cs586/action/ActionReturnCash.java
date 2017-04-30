package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 *  This meta-action is used for returning cash
 */
public abstract class ActionReturnCash {
	DataStore data;

    public ActionReturnCash() {
    }

    public ActionReturnCash(DataStore data) {
        this.data = data;
    }

    public abstract void returnCash();
}
