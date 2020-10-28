package JUnitUserRegistrationProblem;

import java.util.regex.Pattern;

@FunctionalInterface
interface UserRegister{
	public boolean compare(String a,String b);
}

public class UserRegistration {
	
	private static final String FIRSTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String LASTNAME_PATTERN = "^[A-Z]{1}[a-z]{2,}";
	private static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([.+_-]{1}[a-zA-Z0-9]{3,}){0,2}\\@[a-zA-Z0-9]+([.]{1,2}[a-z]{2,}){0,2}";
	private static final String MOBILENUMBER_PATTERN = "^(91)[7-9][0-9]{9}$";
	private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
	

	public boolean UserRegistrationFirstName(String firstName) throws UserRegistrationCustomException  {
		UserRegister user = (pattern,inputString) -> Pattern.matches(pattern,inputString);
		boolean firstname = user.compare(FIRSTNAME_PATTERN, firstName);
		if(firstname)
		return firstname;
		throw new UserRegistrationCustomException("Please enter proper First name")	;
	}
	public boolean UserRegistrationLastName(String lastName) throws UserRegistrationCustomException {
		UserRegister user = (pattern,inputString) -> Pattern.matches(pattern,inputString);
		boolean lastname = user.compare(LASTNAME_PATTERN, lastName);
		if(lastname)
		return lastname;
		throw new UserRegistrationCustomException("Please enter proper Last name");
	}
	public boolean UserRegistrationEmail(String email) throws UserRegistrationCustomException {
		UserRegister user = (pattern,inputString) -> Pattern.matches(pattern,inputString);
		boolean emailB = user.compare(EMAIL_PATTERN, email);
		if(emailB)
		return emailB;
		throw new UserRegistrationCustomException("Please enter proper Email");
	}
	public boolean UserRegistrationMobileNumber(String number) throws UserRegistrationCustomException {
		UserRegister user = (pattern,inputString) -> Pattern.matches(pattern,inputString);
		boolean numberB = user.compare(MOBILENUMBER_PATTERN, number);
		if(numberB)
		return numberB;
		throw new UserRegistrationCustomException("Please enter proper Number");
	}
	public boolean UserRegistrationPassword(String password) throws UserRegistrationCustomException {
		UserRegister user = (pattern,inputString) -> Pattern.matches(pattern,inputString);
		boolean passwordB = user.compare(PASSWORD_PATTERN, password);
		if(passwordB)
		return passwordB;
		throw new UserRegistrationCustomException("Please enter proper Password");
	}
	
	
}
