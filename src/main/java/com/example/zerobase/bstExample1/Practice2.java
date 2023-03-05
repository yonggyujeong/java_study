package com.example.zerobase.bstExample1;

// Practice2
// 인접한 노드간의 차이값 중 최솟값을 구하여라

// 입력 : 4, 2, 6, 1, 3
// 출력 : 1

// 입력 : 5, 1, 48, null, null, 12, 51
// 출력 : 3

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    static class Node {
        int key;
        Node left;
        Node right;

        public Node(int key, Node left, Node right) {
            this.key = key;
            this.left = left;
            this.right = right;
        }
    }

    static class BST2 {
        Node head;

        public void add(int key) {
            if (this.head == null) {
                this.head = new Node(key, null, null);
                return; // return 하기
            }
            Node cur = head;
            while (true) {
                Node pre = cur;
                if (key < cur.key) {
                    cur = cur.left;

                    if (cur == null) {
                        pre.left = new Node(key, null, null);
                        break;
                    }
                } else {
                    cur = cur.right;

                    if (cur == null) {
                        pre.right = new Node(key, null, null);
                        break;
                    }
                }
            }
        }

        public Integer levelOrder() {
            Queue<Node> queue = new LinkedList<>();
            queue.add(head);
            int levelDiff = 99999999;
            while (!queue.isEmpty()) {
                Node node = queue.poll();
                //System.out.print(node.key + " ");

                if (node.left == null || node.right == null) {
                    continue;
                }
                levelDiff = Math.min(Math.abs(node.key - node.left.key), levelDiff);
                levelDiff = Math.min(Math.abs(node.key - node.right.key), levelDiff);

                queue.add(node.left);
                queue.add(node.right);
            }
            return levelDiff;
        }
    }

    public static void solution(Integer[] data) {

        BST2 bst = new BST2();
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) continue;
            bst.add(data[i]);
        }

        System.out.println(bst.levelOrder());
    }

    public static void main(String[] args) {
        Integer[] arr1 = new Integer[] {4, 2, 6, 1, 3};
        solution(arr1);

        Integer[] arr2 = new Integer[] {5, 1, 48, null, null, 12, 51};
        solution(arr2);
    }
}
