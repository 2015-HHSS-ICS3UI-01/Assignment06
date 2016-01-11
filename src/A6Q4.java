 
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kulla6503
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // New Scanner 
        Scanner in = new Scanner(System.in);

        // The user enters the mark that they got on there exam 
        System.out.println("Please enter your Balance: ");

        // Creating a variable to store the mark they got 
        double principal;
        double interest; 
        double balance; 
        int n; 
         
        // Output our sentence to the user letting them know what they entered
        System.out.println("What is the intial amount of money in your bank account?");
        principal = in.nextInt();
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("What is the Interest Rate?");
        interest = in.nextInt(); 
        interest = interest /100.0;
        
        // Output our sentence to the user letting them know what they entered
        System.out.println("How many years of investing are you doing?");
        n = in.nextInt(); 
        
        // Execute method 
         double answer = compoundInterest(principal, interest, n);
         System.out.println("The Total Balance in your Bank Account Is: " +  Math.round(answer));   
         
    }
    
    // Method using Compound Interest 
    public static double compoundInterest(double principal, double interest,int n) {
       
        // Using the exponential formula to find the Bank Balance 
        double balance = (principal) * Math.pow(1 + interest, n); 
        return balance; 
                          
    }
    
    
 
}
