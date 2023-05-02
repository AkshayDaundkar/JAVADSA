package Recursion;

public class SumofDigits {
    public static int sumofDigits(int n) {

        if (n==0 || n < 0) {
            return 0;
        }
        return n%10 + sumofDigits(n/10);
    }
    public static void main(String[] args) {
        var result = sumofDigits(111);
        System.out.println(result);
    }

    //111%10-->1
   // 111/10 -->11
    //11/10 1
    //1/10-->0
}
