package 스터디.stack;

/* https://www.acmicpc.net/problem/1874 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DP_BOJ_1874 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int curNum = 1;
        for (int i = 0; i < n; i++) {
            int findNum = Integer.parseInt(br.readLine());

            while (curNum <= findNum) {
                stack.push(curNum);
                curNum++;
                sb.append("+\n");
            }

            if (findNum == stack.peek()) {
                stack.pop();
                sb.append("-\n");
            }
        }

        System.out.print(stack.size() == 0 ? sb : "NO");
    }
}
