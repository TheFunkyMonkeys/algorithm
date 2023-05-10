package 대동.sliding_window;

/* https://www.acmicpc.net/problem/21921 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_BOJ_21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0, count = 1;

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < x; i++) {
            sum += arr[i];
        }

        int tempSum = sum;
        int i = x;
        while (i < n) {
            tempSum -= arr[i - x];
            tempSum += arr[i];

            if (tempSum > sum) {
                sum = tempSum;
                count = 1;
            } else if (tempSum == sum) {
                count++;
            }

            i++;
        }

        System.out.print(sum == 0 ? "SAD" : sum + "\n" + count);
    }
}
