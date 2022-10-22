package com.learning.automation.javalearning.sravanthi;

public class CreatingMethod {
	int a = 2;
	int b = 5 ;
	
	public void multiplication() {
		
		int multiplication = a*b;
		System.out.println("Multiplication of a and b is :" + multiplication);
	}
	
	public void division(){
		int div = a/b;
		System.out.println("Division of a and b is :" +div);
	}
	
	public void modulo() {
		int modulo = a%b;
		System.out.println("Modulo of a and b is:" +modulo);
	}
	
	public static void main(String[] args) {
		
	CreatingMethod creatingMethod = new CreatingMethod();
	creatingMethod.multiplication();
	creatingMethod.division();
	creatingMethod.modulo();
	
	}
}
