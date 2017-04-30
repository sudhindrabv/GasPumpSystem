package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * GasPump2 ActionGasPumpedMsgaction responsible for displaying gas pumped message *
 */
public class ActionPayMsg_2 extends ActionPayMsg {

	/**
	 * This overridden function used to show payment option message
	 */
	@Override
	public void payMsg() {
		System.out.println("Thank you for choosing GasPump-2");
        System.out.println("Please choose Cash Payment");		
	}

}
