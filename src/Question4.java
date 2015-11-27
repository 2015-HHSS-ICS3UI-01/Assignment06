
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question4 {

    public static void compoundInterest (double initialPrinciple, double interestRate, double years){
    double stepOne = 1 + interestRate;
    double stepTwo = Math.pow(stepOne, years);
    double balance = stepTwo * initialPrinciple;
    System.out.println("Your balance is: " + balance);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What was your inital bank account balance?");
        double initialPrinciple = input.nextDouble();
        System.out.println("What is the interest rate?");
        double interestRate = input.nextDouble();
        System.out.println("How many years has it been?");
        double years = input.nextDouble();
        compoundInterest(initialPrinciple, interestRate, years);
        
               
                
    }
}
