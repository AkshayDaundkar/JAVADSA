package Arrays;

public class Ex6_RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int nums[] = {1, 1, 2,3,3,4,5};
        //{1,2,3,4,5}

        if (nums.length == 0) {
            System.out.println(0);
        }

        int i = 0;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println(i+1);

    }
}
