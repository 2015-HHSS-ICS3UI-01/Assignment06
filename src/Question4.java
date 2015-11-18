
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question4 {
    
    // create a method that will determine the compound interest of the user when given the initial princciple, the interest rate, and the number of years
    public static double compoundInterest(double initialPrinciple, double interestRate, int years) {
        
        // create a variable to store the balance of the user
        double balance = initialPrinciple * Math.pow((1 + interestRate), years);
        
        // round the balance to the nearest cent
        balance = Math.round(balance * 100.00) / 100.00;
        
        // return the final balance
        return balance;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will calculate the compound interest of the user using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what their initial principle is and store this into a variable
        System.out.print("What is your initial principle? ");
        double initialPrinciple = input.nextDouble();
        
        // ask the user what their interest rate is and store this into a variable
        System.out.print("What is your interest rate? ");
        double interestRate = input.nextDouble();
        
        // ask the user how many years there are and store this in a variable
        System.out.print("How many years of interest? ");
        int years = input.nextInt();
        
        // store the method compoundInterest into a variable that can be used
        double compoundInterestAnswer = compoundInterest(initialPrinciple, interestRate, years);
        
        // output the balance
        System.out.println("Your balance is " + "$" + compoundInterestAnswer);
        
        // close the scanner
        input.close();
    }

}
