package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * This meta action is used for printing receipt 
 */
import com.iit.sbellurvasudeva.cs586.data.DataStore;

public abstract class ActionPrintReceipt {

	DataStore data;

    public ActionPrintReceipt(DataStore data) {
        this.data = data;
    }

    public abstract void printReceipt();

}
