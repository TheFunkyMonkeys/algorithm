package 스터디.recursion;

/* https://www.acmicpc.net/problem/18511 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class DG_BOJ_18511 {

    static int n;
    static int max = 0;
    static Integer[] target;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        target = new Integer[k];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < k; i++) {
            target[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(target, Collections.reverseOrder());

        System.out.print(recursion(0));
    }

    public static int recursion(int num) {
        if (Integer.toString(num).length() > Integer.toString(n).length()) {
            return max;
        }

        for (int i = 0; i < target.length; i++) {
            num += target[i];

            if (num <= n) {
                if (num > max) {
                    max = num;
                }
                recursion(num * 10);
            }

            num -= target[i];
        }

        return max;
    }
}
