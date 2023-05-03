package Stack;

import java.util.Arrays;

public class StackMain {

    int arr[];
    int topoOfStack;

    public StackMain(int size) {
        this.arr = new int[size];
        this.topoOfStack = -1;
        System.out.println("The stack is of size " + size);

    }

    //isEmpty
    public boolean isEmpty() {
        if (topoOfStack == -1) {
            return true;

        } else
            return false;
    }

    public boolean isFull() {
        if (topoOfStack == arr.length - 1) {
            //System.out.println("Stack Full");
            return true;

        } else
            return false;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            arr[topoOfStack + 1] = value;
            topoOfStack++;
            System.out.println("The Value is successfully Inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty");
            return 0;
        } else {
            int topStack = arr[topoOfStack];
            topoOfStack--;
            return topStack;
        }
    }

    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Stack empty");
            return -1;
        }
        else
        {
            return arr[topoOfStack];
        }
    }

    public void delete()
    {
        if(isEmpty())
        {
            System.out.println("Stack Empty");
        }
        else
        {
            arr=null;
            System.out.println("stack deleted sucessfully");
            System.out.println(Arrays.toString(arr));
        }

    }


    public static void main(String[] args) {
        StackMain sc = new StackMain(4);
        System.out.println(sc.isEmpty());
        System.out.println(sc.isFull());
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);


        System.out.println("Poping item "+sc.pop());
        System.out.println("Poping Item "+sc.pop());

        System.out.println("peek after removing 2 items "+sc.peek());
        sc.delete();


    }
}
