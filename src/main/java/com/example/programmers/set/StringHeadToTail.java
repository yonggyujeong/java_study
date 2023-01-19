package com.example.programmers.set;

import java.util.Arrays;
import java.util.List;

public class StringHeadToTail {
    public boolean solution(String[] words) {
        List<String> list = Arrays.asList(words);

        char preTail;
        for(int i = 0; i < words.length ; i++) {
            char head = words[i].charAt(0);
            char tail = words[i].charAt(words.length - 1);
        }
    }
}
