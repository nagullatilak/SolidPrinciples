package com.solid.srp;

public class AgeVerification {
	public static boolean verify(Bank bank) {
		if(bank.getAge() > 12) {
			return true;
		}
		else {
			return false;
		}
	}

}
