package com.example.java_study.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class streamTestTest {

    @Test
    void test() {
        Set<Integer> set = new HashSet<>();

        int[] ints = set.stream().mapToInt(Integer::intValue).toArray();
        
    }

}
