package com.example.java_study.set;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(1);
        treeSet.add(5);
        System.out.println(treeSet);
        // [1, 5, 10]

        TreeSet<MyData> treeSet2 = new TreeSet<>((o1, o2) -> o1.value - o2.value);
        treeSet2.add(new MyData(10));
        treeSet2.add(new MyData(5));
        treeSet2.add(new MyData(1));
        treeSet2.add(new MyData(5));
        System.out.println(treeSet2);
        // [1, 5, 10]
    }

    static class MyData {
        private int value;

        public MyData(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
