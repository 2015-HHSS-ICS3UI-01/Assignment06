
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q4 {

    public static double Balance(double initial, double interest, int year) {
        //calculate the value using given equation
        double ans = initial * (Math.pow(1 + interest, year));
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            //ask for principle value
            System.out.println("Please input your principle");
            double initial = input.nextDouble();
            //ask interest rate
            System.out.println("Please input your interest rate");
            double interest = input.nextDouble();
            //ask for number
            System.out.println("Please input the number of years");
            int year = input.nextInt();
            //bring the value calculated using method above
            double balance = Balance(initial, interest, year);
            //print out the value
            System.out.println("Your balance is " + balance);
        }
    }
}
