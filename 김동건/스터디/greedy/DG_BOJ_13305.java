package 스터디.greedy;

/* https://www.acmicpc.net/problem/13305 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DG_BOJ_13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        long[] distance = new long[N - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        long[] oilPrice = new long[N];
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            oilPrice[i] = Long.parseLong(st2.nextToken());
        }

        long totalCost = 0;
        long minOilPrice = oilPrice[0];

        for (int i = 0; i < N - 1; i++) {
            if (oilPrice[i] < minOilPrice) {
                minOilPrice = oilPrice[i];
            }
            totalCost += minOilPrice * distance[i];
        }

        System.out.print(totalCost);
    }
}
