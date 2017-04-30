package com.iit.sbellurvasudeva.cs586.gaspump;

import com.iit.sbellurvasudeva.cs586.abstractfactory.AbstractFactory;
import com.iit.sbellurvasudeva.cs586.data.DataStore;
import com.iit.sbellurvasudeva.cs586.model.efsm.MdaEFSM;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    It provides a constructor which subclasses can use to build up their drivers and necessary objects.

    Each child GasPump class will call this superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field.
*/

public abstract class GasPump {
    MdaEFSM model;
    DataStore data;

    /**
     * This method is used to get DataStore object
     * @return DataStore
     */
    public DataStore getData() {
        return data;
    }

    /**
     * This method is used to set DataStore object.
     * @param data - DataStore Object
     */
    public void setData(DataStore data) {
        this.data = data;
    }

    /**
     * This method Is used to get MdaEFSM object.
     * @return MdaEFSM
     */
	public MdaEFSM getMdaEFSM() {
		return model;
	}

	/**
	 * This method is used to set MdaEFSM object
	 * @param model
	 */
	public void setMdaEFSM(MdaEFSM model) {
		this.model = model;
	}

	/**
	 * This method is used to get DataStore object
	 * @return
	 */
	public DataStore getDataStore() {
		return data;
	}

	/**
	 * This method is used to set DataStore object.
	 * @param dataStore
	 */
	public void setDataStore(DataStore dataStore) {
		this.data = dataStore;
	}

	/**
	 * This constructor used to set Datastore and MdaEFSM objects
	 * @param af - AbstractFactory  Instance
	 */
	public GasPump(AbstractFactory af) {
        setMdaEFSM(af.getMdaEfsm());
        setData(af.getDataStore());
    }

	/**
	 * This abstract method provides the print operations.
	 */
    public abstract void printOperations();



}
