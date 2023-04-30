package 스터디.문자열;

/* https://www.acmicpc.net/problem/10173 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = "";
        while (!(str = br.readLine()).equals("EOI")) {
            str = str.toLowerCase();

            if (str.contains("nemo")) {
                sb.append("Found" + "\n");
            } else {
                sb.append("Missing" + "\n");
            }
        }

        System.out.print(sb);
    }
}
