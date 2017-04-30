package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for stopping message for GasPUmp2
 */
public class ActionStopMsg_2 extends ActionStopMsg {
	
	/*
	 * This function is sued for displaying stopping pump message for GasPump2
	 */
	@Override
    public void stopMsg() {
        System.out.println("STOPPING PUMP ...");
    }
}
