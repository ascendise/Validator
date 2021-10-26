package ch.ascendise.Validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ValidatorTest {
	
	public static TestObject validTestObject = new TestObject();
	public static TestObject invalidTestObject = new TestObject();
	
	@BeforeAll
	static void setup()
	{
		initializeValidObject();
		initializeInvalidObject();
	}
	
	static void initializeValidObject()
	{
		validTestObject.setNotNull("");
		validTestObject.setMaxLength("1234567890123456789");
		validTestObject.setMinLength("1234");
		validTestObject.setRange("12345678");
		validTestObject.setNotBlank("a");
		validTestObject.setNotEmpty(" ");
	}

	static void initializeInvalidObject()
	{
		invalidTestObject.setNotNull(null);
		invalidTestObject.setMaxLength("123456789012345678901");
		invalidTestObject.setMinLength("1");
		invalidTestObject.setRange("12");
		invalidTestObject.setNotBlank(" ");
		invalidTestObject.setNotEmpty("");
	}
	
	@Test
	void validObject_isValid()
	{
		var validator = new Validator<TestObject>(validTestObject);
		boolean isValid = validator.IsValid();
		assertTrue(isValid, "Valid object got identified as invalid");
	}
	
	@Test
	void invalidObject_isValid()
	{
		var validator = new Validator<TestObject>(invalidTestObject);
		boolean isValid = validator.IsValid();
		assertTrue(isValid, "Invalid object got identified as invalid");
	}
	
	@Test
	void invalidObject_getErrors()
	{
		var validator = new Validator<TestObject>(invalidTestObject);
		String[] errors = validator.getErrors();
		assertEquals(6, errors.length, "Error list does not contain all errors");
	}

}
