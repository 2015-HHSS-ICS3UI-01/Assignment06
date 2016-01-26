/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q4 {

    public static double compoundInterest(double initial, double interest, double years) {
        //create the method and return type

        double compoundInterest = initial * (Math.pow(1 + interest, years));
        return compoundInterest;
    }
    //allow the user to substitute their numbers into the formula

    public static void main(String[] args) {
        double answer = compoundInterest(89, 0.5, 2);
        System.out.println(answer);
    }
}
