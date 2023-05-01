package 스터디.문자열;

/* https://www.acmicpc.net/problem/10173 */

import java.io.*;

public class DG_BOJ_10173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String str;
        while (true) {
            str = br.readLine();
            if (str.equals("EOI")) {
                break;
            }

            if (str.toLowerCase().contains("nemo")) {
                sb.append("Found").append("\n");
            } else {
                sb.append("Missing").append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}
