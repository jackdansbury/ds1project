package objects;

import java.util.ArrayList;

public class User {
	
	private String username, password, firstName, lastName, address, city, state, bio;
	private int reviewCount = 0;
	private int userUpvoteCount = 0;
	
	private ArrayList<Review> userReviewsList = new ArrayList<Review>();
	private ArrayList<Review> draftList = new ArrayList<Review>();

	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public User(String username, String password, String firstName, String lastName, String address, String city, String state, String bio) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.bio = bio;
		
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}

	public ArrayList<Review> getUserReviewsList() {
		return userReviewsList;
	}

	public void setUserReviewsList(ArrayList<Review> userReviewsList) {
		this.userReviewsList = userReviewsList;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReviewCount() {
		return Integer.toString(reviewCount);
	}

	public void setReviewCount(String reviewCount) {
		this.reviewCount = Integer.parseInt(reviewCount);
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}
//	public void addReview(T) {
//		this.userReviewsList.add(r);
//	}
	public void addReview(Review r) {
		this.userReviewsList.add(r);
	}
	public void addDraft(Review r) {
		this.draftList.add(r);
	}

	public int getUserUpvoteCount() {
		return userUpvoteCount;
	}

	public void setUserUpvoteCount(int userUpvoteCount) {
		this.userUpvoteCount = userUpvoteCount;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
