package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 4 in the EFSM model. 
 */
class S4 extends State {

    S4(MdaEFSM model) {
        super(model);
    }

    /*
     * Function used for transition from state S4 to S5
     * Metaa-ction used : SetInitialValues,ReadyMsg
     */
    void startPump() {
        if (model.getState() == model.LS[5]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().SetInitialValues();
            model.getState().getOP().ReadyMsg();
            model.changeState(model.LS[6]);
            model.getState().setOP(op);
        }
    }
}
