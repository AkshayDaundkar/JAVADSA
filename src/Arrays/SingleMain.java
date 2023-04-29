package Arrays;

public class SingleMain {

    public static void main(String[] args) {
        SingleDimensionArray A = new SingleDimensionArray(3);
        A.insert(0, 5);
        A.insert(1, 10);
        A.insert(2, 20);
        A.insert(1, 30);
        A.insert(12, 19);
        A.traversing();
        A.delete(20);
        A.traversing();
        A.searchInArray(20);
        A.print();
    }

}
