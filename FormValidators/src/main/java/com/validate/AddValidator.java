package com.validate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AddValidator implements ConstraintValidator<addvalid, String>{

	public boolean isValid(String s, ConstraintValidatorContext cvc)
	{
		boolean result=s.contains("india");
		return result;
		
	}
}
