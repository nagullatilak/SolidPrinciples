package com.solid.lsp;

public class SavingsAccount extends WithDrawableAccount{
	long amount;
	@Override
	public void deposit(long amount) {
		this.amount = amount;
		System.out.println("Deposit to  Savings Account");

	}
	@Override
	public void withdraw(long amount) {
		this.amount = amount;
		System.out.println("Withdraw from savings Account");
	}

}
