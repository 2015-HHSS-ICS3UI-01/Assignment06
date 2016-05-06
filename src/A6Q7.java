/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q7 {

    public static void firstDigit(int number) {
        // Convert integer to string
        String num = Integer.toString(number);
        // Multiple the input by -1 if the input is negative
        if (number < 0) {
            number = number * -1;
        }
        // Convert to string
        String numString = Integer.toString(number);
        // Store first char
        String firstnum = (numString.substring(0, 1));
        // Output the first digit
        System.out.println("The first digit of your input is " + firstnum + ".");

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // User's input
        firstDigit(-43572);
    }
}
