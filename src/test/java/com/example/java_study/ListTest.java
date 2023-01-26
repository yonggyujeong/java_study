package com.example.java_study;

import org.junit.jupiter.api.Test;

import java.util.*;

public class ListTest {

    List<Integer> list = List.of(1,2,3,4,5);

    @Test
    void list_를_int배열으로() {
        list.stream().mapToInt(Integer::valueOf).toArray();
    }


}
