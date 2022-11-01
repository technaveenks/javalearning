package com.learning.automation.javalearning.sonu;

public class EqualsMethod {

    public static void main(String[] args) {
        String name = "Hello";
        String details = "hello";
        boolean isEquals = details.equals(name);
        System.out.println(isEquals);
        if(name == details) {
            System.out.println("same");
        }else{
            System.out.println("different");
        }

     //   int isEquals = name.compareToIgnoreCase(details);
        System.out.println("value of isEquals "+isEquals);
    }
}
