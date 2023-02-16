package com.example.java_study.queue;

import java.util.*;
import java.util.stream.Collectors;

public class spiningQueue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oneLine = sc.nextLine();
        String twoLine = sc.nextLine();

        String[] oneArr = oneLine.split(" ");
        Integer N = Integer.parseInt(oneArr[0]);
        Integer M = Integer.parseInt(oneArr[1]);

        String[] twoArr = twoLine.split(" ");
        List<Integer> list = Arrays.stream(twoArr).map(Integer::parseInt)
                .collect(Collectors.toList());

        Queue<Integer> target = new LinkedList<>(list);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.add(i+1);
        }

        int moveCnt = 0;
        while(!target.isEmpty()) {
            Integer t = target.poll();
            int idx = findIdx(deque, t);
            int leftCnt = idx;
            int rightCnt = deque.size() - idx;   // length-1 - idx + 1
            if (leftCnt <= rightCnt) {
                for (int i = 0; i < leftCnt; i++) {
                    moveLeft(deque);
                    moveCnt += 1;
                }
            }
            else {
                for (int i = 0; i < rightCnt; i++) {
                    moveRight(deque);
                    moveCnt += 1;
                }
            }
            if (deque.peekFirst().equals(t)) {      // peekFirst
                deque.poll();
            }
        }
        System.out.println(moveCnt);
    }

    static void moveLeft(ArrayDeque<Integer> deque) {
        Integer q = deque.removeFirst();
        deque.addLast(q);
    }

    static void moveRight(ArrayDeque<Integer> deque) {
        Integer q = deque.removeLast();
        deque.addFirst(q);
    }

    static int findIdx(ArrayDeque<Integer> deque, Integer target) {
        int idx = 0;
        for (Integer num : deque) {         // deque 는 get 없음
            if (num.equals(target)) {
                return idx;
            }
            idx += 1;
        }
        return -1;
    }


}
