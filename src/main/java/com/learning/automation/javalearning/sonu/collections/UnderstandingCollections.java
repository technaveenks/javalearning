package com.learning.automation.javalearning.sonu.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class UnderstandingCollections {

    public static void main(String[] args) {
        List<String> list = new ArrayList();
        //list can have dupicate values
        list.add("Milk");
        list.add("Bread");
        list.add("Chocolates");
        list.add("Milk");
        list.add("Bread");
        list.add("Chocolates");
      //  list.add(10);
      //  list.add('k');
      //  list.add(true);
      //  list.add(23.33);
      //  list.add(12.32f);
        System.out.println(list);

        //getting particular item from list
        System.out.println(list.get(0));
     //   list.remove(3);
        list.add(3,"Ten");
        System.out.println(list);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
