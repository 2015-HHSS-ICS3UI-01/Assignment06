/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q6 {

    public static void lastDigit(int num) {
        // Multiple the input by -1 if the input is negative
        if (num < 0) {
            num = num * -1;
        }
        // Find the percentage of the input
        int endnum = num % 10;
        // Divide the input by 10
        num = num / 10;
        // Print the last digit
        System.out.println("The last digit of your input is " + endnum + ".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // User's input
        lastDigit(3572);
    }
}
