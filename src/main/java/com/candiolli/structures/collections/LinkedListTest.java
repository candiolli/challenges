package com.candiolli.structures.collections;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String args[]) {
        addRemoveMethod();
    }

    private static void addRemoveMethod() {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();
        ll.add("F");
        System.out.println(ll);
    }


}
