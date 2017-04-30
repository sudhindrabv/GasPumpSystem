package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents state 6 in the EFSM model. 
 */
class S6 extends State {

    S6(MdaEFSM model) {
        super(model);
    }

    /*
     * Function used for transition from generating receipt.
     * Meta-action used: PrintReceipt, ReturnCash
     */
    @Override
    void receipt() {
        if (model.getState() == model.LS[7]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().PrintReceipt();
            model.getState().getOP().ReturnCash();
            model.changeState(model.LS[1]);
            model.getState().setOP(op);
        }
    }

    /*
     * Function used for returning cash when payment chosen is cash
     * Meta-action used: ReturnCash
     */
    @Override
    void noReceipt() {
        if (model.getState() == model.LS[7]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().ReturnCash();
            model.changeState(model.LS[1]);
            model.getState().setOP(op);
        }
    }
}
