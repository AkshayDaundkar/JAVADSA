package Arrays;
import java.util.Arrays;

//00--11-22
//1  2  3
//4  5  6
//7  8  9

public class Ex2_SumofDiagonalElement {
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(arr));

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==j)
                {
                    sum+=arr[i][j];
                }
            }
        }
        System.out.println("Daigonal ka sum is "+sum);

    }
}
