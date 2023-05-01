package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListExample {
    public static void AddElementsinArrayList() //add
    {
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
        //System.out.println(al);

        ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
        //Add
        arraylist.add(1);    //0(1)
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);
        arraylist.add(4);


        //Add using Index --rest all move to right also you cannot skip index so directly we can add to index 6 before 12345
        arraylist.add(0, 0);   //0(N)
        arraylist.add(2, 15);
        arraylist.add(7, 15);


        System.out.println(arraylist);


        ArrayList<String> sl = new ArrayList<String>(Arrays.asList("A","B","C"));
        //Add
        sl.add("Akshay");
        sl.add("Shivani");
        sl.add(1, "Xyz");
        System.out.println(sl);

    }

    public static void AccessElementArrayList() { //get
        ArrayList<Integer> arraylist = new ArrayList<Integer>(10);
        arraylist.add(1);
        arraylist.add(2);
        arraylist.add(3);
        arraylist.add(4);

        System.out.println(arraylist.get(0));
        System.out.println(arraylist.get(1));
        System.out.println(arraylist.get(2));
        System.out.println(arraylist.get(3));
    }

    public static void TraverseArraylist() {
        ArrayList<String> sl = new ArrayList<String>();
        //Add
        sl.add("Akshay");
        sl.add("Shivani");
        sl.add(1, "Xyz");
        //System.out.println(sl);

        //appproach 1 for loop
        for (int i = 0; i < sl.size(); i++) {
            System.out.println(sl.get(i));
        }
        //approch 2 for advanced
        for (String words : sl) {
            System.out.println(words);
        }

        //appriach 3 iterator
        Iterator<String> iterator = sl.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public static void SearchArrayList() {
        ArrayList<String> sl = new ArrayList<String>();
        //Add
        sl.add("Akshay");
        sl.add("Shivani");
        sl.add(1, "Xyz");
        System.out.println(sl);

        for (String s : sl) {
            if (s.equals("Akshay")){
                System.out.println("Element found at Index "+sl.indexOf("Akshay"));
            }
        }

    }

    public static void delete()
    {
        ArrayList<String> sl = new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G","H"));
        System.out.println(sl);

        sl.remove("D");
        sl.remove(0);
        System.out.println(sl);

    }

    public static void main(String[] args) {
        //creation 0(1)
        //AddElementsinArrayList(); //element 0(1) index 0(n)
        //AccessElementArrayList();
        //TraverseArraylist();
        //SearchArrayList(); 0(n)
        //delete(); 0(n)
    }
}
