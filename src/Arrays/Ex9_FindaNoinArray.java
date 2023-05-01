package Arrays;

import java.util.Arrays;
import java.util.List;

public class Ex9_FindaNoinArray {
    public static void main(String[] args) {
        int intArray[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 6) {
                System.out.println(i);
            }
        }
    }
}
