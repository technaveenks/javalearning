package com.learning.automation.javalearning;

public class DealingWithStrings {

	public static void main(String[] args) {
		Integer value = 20;
		String v = "20";
		Object type;
		System.out.println(v);
		System.out.println(v.getClass());

		String response = String.valueOf(value);
		System.out.println(response);
		type = response;
		System.out.println(type.getClass());
		/*
		 * String result = Integer.toString(value); System.out.println(result);
		 * 
		 * StringBuilder builder = new StringBuilder(); builder.append(value); type =
		 * builder; System.out.println(type.getClass());
		 */

	}

}
