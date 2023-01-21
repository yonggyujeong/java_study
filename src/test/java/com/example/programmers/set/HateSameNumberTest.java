package com.example.programmers.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HateSameNumberTest {

    @Test
    void test() {
        int[] arr = {1,1,3,3,0,1,1};
        int[] answer = {1,3,0,1};
        Assertions.assertThat(HateSameNumber.solution(arr)).isEqualTo(answer);
    }

    @Test
    void test2() {
        int[] arr = {4,4,4,3,3};
        int[] answer = {4,3};
        Assertions.assertThat(HateSameNumber.solution(arr)).isEqualTo(answer);
    }

}
