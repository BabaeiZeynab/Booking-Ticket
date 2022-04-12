package com.Booking.Train;

public class BankAccount {
	
	private int accountNumber;
	private int accountBalance;
	

	
	public BankAccount(int accountNumber, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	
	public void showBalance() {
		System.out.println("Account Balance = " + accountBalance);
	}
	
	public void deposite(int amount) {
		accountBalance+= amount;
	}
	
	public void withdraw(int amount) {
		accountBalance-= amount;
	}
	
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	} 
	
	

}
