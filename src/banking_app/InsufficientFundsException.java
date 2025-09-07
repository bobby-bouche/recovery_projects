package banking_app;

public class InsufficientFundsException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public InsufficientFundsException(String message) {
		super(message);
	}
	
	public InsufficientFundsException(Throwable cause) {
		super(cause);
	}
	
	public InsufficientFundsException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
