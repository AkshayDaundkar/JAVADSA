package LinkedList;

public class SingleLinkedList {

    public class Node {
        public int value;
        public Node next;
    }

    public Node head;
    public Node tail;
    public int size;

    public Node createSingleLL(int nodeValue)
    {
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        tail=node;
        size=1;
        return head;
    }



}
