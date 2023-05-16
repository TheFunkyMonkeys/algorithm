package 대동.백준.greedy;

/* https://www.acmicpc.net/problem/11047 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_BOJ_11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int index = arr.length - 1;
        while (k != 0) {
            if (arr[index] > k) {
                index -= 1;
                continue;
            }

            result += k / arr[index];
            k %= arr[index];
        }

        System.out.print(result);
    }
}
