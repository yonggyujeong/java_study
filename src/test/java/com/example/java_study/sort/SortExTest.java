package com.example.java_study.sort;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SortExTest {

    class Mydata {
        int v;

    }

    @Test
    void 배열_정렬() {
        int[] arr = {3, 2, 1, 5, 4};

        // 1. 오름차순
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // [1, 2, 3, 4, 5]

        // 2. 내림차순
        // 내림차순 정렬의 경우 int[]를 Integer[]로 변환 후 정렬해야 한다.
        Integer[] arr2 = Arrays.stream(arr).boxed().toArray(Integer[] :: new);
        // 방법 1
        Arrays.sort(arr2, Collections.reverseOrder());
        // 방법 2
        Arrays.sort(arr2, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr2));
        // [5, 4, 3, 2, 1]

    }


    @Test
    void 리스트_정렬() {
        List<Integer> list = Arrays.asList(3, 2, 1, 4, 5);

        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        // [1, 2, 3, 4, 5]

        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        // [5, 4, 3, 2, 1]

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
        // [1, 2, 3, 4, 5]
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
