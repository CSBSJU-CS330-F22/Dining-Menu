package Menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Food.Food;

/**
 * @author Jayden Brownlee
 */
public class MenuTest {
	Menu mn;
	Food item;
	Food item2;
	
	/*
	 * Test: list filled with weekly informations
	 * Food: a initial list to pass through Menu Test
	 * Dish: Food Item to pass through Menu test
	 */
	@BeforeEach
	void setUp() throws Exception {
		ArrayList<String> test = new ArrayList<String>();
		ArrayList<String> food = new ArrayList<String>();
		ArrayList<String> dish = new ArrayList<String>();
		food.add("Cookie");
		food.add("60");
		food.add("6");
		food.add("5");
		food.add("3");
		food.add("4");
		
		dish.add("Pasta");
		dish.add("150");
		dish.add("9");
		dish.add("4");
		dish.add("6");
		dish.add("7");
		
		test.add("Monday");
		test.add("Breakfast");
		item = new Food(food);
		item2 = new Food(dish);
		mn = new Menu(test, item);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	 * Grabs the date passed through and checks to make sure it matches with the list
	 */
	@Test
	public void testGetDate() {
		assertEquals("Monday", mn.getDate());
	}
	
	/*
	 * Sets the date and checks that it matches the one listed
	 */
	@Test
	public void testSetDate() {
		mn.setDate("Thursday");
		assertEquals("Thursday", mn.getDate());
	}
	
	/*
	 * Grabs the Meal Type passed through and checks to make sure it matches with the list
	 */
	@Test
	public void testGetMealType() {
		assertEquals("Breakfast", mn.getMealType());
	}
	
	/*
	 * Sets the Meal Type and checks that it matches the one listed
	 */
	@Test
	public void testSetMealType() {
		mn.setMealType("Dinner");
		assertEquals("Dinner", mn.getMealType());
	}
	
	/*
	 * Grabs the Food Item passed through and checks to make sure it matches with the list
	 */
	@Test
	public void testGetFood() {
		assertEquals(item, mn.getFood());
	}
	
	/*
	 * Sets the Food Item and checks that it matches the one listed
	 */
	@Test
	public void testSetFoodItem() {
		mn.setFood(item2);
		assertEquals(item2, mn.getFood());
		
	}

}
