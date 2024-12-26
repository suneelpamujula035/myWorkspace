package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.selniumexpress.lc.api.Phone;

public class Phone_Number_Formatter implements Formatter<Phone> {

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		System.out.println("inside the parse method of the Phone_Number_Formatter");
		String[] phoneNumberArray = completePhoneNumber.split("-");
		Phone phone = new Phone();
		phone.setCountryCode(phoneNumberArray[0]);
		phone.setUserNumber(phoneNumberArray[1]);

//		Phone phone = new Phone();
//		// Split the String received from the user
//		String[] phoneNumberArray = completePhoneNumber.split("-");
//		// Weather the number consists of -
//		int index = completePhoneNumber.indexOf('-');
//		if (index == -1 || completePhoneNumber.startsWith("-")) {
//			// If the '-' is not found, then add 91 as the default country code
//			phone.setCountryCode("91");
//			if (completePhoneNumber.startsWith("-")) {
//				phone.setUserNumber(phoneNumberArray[1]);
//			} else {
//				phone.setUserNumber(phoneNumberArray[0]);
//			}
//		} else {
//			// Extract the country code and set it to the phone class countryCode property
//			phone.setCountryCode(phoneNumberArray[0]);
//			phone.setUserNumber(phoneNumberArray[1]);
//		}
		return phone;
	}

}
