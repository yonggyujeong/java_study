package com.example.zerobase.tree;
// 종이접기

class BinaryTree2 {
    public int h;
    public int[] arr;

    public BinaryTree2(int h) {
        this.h = h;
        makeTree(h);
    }

    void makeTree(int h) {
        arr = new int[(int)Math.pow(2, h) - 1];
        arr[0]  = 0;    // 루트

        // 루트 아래 트리 그리기
        for (int i = 0; i < (int)Math.pow(2, h - 1) - 1; i++) { // 1, 3, 7
            arr[2 * i + 1] = 0; // 높이 별 노드 index
            arr[2 * i + 2] = 1;
        }
    }

    void inOrder(int idx) {
        int left = 2 * idx + 1;
        int right = 2 * idx + 2;

        if (left < arr.length) {
            inOrder(left);
        }
        System.out.print(arr[idx] + " ");
        if (right < arr.length) {
            inOrder(right);
        }
    }

    void printTree() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Practice1 {
    static void solution(int h) {
        BinaryTree2 binaryTree2 = new BinaryTree2(h);
        binaryTree2.inOrder(0);
        System.out.println();
    }

    public static void main(String[] args) {
        // 입출력예시
        // 입력 : 1
        // 출력 : 0

        // 입력 : 2
        // 입력 : 0 0 1

        // 입력 : 3
        // 출력 : 0 0 1 0 0 1 1

        solution(1);
        solution(2);
        solution(3);
    }
}
