package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationMobileNumberTestCase {

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
	public void UserRegistrationMobileNumber_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationMobileNumber("918989878761"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
	@Test
	public void UserRegistrationMobileNumber_thenAssertionSad() {
		try {
			assertEquals(true,user.UserRegistrationMobileNumber("91 8989898"));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}

}
