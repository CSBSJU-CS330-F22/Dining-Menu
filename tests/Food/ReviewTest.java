package Food;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ReviewTest {
	//Need to make arraylist to pass as parameter
	ArrayList<String> test = new ArrayList<String>();
	//Review rv = new Review(test);
	@Before
	public void setUp() throws Exception {
		test.add("Cookie");
		test.add("Jbrownlee001@csbsju.edu");
		test.add("5");
		test.add("Great Treat!");
		test.add("Sugar Cookies");
		test.add("true");
		
	}

	@After
	public void tearDown() throws Exception {
		test.remove("Cookie");
		test.remove("Jbrownlee001@csbsju.edu");
		test.remove("5");
		test.remove("Great Treat!");
		test.remove("Sugar Cookies");
		test.remove("true");
		
	}

	@Test
	public void testGetItem() {
		//assertEquals("Cookie", rv.getItemName());
		System.out.println(test.get(5));
		
	}

}
