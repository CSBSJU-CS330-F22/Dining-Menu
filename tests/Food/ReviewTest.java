package Food;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReviewTest {
	//Need to make arraylist to pass as parameter
	ArrayList<String> test = new ArrayList<String>();
	Review rv = new Review();
	@Before
	public void setUp() throws Exception {		
		rv.setItemName("Cookie");
		rv.setUserEmail("Jbrownlee001@csbsju.edu");
		rv.setRating("4");
		rv.setTitle("Best Dish!");
		rv.setReviewDescrip("I like food");
		rv.setAnon(false);
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
	
	//@Test
	//public void testGetAnon() {
		//assertFalse(rv.getAnon());
	//}
	
	//@Test
	//public void testSetAnon() {
		//rv.setAnon(true);
		//assertTrue(rv.getAnon());
	//}
}
