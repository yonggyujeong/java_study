package com.example.programmers.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxIndexTest {
    @Test
    void test() {
        int[] arr = {1, 3, 5, 4, 5, 2, 1};
        int[] result = FindMaxIndex.solution(arr);

        int[] answer = {2, 4};
        Assertions.assertThat(result).isEqualTo(answer);
    }

}
