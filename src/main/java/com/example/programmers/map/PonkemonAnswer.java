package com.example.programmers.map;

import java.util.HashMap;
import java.util.Map;

public class PonkemonAnswer {
    public int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            // 배열의 키 만 중요
            map.put(num, 0);
        }
        int num1 = map.keySet().size();
        int num2 = nums.length / 2;

        // 최솟값
        return Math.min(num1, num2);
    }
    // put : 같은 key 값을 가지는 값을 put 하면 자연스레 덮어씌워진다.
    // keyset : keyset : key를 리스트로 뽑는다.
}
