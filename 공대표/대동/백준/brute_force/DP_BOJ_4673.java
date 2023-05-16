package 대동.백준.brute_force;

/* https://www.acmicpc.net/problem/4673 */

public class DP_BOJ_4673 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        boolean[] arr = new boolean[10001]; // 기본적으로 없다고 가정

        for (int i = 1; i <= 10000; i++) {
            int curNum = i;
            int sum = i;

            while (curNum > 0) {
                sum += curNum % 10;
                curNum /= 10;
            }

            if (sum > 10000) {
                continue;
            }

            arr[sum] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false) {
                sb.append(i + "\n");
            }
        }

        System.out.print(sb);
    }
}
