package Arrays;

import java.util.Arrays;

public class MultiDimensionArray {
    int[][] Arr;

    public MultiDimensionArray(int row, int col) {
        this.Arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                Arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    public void insert(int row, int col, int value) {
        try {
            if (Arr[row][col] == Integer.MIN_VALUE) {
                Arr[row][col] = value;
                System.out.println("Inserted Successfully");
            } else
                System.out.println("Array is already Filled");


        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bound");
        }

    }

    public void print() {
        System.out.println(Arrays.deepToString(Arr));
    }

    public void traverse() {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                System.out.print(Arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public void search(int value)
    {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                if(Arr[i][j]==value)
                {
                    System.out.println("Value found in "+i+" row & " +j+" col");
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }

    public void delete(int value)
    {
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[0].length; j++) {
                if(Arr[i][j]==value)
                {
                    Arr[i][j]=Integer.MIN_VALUE;
                    System.out.println("Deleted Sucessfully value "+value);
                    return;
                }
            }
        }
        System.out.println("Value not found");
    }



}
