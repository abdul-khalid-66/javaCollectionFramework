package com.company;

import java.util.LinkedList;
import java.util.Stack;

public class CollectionStack {
    public static void main(String[] args) {
        System.out.println("Stack in Collection Frame work");
        System.out.println("Last in first out (LIFO) ");
        Stack<String> obj=new Stack<String>();
        obj.push("computer");
        obj.push("Chair");
        obj.push("Glass");
        System.out.println(obj);
        obj.pop();
        System.out.println(obj);
    }
}
