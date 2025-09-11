package banking_app;

public class SavingsAccount extends Account {
	
	private double interest_rate = 0.05;

	

	public SavingsAccount(int accNum, double balance) {
		super(accNum, balance);
	}

	

	@Override
	public void withdraw(double amount) throws InsufficientFundsException {
		if(getBalance() - amount > 0) {
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
		return(interest);
	}
	
}
