package com.example.java_study;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.*;

public class ArraysTest {

    private static int[] arr = {1, 2, 3, 4, 5};

    @Test
    void 배열을_List로_변경하기() { // 어려우면 반복문 쓰자..
        List<Integer> collect =
                Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
    }

    @Test
    void 배열을_Set로_변경하기() {

    }

}
