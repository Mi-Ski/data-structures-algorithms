package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
//        add = offer()
//        remove = poll()
        Queue<String> kolejka = new LinkedList<String>();

        kolejka.offer("Ol");
        kolejka.offer("Li");
        kolejka.offer("Ul");
        System.out.println(kolejka);
        System.out.println(kolejka.peek());;
        kolejka.poll();
        System.out.println(kolejka);
    }
}
