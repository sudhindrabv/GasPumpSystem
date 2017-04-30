package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for displaying gas pump is ready message
 */
public abstract class ActionReadyMsg {
	DataStore data;

    public ActionReadyMsg(DataStore data) {
        this.data = data;
    }

    public abstract void readyMsg();

}
