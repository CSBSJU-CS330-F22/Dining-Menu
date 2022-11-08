

import junit.framework.TestCase;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Food.Food;

public class FoodTest extends TestCase{
	ArrayList<String> test = new ArrayList<String>();
	Food fd = new Food(test);
	

	@Before
	public void setUp() throws Exception {
		test.add("Cookie");
		test.add("60");
		test.add("6");
		test.add("5");
		test.add("3");
		test.add("4");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetName() {
		fd.setName("Chips");
		assertEquals("Chips", fd.getName());
	}
	
	@Test
	public void testSetCalories() {
		fd.setCalories("30");
		assertEquals("30", fd.getCalories());
	}
	
	@Test
	public void testSetFat() {
		fd.setFat("4");
		assertEquals("4", fd.getFat());
	}
	
	@Test
	public void testSetCarbs() {
		fd.setCarbs("20");
		assertEquals("20", fd.getCarbs());
	}
	
	@Test
	public void testSetProtein() {
		fd.setProtein("5");
		assertEquals("5", fd.getProtein());
	}
	
	@Test
	public void testSetCholesterol() {
		fd.setCholesterol("6");
		assertEquals("6", fd.getCholesterol());
	}
	
	@Test
	public void testGetCholesterol() {
		assertEquals("4", fd.getCholesterol());
	}
	
	@Test
	public void testGetProtein() {
		assertEquals("3", fd.getProtein());
	}
	
	@Test
	public void testGetCarbs() {
		assertEquals("5", fd.getCarbs());
	}
	
	@Test
	public void testGetFat() {
		assertEquals("6", fd.getFat());
	}
	
	@Test
	public void testGetCalories() {
		assertEquals("60", fd.getCalories());
	}
	
	@Test
	public void testGetName() {
		assertEquals("Cookie", fd.getName());
	}
	
	

}
