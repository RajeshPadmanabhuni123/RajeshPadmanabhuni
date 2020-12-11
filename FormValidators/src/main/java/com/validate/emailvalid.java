package com.validate;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Retention;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = EmailValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface emailvalid {

	public String message() default "must contains . and @";
	
	public Class<?>[] groups() default{};
	
	public Class<? extends Payload>[] payload() default {};
	
}
