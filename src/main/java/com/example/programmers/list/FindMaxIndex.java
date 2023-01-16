package com.example.programmers.list;

import java.util.*;

public class FindMaxIndex {
    public static int[] solution(int[] arr) {
        // 최댓값 찾기
        Integer maxV = Arrays.stream(arr)
                .max()
                .getAsInt();

        // 인덱스 찾기
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxV){
                list.add(i);
            }
        }

        // List<Integer> to int[]
        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
