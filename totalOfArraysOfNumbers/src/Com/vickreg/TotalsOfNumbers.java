package Com.vickreg;
//An Application that can calculate the total sum of an array of numbers.

import java.util.Scanner;

public class TotalsOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        final int NUMBER_OF_LENGTH = scanner.nextInt();
        int[] values = new int[NUMBER_OF_LENGTH];

        for(int i= 0; i<= values.length;i++){
             System.out.println("Enter a List of Numbers");
            values[i] = scanner.nextInt();

        }
        sumTotalOfArrays(values);
          
    }
    public static int sumTotalOfArrays(int... numbers){
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum: " + sum);
        return sum;
    }
}
