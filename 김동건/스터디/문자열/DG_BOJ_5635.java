package 스터디.문자열;

/* https://www.acmicpc.net/problem/5635 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DG_BOJ_5635 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String name = "", birth = "", maxName = "", minName = "";
        int max = 20101231, min = 19900101;

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            name = arr[0];
            birth = arr[3] + String.format("%02d", Integer.parseInt(arr[2])) + String.format("%02d", Integer.parseInt(arr[1]));

            if (max > Integer.parseInt(birth)) {
                max = Integer.parseInt(birth);
                maxName = name;
            }
            if (min < Integer.parseInt(birth)) {
                min = Integer.parseInt(birth);
                minName = name;
            }
        }

        System.out.println(minName);
        System.out.println(maxName);
    }
}
