package com.example.zerobase.greedyStudy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Boj11047 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String[] input = s.split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(sc.nextLine()));
        }

        list.sort((o1, o2) -> o2 - o1);

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            cnt += K / list.get(i);
            K = K % list.get(i);

            if (K == 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
