package com.jmkey.jmkey.exception;

public class JmKeyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JmKeyException(String mensaje) {
        super(mensaje);
    }
	
	public JmKeyException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
	
	public JmKeyException(Throwable causa) {
        super(causa);
    }

    protected JmKeyException(String mensaje, Throwable causa, boolean enableSuppression, boolean writableStackTrace) {
        super(mensaje, causa, enableSuppression, writableStackTrace);
    }
}
