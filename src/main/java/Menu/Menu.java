/**
 * 
 */
package Menu;

import java.util.ArrayList;

import Food.Food;

/**
 * @author jnewhouse003
 *
 */
public class Menu {
	
	private String date;
	private String mealType;
	private Food food;
	
	public Menu(ArrayList<String> attributes, Food item) {
		this.date = attributes.get(0);
		this.mealType = attributes.get(1);
		this.food = item;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the mealType
	 */
	public String getMealType() {
		return mealType;
	}
	/**
	 * @param mealType the mealType to set
	 */
	public void setMealType(String mealType) {
		this.mealType = mealType;
	}
	/**
	 * @return the food
	 */
	public Food getFood() {
		return food;
	}
	/**
	 * @param food the food to set
	 */
	public void setFood(Food food) {
		this.food = food;
	}
	

}
