package Food;

import junit.framework.TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FoodTest extends TestCase{
	Food fd = new Food();

	@Before
	public void setUp() throws Exception {
		fd.setName("Cookie");
		fd.setCalories("60");
		fd.setFat("6");
		fd.setCarbs("5");
		fd.setProtein("3");
		fd.setCholesterol("4");
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
