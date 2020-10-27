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
		assertEquals(true,user.UserRegistrationFirstName("Archana"));
	}
	@Test
	public void UserRegistrationFirstName_thenAssertionSad() {
		assertEquals(true,user.UserRegistrationFirstName("archana"));
	}

}
