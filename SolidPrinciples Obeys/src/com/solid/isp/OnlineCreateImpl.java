package com.solid.isp;

public class OnlineCreateImpl implements OnlineCreate {

	@Override
	public void upLoadDocuments() {
		System.out.println("Interface Segregation...");
		System.out.println("Documents Uploaded....");
	}
	@Override
	public void Kyc() {
	System.out.println("Video call KYC is done....");

	}

}
