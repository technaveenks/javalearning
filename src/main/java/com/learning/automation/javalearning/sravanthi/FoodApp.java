package com.learning.automation.javalearning.sravanthi;

public class FoodApp {
	
	public static void main(String[] args) {
		
		RestaurantApp restaurantApp = new RestaurantApp();
		restaurantApp.setName("Martin");
		restaurantApp.setPhoneNumber(666136482);
		restaurantApp.setAddress("Mlk dr , 456#");
		restaurantApp.setMenu("FriedRice");
		System.out.println("Customer Name is: " +restaurantApp.getName());
		System.out.println("Customer PhoneNumber is : " +restaurantApp.getPhoneNumber());
		System.out.println("Customer Address is: " +restaurantApp.getAddress());
		System.out.println("Customer Menu is : " +restaurantApp.getMenu());
		
		RestaurantApp restaurantApp1 = new RestaurantApp();
		restaurantApp1.setName("Martin");
		restaurantApp1.setPhoneNumber(666136482);
		restaurantApp1.setAddress("Mlk dr , 456#");
		restaurantApp1.setMenu("FriedRice");
		System.out.println("Customer Name is: " +restaurantApp1.getName());
		System.out.println("Customer PhoneNumber is : " +restaurantApp1.getPhoneNumber());
		System.out.println("Customer Address is: " +restaurantApp1.getAddress());
		System.out.println("Customer Menu is : " +restaurantApp1.getMenu());
		
	}

}