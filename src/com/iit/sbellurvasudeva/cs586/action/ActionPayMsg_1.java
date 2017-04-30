package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * GasPump1 ActionPayMsg action responsible for displaying payment option message
 */
public class ActionPayMsg_1 extends ActionPayMsg {

	/**
	 * This overridden function used to show payment option message
	 */
	@Override
	public void payMsg() {
		System.out.println("Thank you for choosing GasPump-1");
        System.out.println("Please choose Card Payment");		
	}

}
