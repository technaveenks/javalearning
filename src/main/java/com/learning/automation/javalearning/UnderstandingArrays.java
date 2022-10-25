package com.learning.automation.javalearning;

public class UnderstandingArrays {
	
	public static void main(String[] args) {
		int data = 1;
		int marks[]= {4,5,6,8,9};
		System.out.println(marks.length);
		System.out.println(marks[3]);
		for(int retrievedValues :marks) {
			System.out.println("----" +retrievedValues);
		}
		
		int studentMarks[][]= {{4,5,6,8,9},{6,8,9,5,5},{8,7,6,8,9}};
		System.out.println(studentMarks[1][0]);
		for(int[] retrievedValues :studentMarks) {
			for(int values :retrievedValues) {
			System.out.println("-***-" +values);
		}
		}
	}

}
