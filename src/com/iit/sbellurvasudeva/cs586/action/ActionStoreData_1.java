package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for storing prices related to regular, super  gas types for GasPump1
 */
public class ActionStoreData_1 extends ActionStoreData {

	public ActionStoreData_1(DataStore data) {
		super(data);
	}

	@Override
	public void storeData() {
		GasPump1Data d = (GasPump1Data) data;
        d.setR_price(d.getA());
        d.setS_price(d.getB());
        System.out.println("GasPump1 activated successfully!");		
	}

}
