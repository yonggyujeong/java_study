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

        public boolean search(String str) {
            Node cur = root;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                if (cur.child.containsKey(c)) {
                    cur = cur.child.get(c);
                } else {
                    return false;
                }

                if (i == str.length() - 1) {
                    if (!cur.isTerminal) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("april");
        trie.insert("ace");
        trie.insert("bear");
        trie.insert("best");

        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.search("april"));
        System.out.println(trie.search("ace"));
        System.out.println(trie.search("bear"));
        System.out.println(trie.search("best"));
        System.out.println(trie.search("bat"));
        System.out.println(trie.search("appot"));
        System.out.println(trie.search("ftk"));
    }
}
