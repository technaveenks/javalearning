package com.learning.automation.javalearning.sonu.inheritance;

import com.learning.automation.javalearning.sonu.UnderstandingMethods;

public class ClassB extends ClassA{
    public void method01(){
        System.out.println("This is method from ClassB");
    }

    public static void main(String[] args) {
        ClassB b = new ClassB();
        b.method01();
        b.methodfromA();
        b.methodz();

        UnderstandingMethods understandingMethods = new UnderstandingMethods();
        understandingMethods.addition(4,5);

    }
}
