
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q04 {

    public static double compundIntrest(double P, double r, int n) {

        double balance = 0;
        //exponent = 0 until user indicates years
        //takes 1+rate and multiplies by exponent of years
        double exponent = 0;
        exponent = Math.pow(1 + r, n);
        balance = P * exponent;
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);

        //asks user for their initial amount
        System.out.print("What is the initial amount? ");
        double P = input.nextDouble();
        //asks user for the interest rate in a percentage
        System.out.print("What is the interest rate?(in percentage) ");
        double r = input.nextDouble();
        //asks user the number of years
        System.out.print("How many years? ");
        int n = input.nextInt();

        double balance = compundIntrest(P, r, n);
        System.out.println("The balance is $" + balance);

    }
}
