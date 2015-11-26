
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q4 {

    public static void compoundInterest(double initial, double interest, int years) {
       //Does B=P(1+r)^n here to get balance
        double r = interest + 1;
        double n = Math.pow(r, years);
        double balance = n * initial;
        System.out.println(balance);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Asking for initial principle
        Scanner input = new Scanner(System.in);
        System.out.println("Initial Principle:");
        double initial = input.nextDouble();

        //Asking for the interest rate
        System.out.println("Interest Rate:");
        double interest = input.nextDouble();

        //Asking how many years
        System.out.println("Number of Years:");
        int years = input.nextInt();

        //Calculations for new balance
        System.out.println("The new balance would be ");
        compoundInterest(initial, interest, years);

    }
}
