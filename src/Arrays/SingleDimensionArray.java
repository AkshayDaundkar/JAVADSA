package Arrays;


//creation and initialisation
//Insertion
//traversing
//searching
//delete element

import java.util.Arrays;

public class SingleDimensionArray {

    static int[] Arr = null;

    public SingleDimensionArray(int n) {
        Arr = new int[n];
        Arrays.fill(Arr, Integer.MIN_VALUE);
    }
    //Insertion

    public void insert(int location, int value) {
        try {
            if (Arr[location] == Integer.MIN_VALUE) {
                Arr[location] = value;
                System.out.println("Entered " + value + " In Array Successfully");
            } else {
                System.out.println("Array is already filled in loc " + location);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bond");
        }

    }

    public void traversing() {
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
    }

    public void delete(int value) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == value) {
                Arr[i] = Integer.MIN_VALUE;
                System.out.println("Deleted the value Successfully");
            }

        }
        System.out.println("The Value is not present");
    }

    public void searchInArray(int value) {
        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == value) {
                System.out.println("Element found at Index " + i + " ");
            }

        }
        System.out.println("The Value is not present");
    }


}