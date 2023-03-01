package com.example.zerobase.tree;

import java.sql.SQLOutput;
import java.util.Arrays;

class BinaryTree {
    char[] arr;
    BinaryTree(char[] arr) {
        this.arr = arr;
    }
    public void preOrder(int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;

        System.out.print(arr[idx] + " ");
        if (left < arr.length) {
            preOrder(left);
        }
        if (right < arr.length) {
            preOrder(right);
        }
    }

    public void inOrder(int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;

        if (left < arr.length) {
            inOrder(left);
        }
        System.out.print(arr[idx] + " ");
        if (right < arr.length) {
            inOrder(right);
        }
    }

    public void postOrder(int idx) {
        int left = idx * 2 + 1;
        int right = idx * 2 + 2;

        if (left < arr.length) {
            postOrder(left);
        }
        if (right < arr.length) {
            postOrder(right);
        }
        System.out.print(arr[idx] + " ");
    }
}

public class BinaryTreeExample {
    public static void main(String[] args) {
        // Test Code
        char[] arr = new char[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char)(i + 'A');
        }
        System.out.println(Arrays.toString(arr)); // [A, B, C, D, E, F, G, H, I, J]

        BinaryTree bt = new BinaryTree(arr);
        bt.preOrder(0);     // A B D H I E J C F G
        System.out.println();
        bt.inOrder(0);      // H D I B J E A F C G
        System.out.println();
        bt.postOrder(0);    // H I D J E B F G C A
    }
}
