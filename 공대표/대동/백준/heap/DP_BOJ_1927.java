package 대동.백준.heap;

/* https://www.acmicpc.net/problem/1927 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DP_BOJ_1927 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        MinHeap minHeap = new MinHeap();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (minHeap.heap.size() == 0) {
                    sb.append("0\n");
                } else {
                    sb.append(minHeap.delete() + "\n");
                }
            } else {
                minHeap.insert(x);
            }
        }

        System.out.print(sb);
    }

    public static class MinHeap {
        ArrayList<Integer> heap;

        public MinHeap() {
            heap = new ArrayList<>();
            heap.add(Integer.MIN_VALUE);
        }

        public void insert(int value) {
            heap.add(value);
            int index = heap.size() - 1;

            while (index > 1 && heap.get(index / 2) > heap.get(index)) {
                int temp = heap.get(index / 2);
                heap.set(index / 2, heap.get(index));
                heap.set(index, temp);

                index /= 2;
            }
        }

        public int delete() {
            if (heap.size() - 1 == 0) {
                return 0;
            }

            int deleteItem = heap.get(1);

            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int pos = 1;
            while ((pos * 2) < heap.size()) {
                int min = heap.get(pos * 2);
                int minPos = pos * 2;

                if ((pos * 2) + 1 < heap.size() && heap.get(pos * 2 + 1) < heap.get(pos * 2)) {
                    min = heap.get(pos * 2 + 1);
                    minPos = pos * 2 + 1;
                }

                if (heap.get(pos) < min) {
                    break;
                }

                int temp = heap.get(pos);
                heap.set(pos, heap.get(minPos));
                heap.set(minPos, temp);
                pos = minPos;
            }

            return deleteItem;
        }

        public int size() {
            return heap.size();
        }
    }
}
