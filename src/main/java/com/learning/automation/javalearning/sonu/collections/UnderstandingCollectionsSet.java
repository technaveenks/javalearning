package com.learning.automation.javalearning.sonu.collections;

import java.util.HashSet;
import java.util.Set;

public class UnderstandingCollectionsSet {

    public static void main(String[] args) {
        Set list = new HashSet<String>();
        list.add("Milk");
        list.add("Bread");
        list.add("Milk");
        list.add("Bread");
        list.add("Cake");
        list.add("Doughnuts");
        list.add("Cake");
        list.add("Doughnuts");

        list.add(10);
        list.add('k');
        list.add(26.85);
        list.add(true);
        list.add(89.52f);
        System.out.println(list);
    }
}
