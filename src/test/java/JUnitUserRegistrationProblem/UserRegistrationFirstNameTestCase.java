package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationFirstNameTestCase {

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
	public void UserRegistrationFirstName_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationFirstName("Archana"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}		
	}
	@Test
	public void UserRegistrationFirstName_thenAssertionSad() {
		try {
			assertEquals(true,user.UserRegistrationFirstName("archana"));	
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}

}
