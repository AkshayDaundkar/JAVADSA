package Leetcode.Easy;

import java.util.Arrays;

public class LC_344_ReverseString {

    public static char[] Reverse(char[] s)
    {
        char temp[]=new char[s.length];
        for (int i = s.length-1; i >=0 ; i--) {
           temp[s.length-1-i]=s[i];
        }
        return temp;
    }
    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;

        while(start<end)
        {
            char temp=s[start];
            s[start++]=s[end];
            s[end--]=temp;
        }
        System.out.println(Arrays.toString(s));

    }

    public static void main(String[] args) {
        char s[] = {'h','e','l','l','o'};
        char res[]=Reverse(s);
        reverseString(s);
        System.out.println(Arrays.toString(res));

    }
}
