package solve_practice_problems.Baekjoon.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_16435 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= L) {
                L++;
            } else {
                break;
            }
        }

        System.out.println(L);
    }
}
