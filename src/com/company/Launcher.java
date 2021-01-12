package com.company;

public class Launcher {

    public static void main(String[] args) {
        System.out.println(sumOfNumbers(759));
    }

    static int sumOfNumbers(int number) {
        int sum = 0;
        
        while (number > 0) {
             int divide = number % 10;
             sum += divide;
             number = number / 10;
        }
        
        return sum;
    }

}
