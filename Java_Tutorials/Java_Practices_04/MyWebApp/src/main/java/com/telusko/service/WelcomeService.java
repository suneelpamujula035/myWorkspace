package com.telusko.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {

	public String retrieveWelcomeMessage() {
		System.out.println("retrieveWelcomeMessage method>>>>>>>>>");
		return "Good Morning Suneel Pamujula.. Java";
	}
}
