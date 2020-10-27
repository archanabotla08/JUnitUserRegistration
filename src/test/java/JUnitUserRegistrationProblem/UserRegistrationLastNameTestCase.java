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
		assertEquals(true,user.UserRegistrationLastName("Botla"));
	}
	@Test
	public void UserRegistrationLastName_thenAssertionSad() {
		assertEquals(true,user.UserRegistrationLastName("botla"));
	}

}
