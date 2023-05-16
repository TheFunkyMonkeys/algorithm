package 대동.백준.greedy;

/* https://www.acmicpc.net/problem/1789 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_1789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());

        long sum = 0;
        long result = 0;
        while (sum + result <= n) {
            sum += result;
            result++;
        }

        System.out.print(result - 1);
    }
}
