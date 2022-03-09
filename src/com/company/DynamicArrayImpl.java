package com.company;

public class DynamicArrayImpl {
    public static void main(String[] args) {
        DynamicArray tablicaDynamiczna = new DynamicArray();
        tablicaDynamiczna.Add("A");
        tablicaDynamiczna.Add("B");
        tablicaDynamiczna.Add("C");
        tablicaDynamiczna.Add("D");
        tablicaDynamiczna.Delete("D");

        tablicaDynamiczna.Insert("X",1);

        System.out.println(tablicaDynamiczna.toString());
        System.out.println("index of B: " + tablicaDynamiczna.Search("B"));
        System.out.println("capacity: " + tablicaDynamiczna.capacity);
        System.out.println("empty: " + tablicaDynamiczna.IsEmpty());
    }
}
