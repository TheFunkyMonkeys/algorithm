package 스터디.recursion;

/* https://www.acmicpc.net/problem/18511 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class DP_BOJ_18511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[k];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.print(recursion(n, arr, 0, 0));
    }

    public static int recursion(int n, Integer[] arr, int curNum, int max) {
        for (int i = 0; i < arr.length; i++) {
            curNum += arr[i];

            if (curNum <= n) {
                if (curNum > max) {
                    max = curNum;
                }
                max = recursion(n, arr, curNum * 10, max);
            }
            curNum -= arr[i];
        }

        return max;
    }
}
