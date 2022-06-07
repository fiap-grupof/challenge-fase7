package br.com.fiap.grupof.bayer.exceptions;

/**
 * Exceção de quando uma conta existe mas está marcada como inativa no sistema
 */
public class AccountNotActiveException extends Exception {

	private static final long serialVersionUID = 1L;

	public AccountNotActiveException() {
	}

	public AccountNotActiveException(String message) {
		super(message);
	}

	public AccountNotActiveException(Throwable cause) {
		super(cause);
	}

	public AccountNotActiveException(String message, Throwable cause) {
		super(message, cause);
	}

	public AccountNotActiveException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
