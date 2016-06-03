/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q6 {

    public static int lastDigit(int num) {
        // if number is negative, multiply it by -1 to make it a positive
        if (num < 0) {

            num = num * (-1);
        }
        // get the last digit of the number
        num = num % 10;
        // return the number
        return num;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        // ask them to input a number and store it in a variable
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int LD = lastDigit(num);
        // tell them the last digit of their number
        System.out.println("The last digit in your number is " + LD);
    }
}
