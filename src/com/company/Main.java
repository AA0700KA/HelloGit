package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        int number = 5;

        int fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }

}
