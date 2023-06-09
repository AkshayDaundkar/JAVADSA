package Patterns;
//        1.
//        *****
//        *****
//        *****
//        *****
//        *****
//
//
//        2.
//        *
//        **
//        ***
//        ****
//        *****
//
//
//        3
//        *****
//        ****
//        ***
//        **
//        *
//
//
//        4.
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//
//
//        5
//        *
//        **
//        ***
//        ****
//        *****
//        ****
//        ***
//        **
//        *

//         28
//          *
//          * *
//          * * *
//          * * * *
//          * * * * *
//          * * * *
//          * * *
//          * *
//          *
//
//        30
//         1
//         2 1 2
//         3 2 1 2 3
//         4 3 2 1 2 3 4
//         5 4 3 2 1 2 3 4 5
//
//         17
//          1
//          212
//          32123
//          4321234
//          32123
//          212
////        1

//        31
//         4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4

public class Patterns {

    public void Pattern1(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern2(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println(" ");
        }
    }

    public void Pattern3(int value) {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value - i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern4(int value) {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern5(int value) {
        for (int i = 1; i < 2 * value; i++) {
            int totalcols = i > value ? 2 * value - i : i;
            for (int j = 1; j <= totalcols; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern6(int value) {
        for (int i = 1; i < 2 * value; i++) {
            int totalcols = i > value ? 2 * value - i : i;

            int noofspaces = value - totalcols;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void Pattern7(int n) {

          for (int row = 1; row <= n; row++) {

            //spaces
            for (int noofSpaces = 0; noofSpaces < n - row; noofSpaces++) {
                System.out.print("  ");
            }

            for (int col = row; col >= 1; col--) { //row no pasun 1 parent
                System.out.print(col + " ");
            }

            for (int col = 2; col <= row; col++) { //2 pasun row no parent
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }

    public void Pattern8(int n) {

        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row : row;

            //spaces
            for (int noofSpaces = 0; noofSpaces < n - c; noofSpaces++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) { //row no pasun 1 parent
                System.out.print(col + " ");
            }

            for (int col = 2; col <= c; col++) { //1 pasun row no parent
                System.out.print(col + " ");
            }
            System.out.println();

        }
    }
  //       4 4 4 4 4 4 4
//         4 3 3 3 3 3 4
//         4 3 2 2 2 3 4
//         4 3 2 1 2 3 4
//         4 3 2 2 2 3 4
//         4 3 3 3 3 3 4
//         4 4 4 4 4 4 4

    public void Pattern9(int n)
    {
        int originalN=n;
        n=2*n;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <=n; col++) {
                int atEveryIndex= originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

}
