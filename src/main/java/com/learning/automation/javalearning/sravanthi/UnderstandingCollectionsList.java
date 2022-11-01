package com.learning.automation.javalearning.sravanthi;

//import java.awt.List;
import java.util.*;

public class UnderstandingCollectionsList {
public static void main(String[] args) {
	//List list = new ArrayList();
	List<String>list = new ArrayList<String>();
	list.add("Name");
	list.add("Address");
	list.add("Phone Number");
	list.add("Email");
	/*list.add(25);
	list.add(20.05);
	list.add(38.5f);
	list.add('m');
	list.add(true);*/
	
	System.out.println(list);
	//To get particula item from list
	System.out.println("Gettimg particular item: " + list.get(2));
	//Removing particular item from list
	System.out.println("Removing particular item: " +list.remove(1));
	//Adding item to list
	System.out.println("Adding item in  between: " );
	list.add(1,"Add Details");
	System.out.println(list);

	Iterator iterator = list.iterator();
	while (iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	Collections.sort(list);
	System.out.println(list);
	Collections.sort(list,Collections.reverseOrder());
	System.out.println("Sorting list in reverse order: ");
	System.out.println(list);
	
	
}
	
}
