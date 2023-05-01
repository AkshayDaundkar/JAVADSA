package Arrays;
import java.util.Arrays;

public class Ex10_MaxProductoftwoProducts {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50};
        Arrays.sort(intArray);

        String pairs = "";

        pairs = Integer.toString(intArray[intArray.length-1])+","+Integer.toString(intArray[intArray.length-2]);

        System.out.println(pairs);
    }
}
