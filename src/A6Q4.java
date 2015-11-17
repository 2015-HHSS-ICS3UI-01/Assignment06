
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q4 {
    
    public static double compoundInterest (double p){
        
        
        // make a new scanner
        
        Scanner input = new Scanner (System.in);
        
        //tell the user to enter the number of years
        
        System.out.println("Please enter the number of years.");
        
        //store the number of years in variable
        
        double n = input.nextDouble();
        
        //tell the user to enter the interest rate
        
        System.out.println("Please enter the interest rate.");
        
        //store the interest rate in a variable
        
        double r = input.nextDouble();
        //calculate the final balance
        
        double balance = p*(Math.pow((1+r),n)) ;
        
        
        return balance;
        
    }
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make a new scanner
        
        Scanner input = new Scanner (System.in);
        
        //tell user to input the initial amount
        
        System.out.println("Please enter the principle.");
        
        //store the principle in a variable
        
        double p = input.nextInt();
        
        //activate the method
        
        double answer = compoundInterest (p);
        
        System.out.println("Your final balance is $"+answer+".");
    
        //close the scanner
        
        input.close();
}}
        
        
                
    

