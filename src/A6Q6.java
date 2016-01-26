
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author malcr1272
 */
public class A6Q6 {
    //make procedure to find last digit

    public static void lastDigit(int number) {
        //put the last digit in an integer
        int last = number % 10;
        //print out what the last number was
        System.out.println("The last number is " + last);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make scanner
        Scanner in = new Scanner(System.in);

        //ask for a number to enter
        System.out.println("Enter in a number");
        //save number in an integer
        int number = in.nextInt();
        //run procedure
        lastDigit(number);
    }
}
