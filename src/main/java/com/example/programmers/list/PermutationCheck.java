package com.example.programmers.list;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PermutationCheck {
    public static boolean solution(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] answer = IntStream.range(1, arr.length + 1)
                .toArray();
        System.out.println(Arrays.toString(answer));
        System.out.println(Arrays.equals(arr, answer));
        return false;
    }
}
