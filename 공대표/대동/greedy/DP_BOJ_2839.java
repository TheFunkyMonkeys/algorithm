package 대동.greedy;

/* https://www.acmicpc.net/problem/2839 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP_BOJ_2839 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//
//        if (n == 4 || n == 7) {
//            System.out.print(-1);
//        } else if (n % 5 == 0) {
//            System.out.print(n / 5);
//        } else if (n % 5 == 3 || n % 5 == 1) {
//            System.out.print(n / 5 + 1);
//        } else if (n % 5 == 2 || n % 5 == 4) {
//            System.out.print(n / 5 + 2);
//        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        while(true) {
            // 2. 우선 5로 나누고 나누어떨어지면 그대로 출력, 아니면 3을 빼주고 봉지개수를 1 증가한다.
            if(n % 5 == 0) {
                cnt = cnt + n / 5;
                break;
            }

            n = n - 3;
            cnt++;

            // 3. 2번 처럼 하다가 계속 -3을 빼서 음수가 됐으면 정확하게 N 킬로그램을 만들 수 없으니 -1 출력
            //    아니면 봉지개수 출력
            if(n < 0) {
                cnt = -1;
                break;
            }
        }
        System.out.print(cnt);
    }
}
