package 스터디.recursion;

/* https://www.acmicpc.net/problem/10994 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_10994 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        arr = new char[4 * n - 3][4 * n - 3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = ' ';
            }
        }



        recursion(0, 4 * n - 3, arr);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }

    public static void recursion(int start, int n, char[][] arr) {
        if (start >= n) {
            return;
        }

        for (int i = start; i < n; i++) {
            arr[start][i] = '*';
            arr[i][start] = '*';
            arr[n - 1][i] = '*';
            arr[i][n - 1] = '*';
        }

        recursion(start + 2, n - 2, arr);

    }
}
