package com.company;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        Stack<String> stos = new Stack<String>();

        stos.push("item 1");
        stos.push("item 2");
        stos.push("item 3");
        stos.push("item 4");
        stos.push("item 5");

        System.out.println(stos.empty());
        System.out.println(stos);
        stos.pop();
        System.out.println(stos.peek());
        System.out.println(stos);

        String topItem = stos.pop();
        System.out.println(topItem);

        System.out.println(stos.search("???"));
    }
}