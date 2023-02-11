package com.example.java_study.string;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class StringExTest {

    @Test
    void stringFormatEx() {
        // String.format()
        String str = String.format("%d 더하기 %d는 %d입니다.", 3, 2, 5);
        System.out.println(str);

        // string
        String strformat = String.format("결과 : %s", "1");
        System.out.println(strformat);

        // String.format 패딩
        // 1 -> 0001
        String strPadding = String.format("00%04d00", 1, 1);
        System.out.println(strPadding);

        // 1 -> 0001
        String strLeftPad = String.format("00%-4d00", 1, 1);
        System.out.println(strLeftPad);

        // string
//        String strPadding2 = String.format("결과 : %"+"0"+ 2 +"s", "1");
        //String strPadding2 = String.format("결과 : %"+ 2 +"s", "1");
//        System.out.println(strPadding2);
        // string 은 공백만 채울 수 있음

        // 기본형 String 변환
        int i = 100;
        String str1 = i + "";
        String str2 = String.valueOf(i);

        // String을 기본형으로 변형
        int str3 = Integer.parseInt("100"); // auto-boxing이 이루어진다.

        // 02 -> int
        System.out.println("01 -> int");
        String str01 = "01";
        System.out.println(Integer.valueOf(01));
    }

    @Test
    void stringFormat2() {
        String strKR = String.format(Locale.KOREA, "pay : %f", 12.123f);
        System.out.println(strKR);

        String strFR = String.format(Locale.FRANCE, "pay : %f", 12.123f);
        System.out.println(strFR);
    }

    @Test
    void stringFormatPercent() {
        String str = String.format("pay : %f", 12.123f);
        System.out.println(str);

        String str1 = String.format("pay : %f%%", 12.123f);
        System.out.println(str1);
    }

    @Test
    void stringFormatPad() {
        // String.format 패딩
        // 1 -> 0001
        String strPadding = String.format("%04d", 1, 1);
        System.out.println(strPadding);

        // aa1 aa
        String strLeftPad = String.format("aa%-2daa", 1, 1);
        System.out.println(strLeftPad);
    }

    @Test
    void StringMethod() {
        String str = "Hello";
        System.out.println(str.charAt(0));
        // H

        String str2 = "Hello";
        System.out.println(str2.contains("el"));
        // true

        String str3 = "Hello";
        System.out.println(str3.endsWith("llo"));
        // true

        String str4 = "Hello";
        System.out.println(str4.equalsIgnoreCase("HELLO")); // 대소문자 무시, 일치 여부
        // true

        String str5 = "Hello";
        System.out.println(str5.indexOf("l")); // 못찾으면 -1
        // 2

        String str6 = "Dear My Mister";
        System.out.println(str6.indexOf("M", 8)); // fromIndex
        // 8

        String str7 = "Dear My Myster";
        System.out.println(str7.replace("My", "LL")); // 모두 바꿈
        // Dear LL LLster

        String str8 = "Dear My Mister";
        System.out.println(str8.replaceAll("[a-z A-Z]", "II")); // regex 일치 모두
        // IIIIIIIIIIIIIIIIIIIIIIIIIIII

        String str9 = "Dear My Mister";
        System.out.println(str9.replaceFirst("[a-z A-Z]", "II")); // regex 일치 첫번째 것만
        // IIear My Mister

        String str10 = "Dear My Mister";
        System.out.println(str10.substring(5, 7));
        // My

        String txt = "33";
        System.out.println(txt.indexOf("1"));

        txt.indexOf('1');
    }

    @Test
    void 대문자변환() {
        String str = "asdf";
        str = str.toUpperCase();    // 원래 문자는 변환시키지 않고 변환된 문자를 반환함
        System.out.println(str);
    }

    @Test
    void join_함수() {
        String[] arr = {"ddd", "fff", "aaa"};
        String joined = String.join(" ", arr);
        System.out.println("joined = " + joined);
    }

}

