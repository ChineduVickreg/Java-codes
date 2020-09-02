package com.vickreg;
//An application that calculates the products of two odd numbers between 1 and 15. be
import java.util.Scanner;

public class OddNumberProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first odd number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second odd number");
        int num2 = scanner.nextInt();

        OddNumberProducts myProduct = new OddNumberProducts();
        int myOddProduct = myProduct.oddProduct(num1,num2);
        System.out.println("The product = " + myOddProduct );
    }
    public int oddProduct(int num1, int num2){
        int product = 1;
        if(num1 % 2 != 0 && num2 % 2 != 0) {
            product = num1 * num2;
        }
        if(num1 < 0 && num2 <= 15){
            System.out.println("Numbers not within range");
        }
        return product;
    }
}
