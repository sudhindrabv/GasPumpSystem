package com.iit.sbellurvasudeva.cs586.abstractfactory;

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
import com.iit.sbellurvasudeva.cs586.gaspump.GasPump;
import com.iit.sbellurvasudeva.cs586.model.efsm.MdaEFSM;
import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class is used to implement AbstractFactory Design Pattern
 * This class groups all ConcreteFactory classes and provides abstract operation for the concrete classes.
 * This class provides an absract nethods for creating families of related or dependent objects without
 * specifying the concrete classes
 */
public abstract class AbstractFactory {

	public abstract GasPump getGasPump();
	
    public abstract DataStore getDataStore();

    public abstract MdaEFSM getMdaEfsm();

    public abstract OutputProcessor getOutputProcessor();

    public abstract ActionCancelMsg getCancelMsg();

    public abstract ActionDisplayMenu getDisplayMenu();

    public abstract ActionGasPumpedMsg getGasPumpedMsg();

    public abstract ActionPayMsg getPayMsg();

    public abstract ActionPrintReceipt getPrintReceipt();

    public abstract ActionPumpGasUnit getPumpGasUnit();

    public abstract ActionReadyMsg getReadyMsg();

    public abstract ActionRejectMsg getRejectMsg();

    public abstract ActionReturnCash getReturnCash();

    public abstract ActionSetInitialValues getSetInitialValues();

    public abstract ActionSetPrice getSetPrice();

    public abstract ActionStopMsg getStopMsg();

    public abstract ActionStoreCash getStoreCash();

    public abstract ActionStoreData getStoreData();
}