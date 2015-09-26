package com.caveofprogramming.spring.web.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidEmailImp implements ConstraintValidator<ValidEmail, String>{
	private int min;
	
	@Override
	public void initialize(ValidEmail constraintAnnotation) {
		 min = constraintAnnotation.min();
	}

	@Override
	public boolean isValid(String email, ConstraintValidatorContext context) {
		if(email.length() >= min){
			return true;
		} else{
			return false;
		}
	}
}
