package com.vickreg;
//An application that prints even numbers from 2 to 100;

public class EvenNumbers2To100 {
    public static void main(String[] args) {
        int counter = 2;
        do{
            System.out.println(counter);
            counter += 2;
        }while(counter <= 100);
    }
}
