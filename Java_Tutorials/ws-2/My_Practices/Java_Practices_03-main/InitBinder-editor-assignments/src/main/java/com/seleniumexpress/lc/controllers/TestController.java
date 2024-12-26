package com.seleniumexpress.lc.controllers;

import java.math.BigDecimal;
import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.formatter.CreditCardFormatter;
import com.seleniumexpress.lc.propertyeditor.CreditCardEditor;
import com.seleniumexpress.lc.propertyeditor.MyCurrencyEditor;
import com.seleniumexpress.test.api.BillDTO;
import com.seleniumexpress.test.api.CreditCard;

@Controller
public class TestController {

	@RequestMapping("/")
	public String showHomepage(@ModelAttribute("billDTO") BillDTO billDTO) {

		CreditCard creditCard = new CreditCard();
		creditCard.setFirstFourDigits(3333);
		creditCard.setFirstFourDigits(4444);
		creditCard.setFirstFourDigits(5555);
		creditCard.setFirstFourDigits(6666);
		billDTO.setCreditCard(creditCard);
		return "bill-page";
	}

	@RequestMapping(value = "/process-bill")
	public String showResultPage(@Valid @ModelAttribute("billDTO") BillDTO billDTO, BindingResult result) {

		if (result.hasErrors()) {

			return "bill-page";
		}

		return "result-page";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder)
	{
		//Editor for the date field
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat,true);
		binder.registerCustomEditor(Date.class, "date", customDateEditor);
		
		//Register a custom editor for the amount field
		NumberFormat numberFormat = new DecimalFormat("##,###.00");
		CustomNumberEditor editor = new CustomNumberEditor(BigDecimal.class,numberFormat, true);
		binder.registerCustomEditor(BigDecimal.class,"amount", editor);
		
		//Register a custom editor for the currency
		MyCurrencyEditor currencyEditor = new MyCurrencyEditor();
		binder.registerCustomEditor(Currency.class, "currency", currencyEditor);
		
		//Adding a custom formatter for credit card number
		//binder.addCustomFormatter(new CreditCardFormatter());
		
		// Adding custom editor for credit card
		//CreditCardEditor cardEditor = new CreditCardEditor();
		//binder.registerCustomEditor(CreditCard.class,"creditCard", cardEditor);

		
	}
}
