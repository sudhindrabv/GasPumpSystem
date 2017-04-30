package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This groups all the ActionDisplayMenu under one abstract superclass.
 */
public abstract class ActionDisplayMenu {

	DataStore dataStore;

    public ActionDisplayMenu(DataStore dataStore) {
        this.dataStore = dataStore;
    }

    public abstract void displayMenu();

    public DataStore getDataStore() {
        return dataStore;
    }
}
