package 스터디.문자열;

/* https://www.acmicpc.net/problem/9733 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class DP_BOJ_9733 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] workArr = {"Re", "Pt", "Cc", "Ea", "Tb", "Cm", "Ex"};
        double count = 0;

        for (int i = 0; i < workArr.length; i++) {
            hm.put(workArr[i], 0);
        }

        String str = "";
        while ((str = br.readLine()) != null) {
            String[] arr = str.split(" ");

            for (int i = 0; i < arr.length; i++) {
                hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
                count++;
            }
        }

        for (int i = 0; i < workArr.length; i++) {
            System.out.printf("%s %d %.2f\n", workArr[i], hm.get(workArr[i]), hm.get(workArr[i]) / count);
        }

        sb.append("Total " + (int) count + " 1.00");

        System.out.print(sb);
    }
}
