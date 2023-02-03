package com.example.zerobase.assignment.week1.surpriseQuiz.quiz1;

import java.util.Scanner;

public class SignUpMenuMain {
    public static void main(String[] args) {
        while(true) {
            showMenu();

            Integer selectedValue = userInput();
            String printString = Menu.selectMenu(selectedValue);
            System.out.println(printString);

            if(Menu.isExit(selectedValue)){
                break;
            }
        }
    }

    private static Integer userInput() {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input;
    }

    private static void showMenu() {
        Menu.printMenu();
    }
}
