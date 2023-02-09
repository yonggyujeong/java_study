package com.example.java_study.sort;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

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
}
