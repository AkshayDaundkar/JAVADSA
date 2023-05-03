package DynamicProgramming;

import java.util.Arrays;

public class FreindsPatirngDynamicProgramming {

    public static int recursive(int n) {
        if (n <= 2)
            return n;
        else
            return recursive(n - 1) + (n - 1) * recursive(n - 2);
    }

    public static int topDown(int n, int[] dp) {
        if (dp[n] != Integer.MIN_VALUE) {
            return dp[n];
        }
        if (n > 2) {
            return dp[n] = topDown(n - 1, dp) + (n - 1) * topDown(n - 2, dp);
        } else {
            return dp[n] = n;
        }
    }

    public static int BottomUp(int n) {
        int dp[]=new int[n+1];
        for (int i = 0; i <= n; i++) {
            if(i<=2)
                dp[i]=i;
            else
                dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        return dp[n];
    }



    public static void main(String[] args) {
        int friends = 3;
        int dp[] = new int[friends + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);

        System.out.println("Recursive soolution " + recursive(friends)); //{1,2,3} as 1 ,or {1,2 , 1,3, 1,4 }
        System.out.println("TopDown soolution " + topDown(friends, dp)); //{1},or {1,2 , 1,3, 1,4 }
        System.out.println("Bottomup soolution " + BottomUp(friends)); //{1},or {1,2 , 1,3, 1,4 }




    }
}
