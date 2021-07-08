package com.solid.lsp;

public class CurrentAccount extends WithDrawableAccount{
	long amount;
	@Override
	public void deposit(long amount) {
		//logic
		this.amount = amount;
		System.out.println("Deposit to current account");

	}
	@Override
	public void withdraw(long amount) {
		//logic
		this.amount = amount;
		System.out.println("WithDraw from CurrentAccount");
	}
	

}
