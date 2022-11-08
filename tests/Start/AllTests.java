package Start;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Food.Food;
import Food.FoodTest;
import Food.Review;
import Food.ReviewTest;
import junit.framework.Test;
import junit.framework.TestSuite;

@RunWith(Suite.class)
@SuiteClasses({})
public class AllTests {
	
	@SuppressWarnings("unused")
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		suite.addTestSuite(Food.class);
		suite.addTestSuite(Review.class);
		return suite();
	}

}
