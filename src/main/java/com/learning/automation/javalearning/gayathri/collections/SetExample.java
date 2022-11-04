package com.learning.automation.javalearning.gayathri.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {
  public static void main(String[] args) {
	Set list = new HashSet();
	list.add("milk");
	list.add("Bread");
	list.add("Fruits");
	list.add("milk");
	list.add("Bread");
	list.add("Fruits");
	list.add(10);
     list.add('g');
	list.add(true);
	list.add(22.33);
	list.add(45.65f);
	System.out.println(list);
	//to get all items from the list
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
		System.out.println(iterator.next());
		}
}
}
