package 스터디.queue;

/* https://www.acmicpc.net/problem/1158 */

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DG_BOJ_1158 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (true) {
            if (queue.size() == 1) {
                sb.append(queue.poll()).append(">");
                break;
            }

            for (int i = 1; i < K; i++) {
                queue.add(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }

        bw.write("<" + sb);
        bw.close();
    }
}
