package 대동.recursion;

import java.io.*;
import java.util.Arrays;

public class DG_BOJ_16505 {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            bw.write("*");
            bw.close();
            return;
        }
        recursion(n, 0);
        bw.close();
    }

    public static void recursion(int n, int countPoint) throws IOException {
        if (countPoint > (int)Math.pow(2, n)) {
            return;
        }
        if ((countPoint + 1) % 2 == 0) {
            printStarEvenLine(n, countPoint);
        } else {
            printStarOddLine(n, countPoint);
        }
        recursion(n, ++countPoint);
    }

    //홀수줄
    public static void printStarOddLine(int n, int countPoint) throws IOException {
        String[] arr = new String[(int)Math.pow(2, n)/2 - countPoint/2];
        Arrays.fill(arr, "**\n*");

        for (String s : arr) {
            bw.write(s);
        }
        bw.write("\n");
    }

    //짝수줄
    public static void printStarEvenLine(int n, int countPoint) throws IOException {
        String[] arr = new String[(int)Math.pow(2, n) - countPoint];
        Arrays.fill(arr, "*");

        for (String s : arr) {
            bw.write(s);
        }
        bw.write("\n");
    }
}
