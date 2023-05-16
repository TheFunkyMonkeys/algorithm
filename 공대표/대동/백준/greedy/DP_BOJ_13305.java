package 대동.백준.greedy;

/* https://www.acmicpc.net/problem/13305 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_BOJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long[] distance = new long[n - 1];
        long[] city = new long[n - 1]; // 마지막은 필요X
        long min = 1_000_000_001; // 최소 기름 가격
        long result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < distance.length; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < city.length; i++) {
            long cost = Integer.parseInt(st.nextToken());

            if(min > cost) {
                min = cost;
            }
            city[i] = min;
        }

        for (int i = 0; i < city.length; i++) {
            result += city[i] * distance[i];
        }

        System.out.print(result);
    }
}
