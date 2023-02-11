package com.example.java_study.sort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortExTest {

    class Mydata {
        int v;

    }


    @Test
    void sortTest() {
        Random random = new Random();
        List<Integer> list = new LinkedList<>();
        for(int i= 0; i < 30; i++) {
            list.add(random.nextInt(30));
        }

        list.sort(Comparator.naturalOrder());
        System.out.println(list);

        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2; // 오름차순
            }
        });

        // 객체의 경우(Comparable 구현 필수)
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); 
            }
        });

        // 람다 표현식으로 간단하게 1
        list.sort((o1, o2) -> {
            return o1.compareTo(o2);
        });

        // 람다 표현식으로 간단하게 2
        list.sort((o1, o2) -> o1.compareTo(o2));

        System.out.println(list);
                
    }

    @Test
    void compare() {
        String s1 = "abcde";
        String s2 = "qwert";

        String[] strings = {s1, s2};
        List<String> list = Arrays.asList(strings);

        list.sort((o1, o2) -> {
            char c1 = o1.charAt(2);
            char c2 = o2.charAt(2);
            if (c1 == c2) {
                return o1.compareTo(o2);
            }
            return c1 - c2;
        });

        System.out.println(list);
    }


}
