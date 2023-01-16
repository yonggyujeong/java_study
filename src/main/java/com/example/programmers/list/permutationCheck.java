package com.example.programmers.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class permutationCheck {
    public boolean solution(int[] arr) {
        Integer sumV = Arrays.stream(arr).sum();
        Integer sumV2 = IntStream
                .range(1, arr.length+1).sum();
        return sumV == sumV2;
    }
}
