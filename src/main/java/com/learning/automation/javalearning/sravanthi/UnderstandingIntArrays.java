package com.learning.automation.javalearning.sravanthi;

public class UnderstandingIntArrays {
	public static void main(String[] args) {

		//Single dimensional Array
		int Age[] = {22,33,44,55,66};
		System.out.println(Age[2]);
		System.out.println("Length of array is : " +Age.length);
		for (int retreivedValues:Age){
			System.out.println("**" + retreivedValues);
}

		//Multi dimensional Array

		int Marks [][] = {{1,2,3,4,5,6},{2,4,6,8,10},{1,3,5,7,9,2,3,5,8}};
		System.out.println("-- " +Marks[2][3]);
		System.out.println("Length of multi dimensional Array is : " + Marks.length);
		for (int RetreiveMarks[]:Marks) {
			for(int values:RetreiveMarks) {
				System.out.println("@ " +values );
	}
			System.out.println("$$$"+RetreiveMarks.length);

}

}
}
