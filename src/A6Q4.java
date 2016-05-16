
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A6Q4 {

    public static double compoundInterest(int n, double r, double p) {      // creating the method 
        double balance = p * Math.pow((1 + r), n);          // the formula to calculate compound interest 
        return balance;                                     // return statement 
    }

    public static void main(String[] args) {                // main method 

        Scanner input = new Scanner(System.in);                     // creating the scanner 
        System.out.println("Input the principle of the account.");  // asking for the p value 
        double p = input.nextDouble();                              // where user inputs p value 
        System.out.println("Input the interest rate.");             // asking for r value 
        double r = input.nextDouble();                              // where user inputs r value 
        System.out.println("Input the number of years.");           // asking for n value 
        int n = input.nextInt();                                    // where user inputs n value 
        System.out.println("The compound interest will be " + compoundInterest(n, r, p));   // outputting the final compound interest 
    }
}
