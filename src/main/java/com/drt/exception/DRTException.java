/**
 * 
 */
package com.drt.exception;

/**
 * @author bharatkosti
 *
 */
public class DRTException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3997971663128468167L;

	/**
	 * 
	 */
	public DRTException() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public DRTException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public DRTException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public DRTException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public DRTException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
	

}
