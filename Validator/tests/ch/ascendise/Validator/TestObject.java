package ch.ascendise.Validator;

import ch.ascendise.Validator.Annotations.*;

class TestObject {
		@NotNull
		private String notNull;
		@Length(max = 20)
		private String maxLength;
		@Length(min = 3)
		private String minLength;
		@Length(min = 3, max = 20)
		private String range;
		@NotEmpty
		private String notEmpty;
		@NotBlank
		private String notBlank;
		
		public String getNotNull() {
			return notNull;
		}
		public void setNotNull(String notNull) {
			this.notNull = notNull;
		}
		public String getMaxLength() {
			return maxLength;
		}
		public void setMaxLength(String maxLength) {
			this.maxLength = maxLength;
		}
		public String getMinLength() {
			return minLength;
		}
		public void setMinLength(String minLength) {
			this.minLength = minLength;
		}
		public String getRange() {
			return range;
		}
		public void setRange(String range) {
			this.range = range;
		}
		public String getNotEmpty() {
			return notEmpty;
		}
		public void setNotEmpty(String notEmpty) {
			this.notEmpty = notEmpty;
		}
		public String getNotBlank() {
			return notBlank;
		}
		public void setNotBlank(String notBlank) {
			this.notBlank = notBlank;
		}
}
