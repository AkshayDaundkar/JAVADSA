package Arrays;

//find no of days above average temp

import java.util.Scanner;

public class RealLifeProject {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Days?");
        int days=sc.nextInt();
        int temp[] = new int[days];

        int sum=0;

        for (int i = 0; i <days ; i++) {
            System.out.print("Enter the Day's Temprature?");
            temp[i]=sc.nextInt();
            sum+=temp[i];
        }
        double Avg=(float)sum/(float)days;
        System.out.println("Average is "+Avg);

        int noofDays=0;
        for (int i = 0; i < temp.length; i++) {
            if(temp[i] >Avg)
                noofDays+=1;
        }
        System.out.println("There are "+noofDays+" Days Above Average temprrature");

    }

}
