package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for storing prices related to regular, super and premium gas types 
 */
public abstract class ActionStoreData {
	DataStore data;

    public ActionStoreData(DataStore data) {
        this.data = data;
    }

    public abstract void storeData();

}
