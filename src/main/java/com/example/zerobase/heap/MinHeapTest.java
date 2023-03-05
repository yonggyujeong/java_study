package com.example.zerobase.heap;

import java.util.ArrayList;

public class MinHeapTest {
    static class MinHeap {
        ArrayList<Integer> heap;

        public MinHeap() {
            this.heap = new ArrayList<>();  
            this.heap.add(0); // 맨 처음 인덱스 0 채우기
        }

        public void insert(int data) {
            heap.add(data); // 맨 마지막에 추가

            int cur = heap.size() - 1;  // 마지막 값의 인덱스
            while (cur > 1 && heap.get(cur / 2) > heap.get(cur)) {  // 부모 값이 더 크다면
                int parentVal = heap.get(cur / 2);
                heap.set(cur / 2, data);
                heap.set(cur, parentVal);

                cur /= 2;
            }
        }

        public void printTree() {
            for (int i = 0; i < this.heap.size(); i++) {
                System.out.print(this.heap.get(i) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap();
        minHeap.insert(30);
        minHeap.insert(40);
        minHeap.insert(10);
        minHeap.printTree();
        minHeap.insert(50);
        minHeap.insert(60);
        minHeap.insert(70);
        minHeap.printTree();
        minHeap.insert(20);
        minHeap.printTree();
        minHeap.insert(30);
        minHeap.printTree();



    }
}
