package com.example.backjun;

import java.util.*;
public class Boj11656 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        ArrayList<String> lastFixes = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            lastFixes.add(str.substring(i, str.length()));
        }

        lastFixes.sort(Comparator.naturalOrder());

        for (String lastFix : lastFixes) {
            System.out.println(lastFix);
        }
    }
}
