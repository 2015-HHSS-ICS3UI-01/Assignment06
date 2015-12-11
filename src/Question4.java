
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question4 {
    //create return type method to calculate compunded interest

    public static double compoundInterest(double InitialBalance, double interest, double years) {
        //perform calculation to determine compounded interest
        double finalBalance = InitialBalance * (Math.pow(1 + interest, years));
        //return final balence to main method
        return finalBalance;
    }

    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //get intial balance from user, store in variable
        System.out.println("Enter Initial Balance: ");
        double InitialBalance = input.nextDouble();
        //get interest rate from user, store in variable
        System.out.println("Enter Interest Rate in %: ");
        double interest = input.nextDouble();
        //convert % into number usable by formula, store in variable
        interest = interest / 100;
        //get number of years from user, store in variable
        System.out.println("Enter Number of Years: ");
        double years = input.nextDouble();
        //call on method to do math, store in variable
        double finalBalance = compoundInterest(InitialBalance, interest, years);
        //display balance
        System.out.println("Balance after compounding interest: " + finalBalance);
    }
}
