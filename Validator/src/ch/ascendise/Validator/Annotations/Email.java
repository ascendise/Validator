package ch.ascendise.Validator.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import ch.ascendise.Validator.EmailValidator;

/**
 * Annotated field string value should be an email adress
 * 
 * This annotation does only check the pattern of the value
 * If the email itself fits into the regex pattern but is not
 * a registered email address, it will still pass
 * 
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@ValidatorType(EmailValidator.class)
public @interface Email 
{
	
}
