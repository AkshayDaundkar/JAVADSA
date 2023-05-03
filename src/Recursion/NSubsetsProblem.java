package Recursion;

import java.util.Arrays;

import static java.lang.Math.min;

public class NSubsetsProblem {

    public static int recursion(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (k > n) {
            return 0;
        }
        return recursion(n - 1, k - 1) + recursion(n - 1, k);
    }

    public static int topDown(int n, int k, int[][] dp) {
        if (k == 0 || k == n) {
            return 1;
        }
        if (k > n) {
            return 0;
        }
        if (dp[n][k] != Integer.MAX_VALUE) {
            return dp[n][k];
        }

        return dp[n][k] = topDown(n - 1, k - 1, dp) + topDown(n - 1, k, dp);
    }

    public static int BottomUp(int n, int k) {
        int[][] dp = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= min(i, k); j++) {
                if (j == 0 || i == j) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }
            }

        }
        return dp[n][k];
    }


    public static int spaceOptimisedBottomUp(int n, int k) {
        int dp[] = new int[k + 1];
        dp[0] = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = min(i, k); j >= 1; j--) {
                dp[j]=dp[j-1]+dp[j];
            }
        }
        return dp[k];
    }


    public static void main(String[] args) {
        int n = 4;
        int k = 2;
        int[][] dp = new int[n + 1][k + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        System.out.println("Recursive Solution " + recursion(n, k));//O(nk) t&S
        System.out.println("Top Down Approch Solution " + topDown(n, k, dp));//O(nk) t&S
        System.out.println("Bottom up Approch Solution " + BottomUp(n, k));//O(nk) t&S
        System.out.println("Optimised Solution " + spaceOptimisedBottomUp(n, k));//O(nk) space )(n)

    }
}
