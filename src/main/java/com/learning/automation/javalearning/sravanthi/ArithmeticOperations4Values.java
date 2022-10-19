package com.learning.automation.javalearning.sravanthi;

import java.util.Scanner;

public class ArithmeticOperations4Values {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a: ");
		int a = sc.nextInt();
		System.out.print("Enter b: ");
		int b = sc.nextInt();
		System.out.print("Enter c: ");
		int c = sc.nextInt();
		System.out.print("Enter d: ");
		int d = sc.nextInt();
		int Sum = a+b+c+d;
		System.out.println("Addition Result:" +Sum);
		int Diff = a-b-c-d;
		System.out.println("Subtraction Result:" +Diff);
		int Mul = a*b*c*d;
		System.out.println("Multiplication Result:" +Mul);
		float Div = (a/b)/(c/d);
		System.out.println("Division Result:" +Div);
		float modulo = (a%b%c%d);
		System.out.println("Modulo Result:" +modulo);
	}

}
