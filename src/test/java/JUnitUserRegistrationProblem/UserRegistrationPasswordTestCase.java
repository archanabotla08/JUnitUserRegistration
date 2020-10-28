package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

public class UserRegistrationPasswordTestCase {

	UserRegistration user;
	@Before
	public void UserRegistrationObjectCreation() {
		user = new UserRegistration();
	}
	@After
	public void nullObject() {
		user = null;
	}
	@Test
	public void UserRegistrationPassword_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationPassword("A1&oichana"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void UserRegistrationPassword_thenAssertionSad() {
		try {
			assertEquals(true,user.UserRegistrationPassword("A1oiana"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
}
