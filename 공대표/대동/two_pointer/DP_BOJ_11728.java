package 대동.two_pointer;

/* https://www.acmicpc.net/problem/11728 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DP_BOJ_11728 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arrA = new int[Integer.parseInt(st.nextToken())];
        int[] arrB = new int[Integer.parseInt(st.nextToken())];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrA.length; i++) {
            arrA[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arrB.length; i++) {
            arrB[i] = Integer.parseInt(st.nextToken());
        }

        int aIdx = 0, bIdx = 0;
        for (int i = 0; i < arrA.length + arrB.length; i++) {

            if (aIdx == arrA.length) {
                sb.append(arrB[bIdx] + " ");
                bIdx++;
                continue;
            } else if (bIdx == arrB.length){
                sb.append(arrA[aIdx] + " ");
                aIdx++;
                continue;
            }

            if (arrA[aIdx] < arrB[bIdx]) {
                sb.append(arrA[aIdx] + " ");
                aIdx++;
            } else {
                sb.append(arrB[bIdx] + " ");
                bIdx++;
            }
        }

        System.out.print(sb.toString().trim());
    }
}
