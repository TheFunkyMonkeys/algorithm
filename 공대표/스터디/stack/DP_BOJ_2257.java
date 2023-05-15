package 스터디.stack;

/* https://www.acmicpc.net/problem/2257 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class DP_BOJ_2257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('H', 1);
        hm.put('C', 12);
        hm.put('O', 16);

        String str = br.readLine();
        for (int i = 0; i < str.length(); i++) {
            char curC = str.charAt(i);

            if (hm.containsKey(curC)) {
                stack.push(hm.get(curC));
            } else if (curC == '('){
                stack.push(0);
            } else if (curC == ')') {
                int sum = 0;
                while (stack.peek() != 0) {
                    sum += stack.pop();
                }
                stack.pop();
                stack.push(sum);
            } else {
                stack.push(stack.pop() * Integer.parseInt(String.valueOf(curC)));
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        System.out.print(result);
    }
}
