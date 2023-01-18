package com.example.programmers.map;

import java.util.HashMap;
import java.util.Map;

public class UncompletedPlayerAnswer {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> players = new HashMap<>();
        for (String par: participant) {
            players.put(par, players.getOrDefault(par, 0) + 1);
        }

        for (String com : completion) {
            int n = players.get(com) - 1;
            if(n == 0) players.remove(com);
            else players.put(com, n);
        }

        return players.keySet().iterator().next(); //마지막 남은 하나 꺼내기
    }
}
