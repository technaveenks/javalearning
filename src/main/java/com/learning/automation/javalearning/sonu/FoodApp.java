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


        //other object
        RestaurantApp restaurantApp1 = new RestaurantApp();
        System.out.println("====other Object=====");
        restaurantApp1.setName("Carol");
        restaurantApp1.setAddress("10 Walnut Dr.");
        restaurantApp1.setMenu("Fried Rice");
        restaurantApp1.setPhoneNumber(1405789452);

        System.out.println("Customer Name: "+restaurantApp1.getName());
        System.out.println("Customer Address: "+restaurantApp1.getAddress());
        System.out.println("Customer Menu Selection2: "+restaurantApp1.getMenu());
        System.out.println("Customer Phone Number: "+restaurantApp1.getPhoneNumber());

    }
}
