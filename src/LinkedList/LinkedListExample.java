package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        //add
        list.add(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);
        System.out.println(list);

        //remove
        list.remove(1);
        //list.removeFirst();
        //list.removeLast();

        //contains
        System.out.println(list.contains(20));
        //index
        System.out.println(list.indexOf(20));
        list.addLast(20);
        System.out.println(list);
        System.out.println(list.lastIndexOf(20));

        //size
        System.out.println(list.size());

        //convert to array
        var arr=list.toArray();
        System.out.println(Arrays.toString(arr));
        //print
        //System.out.println(list);

    }
}
