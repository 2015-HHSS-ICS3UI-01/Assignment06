/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A6Q4 {
    //make a methos that returns the balance after the compound interest is added
    //make variables for the initial amount, the interst rate, and the number of years
    public static double compoundInterest(double principle, double interest, int years) {
        //equation (B=P(1+r)^n) 
        double balance = principle * Math.pow(1 + interest, years);
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enter the initial principal being added to, the interest rate as a decimal number, and the number of years
        //print compoundInterest to the screen
        System.out.println(compoundInterest(100, .04, 3));
    }
}
