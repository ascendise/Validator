package ch.ascendise.Validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ch.ascendise.Validator.Annotations.*;

class NotBlankValidatorTest {

	@Test
	void validFieldValue()
	{
		class Test
		{
			@NotBlank
			private String notBlank = "aaaa";
		}
		var validator = new POJOValidator(new Test());
		var isValid = validator.isValid();
		assertTrue(isValid, "Correct field got detected as invalid");
	}
	
	@Test
	void invalidFieldValue()
	{
		class Test
		{
			@NotBlank
			private String blank = " ";
		}
		var validator = new POJOValidator(new Test());
		var isValid = validator.isValid();
		assertFalse(isValid, "Invalid field passed");
	}
	
	@Test
	void invalidValue_null()
	{
		class Test
		{
			@NotBlank
			private String blank = null;
		}
		var validator = new POJOValidator(new Test());
		assertFalse(validator.isValid(), "Null value field considered valid");
	}

}
