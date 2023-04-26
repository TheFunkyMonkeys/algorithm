package two_pointer;

/* https://www.acmicpc.net/problem/1806 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1806_DG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        int check = 0;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            arr[i] = num;
            check += num;
        }

        if (check < S) {
            sb.append("0");
        } else {
            int start = 0;
            int end = start;
            int sum = 0;
            int min = N;

            while (end < N) {
                if (sum < S) {
                    sum += arr[end];
                    end++;
                }
                if (sum >= S) {
                    int length = end - start;
                    if (min > length) {
                        min = length;
                    }
                    sum = 0;
                    start++;
                    end = start;
                }
            }

            sb.append(min);
        }

        System.out.println(sb);

    }
}
