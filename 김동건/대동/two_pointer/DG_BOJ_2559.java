package 대동.two_pointer;

/* https://www.acmicpc.net/problem/2559 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DG_BOJ_2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }

        int start = 0;
        int end = start + K;
        int max = sum;
        while (end < N) {
            sum += arr[end] - arr[start];

            if (max < sum) {
                max = sum;
            }

            start++;
            end++;
        }

        System.out.println(max);
    }
}
