package Start;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Food.FoodTest;
import Food.ReviewTest;
import Menu.MenuTest;
import User.UserTest;

@RunWith(Suite.class)
@SuiteClasses({
	FoodTest.class,
	ReviewTest.class,
	MenuTest.class,
	UserTest.class
})
public class AllTests {

}
