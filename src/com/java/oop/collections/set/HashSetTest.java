package com.java.oop.collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    static void main(String[] args) {
        HashSet<String> namesSet = new HashSet<>();
        namesSet.add("A");
        namesSet.add("B");
        namesSet.add("C");
        namesSet.add("D");

        System.out.println(namesSet);
        System.out.println(namesSet.size());
        System.out.println(namesSet.contains("A"));
        System.out.println(namesSet.isEmpty());
        System.out.println(namesSet.remove("A"));
        System.out.println(namesSet);
        System.out.println();

        //Iterator
        Iterator<String> iterator = namesSet.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);


        }
    }

}
