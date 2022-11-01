package com.learning.automation.javalearning.sonu;

public class ArrayIndexOutOfBoundException {

    public static void main(String[] args) {
        int[] arr = {50, 60, 80};
        try {
            System.out.println(arr[3]);

        }catch(Exception e){
            System.out.println("Index is out of bound.");
        }


    }
}
