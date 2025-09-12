package banking_app;

public class InvalidAccountException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public InvalidAccountException(String message) {
		super(message);
	}
	
	public InvalidAccountException(Throwable cause) {
		super(cause);
	}
	
	public InvalidAccountException(String message, Throwable cause) {
		super(message, cause);
	}

}
