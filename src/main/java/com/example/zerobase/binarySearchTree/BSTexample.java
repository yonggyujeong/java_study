package com.example.zerobase.binarySearchTree;

class Node {
    public int key;
    public Node left;
    public Node right;

    Node(int key) {
        this.key = key;
    }
}

class BinarySearchTree {
    Node head;

    BinarySearchTree(int key) {
        head = new Node(key);
    }

    public void addNode(int key) {
        if (head == null) {
            this.head = new Node(key);
        }
        else {
            Node cur = this.head;

            Node pre = cur;
            while(true) {
                if (key < cur.key) {

                    cur = cur.left;     // 왼쪽 이동
                    if (cur == null) {          // 값 할당
                        pre.left = new Node(key);
                        break;
                    }
                }
                else {
                    cur = cur.right;    // 오른쪽 이동

                    if (cur == null) {
                        pre.right = new Node(key);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode() {
        Node parent = null;
        Node successor = null;
        Node predecessor = null;
        Node child = null;

        Node cur = this.head;
        while (cur != null) {

        }
    }
}

public class BSTexample {

    public static void main(String[] args) {

    }
}
