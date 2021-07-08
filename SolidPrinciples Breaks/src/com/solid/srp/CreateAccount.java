package com.solid.srp;

public class CreateAccount {
	public void account(Bank bank) {
		if(verify(bank)) {
			System.out.println("This is Single Responsibility Principle");
			System.out.println("Hi"  +bank.getName()+" your account is created");
		}
		else {
			System.out.println("Hi "+bank.getName()+"Age must be greater than 18");
		}
	}


	public static  boolean verify(Bank bank) {
		if(bank.getAge()>=18) {
			return true;
		}
		else
			return false;
	}
}