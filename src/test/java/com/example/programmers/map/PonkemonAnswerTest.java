package com.example.programmers.map;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PonkemonAnswerTest {
    @Test
    void test() {
        int[] param = {3,1,2,3};

        PonkemonAnswer ponkemon = new PonkemonAnswer();
        assertThat(ponkemon.solution(param)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] param = {3,3,3,2,2,4};

        PonkemonAnswer ponkemon = new PonkemonAnswer();
        assertThat(ponkemon.solution(param)).isEqualTo(3);
    }

    @Test
    void test3() {
        int[] param = {3,3,3,2,2,2};

        PonkemonAnswer ponkemon = new PonkemonAnswer();
        assertThat(ponkemon.solution(param)).isEqualTo(2);
    }
}
