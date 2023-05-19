package 코드스테이츠.데일리;

import java.util.HashMap;

public class Quiz07 {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"make", "Ford"},
                {"model", "Mustang"},
                {"year", "1964"},
                {"make", "Bill"}
        };

        HashMap<String, String> output = convertListToHashMap(arr);


    }

    public static HashMap<String, String> convertListToHashMap(String[][] arr) {
        // TODO:
        HashMap<String, String> hm = new HashMap<>();
        if (arr.length == 0) {
            return hm;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length == 0) {
                continue;
            }

            if(!hm.containsKey(arr[i][0])) {
                hm.put(arr[i][0], arr[i][1]);
            }
        }

        return hm;
    }
}
