/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q7 {

    public static void firstDigit(int num) {

        int digitRemover = 10;
        int firstDigit = num / digitRemover;

        if (num < 0) {
            firstDigit = firstDigit * (-1);
        }
        System.out.println(firstDigit);


    }

    public static void main(String[] args) {
        firstDigit(66);
    }
}
