package com.learning.automation.javalearning.gayathri;

public class FoodApp {
	public static void main(String[] args) {
		Resturant resturant = new Resturant();
		
		resturant.setName("krishna");
		resturant.setAddress("seth folly drive");
		resturant.setMenu("dosa");
		resturant.setPn(346456786);
		System.out.println("the customer name is:" +resturant.getName());
		System.out.println("the address is:"  +resturant.getAddress());
		System.out.println("the menu is:"  +resturant.getMenu());
		System.out.println(("the phone number is: "+resturant.getPn()));
		Resturant resturant1 = new Resturant();
		resturant1.setName("Ram");
		resturant1.setAddress("lace leaf drive");
		resturant1.setMenu("idli");
		resturant1.setPn(234567890);
		System.out.println("the customer name is:" +resturant1.getName());
		System.out.println("the address is:"  +resturant1.getAddress());
		System.out.println("the menu is:"  +resturant1.getMenu());
		System.out.println("the phone number is: "+resturant1.getPn());
		
	}

}
