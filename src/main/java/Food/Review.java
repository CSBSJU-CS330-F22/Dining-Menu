/**
 * 
 */
package Food;

import java.util.ArrayList;

/**
 * @author jolsen001
 *
 */
public class Review {

	private String itemName;
	private String userEmail;
	private String rating;
	private String title;
	private String reviewDescrip;
	private boolean anon;
	/**
	 * 
	 */
	public Review(ArrayList<String> reviewInfo) {
		this.itemName = reviewInfo.get(0);
		this.userEmail = reviewInfo.get(1);
		this.rating = reviewInfo.get(2);
		this.title = reviewInfo.get(3);
		this.reviewDescrip = reviewInfo.get(4);
		this.anon = Boolean.parseBoolean(reviewInfo.get(5));
	}
	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}
	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}
	/**
	 * @param rating the rating to set
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the reviewDescrip
	 */
	public String getReviewDescrip() {
		return reviewDescrip;
	}
	/**
	 * @param reviewDescrip the reviewDescrip to set
	 */
	public void setReviewDescrip(String reviewDescrip) {
		this.reviewDescrip = reviewDescrip;
	}
	/**
	 * @return the anon
	 */
	public boolean getAnon() {
		return anon;
	}
	/**
	 * @param anon the anon to set
	 */
	public void setAnon(boolean anon) {
		this.anon = anon;
	}
	
}
