package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for storing cash into DataStore objects
 */
public abstract class ActionStoreCash {
	DataStore data;

    public ActionStoreCash() {
    }

    public ActionStoreCash(DataStore  data) {
        this.data = data;
    }

    public abstract void storeCash();

}
