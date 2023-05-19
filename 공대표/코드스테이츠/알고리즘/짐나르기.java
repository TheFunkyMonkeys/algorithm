package 코드스테이츠.알고리즘;

import java.util.Arrays;

public class 짐나르기 {
    public static void main(String[] args) {
        int output = movingStuff(new int[]{70, 50, 80, 50}, 100);

        // 70 50 80 60


        System.out.print(output);
    }

    public static int movingStuff(int[] stuff, int limit) {
        // TODO:
        Arrays.sort(stuff);

        int count = 0;
        boolean flag = false;
//        int twoBox = 0;

        for (int i = 0; i < stuff.length; i++) {
            if (stuff[i] == 0) {
                continue;
            }

            for (int j = stuff.length - 1; j > i; j--) {
                if (stuff[j] == 0) {
                    continue;
                }

                if (stuff[i] + stuff[j] <= limit) {
                    stuff[i] = 0;
                    stuff[j] = 0;
                    count++;
                    flag = true;
                    break;

                }
            }

            if (!flag) {
                stuff[i] = 0;
                count++;
            }

            flag = false;
        }

        return count;
    }
}
