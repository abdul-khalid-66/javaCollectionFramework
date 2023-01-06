package com.company;

import java.util.ArrayDeque;

public class collectionArrayDeque {
    public static void main(String[] args) {
        System.out.println("Array Collection Frame Work Queue");
        System.out.println("Array First in First out (FIFO) ");
        ArrayDeque<String> obj=new ArrayDeque<String>();
        obj.push("laptop");
        obj.push("Keyboard");
        obj.push("Mouse");
        obj.push("Screen");
        System.out.println(obj);

        obj.pop();
        System.out.println(obj);
    }
}
