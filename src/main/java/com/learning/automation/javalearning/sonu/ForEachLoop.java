package com.learning.automation.javalearning.sonu;

public class ForEachLoop {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 9, 10};
        String cars[]={"Tesla","BMW","Lexus","Mercedes"};
        for (int x : arr) {
            System.out.println(x);
        }
        for (String s : cars){
            System.out.println(s);

        }
        for(int i = 0; i < arr.length;i++){
            System.out.println("*** "+ arr[i]);
        }

        }
    }
