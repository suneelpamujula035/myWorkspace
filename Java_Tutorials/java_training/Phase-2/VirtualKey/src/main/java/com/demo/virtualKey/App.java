package com.demo.virtualKey;

import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		KeyBoard k = new KeyBoard("Suneel");
		try {
			k.showMenu();
		} catch (Exception e) {
			System.out.println("Please enter numbers only.... ");
		}
	}
}