package com.example.java_study.stack;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    static boolean isCleanable = false;

    public static void main(String[] args) {
        // 입력
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String inputStr = sc.nextLine();

        String[] strArr =  inputStr.split(" ");
        List<Integer> intList = Arrays.stream(strArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> intQueue = new ArrayList<>(intList);

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();
        Stack<Integer> stack4 = new Stack<>();

        List<Stack<Integer>> stackList = new ArrayList<>();
        stackList.add(stack1);
        stackList.add(stack2);
        stackList.add(stack3);
        stackList.add(stack4);

        backTracking(N, intQueue, stackList, 0);

        if (isCleanable) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }

    static void backTracking(int N, List<Integer> intList,
                         List<Stack<Integer>> stackList, int idx) {
        if (idx == N) { // 성공
            isCleanable = true;
        }
        if (isCleanable == true) return; // 한번 성공 했으니 나가기

        int nowNum = intList.get(idx);

        for(int i = 0; i < 4; i++) {
            Stack<Integer> stack = stackList.get(i);
            //System.out.println("stack: " + i);
           // System.out.println("nowNum: " + nowNum);
            if (!stack.isEmpty()) {     // 스택이 비면 에러
                Integer topNum = stack.peek();
                //System.out.println("topNum: " + topNum);
                if (topNum > nowNum) continue;
            }
            stack.push(nowNum);     // 스택에 넣기
            backTracking(N, intList, stackList, idx + 1);
            stack.pop();            // 스택 에서 빼기 (백트래킹)
        }
        return;
    }
}
