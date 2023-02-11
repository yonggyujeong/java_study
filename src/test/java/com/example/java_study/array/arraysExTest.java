package com.example.java_study.array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class arraysExTest {

    @Test
    void array(){
        // int 배열 to List
        int[] arr = {-1};
        List<int[]> ints = Arrays.asList(arr);
        // 실패

        Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
        //import java.util.stream.Collectors; 필수
        // 성공
    }

    @Test
    void stringArrayToList() {
        String[] arr = new String[]{"a", "b", "c"};
        List<String> strings = Arrays.asList(arr);


    }

}
