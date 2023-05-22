package 대동.recursion;

/* https://www.acmicpc.net/problem/10994 */

import java.io.*;
import java.util.Arrays;

public class DG_BOJ_10994 {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(1, n);
        bw.close();
    }

    public static void recursion(int countPoint, int n) throws IOException {
        print(countPoint, n);
        if (countPoint == n * 2 - 1) {
            return;
        }
        recursion(++countPoint, n);
        print(--countPoint, n);
    }

    public static void print(int countPoint, int n) throws IOException {
        String[] arr = new String[4 * n - 3];
        if (countPoint % 2 != 0) {
            Arrays.fill(arr, "*");
            for (int i = 1; i < countPoint; i += 2) {
                arr[i] = " ";
                arr[4 * n - 4 - i] = " ";
            }
        } else {
            Arrays.fill(arr, " ");
            for (int i = 0; i < countPoint - 1; i += 2) {
                arr[i] = "*";
                arr[4 * n - 4 - i] = "*";
            }
        }
        for (String s : arr) {
            bw.write(s);
        }
        bw.write("\n");
    }
}
