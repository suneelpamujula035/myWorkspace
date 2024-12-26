package com.example.exception;

public class ImageNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ImageNotFoundException()
	{
		super();
	}
	public ImageNotFoundException(String message)
	{
		super(message);
	}
}
