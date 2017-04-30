package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 2 in the EFSM model. 
 */
class S2 extends State {

    S2(MdaEFSM model) {
        super(model);
    }

    /*
     * Function used for transition from state S3 to S4 if credit card is approved
	 * Meta actions used : DisplayMenu
     */
    @Override
    void approved() {
        if (model.getState() == model.LS[3]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().DisplayMenu();
            model.changeState(model.LS[4]);
            model.getState().setOP(op);
        }
    }

    /*
     * Function used for transition from state S3 to S2 if credit card is rejected
	 * Meta actions used: RejectMsg 
     */
    @Override
    void reject() {
        if (model.getState() == model.LS[3]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().RejectMsg();
            model.changeState(model.LS[1]);
            model.getState().setOP(op);
        }
    }
}
