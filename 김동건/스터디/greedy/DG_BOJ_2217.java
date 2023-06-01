package 스터디.greedy;

/* https://www.acmicpc.net/problem/2217 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DG_BOJ_2217 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int max = 0;
        for (int i = 0, num = arr.length; i < arr.length; i++, num--) {
            if (max < arr[i] * num) {
                max = arr[i] * num;
            }
        }

        System.out.print(max);
    }
}
