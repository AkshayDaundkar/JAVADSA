package LimkedList.practice;

public class Main {
    public static void main(String[] args) {
        var ll= new LinkedList();
        ll.adddLast(10);
        ll.adddLast(20);
        ll.adddLast(30);
        ll.addFirst(5);
        System.out.println( ll.Indexof(10));
        System.out.println(ll.contains(10));

    }
}
