package com.iit.sbellurvasudeva.cs586.gaspump;

import com.iit.sbellurvasudeva.cs586.abstractfactory.AbstractFactory;
import com.iit.sbellurvasudeva.cs586.data.GasPump2Data;

/**
 * This class is the input processor in the MDAEFsm modal
 * This represents input processor of GasPump2 model.
 */
public class GasPump2 extends GasPump {

	public GasPump2(AbstractFactory af) {
		super(af);
	}

	 /**
     * This function prints all operations of GasPump2
     */
	@Override
	public void printOperations() {
		System.out.println(
				"*********************************************************************" +
						"\nSelect operation: " +
						"\n(0) Activate(int a, int b, int c)" +
						"\n(1) Start " +
						"(2) PayCash " +
						"\n(3) RegularGas " +
						"(4) SuperGas " +
						"(5) PremiumGas " +
						"(6) Cancel " +
						"\n(7) StartPump " +
						"(8) PumpLiter " +
						"(9) Stop " +
						"\n(p) PrintReceipt " +
						"(n) NoReceipt " +
						"(q) Quit the program " +
						"\n*********************************************************************"
				);		
	}

	/**
	 * This function calls model's activate function to check correctness and 
	 * then stores prices of Regular and Super gas types in DataStore. 
	 * @param a - price of Regular gas
	 * @param b - price of Super gas
	 * @param c - price of Premium gas
	 */
	public void Activate(int a, int b, int c) {
		if (a > 0 && b > 0 && c > 0) {
			GasPump2Data d = (GasPump2Data) data;
			d.setA(a);
			d.setB(b);
			d.setC(c);
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
     * This function invokes MDaEfsm payType event by pass 1 as argument indicating that it is Cash
     */
	public void PayCash(float cash) {
		if (cash > 0) {
			GasPump2Data d = (GasPump2Data) data;
			d.setTemp_cash(cash);
			model.payType(2);
		} else {
			System.out.println("Cash amount must be greater than $0");
		}
	}

	/**
     * This function calls the cancel() meta event of the MDA-Efsm model
     */
	public void Cancel() {
		model.cancel();
	}

	/**
     * This function calls the selectGas() meta event of the MDA-Efsm model
     * It passes paramter indicating that it is regular gas type
     */
	public void Regular() {
		model.selectGas(1);
	}

	/**
     * This function calls the selectGas() meta event of the MDA-Efsm model
     * It passes parameter indicating that it is super gas type
     */
	public void Super() {
		model.selectGas(2);
	}

	/**
     * This function calls the selectGas() meta event of the MDA-Efsm model
     * It passes parameter indicating that it is premium gas type
     */
	public void Premium() {
		model.selectGas(3);
	}

	/**
     * This function calls the startPump() meta event of the MDA-Efsm model
     */
	public void StartPump() {
		model.startPump();
	}

	/**
     * This function is used to Pump gas in Liter
     */
	public void PumpLiter() {
		GasPump2Data d = (GasPump2Data) data;
		if (d.getCash() < d.getPrice() * (d.getL() + 1)) {
			System.out.println("NOT ENOUGH CASH");
			model.stopPump();
		} else {
			model.pump();
		}
	}

	/**
     * This function calls the stopPump() meta event of the MDA-Efsm model
     */
	public void Stop() {
		model.stopPump();
	}

	/**
     * This function calls the receipt() meta event of the MDA-Efsm model
     */
	public void Receipt() {
		model.receipt();
	}

	/**
     * This function calls the noReceipt() meta event of the MDA-Efsm model
     */
	public void NoReceipt() {
		model.noReceipt();
	}
}
