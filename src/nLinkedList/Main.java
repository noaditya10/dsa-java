package nLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(11);
        System.out.println(list);
        System.out.println(list.contains(11));
    }
}
