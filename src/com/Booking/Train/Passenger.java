package com.Booking.Train;

public class Passenger {
	
	private int passengerID;
	private String nameString;
	private int passengerAge; 
	
	private BankAccount bankAccount;

	
	
	public Passenger(int passengerID, String nameString, int passengerAge, BankAccount bankAccount) {
		super();
		this.passengerID = passengerID;
		this.nameString = nameString;
		this.passengerAge = passengerAge;
		this.bankAccount = bankAccount;
	}

	public int getPassengerID() {
		return passengerID;
	}

	public void setPassengerID(int passengerID) {
		this.passengerID = passengerID;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
	
	
	

}
