package banking_app;

public class InvalidAmountException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	
	public InvalidAmountException(String message) {
		super(message);
	}
	
	public InvalidAmountException(Throwable cause) {
		super(cause);
	}
	
	public InvalidAmountException(String message, Throwable cause) {
		super(message, cause);
	}

}
