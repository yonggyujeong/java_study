package com.example.programmers.map;
import java.util.*;

public class Ponkemon {
    public int solution(int[] nums) {

        Map<Integer, Integer> ponkemonMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (ponkemonMap.containsKey(nums[i])) {
                //ponkemonMap.replace(nums[i], ponkemonMap.get(nums[i]) + 1);
            }
            ponkemonMap.put(nums[i], 1);
        }

        Integer possibleCount = nums.length / 2;
        Integer numberOfSort = ponkemonMap.size();
        if (possibleCount > numberOfSort) {
            return numberOfSort;
        }
        return possibleCount;
    }

    // Map
    // containsKey
    // put
    // get
    // replace
    // size
}
