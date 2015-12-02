
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q07 {

    public static void firstDigit(int number) {
        //checks if number is more or equal to 1
        //loops through number and chops off last digit until it reaches last digit
        if (number >= 1) {
            for (int i = 10; i < number; i++) {
                number = number / 10;
            }
        }//checks number if it is negative
        //loops through and chops off last digit until it gets to the first one
        else if (number < 1) {
            for (int i = -10; i > number; i--) {
                number = number / 10;
            }
        }
        //prints out first didgit
        System.out.println("The first digit is " + number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user to enter a number
        System.out.println("Enter a number ");
        int number = input.nextInt();
        
        //returns number
        firstDigit(number);
    }
}
