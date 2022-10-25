package com.learning.automation.javalearning.sonu;

public class StringArraysAssignment {

    public static void main(String[] args) {
        //single-dimension
        String cars[] = {"BMW", "Audi", "Tesla", "Lexus"};
        System.out.println(cars.length);
        for (String getCars : cars) {
            System.out.println(getCars);
        }
        //Multi-Dimension
        System.out.println("===Multi-Dimension===");
        String allCars[][] = {{"BMW", "Audi", "Tesla", "Lexus"}, {"Kia", "Hyundai", "Honda"}, {"Range Rover", "Maserati", "Ford Bronco", "Aston Martin"}};
        System.out.println(allCars[2][1]);
        for (String[] getAllCars : allCars) {
            for (String listCars : getAllCars) {
                System.out.println(listCars);
            }

        }
        System.out.println("=====One-More-Example=====");
        String names[][] = {{"Anita","Carol","Anna"},{"Arnold","Tom","Chester"},{"Ram","Sharon","Laxmi"}};
        for(String[] getNames : names){
            for(String allNames : getNames){
                System.out.println(allNames);
            }
        }
    }
}
