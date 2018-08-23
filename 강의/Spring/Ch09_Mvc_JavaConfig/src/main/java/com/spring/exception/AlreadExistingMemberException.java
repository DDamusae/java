package com.spring.exception;

public class AlreadExistingMemberException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public AlreadExistingMemberException(String message) {
		super(message);
	}
}
