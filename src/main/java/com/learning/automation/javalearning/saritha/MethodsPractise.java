package com.learning.automation.javalearning.saritha;

public class MethodsPractise {

		int firstVal = 10;
		int secondVal = 5;
		
		public void addition()
		{ 
			int sum = firstVal + secondVal;
			System.out.println("The sum of two values : " +sum);
		}
		public void subtraction()
		{ 
			int sub = firstVal - secondVal;
			System.out.println("The subtraction of two values : " +sub);
		}
		public void multiplication()
		{ 
			int mul = firstVal * secondVal;
			System.out.println("The multiplication of two values : " +mul);
		}
		public void division()
		{ 
			int div = firstVal / secondVal;
			System.out.println("The division of two values : " +div);
		}
		public void modulo()
		{ 
			int mod = firstVal % secondVal;
			System.out.println("The modulo of two values : " +mod);
		}
		
		
		public static void main(String[] args) {
			MethodsPractise methodsPractise = new MethodsPractise();
			methodsPractise.addition();
			methodsPractise.subtraction();
			methodsPractise.multiplication();
			methodsPractise.division();
			methodsPractise.modulo();
		
		
	}

}
