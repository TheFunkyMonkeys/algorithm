package 스터디.queue;

/* https://www.acmicpc.net/problem/2161 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class DG_BOJ_2161 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (true) {
            sb.append(queue.poll()).append(" ");
            if (queue.isEmpty()) {
                break;
            }
            queue.add(queue.poll());
        }

        System.out.println(sb);
    }
}
