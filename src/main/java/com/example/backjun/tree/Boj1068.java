package com.example.backjun.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Boj1068 {

    static class Node {
        int node;
        List<Integer> children = new ArrayList<>();

        public Node(int node) {
            this.node = node;
        }

        public void addChild(int child) {
            children.add(child);
        }

        public void deleteNode(int delIdx) {
            for (int i = 0; i < children.size(); i++) {
                if (children.get(i) == delIdx) {
                    children.remove(i);
                }
            }
        }

        @Override
        public String toString() {
            return "node : " + node + " - " + children.toString();
        }
    }

    public static int leaf = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] inputNodes = input.split(" ");
        Integer deleteNode = Integer.parseInt(sc.nextLine());


        // 노드 List 생성
        ArrayList<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodes.add(new Node(i));
        }

        // 자식노드 등록
        int root = 0;
        for (int i = 0; i < N; i++) {
            int parent = Integer.parseInt(inputNodes[i]);
            if (parent == -1) { // 루트 노드
                root = i;
                continue;
            }
            nodes.get(parent).addChild(i);
        }

        if (root == deleteNode) {
            System.out.println(0);
            return;
        }

        // delete 노드 지우기
        nodes.get(deleteNode).children.clear();
        List<Integer> delChildren = nodes.get(deleteNode).children;
        for (int idx : delChildren) {
            nodes.get(idx).children.clear();
        }
        // 반대 연결도 지우기
        for (Node node : nodes) {
            node.deleteNode(deleteNode);
            for (int idx : delChildren) {
                node.deleteNode(idx);
            }
        }


        boolean[] visited = new boolean[N];
        dfs(nodes, visited, root);


        System.out.println(leaf);
    }

    public static void dfs(ArrayList<Node> nodes, boolean[] visited, int idx) {

        visited[idx] = true;
        Node node = nodes.get(idx);
        
        if (node.children.size() == 0) {    // dfs 마지막 노드에서 할 일
            leaf += 1;
            return;
        }

        for(int i = 0; i < node.children.size(); i++) {
            Integer child = node.children.get(i);
            if (!visited[child]) {               // 방문처리
                visited[child] = true;
                dfs(nodes, visited, child);
            }
        }
    }
}
