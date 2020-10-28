package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationEmailTestCase {

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
	public void UserRegistrationEmail_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationEmail("abc@gmail.com"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void UserRegistrationEmail_thenAssertionSad() {
		try {
			assertEquals(true,user.UserRegistrationEmail("abc.123.oi@gmail.com"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}

}

