
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q4 {
      
    public static double compoundInterest(double balance){
        double initial = 0;
        double interest = 0;
        int years = 0;
        return balance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Asking for initial principle
       Scanner input = new Scanner(System.in);
        System.out.println("Initial Principle:");
        double initial = input.nextDouble();
        
        //Asking for the interest rate
        System.out.println("Interest Rate:");
        double interest = input.nextDouble();
        
        //Asking how many years
        System.out.println("Number of Years:");
        int years = input.nextInt();
        
        //Calculations for new balance
        double brackets = interest+1;
        double exponent = Math.pow(brackets,years);
        double balance = exponent*initial;
        compoundInterest(balance);
        System.out.println(""+balance);
    }
}
