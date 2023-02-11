package com.example.java_study.regEx;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class RegexPracticeTest {

    @Test
    void patternTest() {
        String regex = "^[a-zA-z]*$";
        String text = "IamAstudent";

        // 사용법 1 - matches
        boolean result1 = Pattern.matches(regex, text);
        System.out.println("result1 = " + result1);

        // 사용법 2 - matcher
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        boolean result2 = matcher.matches();
        System.out.println("result2 = " + result2);
    }

    @Test
    void patternTest_find_group() {
        Pattern pattern = Pattern.compile("([0-9]+)([SDT])([*#]?)");
        Matcher matcher = pattern.matcher("1D2S#10S*");

        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }

    // [한국]-3점, [미국]-2점 -> 입력값
    // 한국 : 3점, 미국 : 2점 -> 표현하고 싶은 값
    @Test
    void patternTest_find_group2() {
        Pattern pattern = Pattern.compile("\\[([가-힣]+)\\]-(\\d+)점");
        Matcher matcher = pattern.matcher("[한국]-3점,[미국]-2점");

        while(matcher.find()) {
            System.out.println(matcher.group(0));   // 정규표현식에 해당하는 문자열
            // group(0)에서 그룹에 해당하는 문자열
            System.out.println(matcher.group(1)+ " : " + matcher.group(2) +"점");
        }
    }

    @Test
    void 숫자인지_판별하기() {
        //
        String numberOnly = "0123456";
        String notNumberOnly = "a012345";

        String numberOnlyRegex = "[0-9]+";

        boolean isNumberOnly = numberOnly.matches(numberOnlyRegex);
        boolean isNotNumberOnly = notNumberOnly.matches(numberOnlyRegex);

        System.out.println("isNumberOnly = " + isNumberOnly);
        System.out.println("isNotNumberOnly = " + isNotNumberOnly);
    }

    @Test
    void 영어인지_판별하기() {
        //
        String englishOnly = "aeawfwe";
        String notEnglishOnly = "aawef33";

        String englishOnlyRegex = "[a-zA-z]+";

        boolean isEnglishOnly = englishOnly.matches(englishOnlyRegex);
        boolean isNotEnglishOnly = notEnglishOnly.matches(englishOnlyRegex);

        System.out.println("isEnglishOnly = " + isEnglishOnly);
        System.out.println("isNotEnglishOnly = " + isNotEnglishOnly);
    }

}
