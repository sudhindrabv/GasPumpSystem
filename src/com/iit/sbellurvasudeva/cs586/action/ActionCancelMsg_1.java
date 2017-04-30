package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * GasPump1 CancelMsg action responsible for printing a cancellation message
 */
public class ActionCancelMsg_1 extends ActionCancelMsg {

	/*
	 * Display Cancellation message
	 */
	@Override
	public void cancelMsg() {
		System.out.println("Cancelling transaction ... ");		
	}

}
