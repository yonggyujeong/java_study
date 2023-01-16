package com.example.programmers.list;

import java.util.Arrays;

public class MakeNaturalNumber {
    public static int[] solution(long n) {
        String nToString = String.valueOf(n);
        String[] splitN = nToString.split("");

        String[] answer = new String[splitN.length];
        for(int i = 0; i < splitN.length; i++) {
            answer[i] = splitN[splitN.length -1 -i];
        }
        return Arrays.asList(answer).stream()
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
