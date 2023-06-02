package 스터디.greedy;

/* https://www.acmicpc.net/problem/2839 */

import java.io.*;

public class DG_BOJ_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        if (N == 4 || N == 7) {
            sb.append(-1);
        } else if (N % 5 == 0) {
            sb.append(N / 5);
        } else if (N % 5 == 1 || N % 5 == 3) {
            sb.append((N / 5) + 1);
        } else if (N % 5 == 2 || N % 5 == 4) {
            sb.append((N / 5) + 2);
        }

        bw.write(sb.toString());
        bw.close();
    }
}
