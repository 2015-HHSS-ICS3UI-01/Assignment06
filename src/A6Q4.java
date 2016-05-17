/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q4 {

    // Double representing intial principal (initial), double representing interest rate (interest), and integer representing number of year (years)
    public static void compoundInterest(double initial, double interest, int year) {
        // Equation of the compound equation in code
        double balance = initial * (Math.pow(1 + interest, year));
        // Output the balance to the user 
        System.out.println("Your balance is: $" + balance + ".");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User inserts the number/information (Initial principle/Interest rate/Number of years)                                 
        compoundInterest(1000, 0.15, 2);
    }
}
