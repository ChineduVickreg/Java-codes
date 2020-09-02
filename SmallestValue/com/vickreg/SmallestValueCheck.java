package com.vickreg;
//An application that identifies the smallest values in a group of numbers.

import java.util.Scanner;

public class SmallestValueCheck {
    public static void main(String[] args) {
        //int smallest = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter counter control number");
        int controlCounter = scanner.nextInt();

        System.out.println("Enter a Number");
        int num1 = scanner.nextInt();
        int smallest = num1;

        for (int i = 1; i < controlCounter; i++){
            System.out.println("Enter a Number");
            int num2 = scanner.nextInt();
            if (num2 < smallest)
                smallest = num2;
        }
        System.out.println("The smallest =" + smallest);

    }
}
