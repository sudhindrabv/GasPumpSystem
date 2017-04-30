package com.iit.sbellurvasudeva.cs586.action;

/**
 * This class is part of the design used to incorporate Strategy Design Pattern. 
 * 
 * For each GasPump there may be different Cancel Message. This abstract class group all those in one superclass strategy.
 * To Display different cancel message for Each GasPump , we can have one class mapped to one GasPump object.
 * each new GasPump added can have a new object of ActionCancelMsg, so that message can be customized for newly added GasPump    
 */
public abstract class ActionCancelMsg {
	 public abstract void cancelMsg();
}
