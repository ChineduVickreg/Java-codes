import com.sun.scenario.animation.shared.ClipInterpolator;

import java.util.Scanner;

// An Application that collects as an array of numbers from the user
// and then loop through them to print each as asterisks
public class BarChartUsingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values separate");
        String line = scanner.nextLine();
        String[] array = line.split(" ");
        for (String i : array){
            for(int r = 0; r < Integer.parseInt(i); r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
