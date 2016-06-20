/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class compoundinterest {

    /**
     * @param args the command line arguments
     */
    public static double compoundinterest(double p) {
        //input Scanner
        Scanner input = new Scanner(System.in);

//store number of years in a variable
        double n = input.nextDouble();

//tell user to enter their interest rate
        System.out.println("Enter the interest rate");

        //store the interest rate
        double r = input.nextDouble();

        double balance = p * (Math.pow((1 + r), n));
        //return statement
        return balance;

    }
}
