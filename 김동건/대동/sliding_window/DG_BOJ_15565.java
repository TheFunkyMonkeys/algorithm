package 대동.sliding_window;

/* https://www.acmicpc.net/problem/15565 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DG_BOJ_15565 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        boolean[] arr = new boolean[N];
        for (int i = 0; i < N; i++) {
            if (Integer.parseInt(st.nextToken()) == 1) {
                arr[i] = true;
            }
        }

        int cnt = 0;
        int minSum = N;
        int start = 0;
        int end = 0;
        boolean flag = true;

        while (end < N) {
            if (arr[end]) {
                cnt++;
            }
            end++;

            while (cnt == K) {
                minSum = Math.min(minSum, end - start);
                if (arr[start]) {
                    cnt--;
                }
                start++;
                flag = false;
            }
        }

        if (flag) {
            System.out.println("-1");
        } else {
            System.out.println(minSum);
        }
    }
}
