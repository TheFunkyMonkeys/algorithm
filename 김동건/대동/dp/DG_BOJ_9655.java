package 대동.dp;

/* https://www.acmicpc.net/problem/9655 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DG_BOJ_9655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n % 2 == 0) {
            System.out.print("CY");
        } else {
            System.out.print("SK");
        }
    }
}
