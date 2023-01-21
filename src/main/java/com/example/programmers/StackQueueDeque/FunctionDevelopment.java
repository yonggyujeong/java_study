package com.example.programmers.StackQueueDeque;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FunctionDevelopment {
    public static int[] solution(int[] progresses, int[] speeds) {
        List<Integer> days = new ArrayList<>();
        for(int i=0; i<progresses.length; i++) {
            int time = (int)Math.ceil((double)(100 - progresses[i]) / (double)speeds[i]);
            days.add(time);
        }

        Queue<Integer> queue = new LinkedList<>(days);
        int finishTime = 100;
        List<Integer> returnV = new ArrayList<>();
        while(!queue.isEmpty()) {
            int cnt = 0;
            finishTime = queue.peek();
            while (finishTime >= queue.peek()) {
                queue.poll();
                cnt += 1;
                if (queue.isEmpty()) break;
            }
            returnV.add(cnt);
        }

        return returnV.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
