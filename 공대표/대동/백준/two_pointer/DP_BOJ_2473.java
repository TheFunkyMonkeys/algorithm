package 대동.백준.two_pointer;

/* https://www.acmicpc.net/problem/2473 */
/* 2473번과 유사한 문제인 2470번은 입력이 100,000 이였지만 2473번은 5,000 이므로 O(n2) 이여도 시간초과가 나지 않는다. 주어진 입력, 시간 등 조건을 잘 보길 바람. */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_BOJ_2473 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int solutionA = 0, solutionB = 0, solutionC = 0;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        long sum = 3000000001L;

        for (int i = 0; i < n - 2; i++) {
            int start = i + 1;
            int end = n - 1;

            while (start < end) {

                long ph = (long) arr[start] + arr[end] + arr[i];

                if (Math.abs(ph) < sum) {
                    sum = Math.abs(ph);
                    solutionA = arr[i];
                    solutionB = arr[start];
                    solutionC = arr[end];
                }
                if (ph > 0) {
                    end--;
                } else
                    start++;
                }

            }
        System.out.print(solutionA + " " + solutionB + " " + solutionC);

    }
}

