package com.lifemichael.javaee.model.exceptions;

public class ContactException extends Exception {

	
private static final long serialVersionUID = 1L;
	

	public ContactException(String e) {
		super(e);
	}
	
	public ContactException(String e, Throwable throwMsg) {
		super(e,throwMsg);
	}
}
