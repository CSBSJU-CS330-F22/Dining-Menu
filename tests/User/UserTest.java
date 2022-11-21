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
	
/*
 * User: creates a user
 * test: creates a food object
 * Dish: creates a food Item
 */
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

	/*
	 * Checks to see if the email is matching the list
	 */
	@Test
	public void testGetEmail() {
		assertEquals("Jbrownlee001@csbsju.edu", ut.getEmail());
	}
	/*
	 * Sets an email and checks to see if it's added to the list
	 */
	@Test
	public void testSetEmail() {
		ut.setEmail("Gevans002@csbsju.edu");
		assertEquals("Gevans002@csbsju.edu", ut.getEmail());
	}
	
/*
 * Checks to see if the password is matching the list
 */
	@Test
	public void testGetPassword() {
		assertEquals("Password", ut.getPassword());
	}
	
	/*
	 * Sets a password and checks to see if it's added to the list
	 */
	@Test
	public void testSetPassword() {
		ut.setPassword("Testing1234");
		assertEquals("Testing1234", ut.getPassword());
	}
	
	/*
	 * Checks to see if the first name is matching the list
	 */
	@Test
	public void testGetFirstName() {
		assertEquals("Jayden", ut.getFirstName());
	}
	
	/*
	 * Sets a first name and checks to see if it's added to the list
	 */
	@Test
	public void testSetFirstName() {
		ut.setFirstName("Jack");
		assertEquals("Jack", ut.getFirstName());
	}
	
	/*
	 * Checks to see if the last name is matching the list
	 */
	@Test
	public void testGetLastName() {
		assertEquals("Brownlee", ut.getLastName());
	}
	
	@Test
	public void testSetLastName() {
		ut.setLastName("Olsen");
		assertEquals("Olsen", ut.getLastName());
	}
	
	/*
	 * Checks to see if the favorite is matching the item
	 */
	@Test
	public void testGetFavFood() {
		assertEquals(item, ut.getFavFood());
	}
	
	/*
	 * Sets a new favorite food and checks to see if it's added to the list
	 */
	@Test
	public void testSetFavFood() {
		ut.setFavFood(item2);
		assertEquals(item2, ut.getFavFood());
	}

}
