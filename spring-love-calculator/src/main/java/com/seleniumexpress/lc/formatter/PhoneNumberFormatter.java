package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {
		System.out.println("inside print method()");
		return phone.getCountryCode() + "-" + phone.getUserNumber();
	}

	@Override
	public Phone parse(String text, Locale locale) throws ParseException {
		Phone phone = new Phone();
		if (text.contains("-") && !text.startsWith("-")) {
			String[] phoneNumberArr = text.split("-");
			phone.setCountryCode(phoneNumberArr[0]);
			phone.setUserNumber(phoneNumberArr[1]);
		} else if (text.startsWith("-")) {
			phone.setCountryCode("91");
			phone.setUserNumber(text.substring(1));
		} else {
			phone.setCountryCode("91");
			phone.setUserNumber(text.substring(1));
		}
		return phone;
	}

}
