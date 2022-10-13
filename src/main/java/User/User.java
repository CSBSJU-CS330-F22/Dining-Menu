/**
 * 
 */
package User;

import java.util.ArrayList;

import Food.Food;

/**
 * @author jnewhouse003
 *
 */
public class User {
	private String email;
	private String password;
	private String firstName;
	private String lastName;
	private Food favFood;
	
	
	public User(ArrayList<String> attributes, Food food) {
		this.email = attributes.get(0);
		this.password = attributes.get(1);
		this.firstName = attributes.get(2);
		this.lastName = attributes.get(3);
		this.setFavFood(food);
	}
	
	public User() {
		this.email = "email@email.com";
		this.password = "password";
		this.firstName = "firstName";
		this.lastName = "lastName";
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the favFood
	 */
	public Food getFavFood() {
		return favFood;
	}

	/**
	 * @param favFood the favFood to set
	 */
	public void setFavFood(Food favFood) {
		this.favFood = favFood;
	}
	
	
}
