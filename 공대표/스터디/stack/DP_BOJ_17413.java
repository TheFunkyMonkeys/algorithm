package 스터디.stack;

/* https://www.acmicpc.net/problem/17413 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class DP_BOJ_17413 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();
        boolean flag = false; // <> 안에 있는건지 판단.
        for (int i = 0; i < str.length(); i++) {
            char curC = str.charAt(i);

            switch (curC) {
                case '<':
                    flag = true;
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(curC);
                    break;
                case '>':
                    flag = false;
                    sb.append(curC);
                    break;
                case ' ':
                    if (!flag) {
                        while (!stack.isEmpty()) {
                            sb.append(stack.pop());
                        }
                    }
                    sb.append(" ");
                    break;
                default:
                    if (!flag) {
                        stack.push(curC);
                    } else {
                        sb.append(curC);
                    }
                    break;
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.print(sb);
    }
}
