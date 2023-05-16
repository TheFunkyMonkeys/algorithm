package 대동.백준.heap;

/* https://www.acmicpc.net/problem/11279 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DP_BOJ_11279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        MaxHeap maxHeap = new MaxHeap();
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (maxHeap.heap.size() == 0) {
                    sb.append("0\n");
                } else {
                    sb.append(maxHeap.delete() + "\n");
                }
            } else {
                maxHeap.insert(x);
            }
        }

        System.out.print(sb);
    }

    public static class MaxHeap {
        public ArrayList<Integer> heap;

        public MaxHeap() {
            heap = new ArrayList<>();
            heap.add(Integer.MAX_VALUE);
        }

        public void print() {
            for (int i : heap) {
                System.out.print(i + " ");
            }
        }

        public void insert(int value) {
            heap.add(value);
            int index = heap.size() - 1;

            while (index > 1 && heap.get(index / 2) < heap.get(index)) {
                /* 루트노드가 아니며 들어온 값이 부모 노드보다 크다면 서로 swap */
                int temp = heap.get(index / 2);
                heap.set(index / 2, value);
                heap.set(index, temp);

                index /= 2;
            }
        }

        public int delete() {
            if (heap.size() - 1 == 0) {
                /* 생성자를 통해 heap 0번 인덱스에 값을 주니 0번 인덱스를 제외하고 개수를 비교하여 isEmpty인지 판단 */
                return 0;
            }

            int deleteNode = heap.get(1); /* 힙 삭제는 무조건 루트노드부터 삭제 */

            heap.set(1, heap.get(heap.size() - 1)); /* 삭제하려는 루트노드에 마지막 노드 값 넣어주기 */
            heap.remove(heap.size() - 1);

            int pos = 1; /* position 루트 노드로 최초 설정 index */
            while ((pos * 2) < heap.size()) {
                /* 왼쪽 자식 노드 인덱스를 heap.size와 비교하여 자식이 있는지 유무 판단 */
                int max = heap.get(pos * 2);
                int maxPos = pos * 2;

                if (((pos * 2 + 1) < heap.size()) && max < heap.get(pos * 2 + 1)) {
                    /* 오른쪽 자식 노드 인덱스를 heap.size와 비교하여 자식이 있는지 유무 판단 후 왼쪽 자식과 크기 비교 */
                    max = heap.get(pos * 2 + 1);
                    maxPos = pos * 2 + 1;
                }

                if (heap.get(pos) > max) {
                    /* 부모노드가 클 경우 반복문 탈출 */
                    break;
                }

                int temp = heap.get(pos);
                heap.set(pos, heap.get(maxPos));
                heap.set(maxPos, temp);
                pos = maxPos;
            }

            return deleteNode;
        }

        public int size() {
            return heap.size();
        }
    }
}
