
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q3 {
    // Create procedure loop that stores numbers from main method as 'number'

    public static void factors(int num) {
        // Create for loop that goes through all numbers between 1 and number
        for (int factor = 1; factor <= num; factor++) {
            // Set variable 'remainder' to store the remainder of the number
            int remainder = num % factor;
            // If the remainder is 0, then print out the factor
            if (remainder == 0) {
                // Ouput the factors
                System.out.println(factor);
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        factors(30);
    }
}