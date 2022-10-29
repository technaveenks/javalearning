package com.learning.automation.javalearning.malathi;

public class FoodApp {
public static void main(String[] args) {
	RestaurentApp restaurent=new RestaurentApp();
	RestaurentApp restaurant=new RestaurentApp();
	
	//First object
	restaurent.setName("Veena");
	restaurent.setAddress("West place");
	restaurent.setPhoneNumber(1234567890);
	restaurent.setMenu("Pizza");
	
	//second object
	restaurant.setName("Veena");
	restaurant.setAddress("West place");
	restaurant.setPhoneNumber(1234567890);
	restaurant.setMenu("Pizza");
	
	
	//Printing first object
	
	System.out.println("Customer name is: "+restaurent.getName());
	System.out.println("Customer address is: "+restaurent.getAddress());
	System.out.println("Restaurant menu is "+restaurent.getMenu());
	System.out.println("Customer phone number is:"+restaurent.getPhoneNumber());
	
	
	//Printing second object
	System.out.println("\nCustomer name is: "+restaurant.getName());
	System.out.println("Customer address is: "+restaurant.getAddress());
	System.out.println("Restaurant menu is "+restaurant.getMenu());
	System.out.println("Customer phone number is:"+restaurant.getPhoneNumber());

	
    
}
}
