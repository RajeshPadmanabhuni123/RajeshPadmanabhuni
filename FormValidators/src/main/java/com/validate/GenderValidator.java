package com.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class GenderValidator implements ConstraintValidator<gender, String>{

	public boolean isValid(String s, ConstraintValidatorContext cvc)
	{
		boolean result=s.contains("male")||s.contains("female");
		return result;
		
	}
}
