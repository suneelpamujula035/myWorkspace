package com.seleniumexpress.lc.converters;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.test.api.CreditCard;

public class CreditConverterObjectToString implements Converter<CreditCard, String> {

	@Override
	public String convert(CreditCard source) {

		
		return "sample "+source.getFirstFourDigits();
	}

	
}
