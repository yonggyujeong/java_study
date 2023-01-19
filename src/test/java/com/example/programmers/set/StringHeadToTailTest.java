package com.example.programmers.set;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringHeadToTailTest {
    @Test
    void test() {
        StringHeadToTail stringHeadToTail = new StringHeadToTail();
        String[] input = {"tank", "kick", "know", "wheel", "land", "dream"};
        Assertions.assertThat(stringHeadToTail.solution(input)).isTrue();
    }

}
