package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<Double> kolejkaPriorytetowa = new java.util.PriorityQueue<>(Collections.reverseOrder());

        kolejkaPriorytetowa.offer(2.3);
        kolejkaPriorytetowa.offer(5.3);
        kolejkaPriorytetowa.offer(1.3);
        kolejkaPriorytetowa.offer(2.4);
        kolejkaPriorytetowa.offer(0.3);

        while(!kolejkaPriorytetowa.isEmpty()) {
            System.out.println(kolejkaPriorytetowa.poll());
        }
    }
}
