/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tatad6701
 */
public class A6Q4 {

    public static void compoundInterest(double p, double r, int n) {
        // Equation of the compound equation
        double balance = (p * (Math.pow((1 + r), n)));
        // Output the balance to the user 
        System.out.println("Your balance is: " + balance);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // User inserts the number/information                                  
        compoundInterest(1000, 0.15, 2);
    }
}
