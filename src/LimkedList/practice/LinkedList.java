package LimkedList.practice;

import Patterns.Patterns;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //isEmpty
    private boolean isEmpty() {
        return first == null;
    }

    //addLast
    public void adddLast(int element) {
        var node = new Node(element);
        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    //addFirst
    public void addFirst(int element) {
        var node = new Node(element);
        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    //indexOf
    public int Indexof(int element) {
        int index = 0;
        var current = first;
        while (current != null) {
            if (current.value == element)
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(int element)
    {
       return Indexof(element) !=-1;
    }
    //deleteFirst
    //deleteLast
    //contains
    //indexOf

}
