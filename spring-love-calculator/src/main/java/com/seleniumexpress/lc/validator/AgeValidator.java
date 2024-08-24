package com.seleniumexpress.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer> {

	private int lower, upper;
	
	@Override
	public void initialize(Age age) {
		//write post construct work here
		this.lower = age.lower();
		this.upper = age.upper();
	}
	
	@Override
	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		return age != null && age >= lower && age <= upper;
	}

}
