package banking_app;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	// Bank fields
	private static List<Account> accounts;
	
	
	
	// constructor
	public Bank() {
		accounts = new ArrayList<>();
	}


	// getter
	public static List<Account> getAccounts() {
		return accounts;
	}
	
	
	public void addAccount(Account a) {
		for(Account acc : accounts) {
			if(acc.getAccountNumber() == a.getAccountNumber()) {
				throw new IllegalArgumentException("Bank already contains this account");
			}
			accounts.add(a);
		}
	}
	
	
	public void transfer(String fromAcc, String toAcc, double amount){
		
	}
	
	
	public void applyInterest() {
		
	}
}
