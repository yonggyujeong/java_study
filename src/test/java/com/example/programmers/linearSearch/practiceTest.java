package com.example.programmers.linearSearch;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Random;

// search : indexOf, contains, remove 등에서 벌써 구현이 되어 있다. : 완전탐색으로
// equals 구현이 필요하다. (equals, hashCode)

// 이진탐색 : Collections.binarySearch 함수로 구현되어 있다.
// Comparable implement 필요 (compareTo)
// 순서대로 정렬되어 있어야한다.


class MyData implements Comparable<MyData> {
    int number;
    public MyData(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "" + number;
    }

    // indexOf로 찾기
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myDate = (MyData) o;
        return number == myDate.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

//    @Override
//    public int compareTo(Object o) {
//        // 두 값을 빼서 0과 비교한다.
//        // 0 보다 큰지 작은지를 비교한다.
//        // 내께 더 크면 양수, 작으면 음수
//        return number - ((MyData)o).number;
//    }

    // Comparable 에 <Mydata> 추가시
    @Override
    public int compareTo(MyData o) {
        return number - o.number;
    }
}

class practiceTest {

    @Test
    void 이진탐색_기본() {
        LinkedList<MyData> list = new LinkedList<>();
        // 이진탐색은 꼭 정렬된 상태여야 한다.
        // 정렬은 아직 배우지 않았으니, random 로직을 지우도록 하자.

//        Random r = new Random();
//        for (int i = 0; i < 100; i++) {
//            list.add(new MyData(r.nextInt(100)));
//        }

        for (int i = 0; i < 100; i++) {
            list.add(new MyData(i));
        }

        // 이진탐색
        int index = Collections.binarySearch(list, new MyData(63));
        System.out.println("index = " + index);
    }

}
