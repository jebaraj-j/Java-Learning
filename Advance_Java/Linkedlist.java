package Advance_Java;

import java.util.LinkedList;

public class Linkedlist {
    static void main(String[] args) {
        LinkedList <Integer> link =  new LinkedList<>();
        link.add(100);
        link.add(200);

        link.addFirst(2);
        link.addLast(10);
        link.stream().forEach(x-> System.out.println(x));
    }
}
