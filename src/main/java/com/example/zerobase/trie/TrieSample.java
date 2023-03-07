package com.example.zerobase.trie;

import java.util.HashMap;

public class TrieSample {
    static class Node {
        HashMap<Character, Node> child;
        boolean isTerminal;

        public Node() {
            this.child = new HashMap<>();
            this.isTerminal = false;
        }
    }

    static class Trie {
        Node root;
        public Trie() {
            this.root = new Node();
        }

        public void insert(String str) {
            Node cur = this.root;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                cur.child.putIfAbsent(c, new Node()); // 없으면 넣어주고 있으면 넘어가기
                cur = cur.child.get(c);

                if (i == str.length() - 1) {
                    cur.isTerminal = true;
                    return;
                }
            }
        }
    }

    public static void main(String[] args) {

    }
}
