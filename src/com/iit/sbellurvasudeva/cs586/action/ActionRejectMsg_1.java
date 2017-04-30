package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * This meta-action is used for GasPump1 Credit card reject message
 */
public class ActionRejectMsg_1 extends ActionRejectMsg {

	/**
	 * This overridden method is used for displaying for Credit card reject message
	 */
	@Override
	public void rejectMsg() {
		System.out.println("CREDIT CARD REJECTED");
		System.out.println("Cancelling transaction ...");
	}

}
