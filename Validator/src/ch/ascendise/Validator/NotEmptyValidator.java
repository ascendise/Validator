package ch.ascendise.Validator;

import ch.ascendise.Validator.Annotations.NotEmpty;

public final class NotEmptyValidator extends AbstractValidator
{
	protected NotEmptyValidator(Object object, String fieldName, NotEmpty notEmpty)
	{
		super(object, fieldName, notEmpty);
	}

	@Override
	public boolean isValid() 
	{
		String s = (String)super.getObject();
		return s != null && !s.isEmpty();
	}

	@Override
	public String getErrorMessage() 
	{
		if(isValid())
		{
			return "";
		}
		return super.getFieldName() + ": Value is empty";
	}
	
	
}
