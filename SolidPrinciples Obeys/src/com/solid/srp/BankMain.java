package com.solid.srp;

import com.solid.dip.HDFC;
import com.solid.dip.TypeOfAtm;
import com.solid.isp.OnlineCreateImpl;
import com.solid.lsp.SavingsAccount;
import com.solid.lsp.WithDrawableAccount;
import com.solid.ocp.RateOfInterest;
import com.solid.ocp.SBI;

public class BankMain {

	public static void main(String[] args) {
		System.out.println("======= This is SRP ========");
		Bank bank = new Bank();
		bank.setName("Tilak");
		bank.setAge(23);
		bank.setAddress("Gudivada");
		CreateAccount ac =new CreateAccount();
		  ac.account(bank);
		  System.out.println("======== This is OCP =======");
		  RateOfInterest ROI = new RateOfInterest();
		 System.out.println("Interset "+ROI.rateOfInerest(new SBI()));
		 System.out.println("======== This is LSP=======");
		 WithDrawableAccount wa = new SavingsAccount();
		 wa.deposit(47000);
		 System.out .println("======== This is ISP =======");
		 OnlineCreateImpl oc = new OnlineCreateImpl();
		 oc.upLoadDocuments();
		 oc.Kyc();
		 System.out.println("======= This is DIP =======");
		 TypeOfAtm trns = new TypeOfAtm(new HDFC());
		 

	}

}
