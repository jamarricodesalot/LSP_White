package org.howard.edu.lsp.assignment5.implementation; //source code package - includes exception handling 
/**
 * Custom IntegerSetException class inherits from the Exception class. 
 * Throws custom IntegerSetException error if set length is less than or equal to zero.
 */
public class IntegerSetException extends Exception {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

/**
* Method throws IntegerSetException when called from largest() and smallest() methods.
* @param ExceptionMsg, String defines the error message which will be printed
* by the largest() and smallest() methods.
*/
public IntegerSetException(String ExceptionMsg) { 
super(ExceptionMsg); //Exception Message is defined under largest() and smallest() methods
}
}