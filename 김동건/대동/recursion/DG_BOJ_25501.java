package 대동.recursion;

/* https://www.acmicpc.net/problem/25501 */

import java.io.*;

public class DG_BOJ_25501 {

    public static int[] recursion(String s, int l, int r, int cnt){
        cnt++;
        if(l >= r) return new int[]{1, cnt};
        else if(s.charAt(l) != s.charAt(r)) return new int[]{0, cnt};
        else return recursion(s, l+1, r-1 , cnt);
    }
    public static int[] isPalindrome(String s){
        return recursion(s, 0, s.length()-1, 0);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int[] arr = isPalindrome(br.readLine());
            sb.append(arr[0]).append(" ").append(arr[1]).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
