package com.epam.exception;

public class UrlFormatException extends Exception {

	
	private static final long serialVersionUID = 1L;
	
	 public UrlFormatException() {
	 }

	    public UrlFormatException(String message) {
	        super(message);
	        
	    }

	    public UrlFormatException(Throwable cause) {
	        super(cause);
	       
	    }

	    public UrlFormatException(String message, Throwable cause) {
	        super(message, cause);
	        
	    }

}
