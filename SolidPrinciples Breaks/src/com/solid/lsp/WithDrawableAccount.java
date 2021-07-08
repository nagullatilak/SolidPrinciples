package com.solid.lsp;

public class WithDrawableAccount extends Account {
      long amount;
	@Override
	public void deposit(long amount) {
		this.amount = amount;
		System.out.println("Deposit withdrawable Account");

	}
	public void withdraw(long amount) {
		this.amount = amount;
		System.out.println("Withdraw from withdrawable account");
	}

}
