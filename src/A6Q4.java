
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A6Q4 {
    
    public static void compoundInterest (double princ, double rate, int numYears){
        double balance = princ*Math.pow(1+rate, numYears);
        
        System.out.println("The account balance is " + balance);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user to enter the principle
        System.out.println("Please input the principle.");
        double princ = input.nextDouble(); 
        
        //ask the user for the interest rate
        System.out.println("Please input the interest rate. ");
        double rate = input.nextDouble();
        
        //ask the user for number of years
        System.out.println("Please input the number of years.");
        int numYears = input.nextInt();
        
        //run the procedure
        compoundInterest(princ, rate, numYears);
        
    }
}
