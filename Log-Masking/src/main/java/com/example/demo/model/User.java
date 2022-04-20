package com.example.demo.model;

public class User {
	private String name;
	private String nric;
	private int creditCard;

	public User(String name, String nric, int creditCard) {
		this.name = name;
		this.nric = nric;
		this.creditCard = creditCard;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNric() {
		return nric;
	}

	public void setNric(String nric) {
		this.nric = nric;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
}

	
