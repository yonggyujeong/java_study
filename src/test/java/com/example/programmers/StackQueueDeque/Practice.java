package com.example.programmers.StackQueueDeque;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Practice {

    @Test
    void Stack_메서드_테스트() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1); //넣기
        stack.pop(); // 상단 값 빼기
        stack.peek(); // 상단 값 참조
        stack.isEmpty(); // 비어있는지
        stack.size(); //크기
        stack.contains(1); //찾기
    }

    @Test
    void Queue_메서드_테스트() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.offer(3);
        queue.poll(); //비어 잇다면 null 반환
        queue.peek();       // queue의 첫번째 값 참조
    }
    
    @Test
    void Deque_메서드_테스트() {
        //https://soft.plusblog.co.kr/24
    }
}
