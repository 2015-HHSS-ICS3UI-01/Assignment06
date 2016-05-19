
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    
    public static double compoundinterest(int n, double r, double p) {
        double balance = p * Math.pow((1 + r), n);
        return balance;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        System.out.println("Input the principal of the amount.");
        double p = input.nextDouble();
        System.out.println("Input the interest rate.");
        double r = input.nextDouble();
        System.out.println("Input the number of years.");
        int n = input.nextInt();
        System.out.println("The compound interest will be " + compoundinterest(n, r, p));
    }
}
