package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 3 in the EFSM model. 
 */
class S3 extends State {

    S3(MdaEFSM model) {
        super(model);
    }

    /*
     * Function used to selectGas type for transition from state S3 to S4
     * Meta action used: SetPrice
     */
    @Override
    void selectGas(int g) {
        if (model.getState() == model.LS[4]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().SetPrice(g);
            model.changeState(model.LS[5]);
            model.getState().setOP(op);
        }
    }

    /*
     * Function used to cancel for transition from state S4 to S5
     */
    @Override
    void cancel() {
        if (model.getState() == model.LS[4]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().CancelMsg();
            model.getState().getOP().ReturnCash();
            model.changeState(model.LS[1]);
            model.getState().setOP(op);
        }
    }
}
