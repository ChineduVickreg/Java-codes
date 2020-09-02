package com.vickreg;
// An application that calculates the the total value of sales in a retail shop.

import java.util.Scanner;

public class SalesCalculator {
    private static final int PNUMBER1 = 2.98;
    private static final int PNUMBER2 = 4.50;
    private static final int PNUMBER3 = 9.98;
    private static final int PNUMBER4 = 4.49;
    private static final int PNUMBER5 = 6.87;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Product Quantity");
        int pQuantity = scanner.nextInt();
        System.out.println("Enter Price");
        double price = scanner.nextdouble();
        System.out.println(calculateSales(pQuantity,price));

    }

    public static void calculateSales(int pQuantity, double price) {
        double price = PNUMBER1;
        switch (price = PNUMBER1){
            case PNUMBER1:
                double cost = pQuantity * price;
                System.out.println("The Cost is " + cost);
                break;
            case PNUMBER2: case PNUMBER3: case PNUMBER4: case PNUMBER5:
                double cost = pQuantity * price;
                System.out.println("The Cost " + cost);
                break;
            default:
                if ((price != PNUMBER1) || (price != PNUMBER2) || (price != PNUMBER3) || (price != PNUMBER4) || (price != PNUMBER5){
                System.out.println("Invalid Price");
                break;
            }

        }

    }
}