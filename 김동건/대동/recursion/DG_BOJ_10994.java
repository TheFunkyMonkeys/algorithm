package 대동.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DG_BOJ_10994 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(0, n);
    }

    public static void recursion(int countPoint, int n) {
        String[] arr = new String[1 + (4 * (n - 1))];
        if (countPoint == n * 2 - 1) {
            for (int i = 0; i < arr.length; i += 2) {
                arr[i] = "*";
                for (int j = 1; j < arr.length; j += 2) {
                    arr[j] = " ";
                }
            }
            for (String s : arr) {
                System.out.print(s);
            }
            return;
        }
        if (countPoint % 2 == 0) {
            for ()
        } else {

        }
        recursion(++countPoint, n);
    }
}
