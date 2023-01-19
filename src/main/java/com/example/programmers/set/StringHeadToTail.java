package com.example.programmers.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringHeadToTail {
    public boolean solution(String[] words) {
        List<String> preWords = new ArrayList<>();

        char preTail = words[0].charAt(0);
        for(int i = 0; i < words.length ; i++) {
            char head = words[i].charAt(0);
            char tail = words[i].charAt(words[i].length() - 1);
            if (preTail != head) {
                return false;
            }
            preTail = tail;
            if (preWords.contains(words[i])) {
                return false;
            }
            preWords.add(words[i]);
        }
        return true;
    }
}
