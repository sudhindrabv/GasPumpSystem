package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class represents one of the ConcreteState objects in Decentralized version of State Design Pattern
 * This class represents state 5 in the EFSM model. 
 */
class S5 extends State {

    S5(MdaEFSM model) {
        super(model);
    }

    /*
     * Function used for to remain in the same state.
     * Meta-action used : PumpGasUnit, GasPumpedMsg
     */
    @Override
    void pump() {
        if (model.getState() == model.LS[6]) {
            // stay in the same state
            model.getState().getOP().PumpGasUnit();
            model.getState().getOP().GasPumpedMsg();
        }
    }

    /*
     * Function used for transition from state S5 to S6
     * Meta-action used : StopMsg
     */
    @Override
    void stopPump() {
        if (model.getState() == model.LS[6]) {
        	OutputProcessor op = model.getState().getOP(); 
            model.getState().getOP().StopMsg();
            model.changeState(model.LS[7]);
            model.getState().setOP(op);
        }
    }
}
