package Food;
import java.util.ArrayList;


public class Food {
	
	private String name;
	private String calories;
	private String fat;
	private String carbs;
	private String protein;
	private String cholesterol;
	
	
	/**
	 * creates a food object from an arraylist of strings
	 * @param attributes attributes from database
	 */
	public Food(ArrayList<String> attributes) {
		this.name = attributes.get(0);
		this.calories = attributes.get(1);
		this.fat = attributes.get(2);
		this.carbs = attributes.get(3);
		this.protein = attributes.get(4);
		this.cholesterol = attributes.get(5);
	}
	
	/**
	 * creates a empty food object;
	 */
	public Food() {
		this.name = "name";
		this.calories = "0";
		this.fat = "0";
		this.carbs = "0";
		this.protein = "0";
		this.cholesterol = "0";
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the calories
	 */
	public String getCalories() {
		return calories;
	}
	/**
	 * @param calories the calories to set
	 */
	public void setCalories(String calories) {
		this.calories = calories;
	}
	/**
	 * @return the fat
	 */
	public String getFat() {
		return fat;
	}
	/**
	 * @param fat the fat to set
	 */
	public void setFat(String fat) {
		this.fat = fat;
	}
	/**
	 * @return the carbs
	 */
	public String getCarbs() {
		return carbs;
	}
	/**
	 * @param carbs the carbs to set
	 */
	public void setCarbs(String carbs) {
		this.carbs = carbs;
	}
	/**
	 * @return the protein
	 */
	public String getProtein() {
		return protein;
	}
	/**
	 * @param protein the protein to set
	 */
	public void setProtein(String protein) {
		this.protein = protein;
	}
	/**
	 * @return the cholesterol
	 */
	public String getCholesterol() {
		return cholesterol;
	}
	/**
	 * @param cholesterol the cholesterol to set
	 */
	public void setCholesterol(String cholesterol) {
		this.cholesterol = cholesterol;
	}
	
	
	
}
