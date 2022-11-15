package Menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Food.Food;

class MenuTest {
	Menu mn;
	
	
	@BeforeEach
	void setUp() throws Exception {
		ArrayList<String> test = new ArrayList<String>();
		test.add("Monday");
		test.add("Breakfast");
		Food item = null;
		mn = new Menu(test, item);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
