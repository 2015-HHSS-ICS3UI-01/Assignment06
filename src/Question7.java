
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question7 {

    public static int firstDigit(int digit) {
        //Using a certain formula, the first digit of a number can be found.
        while (digit >= 10 || digit <= -10) {
            digit = digit / 10;
        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        //The user inputs a number.
        int number = input.nextInt();
        //The method firstDigit, uses a formula to find the last digit of a number.
        int firstNumber = firstDigit(number);
        //The computer gives the user the first digit of their number.
        System.out.println(firstNumber);
    }
}
