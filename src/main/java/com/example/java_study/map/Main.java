package com.example.java_study.map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put(null, null);
    }

    class Node {
        Node next;  // 다음 노드의 주소
        Object object;  // 데이터 값
    }
}
