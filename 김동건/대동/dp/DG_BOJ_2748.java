package 대동.dp;

/* https://www.acmicpc.net/problem/2748 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DG_BOJ_2748 {
    static long[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f = new long[n + 1];
        if (n == 0) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(1);
            return;
        }
        f[1] = 1;
        f[2] = 1;
        System.out.print(fibonacci(n));
    }

    static long fibonacci(int n) {
        for (int i = 3; i < n + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
