package com.product.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<Object> handleProductNotFoundDException(ProductNotFoundException pnfe)
	{
		return new ResponseEntity<Object>(new ApiException(pnfe.getMessage(), HttpStatus.NOT_FOUND), HttpStatus.NOT_FOUND);
	}
}
