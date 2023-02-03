package com.example.zerobase.assignment.week1.surpriseQuiz.quiz1;

import lombok.RequiredArgsConstructor;

import java.util.Arrays;
import java.util.Optional;

@RequiredArgsConstructor
public enum Menu {
    MEMBER_MANAGEMENT(1, "회원관리"),
    SUBJECT_MANAGEMENT(2, "과제관리"),
    SIGNUP_MANAGEMENT(3, "수강관리"),
    PAY_MANAGEMENT(4, "결제관리"),
    EXIT(5, "종료");

    private final Integer menuNumber;
    private final String displayName;

    public static boolean validateValueInMenu(Integer input) {
        Optional<Menu> findMenu = Arrays.stream(Menu.values())
                .filter(x -> x.menuNumber.equals(input))
                .findFirst();
        if (findMenu.isPresent()) return true;
        return false;
    }

    public static void printMenu() {
        System.out.println("<<< [메뉴 선택] >>>");
        for (Menu menu : Menu.values()) {
            String menuNumber = menu.menuNumber.toString();
            String displayName = menu.displayName.toString();
            String printStr = menuNumber + ". " + displayName;
            System.out.println(printStr);
        }
    }

    public static String selectMenu(Integer input) {
        if (isExit(input)) {
            return "프로그램을 종료합니다.";
        }

        Optional<Menu> menu = Arrays.stream(Menu.values())
                .filter(x -> x.menuNumber.equals(input))
                .findFirst();

        if (menu.isPresent()) {
            return menu.get().displayName + "을 출력했습니다.";
        }
        return "입력값이 정확하지 않습니다.";
    }

    public static Boolean isExit(Integer userInput) {
        if (userInput == EXIT.menuNumber) {
            return true;
        }
        return false;
    }
}
