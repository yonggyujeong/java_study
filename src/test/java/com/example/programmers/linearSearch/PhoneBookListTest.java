package com.example.programmers.linearSearch;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class PhoneBookListTest {
    @Test
    public void testCase1 () throws Exception {
        // given
        String[] input = {"119", "97674223", "1195524421"};
        // when
        boolean result = PhoneBookList.solution(input);

        // then
        assertThat(result).isFalse();
    }
}
