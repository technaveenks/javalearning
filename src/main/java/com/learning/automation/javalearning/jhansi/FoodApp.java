package com.learning.automation.javalearning.jhansi;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantApp restaurantapp = new RestaurantApp();
		restaurantapp.setName("abc");
		restaurantapp.setAddress("xyz Dr");
		restaurantapp.setPhonenumber(1234567890);
		restaurantapp.setMenu("item1");
		
		System.out.println("customer name is:" +restaurantapp.getName());
		System.out.println("customer address is:" +restaurantapp.getAddress());
		System.out.println("customer phone number is:" +restaurantapp.getPhonenumber());
		System.out.println("customer menu is:" +restaurantapp.getMenu());
		
		//creating multiple objects
		RestaurantApp restaurantapp1 = new RestaurantApp();
		restaurantapp1.setName("abc");
		restaurantapp1.setAddress("xyz Dr");
		restaurantapp1.setPhonenumber(1234567890);
		restaurantapp1.setMenu("item1");
		
		System.out.println("customer name is:" +restaurantapp1.getName());
		System.out.println("customer address is:" +restaurantapp1.getAddress());
		System.out.println("customer phone number is:" +restaurantapp1.getPhonenumber());
		System.out.println("customer menu is:" +restaurantapp1.getMenu());
	}

}
