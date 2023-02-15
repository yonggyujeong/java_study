package com.example.backjun;
import java.util.*;

public class Bj1021 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String firstLine = sc.nextLine();
        String secondLine = sc.nextLine();

        String[] firstArr = firstLine.split(" ");
        String[] secondArr = secondLine.split(" ");

        Integer N = Integer.parseInt(firstArr[0]);
        Integer M = Integer.parseInt(firstArr[1]);
        Integer[] targetNumbers = Arrays.stream(secondArr).map(Integer::parseInt).toArray(Integer[]::new);

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < N; i++) {
            deque.addFirst(i + 1);
        }

        int cnt = 0;



    }

    void moveLeft(ArrayDeque<Integer> deque) {
        Integer num = deque.removeFirst();
        deque.addLast(num);
        return;
    }

    void moveRight(ArrayDeque<Integer> deque) {
        Integer num = deque.removeLast();
        deque.addFirst(num);
        return;
    }
}
