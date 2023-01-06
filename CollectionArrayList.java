package com.company;

import java.util.ArrayList;

public class CollectionArrayList {
    public static void main(String[] args) {
        System.out.println("Array list Collection Practice");
        ArrayList<String> obj=new ArrayList<String>();
        obj.add(" khalid");
        obj.add(" khan");
        obj.add(" Student");
        obj.add("and ");
        obj.add("Teacher");
        System.out.println(obj);
        obj.addAll(obj);

        // Add String at index number
        obj.add(1,"masood");
        System.out.println(obj);

        // Remove String from array
        obj.remove(0);
        System.out.println(obj);

        // Replace String With other String
        obj.set(0,"ok1");
        System.out.println(obj);

        // Get Single value by index
        obj.set(0,"ok");
        System.out.println(obj.get(3));
        // Clear All ArrayList
        obj.clear();
        System.out.println(obj);
    }
}
