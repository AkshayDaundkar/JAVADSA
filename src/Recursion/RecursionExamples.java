package Recursion;

public class RecursionExamples {

    public static void Infinite()
    {
        System.out.println("Hi");
        Infinite();
    }


    static int count=0;
    public static void Finite()
    {
        count++;
        if(count<=5){
            System.out.println("hello "+count);
            Finite();
        }
    }

    public static int  Fact(int n)
    {
        if(n==1 || n==0)
        {
            return 1;
        }
        else{
            return ( n * Fact(n-1));
        }
    }

    //011235812

    public static void Fibo(int n)
    {
        int num1=0;
        int num2=1;

        int i=0;

        while(i<n)
        {
            System.out.println(num1+" ");
            int num3=num1+num2;
            num1=num2;
            num2=num3;
            i++;
        }
    }

    public static int Fibo2(int n)
    {
        if(n<=1)
        {
            return n;
        }

        return Fibo2(n-1)+Fibo2(n-2);
    }




    public static void main(String[] args) {
        //Recursion in java is a process in which a method calls itself continuously.
        // A method in java that calls itself is called recursive method.
        //Infinite();
        //Finite();
        //System.out.println(Fact(5));
        //Fibo(5);
        Fibo2(5);

        for (int i = 0; i <5 ; i++) {
            System.out.print(Fibo2(i)+" ");
        }


    }
}
