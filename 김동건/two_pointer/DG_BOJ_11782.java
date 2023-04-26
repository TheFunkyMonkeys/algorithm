package two_pointer;

/* https://www.acmicpc.net/problem/11782 */

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DG_BOJ_11782 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arr = new int[A + B];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < A; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = A; i < A + B; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }


        bw.write(sb.toString());
        bw.close();
    }
}
