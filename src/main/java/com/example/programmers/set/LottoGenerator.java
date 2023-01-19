package com.example.programmers.set;

import java.util.HashSet;
import java.util.Set;

public class LottoGenerator {
    public boolean solution(int[] lotto) {
        Set<Integer> lottoSet = new HashSet<>();
        for(int l : lotto) {
            lottoSet.add(l);
        }
        if (lottoSet.size() == 6) {
            return true;
        }
        return false;
    }
}
