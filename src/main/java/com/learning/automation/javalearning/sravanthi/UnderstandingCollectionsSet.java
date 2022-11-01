package com.learning.automation.javalearning.sravanthi;
//import java.awt.List;
import java.util.*;
public class UnderstandingCollectionsSet {
public static void main(String[] args) {
	Set list = new HashSet();
	list.add("Name");
	list.add("Address");
	list.add("Phone Number");
	list.add("Email");
	list.add("Name");
	list.add("Address");
	list.add("Phone Number");
	list.add("Email");
	list.add(25);
	list.add(20.05);
	list.add(38.5f);
	list.add('m');
	list.add(true);
	System.out.println(list);
		Iterator iterator = list.iterator();
	while (iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
}
	
}
