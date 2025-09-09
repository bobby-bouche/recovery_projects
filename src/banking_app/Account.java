package banking_app;

public abstract class Account implements Transactable{

	// account fields
	private int accountNumber;
	private double balance;
	
	
	
	// constructor
	public Account(int accNum, double balance) {
		this.accountNumber = accNum;
		this.balance = balance;
	}


	
	// getters and setters
	public int getAccountNumber() {
		return accountNumber;
	}


	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	

	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
	// methods
	abstract double calculateInterest();
	
	
	@Override
	public void deposit(double amount) {
		double newBalance = getBalance() + amount;
		setBalance(newBalance);
		System.out.println("Deposit successful.\nNew balance: $" + newBalance);	
	}
	
	public void getInfo() {
		System.out.println("Account no: " + accountNumber + "\n" + "Balance: " + balance);
	}

}
