/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q7 {
    // Method created to return the firt digit of the user's input 
    public static void firstDigit(int number) {
        // Multiple the input by -1 if the input is negative
        if (number < 0) {
            number = number * -1;
        }
        // Convert integer to string
        String numString = Integer.toString(number);
        // Store first char (and use to display the answer to the user)
        String firstnum = (numString.substring(0, 1));
        // Output the first digit to the user
        System.out.println("The first digit of your input is " + firstnum + ".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User's input, that connects the method all together
        firstDigit(-947);
    }
}
