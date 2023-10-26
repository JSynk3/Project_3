package org.example;

import java.util.Iterator;

/**
 * Output:
 *
 * Apple
 * Orange
 * Banana
 * Tangerine
 * Peach
 *
 * Empty? false
 * Bag size: 5
 *
 * Apple
 * Orange
 * Banana
 * Tangerine
 * Peach
 */
public class BagManager {
    public static void main(String[] args) {

        Container<String> stringBag = new Bag<>();

        stringBag.add("Apple");
        stringBag.add("Orange");
        stringBag.add("Banana");
        stringBag.add("Tangerine");
        stringBag.add("Peach");

        stringBag.forEach(System.out::println);
        System.out.println();

        System.out.println("Empty? " + stringBag.isEmpty());
        System.out.println("Bag size: " + stringBag.size());
        System.out.println();

        Iterator<String> iter = stringBag.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}