package com.project.exceptions;

public class IvalidTransactionReferenceException extends RuntimeException{
private static final long serialVersionUID = 1L;
	
	public IvalidTransactionReferenceException(String errorMessage) {
		super(errorMessage);
	}
}
