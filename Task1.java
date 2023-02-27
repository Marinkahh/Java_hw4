package Seminar4.hw;

import java.util.Iterator;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
        Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

    }
}
