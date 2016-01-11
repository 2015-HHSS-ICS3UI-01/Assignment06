
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter the number you want to factor: ");
        int number = in.nextInt();

        // Execute Method
        factors(number);
    }

    // Method Using factors 
    public static void factors(int number) {
        int i = 1;

        // Formula used to determine the the factors of the number entered
        while (i <= number) {
            int remainder = number % i;
            if (remainder == 0) {
                System.out.print(i + ",");
            }
            i++;
        }
    }
}
