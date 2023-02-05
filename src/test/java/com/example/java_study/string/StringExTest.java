package com.example.java_study.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringExTest {

    @Test
    void stringFormatEx() {
        // String.format()
        String str = String.format("%d 더하기 %d는 %d입니다.", 3, 2, 5);
        System.out.println(str);

        // String.format 패딩
        // 1 -> 0001
        String strPadding = String.format(
                "%d에 모자란 자릿수 만큼 0을 채웁니다 -> %04d", 1, 1);
        System.out.println(strPadding);

        // 기본형 String 변환
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

        // String을 기본형으로 변형
        int str3 = Integer.parseInt("100"); // auto-boxing이 이루어진다.
    }

}
