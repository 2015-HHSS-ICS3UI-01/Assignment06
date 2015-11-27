
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question6 {

    public static int lastDigit(int digit) {
        //Using a certain formula, the last digit of a number can be found.
        digit = digit % 10;
        return digit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number:");
        //The user inputs a number.
        int number = input.nextInt();
        //The method lastDigit, uses a formula to find the last digit of a number.
        int lastNumber = lastDigit(number);
        //The computer gives the user the last digit of their number.
        System.out.println("The last number is " + lastNumber);
    }
}
