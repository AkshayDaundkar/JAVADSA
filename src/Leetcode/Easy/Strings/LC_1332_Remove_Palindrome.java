package Leetcode.Easy.Strings;

public class LC_1332_Remove_Palindrome {

    public static int checkPallindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString().equals(s)? 1:2;
    }
    public static void main(String[] args) {
        String s="baabb";
        int res=checkPallindrome(s);
        System.out.println(res);

//        if (res == 1) {
//            System.out.println("Pallindrome");
//        } else {
//            System.out.println("Not Pallindrome");
//        }


    }
}
