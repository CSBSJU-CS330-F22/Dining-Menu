package Food;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Food.Review;

/**
 * @author Jayden Brownlee
 */
public class ReviewTest {

	Review rv;
	

/*
 *  Sets up the initial array list and passes the list into the constructor
 */
	@Before
	public void setUp() throws Exception {	
		ArrayList<String> test = new ArrayList<String>();
		test.add("Cookie");
		test.add("Jbrownlee001@csbsju.edu");
		test.add("4");
		test.add("Best Dish!");
		test.add("I like food");
		test.add("false");
		rv = new Review(test);
	}

	@After
	public void tearDown() throws Exception {

	}
	

/*
 * Grabs the item and tests to make sure it matches with the item listed in the constructor
 */
	@Test
	public void testGetItem() {
		assertEquals("Cookie", rv.getItemName());	
	}
	
	/*
	 * Sets the item and checks to see if it matches with the list
	 */
	@Test
	public void testSetItem() {
		rv.setItemName("Bagel");
		assertEquals("Bagel", rv.getItemName());
	}
	
	/*
	 * Grabs the email and tests to make sure it matches with the email listed in the constructor
	 */
	@Test
	public void testGetEmail() {
		assertEquals("Jbrownlee001@csbsju.edu", rv.getUserEmail());
	}
	
	/*
	 * Sets the rating and checks to see if it matches with the list
	 */
	@Test
	public void testSetRatingl() {
		rv.setRating("4");
		assertEquals("4", rv.getRating());
	}
	
	/*
	 * Sets the email and checks to see if it matches with the list
	 */
	@Test
	public void testSetEmail() {
		rv.setUserEmail("test@csbsju.edu");
		assertEquals("test@csbsju.edu", rv.getUserEmail());
	}
	
	/*
	 * Grabs the rating and tests to make sure it matches with the rating listed in the constructor
	 */
	@Test
	public void testGetRating() {
		assertEquals("4", rv.getRating());
		}
	
	/*
	 * Grabs the title of the rating and tests to make sure it matches with the title listed in the constructor
	 */
	@Test
	public void testGetTitle() {
		assertEquals("Best Dish!", rv.getTitle());
		}
	
	/*
	 * Sets the Title and checks to see if it matches with the list
	 */
	@Test
	public void testSetTitle() {
		rv.setTitle("Test");
		assertEquals("Test", rv.getTitle());
		}

	/*
	 * Grabs the review and tests to make sure it matches with the review listed in the constructor
	 */
	@Test
	public void testGetReview() {
		assertEquals("I like food", rv.getReviewDescrip());
		}
	
	/*
	 * Sets the review and checks to see if it matches with the list
	 */
	@Test
	public void testSetReview() {
		rv.setReviewDescrip("Food is good");
		assertEquals("Food is good", rv.getReviewDescrip());
		}
	
	/*
	 * checks if the user is anon and tests to make sure it matches with what's listed in the constructor
	 */
	@Test
	public void testGetAnon() {
		assertEquals(false, rv.getAnon());
	}
	
	/*
	 * Sets the user anon and checks to see if it matches with the list
	 */
	@Test
	public void testSetAnon() {
		rv.setAnon(true);
		assertEquals(true, rv.getAnon());
	}
}
