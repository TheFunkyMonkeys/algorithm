package 대동.백준.brute_force;

/* https://www.acmicpc.net/problem/1065 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0;

        int x = Integer.parseInt(br.readLine());
        for (int i = 1; i <= x; i++) {
            if (i < 100) {
                result++;
                continue;
            }

            int curNum = i;
            if (curNum % 10 + curNum / 100 == (curNum / 10) % 10 * 2) {
                result++;
            }
        }

        System.out.print(result);
    }
}
