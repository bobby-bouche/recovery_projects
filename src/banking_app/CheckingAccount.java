package banking_app;

public class CheckingAccount extends Account {

	private double interest_rate    = 0.0;
	private double overdraft_limit  = -300.0;
	
	public CheckingAccount(int accNum, double balance) {
		super(accNum, balance);
	}


	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(getBalance() - amount > overdraft_limit) {
			double newBalance = getBalance() - amount;
			setBalance(newBalance);
			System.out.println("Withdaw successfull.\nNew balance: $" + newBalance);
		}
		else {
			throw new InsufficientFundsException("Insufficient funds: " + this.getAccountNumber());
		}
	}

	@Override
	double calculateInterest() {
		double interest;
		interest = getBalance() * interest_rate;
		return interest;
	}
	
}
