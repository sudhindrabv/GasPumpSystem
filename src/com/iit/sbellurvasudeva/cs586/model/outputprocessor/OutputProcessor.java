package com.iit.sbellurvasudeva.cs586.model.outputprocessor;

import com.iit.sbellurvasudeva.cs586.abstractfactory.AbstractFactory;
import com.iit.sbellurvasudeva.cs586.action.ActionCancelMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionDisplayMenu;
import com.iit.sbellurvasudeva.cs586.action.ActionGasPumpedMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionPayMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionPrintReceipt;
import com.iit.sbellurvasudeva.cs586.action.ActionPumpGasUnit;
import com.iit.sbellurvasudeva.cs586.action.ActionReadyMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionRejectMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionReturnCash;
import com.iit.sbellurvasudeva.cs586.action.ActionSetInitialValues;
import com.iit.sbellurvasudeva.cs586.action.ActionSetPrice;
import com.iit.sbellurvasudeva.cs586.action.ActionStopMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreCash;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreData;
import com.iit.sbellurvasudeva.cs586.data.DataStore;

/**
 * This class is the abstract superclass in the Strategy design pattern
 * This class acts like a client in the Strategy design pattern.
 * This OutputProcessor is instantiated by the appropriate ConcreteFactory for each GasPump.
 * Its meta-action attributes are set to the appropriate GasPump-specific actions
 * according to the Strategy pattern by the correct ConcreteFactory for each GasPump.
 */
public class OutputProcessor {
	private DataStore dataStore;
	private ActionCancelMsg cancelMsg;
	private ActionDisplayMenu displayMenu;
	private ActionGasPumpedMsg gasPumpedMsg;
	private ActionPayMsg payMsg;
	private ActionPrintReceipt printReceipt;
	private ActionPumpGasUnit pumpGasUnit;
	private ActionReadyMsg readyMsg;
	private ActionRejectMsg rejectMsg;
	private ActionReturnCash returnCash;
	private ActionSetInitialValues setInitialValues;
	private ActionSetPrice setPrice;
	private ActionStopMsg stopMsg;
	private ActionStoreCash storeCash;
	private ActionStoreData storeData;

	public OutputProcessor() {
	}

	public OutputProcessor(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storeData = af.getStoreData();
    }
	
	/*
	 * Below are the list Meta-actions involved 
	 * All the below are implemented using Strategy Design Pattern
	 */

	public void CancelMsg() {
		this.cancelMsg.cancelMsg();
	}

	public void DisplayMenu() {
		this.displayMenu.displayMenu();
	}

	public void GasPumpedMsg() {
		this.gasPumpedMsg.gasPumpedMsg();
	}

	public void PayMsg() {
		this.payMsg.payMsg();
	}

	public void PrintReceipt() {
		this.printReceipt.printReceipt();
	}

	public void PumpGasUnit() {
		this.pumpGasUnit.pumpGasUnit();
	}

	public void ReadyMsg() {
		this.readyMsg.readyMsg();
	}

	public void RejectMsg() {
		this.rejectMsg.rejectMsg();
	}

	public void ReturnCash() {
		this.returnCash.returnCash();
	}

	public void SetInitialValues() {
		this.setInitialValues.setInitialValues();
	}

	public void SetPrice(int g) {
		this.setPrice.setPrice(g);
	}

	public void StopMsg() {
		this.stopMsg.stopMsg();
	}

	public void StoreCash() {
		this.storeCash.storeCash();
	}

	public void StoreData() {
		this.storeData.storeData();
	}

	/*
	 * GETTERS AND SETTERS
	 */

	public DataStore getDataStore() {
		return dataStore;
	}

	public void setCancelMsg(ActionCancelMsg cancelMsg) {
		this.cancelMsg = cancelMsg;
	}

	public void setDataStore(DataStore dataStore) {
		this.dataStore = dataStore;
	}

	public void setDisplayMenu(ActionDisplayMenu displayMenu) {
		this.displayMenu = displayMenu;
	}

	public void setGasPumpedMsg(ActionGasPumpedMsg gasPumpedMsg) {
		this.gasPumpedMsg = gasPumpedMsg;
	}

	public void setPayMsg(ActionPayMsg payMsg) {
		this.payMsg = payMsg;
	}

	public void setPrintReceipt(ActionPrintReceipt printReceipt) {
		this.printReceipt = printReceipt;
	}

	public void setPumpGasUnit(ActionPumpGasUnit pumpGasUnit) {
		this.pumpGasUnit = pumpGasUnit;
	}

	public void setReadyMsg(ActionReadyMsg readyMsg) {
		this.readyMsg = readyMsg;
	}

	public void setRejectMsg(ActionRejectMsg rejectMsg) {
		this.rejectMsg = rejectMsg;
	}

	public void setReturnCash(ActionReturnCash returnCash) {
		this.returnCash = returnCash;
	}

	public void setSetInitialValues(ActionSetInitialValues setInitialValues) {
		this.setInitialValues = setInitialValues;
	}

	public void setSetPrice(ActionSetPrice setPrice) {
		this.setPrice = setPrice;
	}

	public void setStopMsg(ActionStopMsg stopMsg) {
		this.stopMsg = stopMsg;
	}

	public void setStoreCash(ActionStoreCash storeCash) {
		this.storeCash = storeCash;
	}

	public void setStoreData(ActionStoreData storeData) {
		this.storeData = storeData;
	}

}
