package com.solid.dip;

public class HDFC implements ATM {
	@Override
	public String findAtmNearByYou() {
		System.out.println("This is HDFC");
		return "HDFC";

	}

}
