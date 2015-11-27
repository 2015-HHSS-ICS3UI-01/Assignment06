
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question9 {

    public static int allDigitsOdd(int digit) {
        //This method finds an odd or even number in a digit.
        int n = 0;
        digit = digit % 10;
        if (digit == 0 || digit == 2 || digit == 4 || digit == 6 || digit == 8) {
            n = 1;
        } else {
            n = 0;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        //The user enters a number.
        int number = input.nextInt();
        while (true) {
            //The method allDigitsOdd searches the number to find an even number
            int choice = allDigitsOdd(number);
            //The sequence then gets rid of the number it checked, if it was odd
            //then it`s just thrown away.
            number = number / 10;
            //If the number has an even number, then the computer tells the user
            //that it`s false, there is an even number.
            if (choice == 1) {
                System.out.println("False");
                break;
                //If the number has no even numbers, then the computer tells the user
                //that it`s true, there is no even numbers.
            } else if (number < 10) {
                System.out.println("True");
                break;
            }
        }
    }
}
