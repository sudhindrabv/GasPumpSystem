package com.iit.sbellurvasudeva.cs586.model.efsm;

import com.iit.sbellurvasudeva.cs586.model.outputprocessor.OutputProcessor;

/**
 * This class is the abstract State superclass and this class together with classes 
 * InititialState, S0,S1,S2,S3,S4,S5,S6 ,MdaEFSM complete the State Design Pattern
 * following De-centralized State Design pattern. 
 * 
 * In this class all the methods implement by default invalidOperation() method.
 * Each state in the sub class inherits these methods, But the child classes override this 
 * default behavior to provide state transitions,if the current state is a valid state.
 *
 */	

public abstract class State {
	MdaEFSM model;
	OutputProcessor op;
	
	public State(MdaEFSM model) {
		this.model = model;
	}

	/*
	 * Getters and Setters
	 */

	public OutputProcessor getOP() {
		return op;
	}

	public void setOP(OutputProcessor op) {
		this.op = op;
	}

	/*
	 * State Operations
	 * This method gives default message operation not supported if this not overridden by the child classes.
	 * For operation not to enter into these classes, the state entered should be valid state.
	 */
	void activate() {
		invalidOperation();
	}

	void start() {
		invalidOperation();
	}

	/*
	 * credit: t=1 cash: t=2
	 */
	void payType(int t) {
		invalidOperation();
	}

	void approved() {
		invalidOperation();
	}

	void reject() {
		invalidOperation();
	}

	/*
	 * Regular: g=1 Super: g=2 Premium: g=3
	 */
	void selectGas(int g) {
		invalidOperation();
	}

	void cancel() {
		invalidOperation();
	}

	void startPump() {
		invalidOperation();
	}

	void pump() {
		invalidOperation();
	}

	void stopPump() {
		invalidOperation();
	}

	void receipt() {
		invalidOperation();
	}

	void noReceipt() {
		invalidOperation();
	}

	/*
	 * This function is used to display message "Operation is invalid in this state" if state is invalid
	 */
	private void invalidOperation() {
		System.out.println("Operation is invalid in this state");
	}
}
