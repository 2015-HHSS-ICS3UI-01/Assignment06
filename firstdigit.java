/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class firstdigit {

    public static int firstDigit(int num) {
        //while loop, if number is between 10 and -10
        while (num >= 10 || num <= -10) {
            num = num / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        // input new scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter a number
        System.out.println("Please enter a number");
        //store varible in an integer
        int num = input.nextInt();
        //store a variable in an integer
        int firstDigit = firstDigit(num);
        //tell user the first digit of the number entered
        System.out.println("The first digit of the number that was entered is" + firstDigit);
        //close scanner
        input.close();
    }
}
