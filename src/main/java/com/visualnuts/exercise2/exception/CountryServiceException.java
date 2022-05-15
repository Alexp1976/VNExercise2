package com.visualnuts.exercise2.exception;

public class CountryServiceException extends Exception {

	private static final long serialVersionUID = -972940173671301458L;

	public CountryServiceException() {
	}
	
	public CountryServiceException(String message) {
		super(message);
	}
}
