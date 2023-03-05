package com.example.java_study.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "221123";

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put(Integer.toString(i), 0);
        }
        // System.out.print(map);
        for (int i = 0; i < s.length(); i++) {
            String str = Character.toString(s.charAt(i));
            map.replace(str, map.get(str) + 1);
        }


    }

}
