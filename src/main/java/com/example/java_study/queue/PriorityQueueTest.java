package com.example.java_study.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {

    public static void main(String[] args) {
        // Min Heap
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(10);
        priorityQueue.offer(4);
        priorityQueue.offer(5);
        priorityQueue.offer(1);
        priorityQueue.offer(7);

        System.out.println(priorityQueue);
        // [1, 4, 5, 10, 7]

        // Max Heap
        PriorityQueue<Integer> priorityQueueMax = new PriorityQueue<>(Comparator.reverseOrder());

        priorityQueueMax.offer(10);
        priorityQueueMax.offer(4);
        priorityQueueMax.offer(5);
        priorityQueueMax.offer(1);
        priorityQueueMax.offer(7);

        System.out.println(priorityQueueMax);
        // [10, 7, 5, 1, 4]

        // 맥스 힙 람다로 구현
        PriorityQueue<Integer> pqL = new PriorityQueue<>((o1, o2) -> o2 - o1);
        pqL.offer(10);
        pqL.offer(4);
        pqL.offer(5);
        pqL.offer(1);
        pqL.offer(7);

        System.out.println(pqL);
    }
}
