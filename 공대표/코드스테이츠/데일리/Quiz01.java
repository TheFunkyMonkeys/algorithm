package 코드스테이츠.데일리;

import java.util.HashMap;

public class Quiz01 {
    public static void main(String[] args) {
        String[] arr = new String[]{"Queen", "Elizabeth", "Of Hearts", "Beyonce"};
        HashMap<String, String> output = transformFirstAndLast(arr);
    }

    public static HashMap<String, String> transformFirstAndLast(String[] arr) {
        // TODO:
        if (arr.length == 0) {
            return null;
        }

        HashMap<String, String> result = new HashMap<>();
        result.put(arr[0], arr[arr.length - 1]);

        return result;
    }
}
