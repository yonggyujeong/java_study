package com.example.programmers.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MakeNaturalNumberTest {
    @Test
    void test() {
        long n = 12345;
        int[] solution = MakeNaturalNumber.solution(n);
        int[] answer = {5,4,3,2,1};
        Assertions.assertThat(solution).isEqualTo(answer);
    }

}
