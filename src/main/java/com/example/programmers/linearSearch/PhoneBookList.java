package com.example.programmers.linearSearch;

import java.util.Arrays;

public class PhoneBookList {
    public static boolean solution(String[] phone_book) {
        // 단순 비교 : 100만!
        // 정렬해서 바로 옆에꺼만 비교
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
            String formerWord = phone_book[i];
            String nextWord = phone_book[i+1];
            if(formerWord.length() > nextWord.length()) continue;
            if(formerWord.equals(nextWord.substring(0, formerWord.length()))) {
                return false;
            }
        }
        return true;
    }

    public static boolean solution2(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
            String formerWord = phone_book[i];
            String nextWord = phone_book[i+1];
            if(nextWord.indexOf(formerWord) == 0) {
                return false;
            }
        }
        return true;
    }
}
