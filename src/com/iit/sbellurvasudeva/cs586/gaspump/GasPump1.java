package com.iit.sbellurvasudeva.cs586.gaspump;

import com.iit.sbellurvasudeva.cs586.abstractfactory.AbstractFactory;
import com.iit.sbellurvasudeva.cs586.data.GasPump1Data;

/**
 * This class is the input processor in the MDAEFsm modal
 */
public class GasPump1 extends GasPump{
	
	public GasPump1(AbstractFactory af) {
		super(af);
	}

	/**
	 * This function calls model's activate function to check correctness and 
	 * then stores prices of Regular and Super gas types in DataStore. 
	 * @param a - price of Regular gas
	 * @param b - price of Super gas
	 */
    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            GasPump1Data d = (GasPump1Data) data;
            d.setA(a);
            d.setB(b);
            model.activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    /**
     * This function calls MdaEfsm start event
     */
    public void Start() {
        model.start();
    }

    /**
     * This function invokes MDaEfsm payType event by pass 1 as argument indicating that it is credit
     */
    public void PayCredit() {
        model.payType(1);
    }

    /**
     * This function calls the approve() meta-event of the MDa-EFSM model
     */
    public void Approved() {
        model.approved();
    }

    /**
     * This function calls the reject() metaevent of the MDA-Efsm model
     */
    public void Reject() {
        model.reject();
    }

    /**
     * This function calls the cancel() metaevent of the MDA-Efsm model
     */
    public void Cancel() {
        model.cancel();
    }

    /**
     * This function calls the selectGas() metaevent of the MDA-Efsm model
     * It passes paramter indicating that it is regular gas type
     */
    public void Regular() {
        model.selectGas(1);
    }

    /**
     * This function calls the selectGas() metaevent of the MDA-Efsm model
     * It passes paramter indicating that it is super gas type
     */
    public void Super() {
        model.selectGas(2);
    }

    /**
     * This function calls the startPump() metaevent of the MDA-Efsm model
     */
    public void StartPump() {
        model.startPump();
    }

    /**
     * This function calls the cancel() metaevent of the MDA-Efsm model
     */
    public void PumpGallon() {
        model.pump();
    }

    /**
     * This function calls the stopPump() metaevent of the MDA-Efsm model
     * This internally calls receipt() meta event of MDAEfsm 
     */
    public void StopPump() {
        model.stopPump();
        model.receipt();
    }

    /**
     * This function prints all operations of GasPump1 
     */
	@Override
	public void printOperations() {
		System.out.println(
                "*********************************************************************" +
                "\nSelect operation: " +
                "\n(0) Activate(float a, float b) " +
                "\n(1) Start " +
                "(2) PayCredit " +
                "(3) Approve " +
                "(4) Reject" +
                "\n(5) RegularGas " +
                "(6) SuperGas " +
                "(7) Cancel " +
                "\n(8) StartPump " +
                "(9) PumpGallon " +
                "(x) StopPump " +
                "{q} Quit the program " +
                "\n*********************************************************************"
		);
	}
	
}
