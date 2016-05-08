/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q5 {

    public static void Chaotic(int numLines) {
        // Generate lines of random stars until required amount is met
        for (int linesTyped = 0; numLines > linesTyped; linesTyped = linesTyped + 1) {
            // Generate a random amount of '*' between 1 and 5
            int randNum = (int) (Math.random() * (5 - 1 + 1)) + 1;
            // Use random number generated to create a line of stars 
            for (int starsOut = 0; randNum > starsOut; starsOut = starsOut + 1) {
                // Print each number as a '*' 
                System.out.println("*");
            }
            // Create space (enter key) to enter next line
            System.out.println("");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Chaotic(6);
    }
}
