package com.learning.automation.javalearning.sujatha;

public class FoodApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestaurantApp restappobj=new RestaurantApp();
		
		//restappobj.Address="213,west avenue,apt123,20990";
		restappobj.setCustname("Raj");
		restappobj.setAddress("gajfhgajh 8764");
		restappobj.setContactNumber(32421526);
		restappobj.setMenu("roti");
		System.out.println("Customer Address:"+restappobj.getAddress());
		System.out.println("Customer Name:"+restappobj.getCustname());
		System.out.println("Customer Contact NUmber:"+restappobj.getContactNumber());
		System.out.println("Customer Menu:"+restappobj.getMenu());
		
		
		RestaurantApp restappobj1=new RestaurantApp();
		restappobj1.setCustname("Raj");
		restappobj1.setAddress("gajfhgajh 8764");
		restappobj1.setContactNumber(32421526);
		restappobj1.setMenu("roti");
		System.out.println("Customer Address:"+restappobj1.getAddress());
		System.out.println("Customer Name:"+restappobj1.getCustname());
		System.out.println("Customer Contact NUmber:"+restappobj1.getContactNumber());
		System.out.println("Customer Menu:"+restappobj1.getMenu());
				
	}

}
