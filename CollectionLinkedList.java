package com.company;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<String> obj=new LinkedList<String>();
        obj.add("Khalid");
        obj.add("khan");
        obj.add("Computer");
        System.out.println(obj);

        // Add at First
        obj.addFirst("fist");
        System.out.println(obj);
        obj.set(0,"index 0");
        System.out.println(obj);

        // Add at Middle
        obj.add(2,"Last");
        System.out.println(obj);

        // Add at last
        obj.addLast("Last");
        System.out.println(obj);

        // Remove from last
        obj.removeLast();
        System.out.println(obj);

        // Remove from last
        obj.removeFirst(); //remove form first
        obj.remove(); // remover same from first
        System.out.println(obj);

//        obj.remove(); //remove form first
        obj.remove(2); // remover index from first
        System.out.println(obj);
    }
}
