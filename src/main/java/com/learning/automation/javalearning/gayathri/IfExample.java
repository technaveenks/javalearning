package com.learning.automation.javalearning.gayathri;

public class IfExample {
	public static void main(String[] args) {
		int a = 20,b = 30,c = 40;
		if (a>b) {
			System.out.println("a is greater");	
	}
		else if (b>c) {
			System.out.println("b is greater");
		}
		else System.out.println("c is greater");
	
  // declaring a variable is switch statement
	
     int number = 20;
     
  switchCase(number);
	}

	private static void switchCase(int number) {
		// switch expression
		 switch(number) {
   // switch statements
		 case 10: System.out.println("the number is :" +10);
		 break;
		 case 20: System.out.println("the number is :" +20);
		 break;
		 case 30: System.out.println("the number is :" +30);
		 break;
		 default:
			 System.out.println("the number is not in 10,20,30");
			 
		 }
		 // for loop 
		 for (int i=1;i<= 10;i++) {
			 System.out.println(i);
		 }
		 // Declaring an array
		 int numbers[] = {1,4,5,7,8,9,6};
		 System.out.println(numbers[0]);
		 
		 //print the specific number 
		 System.out.println("the indexed numbers:" + numbers[2]);
		 
		 // for each loop
		 for (int z: numbers) {
			 System.out.println("the numbers  are ***" +z);
		 }
			// for loop for any array
		 System.out.println("THE NUMBERS LENGTH IS" +numbers.length);
		for (int i=0;i<numbers.length;i++) {
			System.out.println("***** " +numbers[i]);
		}
			 
	     //while loop 
		int gascost =0;
		while(gascost<=10) {
		System.out.println("the pumping and the gas cost is :" + gascost);
		gascost++;
		}
			
		//DO WHILE LOOP
		gascost = 0; 
		do {
			System.out.println("***the pumping gas and the gas cost is:"  +gascost);
		    gascost++;
		}while(gascost<=10);
		
		 }
		 
		 
	} 

