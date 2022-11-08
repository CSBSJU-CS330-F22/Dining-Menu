package Menu;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MenuTest {
	Menu mn = new Menu();
	
	@BeforeEach
	void setUp() throws Exception {
		mn.setDate("Monday");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testGetDate() {
		assertEquals("Monday", mn.getDate());
	}

}
