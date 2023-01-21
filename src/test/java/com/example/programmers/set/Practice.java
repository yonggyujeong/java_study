package com.example.programmers.set;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.stream.Collectors;

public class Practice {

    @Test
    void 중복제거하기_SET_변환() {
        List<String> list = Arrays.asList("A", "B", "C", "A", "B", "C");
        // set 변환
        Set<String> set = new HashSet<>(list);
        System.out.println("set = " + set);

        // 리스트로 반환
        List<String> setToList = new ArrayList<>(set);
        System.out.println("setToList = " + setToList);
    }

    @Test
    void 중복제거하기_Stream() {
        List<String> list = Arrays.asList("A", "B", "C", "A", "B", "C");
        List<String> list2 = list.stream()
                .collect(Collectors.toList());
        // import java.util.stream.Collectors;

        System.out.println("list2 = " + list2);
    }

    @Test
    void List로_Set효과내기_합집합() {

    }
}
