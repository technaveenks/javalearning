package com.learning.automation.javalearning.sonu;

public class UnderstandingConstructors {

    int a,b,c;

    public UnderstandingConstructors(){
        a = 9;
        b = 2;
        c = 5;
    }

    public UnderstandingConstructors(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;

    }

    public void subtraction(){
        int value = (a - b) + c;
        System.out.println("The subtraction and addition of numbers is: "+value);

    }

    public void addition(){
        int value = a + b + c;
        System.out.println("The addition of two numbers is: "+value);
    }

    public static void main(String[] args) {
        UnderstandingConstructors constructors = new UnderstandingConstructors(); //default constructor
        UnderstandingConstructors constructors1 = new UnderstandingConstructors(100,200,300);//parameterized constructor
        constructors.subtraction();
        constructors.addition();
        constructors1.subtraction();
        constructors1.addition();

    }
}
