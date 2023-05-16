package 대동.백준.heap;

/* https://www.acmicpc.net/problem/11286 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DP_BOJ_11286 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        absMinHeap absMinHeap = new absMinHeap();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                sb.append(absMinHeap.delete() + "\n");
            } else {
                absMinHeap.insert(x);
            }
        }
        System.out.print(sb);
    }

    public static class absMinHeap {
        ArrayList<Integer> heap;

        public void print() {
            for (int i : heap) {
                System.out.print(i + " ");
            }
        }

        public absMinHeap() {
            heap = new ArrayList<>();
            heap.add(Integer.MAX_VALUE);
        }

        public void insert(int value) {
            heap.add(value);
            int index = heap.size() - 1;

            while (index > 1 && Math.abs(heap.get(index / 2)) >= Math.abs(heap.get(index))) {
                if (Math.abs(heap.get(index / 2)) == Math.abs(heap.get(index))) {
                    if (heap.get(index / 2) < heap.get(index)) {
                        break;
                    }
                }
                int temp = heap.get(index / 2);
                heap.set(index / 2, heap.get(index));
                heap.set(index, temp);

                index /= 2;
            }
        }

        public int delete() {
            if (heap.size() - 1 < 1) {
                return 0;
            }

            int deleteItem = heap.get(1);

            heap.set(1, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int pos = 1;
            while ((pos * 2) < heap.size()) {
                int absMin = heap.get(pos * 2);
                int absMinPos = pos * 2;

                if ((pos * 2) + 1 < heap.size() && Math.abs(heap.get(pos * 2)) >= Math.abs(heap.get(pos * 2 + 1))) {
                    if (Math.abs(heap.get(pos * 2)) == Math.abs(heap.get(pos * 2 + 1))) {
                        if (heap.get(pos * 2) < heap.get(pos * 2 + 1)) {

                        } else {
                            absMin = heap.get(pos * 2 + 1);
                            absMinPos = pos * 2 + 1;
                        }
                    } else {
                        absMin = heap.get(pos * 2 + 1);
                        absMinPos = pos * 2 + 1;
                    }
                }

                if (Math.abs(absMin) > Math.abs(heap.get(pos))) {
                    break;
                } else if (Math.abs(absMin) == Math.abs(heap.get(pos))) {
                    if (absMin > heap.get(pos)) {
                        break;
                    }
                }

                int temp = heap.get(pos);
                heap.set(pos, absMin);
                heap.set(absMinPos, temp);
                pos = absMinPos;
            }

            return deleteItem;
        }

        public int size() {
            return heap.size();
        }
    }
}
