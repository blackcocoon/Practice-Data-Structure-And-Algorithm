package algorithm.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon_15656 {

    static int[] arr;
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        arr = new int[N + 1];
        for (int i = 1; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        backtracking(1, new ArrayList<>());
        System.out.println(sb);
    }

    static void backtracking(int level, ArrayList<Integer> result) {
        if (result.size() == M) {
            for (int o : result)
                sb.append(o).append(" ");
            sb.append("\n");
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            result.add(arr[i]);
            backtracking(i, result);
            result.remove(result.size() - 1);
        }
    }
}
