package JUnitUserRegistrationProblem;

import java.util.regex.Pattern;

public class UserRegistration {
	
	private static final String FIRSTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String LASTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	
	public boolean UserRegistrationFirstName(String firstName) {
		
		return Pattern.matches(FIRSTNAME_PATTERN, firstName);
	}
	public boolean UserRegistrationLastName(String lastName) {
		
		return Pattern.matches(LASTNAME_PATTERN, lastName);
	}
	
}
