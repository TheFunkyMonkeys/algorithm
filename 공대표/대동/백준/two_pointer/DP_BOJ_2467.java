package 대동.백준.two_pointer;

/* https://www.acmicpc.net/problem/2467 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_BOJ_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int solutionA = 0, solutionB = 0;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0, end = n - 1;
        int sum = 2000000000;
        while (start < end) {
            int ph = arr[start] + arr[end];

            if (ph >= 0) {
                if (sum >= Math.abs(ph)) {
                    sum = Math.abs(ph);
                    solutionA = arr[start];
                    solutionB = arr[end];
                }
                end--;
            } else {
                if (sum >= Math.abs(ph)) {
                    sum = Math.abs(ph);
                    solutionA = arr[start];
                    solutionB = arr[end];
                }
                start++;
            }

        }

        System.out.print(solutionA + " " + solutionB);
    }
}
