package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents initial state in the EFSM model.
 */
class InitialState extends State {

	InitialState(MdaEFSM model) {
		super(model);
	}

	/*
	 * This function is used to transition to State S0 and call the StoreData() meta-action
	 */
	@Override
	void activate() {
		if (model.getState() == model.LS[0]) {
			OutputProcessor op = model.getState().getOP(); 
			model.getState().getOP().StoreData();
			model.changeState(model.LS[1]);
			model.getState().setOP(op);
		}
	}
}
