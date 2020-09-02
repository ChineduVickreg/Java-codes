//An Application that will read through 5 numbers
//collected from the user
//and print asterisks of each number
//after looping through each of them

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first Number");
        int num1 = scanner.nextInt();
        System.out.println("Enter second Number");
        int num2 = scanner.nextInt();
        System.out.println("Enter third Number");
        int num3 = scanner.nextInt();
        System.out.println("Enter fourth Number");
        int num4 = scanner.nextInt();
        System.out.println("Enter fifth Number");
        int num5 = scanner.nextInt();

        barsOfAsterisks(num1,num2,num3,num4,num5);


    }
    public static void barsOfAsterisks(int num1, int num2, int num3, int num4, int num5){
        for (int i = 0; i < num1; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < num2; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < num3; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < num4; i++){
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < num5; i++){
            System.out.print("*");
        }
        System.out.println();

    }
}
