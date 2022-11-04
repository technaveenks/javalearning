package com.learning.automation.javalearning.gayathri.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
	list.add("milk");
	list.add("Bread");
	list.add("Fruits");
	//list.add(10);
	//list.add('g');
	//list.add(true);
	//list.add(22.33);
	//list.add(45.65f);
	System.out.println(list);
	
	//to get a particular item from list
	
	//System.out.println(list.get(0));
	//System.out.println(list.get(4));
	//list.remove(4);
	//System.out.println(list);
	
	//to add an item to the particular location in the list
	list.add(3, "five");
	System.out.println(list);
	//to get all items from the list
	Iterator iterator = list.iterator();
	while(iterator.hasNext()) {
	System.out.println(iterator.next());
	}
	//to sort the items in the ascending order in the list
	Collections.sort(list);
	System.out.println(list);
	//to reverse the order in the list
	Collections.sort(list,Collections.reverseOrder());
	System.out.println(list);
	
}
}
