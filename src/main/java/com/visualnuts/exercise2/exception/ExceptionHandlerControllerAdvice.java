package com.visualnuts.exercise2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionHandlerControllerAdvice {

	@ExceptionHandler(CountryServiceException.class)
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	public @ResponseBody String handleCountryNotInformed(CountryServiceException exception) {
		return exception.getMessage();
	}
}
