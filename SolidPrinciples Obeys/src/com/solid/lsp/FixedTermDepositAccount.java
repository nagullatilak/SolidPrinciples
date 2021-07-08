package com.solid.lsp;

public class FixedTermDepositAccount implements Account {
     long amount;
	@Override
	public void deposit(long amount) {
		// TODO Auto-generated method stub
		//logic
		this.amount=amount;
		
		System.out.println("Enter the amount how much you want to deposit");
	}
     
}
