package Recursion;

import java.util.Arrays;

import static java.lang.Math.max;

public class NCutProblemDynamicProgramming {

    public static int recursion(int l, int p, int q, int r) {
        if (l == 0) {
            return 0;
        }
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        if (p <= l) {
            a = recursion(l - p, p, q, r);
        }
        if (q <= l) {
            b = recursion(l - q, p, q, r);
        }
        if (r <= l) {
            c = recursion(l - r, p, q, r);
        }

        return 1 + max(a, max(b, c));

    }

    public static int topDown(int l, int p, int q, int r, int dp[]) {
        if (l == 0) {
            return 0;
        }

        if (dp[l] != Integer.MIN_VALUE) {
            return dp[l];
        }
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;

        if (p <= l) {
            a = recursion(l - p, p, q, r);
        }
        if (q <= l) {
            b = recursion(l - q, p, q, r);
        }
        if (r <= l) {
            c = recursion(l - r, p, q, r);
        }

        return dp[l] = 1 + max(a, max(b, c));

    }

    public static int bottomUp(int l, int p, int q, int r) {
        int dp[] = new int[l + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        dp[0] = 0;
        for (int i = 0; i <= l; i++) {
            if (i + p <= l) {
                dp[i + p] = max(dp[i + p], dp[i] + 1);
            }
            if (i + q <= l) {
                dp[i + q] = max(dp[i + q], dp[i] + 1);
            }
            if (i + r <= l) {
                dp[i + r] = max(dp[i + r], dp[i] + 1);
            }

        }

        return dp[l];
    }

    public static void main(String[] args) {
        int l = 11;
        int p = 2;
        int q = 3;
        int r = 5;
        int recursiveSolution = recursion(l, p, q, r);
        System.out.println("Recursive Solution " + max(0, recursiveSolution));

        int dp[] = new int[l + 1];
        Arrays.fill(dp, Integer.MIN_VALUE);
        int topdownsol = topDown(l, p, q, r, dp);
        System.out.println("Top Down Approch sol " + max(0, topdownsol));

        int bottomupsol = bottomUp(l, p, q, r);
        System.out.println("Bottom Up solution " + max(0, bottomupsol));
    }
}
