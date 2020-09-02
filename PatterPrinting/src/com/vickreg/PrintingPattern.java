package com.vickreg;
//An application that prints pattern using @

public class PrintingPattern {
    public static void main(String[] args) {
pattern();

    }
    public static void pattern(){
        int space = 1;
        for (int a = 1; a <= 10; a++){
            for (int j = 0; j < 10; j++){
                System.out.print("@ ");
            }
            System.out.println();
//            if (a % 2 !=0){
//                space--;
//            }else{
//                space++;
//            }
//            for (int s = space; s < 1; s++){
//                System.out.println(" ");
//            }
//
        }
    }
}



