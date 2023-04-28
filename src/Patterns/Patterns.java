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
//        4 4 4 4 4 4 4
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

    public void Pattern2(int value)
    {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*"+ " ");
            }
            System.out.println(" ");
        }
    }

    public void Pattern3(int value)
    {
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value-i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern4(int value)
    {
        for (int i = 1; i <= value; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern5(int value)
    {
        for (int i = 1; i < 2*value; i++) {
            int totalcols = i>value ? 2*value-i:i;
            for (int j = 1; j <= totalcols ; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public void Pattern6(int value)
    {
        for (int i = 1; i < 2*value; i++) {
            int totalcols = i>value ? 2*value-i:i;

            int noofspaces=value-totalcols;
            for (int s = 0; s < noofspaces; s++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= totalcols ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
