package 대동.sliding_window;

/* https://www.acmicpc.net/problem/21921 */

import java.io.*;
import java.util.StringTokenizer;

public class DG_BOJ_21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        int sum = 0;
        for (int i = 0; i < X; i++) {
            sum += arr[i];
        }

        int start = 0;
        int end = X + start;
        int max = sum;
        int cnt = 1;

        while (end < N) {
            sum += arr[end] - arr[start];

            if (max < sum) {
                max = sum;
                cnt = 1;
            } else if (max == sum) {
                cnt++;
            }

            start++;
            end++;
        }

        if (max == 0) {
            sb.append("SAD");
        } else {
            sb.append(max).append("\n").append(cnt);
        }

        bw.write(sb.toString());
        bw.close();
    }
}
