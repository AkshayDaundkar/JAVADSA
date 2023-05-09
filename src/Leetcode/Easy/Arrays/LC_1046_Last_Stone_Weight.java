package Leetcode.Easy.Arrays;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;

public class LC_1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        sort(stones);
        int x = stones.length-2;
        int y = stones.length-1;

        while (x >= 0) {
            if (stones[x] == stones[y]) {
                stones[x] = 0;
                stones[y] = 0;
            } else {
                stones[y] = stones[y] - stones[x];
                stones[x] = 0;
            }
            System.out.println(Arrays.toString(stones));
            Arrays.sort(stones);

            if(stones[x]==0)
                break;
        }

        return stones[y];
    }

    public static void main(String[] args) {
        int stones[] = {2,7,4,1,8,1};
        int stones2[]={1,3};
        int res = lastStoneWeight(stones);
        System.out.println(res);
    }
}
