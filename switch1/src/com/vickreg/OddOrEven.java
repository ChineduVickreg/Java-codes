package com.vickreg;
//An application that prints Even or Odd integers using switch statements

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Integer");
        int value = scanner.nextInt();

        switch (value % 2){
            case 0:
                System.out.println(value + " = " + "Even Integer");
                break;
            case 1:
                System.out.println(value +" = " + "Odd Integer");
        }
    }
}
