package com.solid.dip;

public class TypeOfAtm {
	private ATM atm;
	public TypeOfAtm(ATM atm) {
		this.atm = atm;
		atm.findAtmNearByYou();
	}

}
