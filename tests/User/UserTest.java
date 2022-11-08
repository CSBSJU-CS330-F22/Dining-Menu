package User;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserTest {
User ut = new User();
	
	@Before
	public void setUp() throws Exception {
		ut.setEmail("jbrownlee001");
		ut.setPassword("Pass");
		ut.setFirstName("Jayden");
		ut.setLastName("Brownlee");
		//ut.setFavFood("Cookie");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
