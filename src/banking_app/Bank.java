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
}
