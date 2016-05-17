/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q5 {
    // Method used to create random number of artersicks on a set amount of lines (which the user inputs)
    public static void chaotic(int numLines) {
        // Generate lines of random stars until required amount is met
        for (int linesTyped = 0; numLines > linesTyped; linesTyped = linesTyped + 1) {
            // Generate number between 1 and 5 for asterisks to be outputted by the program (Math part of the code) 
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // Use random number generated to create a line of stars (the program will keep adding stars to the line until randNum is reached)
            for (int starsOut = 0; randNum > starsOut; starsOut = starsOut + 1) {
                // The program will output an asterisk(s) 
                System.out.print("*");
            }
            // Create space (enter key) to enter next line for program to work 
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Number of rows to print (the user's input that connects back to the main method)
        chaotic(7);
    }
}
