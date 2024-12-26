package com.example.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ImageNotFoundException.class)
	public ResponseEntity<Object> handleImageNotFound(ImageNotFoundException infe)
	{
		HttpStatus notFound = HttpStatus.NOT_FOUND;
		ApiException apiException = new ApiException(infe.getMessage(), notFound, ZonedDateTime.now(ZoneId.of("Asia/Kolkata")));
		return new ResponseEntity<Object>(apiException, notFound);
	}
}
