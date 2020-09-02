//An Application that prints a check board using asterisks.

import javax.swing.*;

public class CheckBoardAsterisks{
    public static void main(String[] args) {
    checkBoard();
    }
    //the mother loop prints the next line
    // horizontally in the code.
    //the nested loop in the mother loop prints the "*"
    // eight times horizontally.
    public static void checkBoard(){
        int space = 1;
     for (int a = 1; a < 8; a++){
         for (int j = 0; j < 8; j++){
             System.out.print("* ");
         }
         System.out.println();
         if (a % 2 != 0){
             space--;
         }else{
             space++;
         }
         for (int s = space; s < 1; s++){
             System.out.print(" ");
         }
     }

        }
    }

