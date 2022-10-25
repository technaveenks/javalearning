package com.learning.automation.javalearning.sonu;

public class UnderstandingIntArrays {

    public static void main(String[] args) {
        //single-dimension
        int data = 1;
        int marks[] = {26, 85, 56, 98, 78, 65};
        System.out.println(marks.length);
        System.out.println(marks[3]);
        System.out.println("-------------");
        for (int getValues : marks) {
            System.out.println(getValues);
        }
        //Multi-dimension
        System.out.println("====Multi-dimension=====");
        int studentMarks[][] = {{20, 85, 56, 196, 74}, {54, 85, 32, 65, 45, 88}, {54, 88, 77, 99, 39}};
        System.out.println("length of Array is: " + studentMarks.length);
        System.out.println("index of array [0][3],[1][5]&[2][3]is: " + studentMarks[0][3] + " " + studentMarks[1][5] + " " + studentMarks[2][3]);
        for (int[] getValues : studentMarks) {
            for (int getValues1 : getValues) {

                System.out.println(getValues1);
            }

        }
    }

}
