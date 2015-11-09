
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author hadik9595
 */
public class A6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generate scanner
        Scanner in = new Scanner(System.in);
        // Asks for number to divide
        System.out.println("Enter a number");
        int number = in.nextInt();
        // Prints out AND EXECUTES main method factors
        System.out.println("factors (" + number + ") would print out the numbers ");
        Factors(number);
    }

    public static void Factors(int number) {
        // Intialized check as number basically
        int Check = number;
        // i starts at 1 and adds on until it equals = number
        int i = 1;
        // while loop that keeps going until i becomes filled
        while (i <= Check) {
            // Most important part of the code.. It looks if its remainder is 0 then prints it.
            if (Check % i == 0) {
                //prints any evenly divisible numbers.
                System.out.println(i + " is a factor");

            }
            // Adds 1 until i is no longer is divisible evenly and reaches the original number.
            i++;

        }

    }
}
