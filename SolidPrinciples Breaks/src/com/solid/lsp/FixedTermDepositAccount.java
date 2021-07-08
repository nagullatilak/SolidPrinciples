package com.solid.lsp;

public class FixedTermDepositAccount extends Account {
      long amount;
	@Override
	public void deposit(long amount) {
		this.amount=amount;
		// TODO Auto-generated method stub
		System.out.println("Enter the amount how much you want to deposit");
	}
	@Override
	public void withDraw(long amount) {
		this.amount = amount;
		System.out.println("You cant withdraw the amount because this is FixedTerm Deposit account");
	}
     
}
