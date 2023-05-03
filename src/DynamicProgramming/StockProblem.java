package DynamicProgramming;

import java.util.Arrays;

public class StockProblem {

    public static void span(int prices[], int n, int S[]) {
        S[0] = 1;
        for (int i = 1; i < n; i++) {
            S[i] = 1; //assign everyday as 1
            for (int j = i - 1; j >= 0; j--) {
                if (prices[i] > prices[j]) {
                    S[i]=S[i]+1;
                }
            }
        }
        System.out.println(Arrays.toString(S));
    }

    public static void main(String[] args) {
        int prices[] = {100, 80, 60, 70, 60, 75, 85};
        //prices
        int n = prices.length;
        int S[] = new int[n];
        span(prices, n, S);

    }
}
