package objects;

import java.util.ArrayList;

public class Restaurant {
	
	private String name, address, city, state, mondayHours, tuesdayHours, wednesdayHours, thursdayHours, fridayHours, saturdayHours, sundayHours, typeOfMeal;
	
	
	private ArrayList<Review> reviewsList = new ArrayList<Review>();


	
	public Restaurant(String name, String city, String state, String address, String mondayHours, String tuesdayHours, String wednesdayHours, String thursdayHours, String fridayHours, String saturdayHours, String sundayHours, String typeOfMeal) 
	{
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.address = address;
		this.mondayHours = mHours;
		this.tuesdayHours = tuHours;
		this.wednesdayHours = wHours;
		this.thursdayHours = thHours;
		this.fridayHours = fHours;
		this.saturdayHours = saHours;
		this.sundayHours = suHours;
		this.setTypeOfMeal = typeOfMeal;
	}
	
	
	public Restaurant(String n) {
		name = n;
	}
	public Restaurant(String n, String a, String c, String s) {
		name = n;
		address = a;
		city = c;
		state = s;
		
	}
	
	public Restaurant(String name, String address, String city) {
		this.name = name;
		this.address = address;
	}
	
	
	public ArrayList<Review> getReviewsList() {
		return getReviewsList();
	}
	public void addReview(Review r) {
		
	}

	public String getTypeOfMeal() {
		return typeOfMeal;
	}


	public void setTypeOfMeal(String typeOfMeal) {
		this.typeOfMeal = typeOfMeal;
	}
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	public String getAddress() {
		return typeOfMeal;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	public String getMondayHours() {
		return mondayHours;
	}

	public void setMondayHours(String mHours) {
		this.mondayHours = mHours;
	}
	
	public String getTuesdayHours() {
		return tuesdayHours;
	}

	public void setTuesdayHours(String tuHours) {
		this.tuesdayHours = tuHours;
	}
	
	public String getWednesdayHours() {
		return wednesdayHours;
	}

	public void setWednesdayHours(String wHours) {
		this.wednesdayHours = wHours;
	}
	
	public String getThursdayHours() {
		return thursdayHours;
	}

	public void setThursdayHours(String thHours) {
		this.thurdayHours = thHours;
	}
	
	public String getFridayHours() {
		return fridayHours;
	}

	public void setFridayHours(String fHours) {
		this.FridayHours = fHours;
	}
	
	public String getSaturdayHours() {
		return saturdayHours;
	}

	public void setSaturdayHours(String saHours) {
		this.saturdayHours = saHours;
	}
	
	public String getSundayHours() {
		return sundayHours;
	}


	public void setSundayHours(String suHours) {
		this.sundayHours = suHours;
	}

}
