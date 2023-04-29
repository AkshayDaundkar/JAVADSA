package Arrays;

public class MultiDimensionArrayMain {
    public static void main(String[] args) {
        MultiDimensionArray mad=new MultiDimensionArray(3,3);
        mad.insert(0,0,1);//insert
        mad.insert(0,1,10);
        mad.insert(2,1,10);

        mad.print();//print
        //mad.traverse();
        //mad.search(10);
        mad.delete(10);
        mad.print();
        //search
        //delete
        //traverse
    }
}
