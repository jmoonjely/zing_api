package au.com.zing.exception;

public class BusinessProcessingException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BusinessProcessingException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BusinessProcessingException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public BusinessProcessingException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public BusinessProcessingException(String message) {
		super(message);
		 new Throwable(message);
	}

	public BusinessProcessingException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}
