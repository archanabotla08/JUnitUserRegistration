package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationLastNameTestCase {

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
	public void UserRegistrationLastName_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationLastName("Botla"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void UserRegistrationLastName_thenAssertionSad() {
		try {
			assertEquals(true,user.UserRegistrationLastName("botla"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}

}
