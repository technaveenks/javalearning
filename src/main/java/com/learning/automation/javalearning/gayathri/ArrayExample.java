package com.learning.automation.javalearning.gayathri;

public class ArrayExample {
	
	public static void main(String[] args) {
		int marks[] = {2,3,4,5,6};
		System.out.println(marks.length);
		System.out.println(marks[4]);
		for (int retrivedvalues : marks) {
			System.out.println(" -----" +retrivedvalues);
		}
		
		int studentMarks[][] = {{2,3,4,5,6},{4,5,6,7,8},{5,6,7,8,9}};
		System.out.println(studentMarks[0][0]);
		System.out.println(studentMarks[1][0]);
		for (int[] retrivedvalues : studentMarks) {
			for(int values : retrivedvalues) {
				System.out.println(" *****" +values);
			}
		}
	}

}
