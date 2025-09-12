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
	public List<Account> getAccounts() {
		return accounts;
	}
	
	
	
	public void addAccount(Account a) {
		if(accounts.contains(a)) {
			throw new IllegalArgumentException("Bank already contains this account");
		}
		accounts.add(a);
	}
	
	
	
	private Account getAccount(int accNum) {
		Account account = null;
		for(Account a : accounts) {
			if(a.getAccountNumber() == accNum) {
				account = a;
			}
		}
		return account;
	}
	
	
	
	private boolean validateAccount(int accNum) {
		boolean validAccount = false;
		for(Account a : accounts) {
			if(a.getAccountNumber() == accNum) {
				validAccount = true;
			}
		}
		return validAccount;
	}
	
	
	
	public void transfer(String fromAcc, String toAcc, double amount) throws InsufficientFundsException{
		int fromAccNum = 0; 
		int toAccNum   = 0;
		try {
			fromAccNum = Integer.parseInt(fromAcc);
			toAccNum   = Integer.parseInt(toAcc);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
		}
		if(amount <= 0) {
			throw new InvalidAmountException("Invalid amount: " + amount);
		}	
		if(validateAccount(fromAccNum) == false) {
			throw new IllegalArgumentException("Invalid account number: " + fromAccNum);
		}
		if(validateAccount(toAccNum) == false) {
			throw new IllegalArgumentException("Invalid account number: " + toAccNum);
		}
		
		Account senderAccount   = getAccount(fromAccNum);
		Account recieverAccount = getAccount(toAccNum);
		senderAccount.withdraw(amount);
		recieverAccount.deposit(amount);
		
		System.out.println("transfer successful. \nNew balance: " + senderAccount.getBalance() + "\n");
	}

	

	public void applyInterest() {
		for(Account a : accounts) {
			double interest = a.calculateInterest();
			a.getInfo();
			System.out.println("Calculated Interest: " + interest + "\n");
			System.out.println("Account total: $" + (a.getBalance() + interest) + "\n");
		}
	}
	
	
}
