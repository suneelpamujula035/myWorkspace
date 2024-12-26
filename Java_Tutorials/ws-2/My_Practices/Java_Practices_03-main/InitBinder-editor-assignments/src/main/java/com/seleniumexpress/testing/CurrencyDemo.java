package com.seleniumexpress.testing;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {

	public static void main(String[] args) {

		// JPY,AUD,INR,USD

//	Currency currency = Currency.getInstance("USD");
		Currency currency = Currency.getInstance(Locale.UK);
		System.out.println(currency.getSymbol());
		System.out.println(currency.getDisplayName());
		//System.out.println(currency.getCurrencyCode());

	}

}
