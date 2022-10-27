package com.learning.automation.javalearning.sonu;

public class UnderstandingFinal {
    //without final
    int age = 15;
    //with final
    final int ages = 21;

    public static void main(String[] args) {
        UnderstandingFinal understandingFinal = new UnderstandingFinal();
        understandingFinal.age = 40;
    //    understandingFinal.ages=42; //error can not change value of final
        System.out.println(understandingFinal.age);
        System.out.println(understandingFinal.ages);
    }
}
