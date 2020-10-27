package JUnitUserRegistrationProblem;

import java.util.regex.Pattern;

public class UserRegistration {
	
	private static final String FIRSTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String LASTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+_-]{1}[a-zA-Z0-9]{3,}){0,2}\\\\@[a-zA-Z0-9]+([.]{1,2}[a-z]{2,}){0,2}";
	private static final String MOBILENUMBER_PATTERN = "^(91)[7-9][0-9]{9}$}";
	
	public boolean UserRegistrationFirstName(String firstName) {
		
		return Pattern.matches(FIRSTNAME_PATTERN, firstName);
	}
	public boolean UserRegistrationLastName(String lastName) {
		
		return Pattern.matches(LASTNAME_PATTERN, lastName);
	}
	public boolean UserRegistrationEmail(String email) {
		
		return Pattern.matches(EMAIL_PATTERN, email);
	}
	public boolean UserRegistrationMobileNumber(String number) {
		
		return Pattern.matches(MOBILENUMBER_PATTERN, number);
	}
	
	
}
