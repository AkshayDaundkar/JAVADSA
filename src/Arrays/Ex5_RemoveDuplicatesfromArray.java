package Arrays;

import java.util.Arrays;

public class Ex5_RemoveDuplicatesfromArray {
    public static void main(String[] args) {
        int array[] = {1,2,3,1};
        int n = array.length;
        int[] uniqueArray = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = i + 1; j < n; j++) {
                if (array[i] == array[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[index++] = array[i];
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(uniqueArray, index)));
    }
}
