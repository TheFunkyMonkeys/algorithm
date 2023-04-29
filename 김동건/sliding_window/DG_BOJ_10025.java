package sliding_window;

/* https://www.acmicpc.net/problem/10025 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DG_BOJ_10025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        int maxNum  = 0;
        int[] arr = new int[1000001];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            int iceNum = Integer.parseInt(st.nextToken());
            int pailNum = Integer.parseInt(st.nextToken());
            arr[pailNum] = iceNum;
            if (maxNum < pailNum) {
                maxNum = pailNum + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < (2 * K) + 1 && i <= 1000000; i++) {
            sum += arr[i];
        }

        int start = 0;
        int end = (2 * K) + 1;
        int maxSum = sum;
        while (end < 1000000) {
            sum += arr[end++] - arr[start++];
            if (maxSum < sum) {
                maxSum = sum;
            }
        }

        System.out.println(maxSum);
    }
}
