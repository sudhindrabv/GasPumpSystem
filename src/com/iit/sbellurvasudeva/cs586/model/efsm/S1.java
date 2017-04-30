package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 0 in the EFSM model and This function is used to invoke StoreCash() and  DisplayMenu() in OP 
 */
class S1 extends State {

    S1(MdaEFSM model) {
        super(model);
    }


    /*
     * This function is used for transition t state S2.
     *  credit: t=1
     *       Transition to State S2
     *       No meta-action called
     *  cash:   t=2
     *       Transition to State S3
     *       Call StoreCash() and DisplayMenu() meta-actions
     */
    @Override
    void payType(int t) {
        if ((t == 1) && (model.getState() == model.LS[2])) {
        	System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
        	OutputProcessor op = model.getState().getOP(); 
            model.changeState(model.LS[3]);
            model.getState().setOP(op);
        } else if ((t == 2) && (model.getState() == model.LS[2])) {
        	OutputProcessor op = model.getState().getOP(); 
        	model.getState().getOP().StoreCash();
            model.getState().getOP().DisplayMenu();
            model.changeState(model.LS[4]);
            model.getState().setOP(op);
        }
    }
}
