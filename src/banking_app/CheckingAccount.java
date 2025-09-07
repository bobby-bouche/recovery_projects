package banking_app;

public class CheckingAccount extends Account {

	private double interest_rate    = 0;
	private double overdraft_limit  = -300.0;
	
	public CheckingAccount(int accNum, double balance) {
		super(accNum, balance);
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void calculateInterest() {
		double interest;
		interest = getBalance() * interest_rate;
		System.out.println("$" + interest);
	}
	
}
