package objects;

import java.util.ArrayList;

public class Restaurant {
	
	private String name, address, city, state, hours, typeOfMeal;
	
	
	private ArrayList<Review> reviewsList = new ArrayList<Review>();


	
	public Restaurant(String name, String address, String city, String state, String hours, String typeOfMeal) 
	{
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.hours = hours;
		this.setTypeOfMeal(typeOfMeal);
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
	
	public String getHours() {
		return hours;
	}


	public void setHours(String hours) {
		this.hours = hours;
	}

}
