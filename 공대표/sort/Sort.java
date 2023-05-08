package sort;

public class Sort {

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    minIdx = j;
                }
            }

            swap(arr, i, minIdx);
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int target = arr[i];
            int j = i - 1;

            while (j >= 0 && target < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = target;
        }
    }


    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
