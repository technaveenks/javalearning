package com.learning.automation.javalearning.sonu;

public class FoodApp {

    public static void main(String[] args) {
        RestaurantApp restaurantApp = new RestaurantApp();
        restaurantApp.setAddress("123 Hello Street");
        restaurantApp.setMenu("Pizza");
        restaurantApp.setName("Sharon");
        restaurantApp.setPhoneNumber(1234567890);

        System.out.println("Customer Name: "+restaurantApp.getName());
        System.out.println("Customer Address: "+restaurantApp.getAddress());
        System.out.println("Customer Menu Selection: "+restaurantApp.getMenu());
        System.out.println("Customer Phone Number:"+restaurantApp.getPhoneNumber());
    }
}
