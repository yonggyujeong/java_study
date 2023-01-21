package com.example.programmers.StackQueueDeque;

import java.util.Stack;

public class CorrectBracket {
    static boolean solution(String s) {
        //String[] arr = s.split("");

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char b = s.charAt(i);
            if (b == '(') {
                stack.push(1);
                continue;
            }
            if(stack.isEmpty()) {
                return false;
            }
            stack.pop();
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
