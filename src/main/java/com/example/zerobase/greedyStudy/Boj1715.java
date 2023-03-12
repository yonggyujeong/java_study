package com.example.zerobase.greedyStudy;


import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj1715 {



    // 우선순위 큐로 풀것 (minHeap)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.offer(sc.nextLong());        // Long.parseLong(sc.nextLine()) -> 메모리초과
        }

        long sum = 0;
        while (pq.size() > 1) {
            Long num1 = pq.poll();
            Long num2 = pq.poll();

            sum += (num1 + num2);
            pq.offer(num1 + num2);
        }
        System.out.println(sum);

    }
}
