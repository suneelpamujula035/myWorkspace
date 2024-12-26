package com.weatherapi.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(CityNotFoundException.class)
	public ResponseEntity<Object> handleCityNotFound(CityNotFoundException infe)
	{
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ApiException apiException = new ApiException(infe.getMessage(), notFound, ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<Object>(apiException, notFound);
	}
}
