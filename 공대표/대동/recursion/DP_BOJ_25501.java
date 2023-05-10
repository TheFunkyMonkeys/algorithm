package 대동.recursion;

/* https://www.acmicpc.net/problem/25501 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] cur = isPalindrome(br.readLine());
            sb.append(cur[0] + " " + cur[1] + "\n");
        }

        System.out.print(sb);
    }

    public static int[] recursion(String s, int l, int r, int count){
        count++;
        if(l >= r) return new int[]{1, count};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, count};
        else return recursion(s, l+1, r-1, count);
    }

    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }

}
