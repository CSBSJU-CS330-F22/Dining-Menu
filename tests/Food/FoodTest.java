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
		assertEquals("Cookie", fd.getName());
	}
	
	@Test
	public void testSetCalories() {
		assertEquals("60", fd.getCalories());
	}
	
	@Test
	public void testSetFat() {
		assertEquals("6", fd.getFat());
	}
	
	@Test
	public void testSetCarbs() {
		assertEquals("5", fd.getCarbs());
	}
	
	@Test
	public void testSetProtein() {
		assertEquals("3", fd.getProtein());
	}
	
	@Test
	public void testSetsetCholesterol() {
		assertEquals("4", fd.getCholesterol());
	}

}
