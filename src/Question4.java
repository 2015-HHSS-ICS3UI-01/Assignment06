
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
    
    public static double compoundInterest(double initialPrinciple, double interestRate, int years) {
        
        double balance = initialPrinciple * Math.pow((1 + interestRate), years);
        
        balance = Math.round(balance * 100.00) / 100.00;
        
        return balance;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your initial principle? ");
        double initialPrinciple = input.nextDouble();
        
        System.out.print("What is your interest rate? ");
        double interestRate = input.nextDouble();
        
        System.out.print("How many years of interest? ");
        int years = input.nextInt();
        
        double compoundInterestAnswer = compoundInterest(initialPrinciple, interestRate, years);
        
        System.out.println("Your balance is " + "$" + compoundInterestAnswer);
        
        input.close();
    }

}
