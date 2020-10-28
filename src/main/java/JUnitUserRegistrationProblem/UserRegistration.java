package JUnitUserRegistrationProblem;

import java.util.regex.Pattern;

public class UserRegistration {
	
	private static final String FIRSTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String LASTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+_-]{1}[a-zA-Z0-9]{3,}){0,2}\\@[a-zA-Z0-9]+([.]{1,2}[a-z]{2,}){0,2}";
	private static final String MOBILENUMBER_PATTERN = "^(91)[7-9][0-9]{9}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	
	public boolean UserRegistrationFirstName(String firstName) throws UserRegistrationCustomException {
		
		boolean firstname =  Pattern.matches(FIRSTNAME_PATTERN, firstName);
		if(firstname)
			return Pattern.matches(FIRSTNAME_PATTERN, firstName);
		throw new UserRegistrationCustomException("Please enter proper First name");
	}
	public boolean UserRegistrationLastName(String lastName) throws UserRegistrationCustomException {
		boolean lastname = Pattern.matches(LASTNAME_PATTERN, lastName);
		if(lastname)
		return Pattern.matches(LASTNAME_PATTERN, lastName);
		throw new UserRegistrationCustomException("Please enter proper Last name");
	}
	public boolean UserRegistrationEmail(String email) throws UserRegistrationCustomException {
		boolean emailB = Pattern.matches(EMAIL_PATTERN, email);
		if(emailB)
		return Pattern.matches(EMAIL_PATTERN, email);
		throw new UserRegistrationCustomException("Please enter proper Email");
	}
	public boolean UserRegistrationMobileNumber(String number) throws UserRegistrationCustomException {
		boolean numberB = Pattern.matches(MOBILENUMBER_PATTERN, number);
		if(numberB)
		return Pattern.matches(MOBILENUMBER_PATTERN, number);
		throw new UserRegistrationCustomException("Please enter proper Number");
	}
	public boolean UserRegistrationPassword(String password) throws UserRegistrationCustomException {
		boolean passwordB = Pattern.matches(PASSWORD_PATTERN, password);
		if(passwordB)
		return Pattern.matches(PASSWORD_PATTERN, password);
		throw new UserRegistrationCustomException("Please enter proper Password");
	}
	
	
}
