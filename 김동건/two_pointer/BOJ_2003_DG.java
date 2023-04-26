package two_pointer;

/* https://www.acmicpc.net/problem/2003 */

import java.io.*;
import java.util.StringTokenizer;

public class BOJ_2003_DG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int cnt = 0;

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int j = 0;
        while (j < N) {
            int sum = 0;
            for (int i = j; i < arr.length; i++) {
                sum += arr[i];
                if (sum == M) {
                    cnt++;
                    break;
                } else if (sum > M) {
                    break;
                }
            }
            j++;
        }

        System.out.println(cnt);
    }
}
