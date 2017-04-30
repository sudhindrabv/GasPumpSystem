package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * GasPump2 ActionCancelMsg_2 action responsible for printing a cancellation message 
 */
public class ActionCancelMsg_2 extends ActionCancelMsg {

	/*
	 * Display cancellation message
	 */
	@Override
	public void cancelMsg() {
		System.out.println("Cancelling transaction ... ");		
	}

}
