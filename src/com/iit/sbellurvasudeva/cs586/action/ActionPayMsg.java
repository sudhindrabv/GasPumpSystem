package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern.
 * 
 * This groups all the ActionPayMsg under one abstract superclass.
 * this Meta-action is used to display -payment option 
 */

public abstract class ActionPayMsg {

	public ActionPayMsg() {
	}

	public abstract void payMsg();
}
