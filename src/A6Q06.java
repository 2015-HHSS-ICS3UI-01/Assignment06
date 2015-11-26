
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q06 {

    public static void lastDigit(int number) {

        //number is % by 10
        number = number % 10;

        //tells user the last number
        System.out.println("The last digit is " + number);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user for a number
        System.out.println("Enter a number ");
        int number = input.nextInt();

        //returns number
        lastDigit(number);
    }
}
