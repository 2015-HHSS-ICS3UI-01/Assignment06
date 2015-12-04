
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner
        Scanner input = new Scanner(System.in);
        //Ask user to enter starting balance of account
        System.out.println("Please enter the initial balance of an account");
        //integer for starting balance of account
        double initialPrincipal = input.nextDouble();
        //Asks user for interest rate
        System.out.println("Please enter the interest rate as a decimal number");
        //interger for interest rate
        double interestRate = input.nextDouble();
        //divides interest rate(decimal number) by 100
        interestRate = interestRate / 100;
        //Asks user to enter number of years
        System.out.println("Please enter the number of years");
        //integer for number of years
        double numOfYrs = input.nextDouble();
        //Calculates final balance of account to 2 decimal places
        double finalBalance = Math.ceil(compoundInterest(initialPrincipal, interestRate, numOfYrs)*100)/100;
        //Outputs final balance of account
        System.out.println("The new balance of the account is $" + finalBalance);
    }
    //Create new method for finding balance
    public static double compoundInterest(double initialPrincipal, double interestRate, double numOfYrs) {
        //Calculate the balance using integers
        double balance = initialPrincipal * Math.pow((1 + interestRate), numOfYrs);
        //returns value of balance
        return balance;
    }
}
