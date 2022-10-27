package com.learning.automation.javalearning.sonu;

public class UnderstandingStatic {
    static int number = 25;

    public static void addition(){
        int num1 = 10;
        int num2 = 15;

        int sum = num1 +num2;
        System.out.println("The sum of two numbers is: "+sum);//25
        System.out.println("Number = "+ number);
        number = number + 15;   //25+15=40
    }
    static {
        System.out.println("This is Static Block.");//This will execute first.
        number = number + 15;
    }

    public static void main(String[] args) {
     //   UnderstandingStatic understandingStatic = new UnderstandingStatic();
        addition();
        System.out.println("* Number = "+ number);//40+15=55
    }
}
