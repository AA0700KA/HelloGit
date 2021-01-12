package com.company;

public class Launcher {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(759));
    }

    static int sumOfNumbers(int number) {
        if (number < 10) {
            return number;
        } else {
            int divide = number % 10;
            return divide + sumOfNumbers(number/10);
        }
    }

}
