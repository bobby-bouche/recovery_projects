package banking_app;


public class Driver {

	public static void main(String[] args) {
		
		try {
			
			Bank bank = new Bank();
			CheckingAccount acc1 = new CheckingAccount(1234, 500.00);
			SavingsAccount acc2  = new SavingsAccount(2234, 750.00);
			
			bank.addAccount(acc1);
			bank.addAccount(acc2);
			
			acc1.deposit(100.00);
			//acc2.withdraw(200.0);
			//acc2.withdraw(7750.00);
			//acc1.withdraw(900.00);
		
			String s1 = Integer.toString(acc1.getAccountNumber());
			String s2 = Integer.toString(acc2.getAccountNumber());
			bank.transfer(s1, s2, 150.0);
			
		}
		catch(InvalidAmountException e) {
			System.out.println(e);
		}
		catch(InsufficientFundsException e) {
			System.out.println(e);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e);
		} 
	
	}
	
	
}


