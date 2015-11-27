
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author stahc1596
 */
public class Question4 {

    public static double compoundInterest(double p, double r, int n) {
        //This formula takes all the inputed values and gets a final amount.
        double base = p * (1 + r);
        base = Math.pow(base, r);
        return base;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a initial amount.");
        //The user inputs their initial amount.
        double initial = input.nextDouble();
        System.out.println("Input a interest rate.");
        //The user inputs the interest.
        double interest = input.nextDouble();
        System.out.println("Input a year.");
        //The user inputs the amount of years passed.
        int year = input.nextInt();
        //The calculations are done in the method comoundInterest.
        double answer = compoundInterest(initial, interest, year);
        //The answer is given to the user once all calculations are done.
        System.out.println("Your balance is " + answer);
    }
}
