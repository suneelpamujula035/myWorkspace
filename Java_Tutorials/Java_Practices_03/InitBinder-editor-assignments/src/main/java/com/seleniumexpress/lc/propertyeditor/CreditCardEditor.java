package com.seleniumexpress.lc.propertyeditor;

import java.beans.PropertyEditorSupport;

import com.seleniumexpress.test.api.CreditCard;

public class CreditCardEditor extends PropertyEditorSupport {

	@Override
	public String getAsText() {
		CreditCard creditCard = (CreditCard) getValue();
		return "sample : " + creditCard;
	}

	@Override
	public void setAsText(String text) throws IllegalArgumentException {

		// splitting the credit card
		String[] digitsArray = text.split("-");

		// Setting credit card values
		CreditCard creditCard = new CreditCard();

		creditCard.setFirstFourDigits(Integer.valueOf(digitsArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(digitsArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(digitsArray[2]));
		creditCard.setLastFourDigits(Integer.valueOf(digitsArray[3]));

		// returning credit card objects
		setValue(creditCard);
	}
}
