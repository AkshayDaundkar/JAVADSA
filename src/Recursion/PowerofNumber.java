package Recursion;

public class PowerofNumber {
    public static int power(int number, int exp) {
        if (exp==0) {
            return 1;
        }
        return number * power(number, exp-1); //2^3 2*2*2
    }

    public static void main(String[] args) {
        var result = power(2,3);
        System.out.println(result);
    }

}
