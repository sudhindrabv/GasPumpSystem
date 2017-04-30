package com.iit.sbellurvasudeva.cs586.abstractfactory;

import com.iit.sbellurvasudeva.cs586.action.ActionCancelMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionCancelMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionDisplayMenu;
import com.iit.sbellurvasudeva.cs586.action.ActionDisplayMenu_1;
import com.iit.sbellurvasudeva.cs586.action.ActionGasPumpedMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionGasPumpedMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionPayMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionPayMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionPrintReceipt;
import com.iit.sbellurvasudeva.cs586.action.ActionPrintReceipt_1;
import com.iit.sbellurvasudeva.cs586.action.ActionPumpGasUnit;
import com.iit.sbellurvasudeva.cs586.action.ActionPumpGasUnit_1;
import com.iit.sbellurvasudeva.cs586.action.ActionReadyMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionReadyMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionRejectMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionRejectMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionReturnCash;
import com.iit.sbellurvasudeva.cs586.action.ActionReturnCash_1;
import com.iit.sbellurvasudeva.cs586.action.ActionSetInitialValues;
import com.iit.sbellurvasudeva.cs586.action.ActionSetInitialValues_1;
import com.iit.sbellurvasudeva.cs586.action.ActionSetPrice;
import com.iit.sbellurvasudeva.cs586.action.ActionSetPrice_1;
import com.iit.sbellurvasudeva.cs586.action.ActionStopMsg;
import com.iit.sbellurvasudeva.cs586.action.ActionStopMsg_1;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreCash;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreCash_1;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreData;
import com.iit.sbellurvasudeva.cs586.action.ActionStoreData_1;
import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;
import com.iit.sbellurvasudeva.cs586.gaspump.GasPump;
import com.iit.sbellurvasudeva.cs586.gaspump.GasPump1;
import com.iit.sbellurvasudeva.cs586.model.efsm.MdaEFSM;
import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class is used for the implementation AbstarctFactory Design Pattern
 * 
 *  This class is the factory that produces the required objects for GasPump1 
 * 	Instantiates the proper action strategies with the shared data structure
 * 	OutputProcessor object will be instantiated with an object of this class when it needs to
 *	display output for GasPump1. Output processor will call the methods provided by this class in order to bind
 * 	GasPump1 specific actions.
 */
public class ConcreteFactory1 extends AbstractFactory {
	private GasPump1Data data;
	private GasPump1 gaspPump1;
	private MdaEFSM model;
	private OutputProcessor op;

	public ConcreteFactory1() {
		// create the 4 core objects that a GasPump needs
		data = new GasPump1Data();
		gaspPump1 = new GasPump1(this);
		model = new MdaEFSM();
		op = new OutputProcessor();

		// GasPumps(InputProcessor) and OutputProcessor share the same data
		gaspPump1.setDataStore(data);
		op.setDataStore(data);

		// set the GasPump1(InputProcessor's) model object reference
		gaspPump1.setMdaEFSM(model);

		// set the OutputProcessor's action strategies to GasPump1 specific
		// actions
		// and also pass in the shared Data structure to actions that need it
		op.setCancelMsg(new ActionCancelMsg_1());
		op.setDisplayMenu(new ActionDisplayMenu_1(data));
		op.setGasPumpedMsg(new ActionGasPumpedMsg_1(data));
		op.setPayMsg(new ActionPayMsg_1());
		op.setPrintReceipt(new ActionPrintReceipt_1(data));
		op.setPumpGasUnit(new ActionPumpGasUnit_1(data));
		op.setReadyMsg(new ActionReadyMsg_1(data));
		op.setRejectMsg(new ActionRejectMsg_1());
		op.setReturnCash(new ActionReturnCash_1());
		op.setSetInitialValues(new ActionSetInitialValues_1(data));
		op.setSetPrice(new ActionSetPrice_1(data));
		op.setStopMsg(new ActionStopMsg_1());
		op.setStoreCash(new ActionStoreCash_1());
		op.setStoreData(new ActionStoreData_1(data));

		// set the EFSM model's OutputProcessor's object reference
		model.getState().setOP(op);
	}

	/**
	 * This return instantiated data store of GasPump1
	 */
	@Override
	public DataStore getDataStore() {
		return this.data;
	}

	/**
	 * This override function returns the MdaEFSM Object 
	 */
	@Override
	public MdaEFSM getMdaEfsm() {
		return this.model;
	}

	/**
	 * This override function return the OutputProcessor
	 */
	@Override
	public OutputProcessor getOutputProcessor() {
		return this.op;
	}

	/**
	 * This override function gets the current factory's GasPump object which is GasPump1 
	 */
	@Override
	public GasPump getGasPump() {
		return this.gaspPump1;
	}

	/**
	 * This override function gets ActionCancelMsg class that is used to display Cancel Message 
	 */
	@Override
	public ActionCancelMsg getCancelMsg() {
		return new ActionCancelMsg_1();
	}

	/**
	 * This override function gets ActionDisplayMenu class that is used for displaying Menu
	 */
	@Override
	public ActionDisplayMenu getDisplayMenu() {
		return new ActionDisplayMenu_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionGasPumpedMsg class that is used for  displaying Gas Pump Message
	 */
	@Override
	public ActionGasPumpedMsg getGasPumpedMsg() {
		return new ActionGasPumpedMsg_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionPayMsg class that is used to get Payment prompt message.
	 */
	@Override
	public ActionPayMsg getPayMsg() {
		return new ActionPayMsg_1();
	}

	/**
	 * This override function gets ActionPrintReceipt class that is used for printing receipt
	 */
	@Override
	public ActionPrintReceipt getPrintReceipt() {
		return new ActionPrintReceipt_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionPumpGasUnit class that is used for pumping gas units 
	 */
	@Override
	public ActionPumpGasUnit getPumpGasUnit() {
		return new ActionPumpGasUnit_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionReadyMsg class that is used for displaying Ready message
	 */
	@Override
	public ActionReadyMsg getReadyMsg() {
		return new ActionReadyMsg_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionRejectMsg class that is used for displaying reject message  
	 */
	@Override
	public ActionRejectMsg getRejectMsg() {
		return new ActionRejectMsg_1();
	}

	/**
	 * This override function gets ActionReturnCash class that is used for return cash 
	 */
	@Override
	public ActionReturnCash getReturnCash() {
		return new ActionReturnCash_1();
	}

	/**
	 * This override function gets ActionSetInitialValues class that is used for setting initial values 
	 */
	@Override
	public ActionSetInitialValues getSetInitialValues() {
		return new ActionSetInitialValues_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionSetPrice class that is used for setting price of gas
	 */
	@Override
	public ActionSetPrice getSetPrice() {
		return new ActionSetPrice_1(this.getDataStore());
	}

	/**
	 * This override function gets ActionStopMsg class that is used for stopping message
	 */
	@Override
	public ActionStopMsg getStopMsg() {
		return new ActionStopMsg_1();
	}

	/**
	 * This override function gets ActionStoreCash class that is used for storing cash 
	 */
	@Override
	public ActionStoreCash getStoreCash() {
		return new ActionStoreCash_1();
	}

	/**
	 * This override function gets ActionStoreData class that is used for storing data related to regular and super gas types
	 */
	@Override
	public ActionStoreData getStoreData() {
		return new ActionStoreData_1(getDataStore());
	}

}
