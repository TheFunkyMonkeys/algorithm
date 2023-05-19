package 코드스테이츠.알고리즘;

public class 편의점 {
    public static void main(String[] args) {
        int output1 = partTimeJob(4972);

        System.out.print(output1);
    }

    public static int partTimeJob(int k) {
        // TODO:
        int result = 0;
        int[] coin = {500, 100, 50, 10, 5, 1};

        int index = 0;
        while (k != 0) {
            if (coin[index] > k) {
                index += 1;
                continue;
            }

            result += k / coin[index];
            k %= coin[index];
        }

        return result;
    }

}
