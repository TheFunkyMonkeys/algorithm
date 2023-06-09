package 대동.two_pointer;

/* https://www.acmicpc.net/problem/3273 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DG_BOJ_3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int x = Integer.parseInt(br.readLine());
        int cnt = 0;
        int end = n - 1;
        int start = 0;

        while (start < end) {
            if (arr[start] + arr[end] == x) {
                cnt++;
                start++;
                end--;
            } else if (arr[start] + arr[end] < x) {
                start++;
            } else {
                end--;
            }
        }

        System.out.println(cnt);
    }
}
