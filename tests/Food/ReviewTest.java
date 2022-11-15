package Food;



import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Food.Review;

public class ReviewTest {
	//Need to make arraylist to pass as parameter
	Review rv;
	


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
	


	@Test
	public void testGetItem() {
		assertEquals("Cookie", rv.getItemName());	
	}
	
	@Test
	public void testSetItem() {
		rv.setItemName("Bagel");
		assertEquals("Bagel", rv.getItemName());
	}
	
	@Test
	public void testGetEmail() {
		assertEquals("Jbrownlee001@csbsju.edu", rv.getUserEmail());
	}
	
	@Test
	public void testSetRatingl() {
		rv.setRating("4");
		assertEquals("4", rv.getRating());
	}
	
	@Test
	public void testSetEmail() {
		rv.setUserEmail("test@csbsju.edu");
		assertEquals("test@csbsju.edu", rv.getUserEmail());
	}
	
	@Test
	public void testGetRating() {
		assertEquals("4", rv.getRating());
		}
	
	@Test
	public void testGetTitle() {
		assertEquals("Best Dish!", rv.getTitle());
		}
	
	@Test
	public void testSetTitle() {
		rv.setTitle("Test");
		assertEquals("Test", rv.getTitle());
		}

	@Test
	public void testGetReview() {
		assertEquals("I like food", rv.getReviewDescrip());
		}
	
	@Test
	public void testSetReview() {
		rv.setReviewDescrip("Food is good");
		assertEquals("Food is good", rv.getReviewDescrip());
		}
	
	@Test
	public void testGetAnon() {
		assertEquals(false, rv.getAnon());
	}
	
	@Test
	public void testSetAnon() {
		rv.setAnon(true);
		assertEquals(true, rv.getAnon());
	}
}
