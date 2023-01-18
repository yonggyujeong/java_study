package com.example.programmers.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PonkemonList {
    public int solution(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            // 배열의 키 만 중요
           if (!list.contains(num)) {
               list.add(num);
           }
        }
        int num1 = list.size();
        int num2 = nums.length / 2;

        // 최솟값
        return Math.min(num1, num2);
    }
    // 리스트를 사용하면 contains를 써야한다.
    // 값이 추가될 수록 contains로 비교하는 값이 많아진다
    // map이 더 효율적인 방법이다
}
