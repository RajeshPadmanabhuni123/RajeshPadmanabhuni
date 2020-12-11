package com.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EmailValidator implements ConstraintValidator<emailvalid, String>{

	public boolean isValid(String s, ConstraintValidatorContext cvc)
	{
		boolean result=(s.contains("@") && s.contains("."));
		return result;
		
	}
}
