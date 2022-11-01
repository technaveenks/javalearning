package com.learning.automation.javalearning.neeraja;

public class FoodApp {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestuarentApp resturarentapp=new RestuarentApp();
		resturarentapp.setName("Ram");
		resturarentapp.setAddress("wside dr");
		resturarentapp.setPhoneNumber(23467890);
		resturarentapp.setMenu("Upma");
		System.out.println("Customer name is:"+resturarentapp.getName());
		System.out.println("Customer address  is:"+resturarentapp.getAddress());
		System.out.println("Customer phone number is:"+resturarentapp.getPhoneNumber());
		System.out.println("Customer menu is:"+resturarentapp.getMenu());
		System.out.println("**************");
		
		RestuarentApp resturarentapp1=new RestuarentApp();
		
		resturarentapp1.setName("Ram");
		resturarentapp1.setAddress("wside dr");
		resturarentapp1.setPhoneNumber(23467890);
		resturarentapp1.setMenu("Upma");
		System.out.println("Customer name is:"+resturarentapp1.getName());
		System.out.println("Customer address  is:"+resturarentapp1.getAddress());
		System.out.println("Customer phone number is:"+resturarentapp1.getPhoneNumber());
		System.out.println("Customer menu is:"+resturarentapp1.getMenu());
		
		
	}

}
