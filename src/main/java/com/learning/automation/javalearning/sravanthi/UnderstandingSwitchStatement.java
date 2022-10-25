package com.learning.automation.javalearning.sravanthi;
import java.util.*;
public class UnderstandingSwitchStatement {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Month number : ");
		int Mnumber =scanner. nextInt();
		
		switch(Mnumber) {
		case 1:  System.out.println("It is Janjuary");
		break;
		case 2: System.out.println("It is February");
		break;
		case 3: System.out.println("It is March");
		break;
		case 4: System.out.println("It is April");
		break;
		case 5: System.out.println("It is May");
		break;
		case 6: System.out.println("It is June");
		break;
		default: System.out.println("Invalid Number");
		
	}

}
}
