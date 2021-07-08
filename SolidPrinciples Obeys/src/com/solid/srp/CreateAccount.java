package com.solid.srp;

public class CreateAccount {
	public void account(Bank bank) {
		if(AgeVerification.verify(bank)) {
			System.out.println("This is Single Responsibility Principle");
			System.out.println("Hi  "  +bank.getName()+  " your account is created");
		}
		else {
			System.out.println("Age must be greater than 12");
		}
	}

}
