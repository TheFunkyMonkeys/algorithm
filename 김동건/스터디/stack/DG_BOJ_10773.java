package 스터디.stack;

/* https://www.acmicpc.net/problem/10773 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DG_BOJ_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) {
                stack.pop();
                continue;
            }
            stack.push(num);
        }

        int sum = 0;
        for (Integer integer : stack) {
            sum += integer;
        }

        System.out.println(sum);
    }
}
