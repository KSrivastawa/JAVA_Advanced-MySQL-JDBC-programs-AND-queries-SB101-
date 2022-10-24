package com.Q3_User_Defined_checked_Exception;

public class Account {

	String accountNumber; 
	double balance;
	
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}

	void deposit(double amount) {
		
		 balance = balance + amount;
		 System.out.println("Balanced Amount is: "+ balance);
		
	}
	
	double withdraw(double amount) throws InsufficientFundsException {
		
		if(amount < this.balance) {
			
			return this.balance = this.balance - amount;
			 
		}
		else {
			
			InsufficientFundsException ife = new InsufficientFundsException("Opps! You have Insufficient fund...");
			throw ife;
		}
		
	}

	
	
}
