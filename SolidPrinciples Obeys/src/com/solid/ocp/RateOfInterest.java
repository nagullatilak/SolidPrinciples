package com.solid.ocp;

public class RateOfInterest {

	public double rateOfInerest(BankType bankType) {
		System.out.println("This is ocp principle");
		return bankType.rateOfInterest();
	}

}
