package Arrays;

public class Ex8_TwoSums {
    //Two Sums
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int  target = 26;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    System.out.println("The array Indexes will be "+i+" "+j);
                }
            }
        }
    }
}
