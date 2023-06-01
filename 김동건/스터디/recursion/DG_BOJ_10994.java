package 스터디.recursion;

/* https://www.acmicpc.net/problem/10994 */

import java.io.*;
import java.util.Arrays;

public class DG_BOJ_10994 {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //한줄씩 계속 출력하기 위해 전역변수 사용

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        recursion(1, n);
        bw.close();
    }

    public static void recursion(int countPoint, int n) throws IOException { //countPoint는 해당 줄의 번호를 의미
        print(countPoint, n);

        if (countPoint == n * 2 - 1) { //가운데 줄을 출력해야 될때 리턴
            return;
        }

        recursion(++countPoint, n);

        print(--countPoint, n); //가운데 줄 기준으로 별의 모양은 똑같으니 줄을 줄어가며 다시 프린트
    }

    public static void print(int countPoint, int n) throws IOException {
        String[] arr = new String[4 * n - 3]; //한 줄에 표시되는 별의 개수

        if (countPoint % 2 != 0) { //홀수번째 줄은 arr를 별로 가득 채우고 양쪽에 공백을 추가
            Arrays.fill(arr, "*");
            for (int i = 1; i < countPoint; i += 2) {
                arr[i] = " ";
                arr[4 * n - 4 - i] = " ";
            }
        } else { //짝수번째 줄은 arr를 공백으로 가득 채우고 양쪽에 별을 추가
            Arrays.fill(arr, " ");
            for (int i = 0; i < countPoint - 1; i += 2) {
                arr[i] = "*";
                arr[4 * n - 4 - i] = "*";
            }
        }

        for (String s : arr) { //한 줄마다 출력
            bw.write(s);
        }

        bw.write("\n");
    }
}
