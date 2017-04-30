package com.iit.sbellurvasudeva.cs586.data;

/**
 * This class is responsible for storing GasPump1 object that can be shared across components
 */
public class GasPump1Data extends DataStore {
	private String gasType;
	private float R_price;
	private float S_price;
	private float price;
	private int G;
	private float total;
	private String credit_card;

	// temporary variables
	private float a;
	private float b;

	// getters and setters
	public String getGasType() {
		return gasType;
	}

	public void setGasType(String gasType) {
		this.gasType = gasType;
	}

	public float getR_price() {
		return R_price;
	}

	public void setR_price(float r_price) {
		R_price = r_price;
	}

	public float getS_price() {
		return S_price;
	}

	public void setS_price(float s_price) {
		S_price = s_price;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getG() {
		return G;
	}

	public void setG(int g) {
		G = g;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}
}
