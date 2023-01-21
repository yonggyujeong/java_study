package com.example.programmers.StackQueueDeque;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class FunctionDevelopmentTest {

    @Test
    void test() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        int[] answer = {2, 1};
        assertThat(FunctionDevelopment.solution(progresses,speeds)).isEqualTo(answer);
    }

    @Test
    void test2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};
        int[] answer = {1, 3, 2};
        assertThat(FunctionDevelopment.solution(progresses,speeds)).isEqualTo(answer);
    }

}
