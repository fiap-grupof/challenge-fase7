package br.com.fiap.grupof.bayer.exceptions;

/**
 * Exceção de quando há um problema na conexão com o banco de dados
 */
public class ConnectionException extends Exception {

	private static final long serialVersionUID = 1L;

	public ConnectionException() {
	}

	public ConnectionException(String message) {
		super(message);
	}

	public ConnectionException(Throwable cause) {
		super(cause);
	}

	public ConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public ConnectionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}