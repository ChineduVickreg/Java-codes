//An Application that can calculate the total sum of an array of numbers using Variable arguments.

import java.util.Scanner;

public class SumOfArrayOfNumbers {
    public static void main(String[] args) {
        sumTotalOfArrays(23,56,78,900);
    }
    public static int sumTotalOfArrays(int ...numbers){
        int sum = 0;
        for (int i : numbers){
            sum += i;

        }
        System.out.println("Sum of the arrays = " + sum);
        return sum;
    }

}
