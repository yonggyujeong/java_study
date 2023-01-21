package com.example.programmers.StackQueueDeque;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class CorrectBracketTest {
    @Test
    void test() {
        long startTime = System.currentTimeMillis();


        // 메서드
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 100000; i++) {
            stack.push(1);
             stack.empty();
             stack.pop();
        }

        long finishTime = System.currentTimeMillis();
        long elapsedTime = finishTime - startTime;

        System.out.println("startTime(ms) : " + startTime);
        System.out.println("finishTime(ms) : " + finishTime);
        System.out.println("elapsedTime(ms) : " + elapsedTime);
    }
}
