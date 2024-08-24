package com.seleniumexpress.lc.validator;

import static java.lang.annotation.ElementType.FIELD;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import org.springframework.context.annotation.PropertySource;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(FIELD)
@Constraint(validatedBy = AgeValidator.class)
//@PropertySource("messageSource")
public @interface Age {
	
	String message() default "{invalidAgeMessage}";
	
	int lower() default 18;
	int upper() default 60;
	
	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };

}
