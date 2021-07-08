package com.solid.isp;
interface Account{
	public abstract  void fillAForm();
	public abstract void submitDocuments();
	public abstract void uploadDocuments();
	public abstract void VideoKyc();
}
public class AccountImpl implements Account {

	@Override
	public void fillAForm() {
		System.out.println("Applicable for both online and Inperson creators");
		
	}

	@Override
	public void submitDocuments() {
		//not applicabe for online creation
		System.out.println("Not applicable for online Creators");
		
	}

	@Override
	public void uploadDocuments() {
		//not applicabel for Inperson
		System.out.println("Not applicabel for Inperson account creators");
		
	}

	@Override
	public void VideoKyc() {
		System.out.println("Not Applicable for Inperson creators");
		
	}

}
