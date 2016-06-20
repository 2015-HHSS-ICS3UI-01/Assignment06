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
public class lastdigit {

    public static int lastDigit(int num) {
        //store variable in an integer
        int r = num % 10;

        return r;

    }

    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter a number
        System.out.println("Enter a number");
        //store variable in an integer
        int num = input.nextInt();
        //store variable in an integer
        int lastDigit = lastDigit(num);
        //tell user what the last digit of the number entered is
        System.out.println("The last digit of the number that was entered is" + lastDigit);
        //close scanner
        input.close();
    }
}
