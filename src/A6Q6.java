/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q6 {

    public static void lastDigit(int num) {
        //multiply number by .10
        int lastDigit = num % 10;

        //to return the last digit for a negative number, multiply it by -1
        if (num < 0) {
            lastDigit = lastDigit * (-1);
        }
        System.out.println(lastDigit);
    }

    public static void main(String[] args) {
        //return product
        lastDigit(6);

    }
}
