package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Ex3_BestScorefromArray {
    public static void main(String[] args) {
        int arr[] = {84, 85, 86, 87, 85, 90, 85, 83};
        System.out.println(Arrays.toString(arr));
        int largest = 0;
        int secondlargest = 0;

        for (int score : arr) {
            if (score > largest) {
                secondlargest = largest;
                largest = score;


            } else if (score > secondlargest && score < largest) {
                secondlargest = score;
            }
        }

        System.out.println(largest + " " + secondlargest);
    }
}
