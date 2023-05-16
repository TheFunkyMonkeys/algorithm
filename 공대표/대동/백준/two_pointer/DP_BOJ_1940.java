package 대동.백준.two_pointer;

/* https://www.acmicpc.net/problem/1940 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DP_BOJ_1940 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
    
            int n = Integer.parseInt(br.readLine());
            int m = Integer.parseInt(br.readLine());
    
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
    
            Arrays.sort(arr);
            int start = 0, end = 1;
    
            while (start < n) {
                if (end >=n) {
                    start++;
                    end = start + 1;
                    continue;
                }
    
                if (arr[start] + arr[end] == m) {
                    start++;
                    end = start + 1;
                    count++;
                    continue;
                }
    
                end++;
            }
    
            System.out.print(count);
    }
}
