package com.example.java_study.bigInteger;

import java.math.BigInteger;

public class practice {

    public static void main(String[] args) {
        BigInteger bigInteger = new BigInteger("2");
        BigInteger sub = new BigInteger("10");
        BigInteger div = new BigInteger("1000000000");
        System.out.println(bigInteger.pow(100000).subtract(sub).remainder(div).intValue());


//        BigInteger bigInteger = new BigInteger("3");
//        System.out.println("add      = " + bigInteger.add(new BigInteger("400")));
//        System.out.println("subtract = " + bigInteger.subtract(new BigInteger("400")));
//        System.out.println("multiply = " + bigInteger.multiply(new BigInteger("400")));
//        System.out.println("divide   = " + bigInteger.divide(new BigInteger("400")));
//        System.out.println("remainder = " + bigInteger.remainder(new BigInteger("400")));
//        System.out.println("pow       = " + bigInteger.pow(4));


    }
}
