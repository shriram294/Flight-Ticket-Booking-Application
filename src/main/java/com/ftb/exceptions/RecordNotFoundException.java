package com.ftb.exceptions;

public class RecordNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String s) {
		super(s);
	}
}
