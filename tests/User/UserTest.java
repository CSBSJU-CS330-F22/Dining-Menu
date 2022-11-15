package User;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Food.Food;

public class UserTest {
User ut;
Food item;
Food item2;
	
	@Before
	public void setUp() throws Exception {
		ArrayList<String> user = new ArrayList<String>();
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> dish = new ArrayList<String>();
		test.add("Cookie");
		test.add("60");
		test.add("6");
		test.add("5");
		test.add("3");
		test.add("4");
		
		user.add("Jbrownlee001@csbsju.edu");
		user.add("Password");
		user.add("Jayden");
		user.add("Brownlee");
		
		dish.add("Pasta");
		dish.add("150");
		dish.add("9");
		dish.add("4");
		dish.add("6");
		dish.add("7");
		
		item = new Food(test);
		item2 = new Food(dish);
		ut = new User(user, item);
		

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetEmail() {
		assertEquals("Jbrownlee001@csbsju.edu", ut.getEmail());
	}
	@Test
	public void testSetEmail() {
		ut.setEmail("Gevans002@csbsju.edu");
		assertEquals("Gevans002@csbsju.edu", ut.getEmail());
	}
	
	@Test
	public void testGetPassword() {
		assertEquals("Password", ut.getPassword());
	}
	
	@Test
	public void testSetPassword() {
		ut.setPassword("Testing1234");
		assertEquals("Testing1234", ut.getPassword());
	}
	
	@Test
	public void testGetFirstName() {
		assertEquals("Jayden", ut.getFirstName());
	}
	
	@Test
	public void testSetFirstName() {
		ut.setFirstName("Jack");
		assertEquals("Jack", ut.getFirstName());
	}
	
	@Test
	public void testGetLastName() {
		assertEquals("Brownlee", ut.getLastName());
	}
	
	@Test
	public void testSetLastName() {
		ut.setLastName("Olsen");
		assertEquals("Olsen", ut.getLastName());
	}
	
	@Test
	public void testGetFavFood() {
		assertEquals(item, ut.getFavFood());
	}
	
	@Test
	public void testSetFavFood() {
		ut.setFavFood(item2);
		assertEquals(item2, ut.getFavFood());
	}

}
