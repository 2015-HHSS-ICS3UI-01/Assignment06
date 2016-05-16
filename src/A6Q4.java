/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A6Q4 {
    // initial principle, interest rate, number of years
    public static void compoundInterest(double p, double r, int n) {
        // new balance = compound interest equation
        double b = (p *(Math.pow((1 + r), n)));
        // return new balance
        System.out.println("Your new balance is: " + b);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input values
        compoundInterest(1000, 0.15, 2);
    }
}
