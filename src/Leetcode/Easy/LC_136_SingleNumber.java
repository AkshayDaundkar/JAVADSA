package Leetcode.Easy;

import java.util.Arrays;

public class LC_136_SingleNumber {

    public static int singleNumbers(int[] nums) {
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i != len; i++)
            ans ^= nums[i];
        return ans;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int nums[]={1,2,2};
        System.out.println(singleNumbers(nums));
        System.out.println(singleNumber(nums));
    }

}
