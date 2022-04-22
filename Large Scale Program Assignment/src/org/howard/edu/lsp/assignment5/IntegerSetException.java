package org.howard.edu.lsp.assignment5;

public class IntegerSetException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public IntegerSetException(String ExceptionMsg) {
		super(ExceptionMsg); // Exception message is defined in the largest and smallest functions
	}

}
