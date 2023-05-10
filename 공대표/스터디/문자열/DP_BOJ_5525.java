package 스터디.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_5525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int count = 0;

        String str = "IOI";
        for (int i = 1; i < n; i++) {
            str += "OI";
        }

        String replaceStr = str.substring(2, str.length());

        while (s.contains(str)) {
            s = s.replaceFirst(str, replaceStr);
            count++;
        }

        System.out.print(count);
    }
}
