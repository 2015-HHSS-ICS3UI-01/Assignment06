
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

    public static int firstDigit(int digit){
        while (digit >= 10 || digit <= -10){
            digit = digit/10;
        }
        return digit;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        int firstNumber = firstDigit(number);
        System.out.println(firstNumber);
    }
}
