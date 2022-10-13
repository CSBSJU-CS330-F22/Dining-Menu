/**
 * 
 */
package Food;

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
	public Review(String itemName, String userEmail, String rating, String title, String reviewDescrip, boolean anon) {
		this.itemName = itemName;
		this.userEmail = userEmail;
		this.rating = rating;
		this.title = title;
		this.reviewDescrip = reviewDescrip;
		this.anon = anon;
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
