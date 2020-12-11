package com.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = AddValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface addvalid {

	public String message() default "must contains india";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default {};
	
}
