
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q4 {

    public static double compoundInterest(double in, double ir, int years) {

        double balance = in * Math.pow((1 + ir), years);

        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the initial amount:");
        double p = input.nextDouble();

        System.out.println("Please enter the interest rate:");
        double r = input.nextDouble();

        System.out.println("Please enter the number of years:");
        int n = input.nextInt();

        double compoundInterest = compoundInterest(p, r, n);

        System.out.println("The new balance is $" + compoundInterest);

    }
}
