package 대동.dp;

/* https://www.acmicpc.net/problem/24416 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DG_BOJ_24416 {
    static int[] f;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        f  = new int[n+1];
        System.out.print(fib(n) + " ");
        System.out.print(fibonacci(n));
    }

    static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        else return (fib(n - 1) + fib(n - 2));
    }

    static int fibonacci(int n) {
        int sum = 0;
        f[1] = 1;
        f[2] = 1;
        for (int i = 3; i < n + 1; i++) {
            f[i] = f[i - 1] + f[i - 2];
            sum++;
        }
        return sum;
    }
}
