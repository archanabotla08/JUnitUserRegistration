package JUnitUserRegistrationProblem;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationParameterizedEmailTestCase {
	
	private String email;
	private boolean value;
	UserRegistration user;
	public UserRegistrationParameterizedEmailTestCase(String email,boolean value) {
		super();
		this.email = email;
		this.value = value;
	}
	@Before
	public void UserRegistrationObjectCreation() {
		user = new UserRegistration();
	}
	@After
	public void nullObject() {
		user = null;
	}
	
	
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] {	{"abc@yahoo.com",true},
												{"abc-100@yahoo.com",true},
												{"abc100@yahoo.com",true},
												{"abc111@abc.com",true},
												{"abc-100@abc.net",true},
												{"abc.100@abc.com.au",true},
												{"abc@1.com",true},
												{"abc@gmail.com.com",true},
												{"abc+100@gmail.com",true},
												{"abc",false},
												{"abc@.com.my",false},
												{"abc123@gmail.com"},
												{"abc123@com",false},
												{"abc123@com.com",false},
												{"abc@abc.com",false},
												{"abc()*@gmail.com",false},
												{"abc@%*.com",false},
												{"abc..2002@gmail.com",false},
												{"abc.@gmail.com",false},
												{"abc2abc@gamil.com",false},
												{"abc@gmail.com.1a"},
												{"abc@abc@gmail.com",false},
												{"abc@gmail.com.au.au",false},
												});
	}
	@Test
	public void UserRegistrationEmail_thenAssertionHappy() {
		try {
			assertEquals(true,user.UserRegistrationEmail(email));
		}catch(UserRegistrationCustomException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
