package com.example.zerobase.binarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int key;
    public Node left;
    public Node right;

    Node(int key, Node left, Node right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }
}

class BinarySearchTree {
    Node head;  // 루트

    BinarySearchTree(int key) {
        head = new Node(key, null, null);   // null 넣어줘야함
    }

    public void addNode(int key) {
        if (head == null) {
            this.head = new Node(key, null, null);
        }
        else {
            Node cur = this.head;

            while(true) {
                Node pre = cur;

                if (key < cur.key) {
                    cur = cur.left;     // 왼쪽 이동

                    if (cur == null) {          // 값 할당
                        pre.left = new Node(key, null, null);
                        break;
                    }
                }
                else {
                    cur = cur.right;    // 오른쪽 이동

                    if (cur == null) {
                        pre.right = new Node(key, null, null);
                        break;
                    }
                }
            }
        }
    }

    public void removeNode(int key) {   // 삭제 하려는 값
        // 임시 변수들
        Node parent = null;
        Node successor = null;
        Node predecessor = null;
        Node child = null;

        // 삭제하려는 값 찾기
        Node cur = this.head;
        while (cur != null) {
            if (key == cur.key) {
                break;
            }

            parent = cur;       // 부모노드 저장해 두기
            if (key < cur.key) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }

        if (cur == null) {
            System.out.println("key에 해당하는 노드가 없습니다.");
            return;
        }

        // 리프 노드인 경우
        if (cur.left == null && cur.right == null) { 
            if (parent == null) {   // 노드가 하나밖에 없는 경우
                this.head = null;
            } else {
                if (cur == parent.left) {
                    parent.left = null;  // 삭제
                } else {
                    parent.right = null;
                }
            }
            // 자식 노드가 하나인 경우
        }  else if (cur.left != null && cur.right == null || cur.left == null && cur.right != null) {
            if (cur.left != null) {
                child = cur.left;
            } else {
                child = cur.right;
            }

            if (parent == null) {   // 노드가 하나밖에 없는 경우
                this.head = child;
            } else {
                if (parent.left == cur) {
                    parent.left = child;    // 왼쪽 삭제
                } else {
                    parent.right = child;
                }
            }
            // 자식 노드가 둘인 경우
        } else {
            predecessor = cur;      // successor 부모
            successor = cur.left;   // 좌측 서브트리에서 가장 큰 노드 저쟝용

            while (successor.right != null) {
                predecessor = successor;
                successor = successor.right;
            }

            predecessor.right = successor.left; // **
            successor.left = cur.left;
            successor.right = cur.right;

            if (parent == null) {
                this.head = successor;
            } else {
                if (parent.left == cur) {
                    parent.left = successor;
                } else {
                    parent.right = successor;
                }
            }

        }
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.key + " ");
        inOrder(node.right);
    }

    public void levelOrder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()) {
            Node cur = queue.poll();

            System.out.print(cur.key + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }

            if (cur.right != null) {
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }
}

public class BSTexample {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(20);
        bst.addNode(10);
        bst.addNode(30);
        bst.addNode(1);
        bst.addNode(15);
        bst.addNode(25);
        bst.addNode(13);
        bst.addNode(35);
        bst.addNode(27);
        bst.addNode(40);
        bst.levelOrder(bst.head);
        bst.inOrder(bst.head);
    }
}
