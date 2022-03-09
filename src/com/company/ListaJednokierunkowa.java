package com.company;

import java.util.LinkedList;

public class ListaJednokierunkowa {
    public static void main(String[] args) {
        LinkedList<String> listaJednokierunkowa = new LinkedList<String>();

        listaJednokierunkowa.offer("A");
        listaJednokierunkowa.offer("B");
        listaJednokierunkowa.offer("C");
        listaJednokierunkowa.offer("D");
        listaJednokierunkowa.offer("F");
        listaJednokierunkowa.add(4, "E");

        System.out.println(listaJednokierunkowa.peekFirst());
        System.out.println(listaJednokierunkowa.peekLast());

        listaJednokierunkowa.addFirst("0");
        listaJednokierunkowa.addLast("G");
        System.out.println(listaJednokierunkowa);

    }
}
