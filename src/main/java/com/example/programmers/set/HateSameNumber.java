package com.example.programmers.set;

import java.util.ArrayList;
import java.util.List;

public class HateSameNumber {
    public static int[] solution(int[] arr) {
        int preNum = -1;
        List<Integer> list = new ArrayList<>();
        for (int n : arr) {
            if (preNum != n) {
                list.add(n);
            }
            preNum = n;
        }
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
