package 대동.two_pointer;

/* https://www.acmicpc.net/problem/2467 */

import java.io.*;
import java.util.StringTokenizer;

public class DG_BOJ_2467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int min = Integer.MAX_VALUE;
        int start = 0;
        int end = N - 1;
        int minStart= 0;
        int minEnd = 0;
        while (true) {
            int sum = Math.abs(arr[start] + arr[end]);

            if (min >= sum) {
                min = sum;
                minStart = arr[start];
                minEnd = arr[end];
            }

            if (Math.abs(arr[start]) < arr[end]) {
                end--;
            } else if (Math.abs(arr[start]) > arr[end]){
                start++;
            } else {
                break;
            }

            if (start >= end) {
                break;
            }
        }

        sb.append(minStart).append(" ").append(minEnd);

        bw.write(sb.toString());
        bw.close();
    }
}
