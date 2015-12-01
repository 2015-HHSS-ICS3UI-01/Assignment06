
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q4 {
        public static void compoundInterest(double principle, double interestRate, int amountOfYears){
            
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // input a scanner
        Scanner input = new Scanner(System.in);
        //what is the interest rate
        System.out.println("Please insert the interest rate ");
        double interestRate = input.nextDouble();
        //what is the amount of years
        System.out.println("Please insert the amount of years");
        double amountOfYears = input.nextDouble();
        //what is the principle amount
        System.out.println("Please insert the principle amount");
        double principle = input.nextDouble();
        // the equation
        double balance = principle*Math.pow(interestRate +1, amountOfYears);
        // the balance of the account
        System.out.println(balance + " Is the balance on the account ");
        
        
    }
}
