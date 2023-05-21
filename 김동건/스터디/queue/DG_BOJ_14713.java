package 스터디.queue;

/* https://www.acmicpc.net/problem/14713 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DG_BOJ_14713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int countTokens;
        Queue<Queue<String>> queue = new LinkedList<>();
        Queue<String> innerQueue;

        int wordCnt = 0;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            countTokens = st.countTokens();
            innerQueue = new LinkedList<>();

            for (int j = 0; j < countTokens; j++) {
                innerQueue.add(st.nextToken());
            }

            wordCnt += innerQueue.size();
            queue.add(innerQueue);
        }

        Queue<String> queueL = new LinkedList<>();
        st = new StringTokenizer(br.readLine());
        countTokens = st.countTokens();

        for (int i = 0; i < countTokens; i++) {
            queueL.add(st.nextToken());
        }

        if (wordCnt != queueL.size()) {
            System.out.println("Impossible");
            return;
        }

        int cnt = 1;
        while (!queueL.isEmpty() && cnt <= N) {
            if (queueL.peek().equals(queue.peek().peek())) {
                queueL.remove();
                queue.peek().remove();
                cnt = 1;
            } else {
                queue.add(queue.poll());
                cnt++;
            }
        }

        if (queueL.isEmpty()) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
