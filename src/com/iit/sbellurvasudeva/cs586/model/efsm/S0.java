package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 0 in the EFSM model. 
 */
class S0 extends State {

    S0(MdaEFSM model) {
        super(model);
    }

    /*
     * This function is used to transition to State S1 and call the PayMsg() meta-action
     */
    @Override
    void start() {
        if (model.getState() == model.LS[1]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().PayMsg();
            model.changeState(model.LS[2]);
            model.getState().setOP(op);
        }
    }
}
