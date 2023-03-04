package com.example.java_study.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CalculatorExample {

    public static void main(String[] args) {
        String S = "10/3";

        String[] numArr = S.split("[-+*\\/]");
        List<Double> numList = new ArrayList<>();
        for (int i = 0; i < numArr.length ; i++) {
            numList.add(Double.parseDouble(numArr[i]));
        }
        List<String> opList = makeOpArr(S);
        System.out.println("numList = " + numList); // [2, 6, 7, 8, 2, 5]
        System.out.println("opList = " + opList);   // [-, -, *, /, +]

        boolean isFirstFinished = false;
        while (true) {
            if (opList.size() == 0) {
                break;
            }
            boolean operated = false;
            if (isFirstFinished == false) {
                for (int i = 0; i < opList.size(); i++) {
                    operated = false;
                    if (opList.get(i).equals("*")  || opList.get(i).equals("/")) {
                        String op = opList.get(i);
                        Double cal = calculate(numList.get(i), numList.get(i + 1), op);
                        numList.set(i, cal);       // list 수정
                        numList.remove(i + 1);
                        opList.remove(i);
                        operated = true;
                        break;
                    }
                }
                if (operated == true) {
                    continue;
                }
                isFirstFinished = true;
            } else {
                for (int i = 0; i < opList.size(); i++) {
                    operated = false;
                    if (opList.get(i).equals("+")  || opList.get(i).equals("-")) {
                        String op = opList.get(i);
                        Double cal = calculate(numList.get(i), numList.get(i + 1), op);
                        numList.set(i, cal);       // list 수정
                        numList.remove(i + 1);
                        opList.remove(i);
                        operated = true;
                        break;
                    }
                }
                if (operated == true) {
                    continue;
                }
            }
        }
        double calculatedDouble = numList.get(0);
        double result = Math.floor(calculatedDouble * 100.0) / 100.0;
        System.out.println(result);
        //System.out.println(10.0 / 3.0);
    }



    static Double calculate(double a, double b, String op) {
        if (op.equals("*")) {
            return a * b;
        }
        if (op.equals("/")) {
            return a / b;
        }
        if (op.equals("+")) {
            return a + b;
        }
        if (op.equals("-")) {
            return a - b;
        }
        return -1.0;
    }

    static List<String> makeOpArr(String str) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))){
                list.add(String.valueOf(str.charAt(i)));
            }
        }
        return list;
    }
}
