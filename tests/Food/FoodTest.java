package Food;


import junit.framework.TestCase;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
/**
 * @author Jayden Brownlee
 */

public class FoodTest extends TestCase{
	
	Food fd;
	
/*
 * Sets up the initial array list and passes the list into the constructor
 */
	@Before
	public void setUp() throws Exception {
		ArrayList<String> test = new ArrayList<String>();
		test.add("Cookie");
		test.add("60");
		test.add("6");
		test.add("5");
		test.add("3");
		test.add("4");
		fd = new Food(test);
	}

	@After
	public void tearDown() throws Exception {
	}

	/*
	 * Sets the name and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetName() {
		fd.setName("Chips");
		assertEquals("Chips", fd.getName());
	}
	
	/*
	 * Sets the calories and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetCalories() {
		fd.setCalories("30");
		assertEquals("30", fd.getCalories());
	}
	
	/*
	 * Sets the fat and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetFat() {
		fd.setFat("4");
		assertEquals("4", fd.getFat());
	}
	
	/*
	 * Sets the carbs and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetCarbs() {
		fd.setCarbs("20");
		assertEquals("20", fd.getCarbs());
	}
	
	/*
	 * Sets the protein and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetProtein() {
		fd.setProtein("5");
		assertEquals("5", fd.getProtein());
	}
	
	/*
	 * Sets the Cholesterol and tests to make sure that the name matches the one set
	 */
	@Test
	public void testSetCholesterol() {
		fd.setCholesterol("6");
		assertEquals("6", fd.getCholesterol());
	}
	
	/*
	 * Grabs the Cholesterol and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetCholesterol() {
		assertEquals("4", fd.getCholesterol());
	}
	
	/*
	 * Grabs the Protein and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetProtein() {
		assertEquals("3", fd.getProtein());
	}
	
	/*
	 * Grabs the Carbs and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetCarbs() {
		assertEquals("5", fd.getCarbs());
	}
	
	/*
	 * Grabs the Fat and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetFat() {
		assertEquals("6", fd.getFat());
	}
	
	/*
	 * Grabs the Calories and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetCalories() {
		assertEquals("60", fd.getCalories());
	}
	
	/*
	 * Grabs the Name and tests to see if it matches from the constructor
	 */
	@Test
	public void testGetName() {
		assertEquals("Cookie", fd.getName());
	}
	
	

}
