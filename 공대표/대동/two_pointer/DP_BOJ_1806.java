package 대동.two_pointer;

/* https://www.acmicpc.net/problem/1806 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_BOJ_1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0, end = 1, sum = arr[start], count = 1;
        while (start < end) {
            if (sum >= m) {
                if (length > count || length == 0) {
                    length = count;
                }
                sum -= arr[start];
                start++;
                count--;
                continue;
            }

            if (end < n) {
                sum += arr[end];
                count++;
                end++;
            } else {
                sum -= arr[start];
                count--;
                start++;
            }

        }

        System.out.print(length);
    }
}
