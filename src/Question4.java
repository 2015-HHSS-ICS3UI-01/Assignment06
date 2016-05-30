
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question4 {
    //create a method to figure out the new balance after interest

    public static void compoundInterest(double start, double rate, int years) {
        double balance = start * Math.pow(1 + rate, years);
        System.out.println("Your balance is $" + balance);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //search for, input and store balance, rate and time
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your starting balance");
        double start = input.nextDouble();
        System.out.println("Please enter your interest rate per year as a decimal");
        double rate = input.nextDouble();
        System.out.println("Please enter the number of years you money will invested for");
        int years = input.nextInt();
        compoundInterest(start, rate, years);
    }
}
