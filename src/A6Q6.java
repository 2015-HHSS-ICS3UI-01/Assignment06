
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q6 {
        static public void lastDigit(int number){
            // what int digit means
            int digit = number%10;
            // what the number is exactly
            System.out.println(" The last digit of your specific number is " + digit);
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        // enter the last digit
        System.out.println("Please put the number that the last digit is originally from");
        int number = input.nextInt();
        // formula
        lastDigit(number);
    }
}
