package com.example.backjun.tree;

import lombok.ToString;

import java.util.*;
public class Boj11725 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int N = Integer.parseInt(strArr[0]);

        // List<Node> 만들기 -> Node[] 가 안되기에 반복문 돌며 직접 만듬
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N + 1; i++) {   // 노드 시작이 1부터 임
            nodes.add(new Node(i));
        }

        // 연결 만들기
        for (int i = 0; i < N - 1; i++) {
            input = sc.nextLine();
            strArr = input.split(" ");
            int n1 = Integer.parseInt(strArr[0]);
            int n2 = Integer.parseInt(strArr[1]);

            nodes.get(n1).addLink(n2);
            nodes.get(n2).addLink(n1);
        }
        boolean[] visited = new boolean[N + 1]; // 노드 시작 1부터
        dfs(nodes, visited, 1);

        for (int i = 2; i < nodes.size(); i++) {    // 노드 1부터 시작, 루트노드 제외
            System.out.println(nodes.get(i).parents);
        }
    }

    public static void dfs(List<Node> nodes, boolean[] visited, int node) {
        // 재귀에 넣지 않으면 무한 루프가 돌지 않음, 이거 넣으면 바로
//        if (visited[node]) {
//            return;
//        }

        // 자식들
        List<Integer> links = nodes.get(node).links;
        for (Integer linkNode : links) {
            if (visited[linkNode]) continue;

            // 방문
            Node child = nodes.get(linkNode);
            child.parents = node;
            visited[linkNode] = true;
            dfs(nodes, visited, linkNode);
        }
    }

    // ArrayList<Integer>[]가 불가능하여 만든 클래스
    // static 으로 만들어야 함
    public static class Node {
        public Integer node;
        public Integer parents;
        public List<Integer> links = new ArrayList<>();

        public void addLink(int node) {
            links.add(node);
        }

        public Node(Integer node) {
            this.node = node;
        }
    }
}

