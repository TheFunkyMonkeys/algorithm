package 스터디.문자열;

/* https://www.acmicpc.net/problem/5635 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 20101231;
        int min = 19900101;

        String old = "", young = "";

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            String birth = str[3] + String.format("%02d", Integer.parseInt(str[2])) + String.format("%02d", Integer.parseInt(str[1]));

            if (max >= Integer.parseInt(birth)) {
                max = Integer.parseInt(birth);
                old = str[0];
            }

            if (min <= Integer.parseInt(birth)) {
                min = Integer.parseInt(birth);
                young = str[0];
            }
        }

        System.out.print(young + "\n" + old);
    }
}
