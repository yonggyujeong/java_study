package com.example.programmers.set;

import java.util.HashSet;
import java.util.Set;

public class LottoGenerator {
    public boolean solution(int[] lotto) {
        Set<Integer> set = new HashSet<>();
        for (int l : lotto) {
            if (l >= 1 && l <= 45) {
                set.add(l);
            }
        }
        if (set.size() == 6) return true;
        return false;
    }
}
