package com.example.zerobase.greedyStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Boj1744 {

    public static void main(String[] args) {
        // 큰 두 수를 묶는다.
        // 0은 묶으면 안된다.
        // 음수는 음수끼리 묶거나 묶지 않아야한다.
        // 음수와 양수를 따로 저장하여 처리하면?
        // ** 1은 곱하는 것보다 더하는 게 더 큼
        // ** 0은 음수를 없애는데 사용할 수 있다. -> 갯수가 홀수개인 경우만

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        int oneCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < N; i++) {
            int input = sc.nextInt();

            if (input > 1) {        // 1은 곱하는 것보다 더하는 게 더 큼
                positiveList.add(input);
            } else if (input < 0) {
                negativeList.add(input);
            } else if (input == 1) {
                oneCount += 1;
            } else {
                zeroCount += 1;
            }
        }


        Long sum = 0L;
        // 1만큼 추가
        sum += oneCount;

        // 내림차순
        positiveList.sort((o1, o2) -> o2 - o1);
        sum += groupingResult(positiveList);

        // 오름차순
        negativeList.sort((o1, o2) -> o1 - o2);

        // 0 만큼 없애기 홀수개인 경우만
        if (negativeList.size() % 2 == 1 && zeroCount > 0){
            negativeList.remove(negativeList.size() - 1); // 제일 작은거 지우기
        }
        sum += groupingResult(negativeList);

        System.out.println(sum);
    }

    static Long groupingResult(List<Integer> list) {
        Long sum = 0L;
        for (int i = 0; i < Math.ceil(list.size() / 2.0); i++) {    // ceil, floor 할때는 실수형으로
            // i * 2 //0, 2, 4, 6, ...  // 0, 2, 4
            int num1 = list.get(i * 2); // 1 2 3 4 5
            int num2 = 1;
            if (i * 2 + 1 < list.size()) {
                num2 = list.get(i * 2 + 1);
            }
            sum += (num1 * num2);
        }
        return sum;
    }
}
