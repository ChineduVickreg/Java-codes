package com.vickreg;
//An application that calculates the factorial of numbers.

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the factorial number");
        long factorialNumber = scanner.nextLong();

        long myFactorial = factorial(factorialNumber);
        System.out.println("The factorial = " + myFactorial);
    }
    public static long factorial(long factorialNumber){
        long fact = 1;
        for (long i = 1; i < factorialNumber; i++) {
            fact = factorialNumber * factorial(factorialNumber -1);
        }
        return fact;
    }

}
