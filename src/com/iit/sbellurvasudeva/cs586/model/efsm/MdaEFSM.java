package com.iit.sbellurvasudeva.cs586.model.efsm;

/**
 * This class is the VM class in the De-centralized State design pattern
 * This class acts like Context class and provides interface to the input processor
 * State classes are responsible for performing Actions and State transitions
 * This context class deals with the State objects directly.
 */
public class MdaEFSM {
	protected State s;
    protected State[] LS;

    /**
     * This constructor is responsible for defining states for LS and initially setting start state
     */
    public MdaEFSM() {
        LS = new State[8]; // list of states in EFSM
        
        //instantate each state in the list to point to specific state in the list. 
        LS[0] = new InitialState(this);
        LS[1] = new S0(this);
        LS[2] = new S1(this);
        LS[3] = new S2(this);
        LS[4] = new S3(this);
        LS[5] = new S4(this);
        LS[6] = new S5(this);
        LS[7] = new S6(this);
        s = LS[0]; // Initially in the S0 State
    }
    
    /*
        State operations
    */

    /**
     * This is used to get current state
     */
    public State getState() {
		return s;
	}

    /*
     * This function is used to change state, as per the de-centralized design pattern
     */
	public void changeState(State s) {
		this.s = s;
	}

	/*
	 * This function is sued to activate the state
	 */
	public void activate() {
        s.activate();
    }

	/*
	 * This function is used to invoke start event of the MDAEFSM
	 */
    public void start() {
        s.start();
    }
   	 
    /*
     * This function is used to invoke start event of the MDAEFSM. This function takes an argument the type of pay
        credit: t=1
        cash:   t=2
     */
    public void payType(int t) {
        s.payType(t);
    }

    /*
     * his function is used to invoke approved event of the MDAEFSM.
     */
    public void approved() {
        s.approved();
    }

    /*
     * This function is used to invoke reject event of the MDAEFSM.
     */
    public void reject() {
        s.reject();
    }

    /*
     * This function is used to invoke cancel event of the MDAEFSM.
     */
    public void cancel() {
        s.cancel();
    }

   /*
    * This function is used to invoke selectGas event of the MDAEFSM.
    * Regular:    g=1
    * Premium:    g=2
    * Super:      g=3
    */
    public void selectGas(int g) {
        s.selectGas(g);
    }

    /*
     * This function is used to invoke startPump event of the MDAEFSM
     */
    public void startPump() {
        s.startPump();
    }

    /*
     * This function is used to invoke pump event of the MDAEFSM
     */
    public void pump() {
        s.pump();
    }
    
	/*
	 * This function is used to invoke stopPump event of the MDAEFSM 
	 */
    public void stopPump() {
        s.stopPump();
    }

    /*
	 * This function is used to invoke receipt event of the MDAEFSM 
	 */
    public void receipt() {
        s.receipt();
    }

    /*
	 * This function is used to invoke noReceipt event of the MDAEFSM 
	 */
    public void noReceipt() {
        s.noReceipt();
    }

}
