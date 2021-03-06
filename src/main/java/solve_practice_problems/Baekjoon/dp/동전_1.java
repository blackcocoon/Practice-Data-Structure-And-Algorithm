package solve_practice_problems.Baekjoon.dp;

import java.util.Scanner;

public class 동전_1 { // 경우의 수를 출력
/*
3 10
1
2
5
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] coins = new int[n + 1];
        for (int i = 1; i <= n; i++)
            coins[i] = sc.nextInt();

        int[] dp = new int[k + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = coins[i]; j <= k; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        System.out.println(dp[k]);
    }
}
