package com.iit.sbellurvasudeva.cs586.action;

import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for storing prices related to regular, super and premium gas types  for GasPump2
 */
public class ActionStoreData_2 extends ActionStoreData {

	public ActionStoreData_2(DataStore data) {
		super(data);
	}

	@Override
	public void storeData() {
		GasPump2Data d = (GasPump2Data) data;
		d.setR_price(d.getA());
		d.setP_price(d.getB());
		d.setS_price(d.getC());
		System.out.println("GasPump2 activated successfully!");
	}

}
