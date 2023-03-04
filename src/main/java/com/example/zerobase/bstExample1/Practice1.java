package com.example.zerobase.bstExample1;

import java.util.ArrayList;
import java.util.List;

class Node {
    int key;
    Node right;
    Node left;
    public Node(int key, Node right, Node left) {
        this.key = key;
        this.right = right;
        this.left = left;
    }
}

class BST {
    Node head;

    public BST() {
    }

    public void addNode(int key) {
        if (head == null) {
            head = new Node(key, null, null);
            return;
        }

        Node cur = head;

        while (true) {
            Node pre = cur;

            if (key < cur.key) {
                cur = cur.left;
                if (cur == null) {  // 리프노드
                    pre.left = new Node(key, null, null);
                    break;
                }
            } else {
                cur = cur.right;
                if (cur == null) {  // 리프노드
                    pre.right = new Node(key, null, null);
                    break;
                }
            }
        }
    }

    public void inOrder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        inOrder(node.left, result);
        result.add(node.key);
        inOrder(node.right, result);
    }
}

public class Practice1 {

    public static void main(String[] args) {
        // N 번째로 큰 수를 구하여라
        // 입력트리 [3, 1, 4, 2]
        // N : 1
        // 결과 : 1

        // 입력트리 [5, 3, 6, 2, 4, 1]
        // N : 3
        // 결과 : 3
        
        // 트리의 InOrder를 구하면 오름차순이다.

        int[] arr = new int[]{3, 1, 4, 2};

        BST bst = new BST();

        for (int i = 0; i < arr.length; i++) {
            bst.addNode(arr[i]);
        }
        //System.out.println(bst.head.key);
        ArrayList<Integer> result = new ArrayList<>();
        bst.inOrder(bst.head, result);
        System.out.println(result);
    }
}
