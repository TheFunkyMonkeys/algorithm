package 스터디.queue;

/* https://www.acmicpc.net/problem/14713 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class DP_BOJ_14713 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<ArrayList<String>> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());
        int parrotWord = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<String> arr = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int size = st.countTokens();

            for (int j = 0; j < size; j++) {
                arr.add(st.nextToken());
                parrotWord++;
            }

            queue.add(arr);
        }

        String sen = br.readLine();
        StringTokenizer st = new StringTokenizer(sen);
        int stLength = st.countTokens();
        String result = "";

        if (stLength == parrotWord) {
            for (int i = 0; i < stLength; i++) {
                String curWord = st.nextToken();


                int queueSize = queue.size();
                for (int j = 0; j < queueSize; j++) {
                    ArrayList<String> curArr = queue.remove();

                    if (curArr.size() > 0) {
                        if (curWord.equals(curArr.get(0))) {
                            result += curArr.remove(0) + " ";
                            queue.add(curArr);
                            break;
                        } else {
                            queue.add(curArr);
                        }
                    }
                }
            }
        }

        System.out.print(result.trim().equals(sen) ? "Possible" : "Impossible");
    }
}
