
import java.util.Scanner;

/*50
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundInterest(double principle, double rate, int years) {
        double balance = principle * Math.pow(rate + 1, years);
        return balance;
    }
    public static void main(String[] args) {
        System.out.println("Enter you principle amount.");
        Scanner input = new Scanner(System.in);
        double principle = input.nextDouble();
        System.out.println("Enter your intrest rate.");
        double rate = input.nextDouble();
        System.out.println("Enter the number of years.");
        int years = input.nextInt();
        double balance = compoundInterest(principle,rate,years);
        System.out.println("Your balance is " + balance);
    }
}
