package 스터디.queue;

/* https://www.acmicpc.net/problem/1158 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DP_BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder("<");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        int j = 0;
        while (queue.size() != 1) {
            j++;
            if (j % k == 0) {
                sb.append(queue.remove() + ", ");
                continue;
            }

            queue.add(queue.remove());
        }

        sb.append(queue.remove() + ">");

        System.out.print(sb);
    }
}
