import com.solid.dip.Atm;
import com.solid.isp.AccountImpl;
import com.solid.lsp.Account;
import com.solid.lsp.FixedTermDepositAccount;
import com.solid.ocp.AxisBank;
import com.solid.ocp.RateOfInterest;
import com.solid.srp.Bank;
import com.solid.srp.CreateAccount;
public class BankMain {

	public static void main(String[] args) {
		System.out.println("======= This is SRP ========");
		Bank bank = new Bank();
		bank.setName("Sai");
		bank.setAge(16);
		bank.setAddress("Gudivada");
		CreateAccount ac =new CreateAccount();
		  ac.account(bank);
		System.out.println("======= This is OCP ========");
		RateOfInterest ri = new RateOfInterest();
		System.out.println(ri.getInterestAxis(new AxisBank()));
		System.out.println("======== This is LSP =========");
	    Account ac1 = new FixedTermDepositAccount(); 
	    ac1.withDraw(23000);
	    ac1.deposit(35000);
	    System.out.println("========= This is ISP ======");
	    AccountImpl am= new AccountImpl();
	    am.uploadDocuments();
	    am.fillAForm();
	    System.out.println("========= This is DIP ========");
	    Atm at = new Atm();
	    
	}
	

}
