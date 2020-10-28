package JUnitUserRegistrationProblem;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LibraryTest.class, UserRegistrationEmailTestCase.class, UserRegistrationFirstNameTestCase.class,
		UserRegistrationLastNameTestCase.class, UserRegistrationMobileNumberTestCase.class,
		UserRegistrationParameterizedEmailTestCase.class, UserRegistrationPasswordTestCase.class })
public class UserRegistrationAllTests {

	@BeforeClass
	public static void testBefore(){
		System.out.println("In Before Class");
	}
	@AfterClass
	public static void testAfter(){
		System.out.println("In After Class");
	}
}
