package Strings;
import java.util.Arrays;
public class ExamplesString {

    //reverse string
    //pallindrome
    //remove char from string
    //4 reverse string word vise akshay shivani --shivani akshay
    //1 split then loop from end to >=0 and print using substring(0,stringkalen-1)


    //5 reverse each word akshay shivani--- yahska inavihs
    //1 split sentence to words
    //2 create res string and traverse through splitted words
    //3 create new stringBuilder object and reverse it
    //4 add words to that rev string and trim & print


    public static String reverseWord(String str){
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words){
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }




    public static void main(String[] args) {
        String input="I love my India";
        //String arr[]= input.split(" "); //split for taking out words from sentence

//        System.out.println(Arrays.toString(arr));
//
//        String res="";
//        for (int i = arr.length-1 ; i >=0; i--) {
//            res += arr[i]+" ";
//        }
//        //System.out.println(res); //India my love I
//        System.out.println(res.substring(0,res.length()-1));



        String res=reverseWord(input);
        System.out.println(res);

    }
}
