package Strings;

public class StringFunctions {
    public static void main(String[] args) {
        String a="shivani";
        String b ="Akshay";
        String d="A";

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());

        System.out.println(b.concat(a));
        System.out.println(b.length());

        System.out.println(a.substring(1,3)); //outer index excluded 1,2
        System.out.println(a.contains(d)); //Boolean value


        String c="   add   "; //remove spaces
        System.out.println(c.trim());
        System.out.println(c.isEmpty()); //boolean

        System.out.println(b.charAt(0));
        System.out.println(b.charAt(1));

        System.out.println(a.equals(b));//Boolean value
        System.out.println(c.replace('a','e'));

        StringBuilder e =new StringBuilder();
        e.append("Akshay");
        System.out.println(e.reverse());
    }
}
