
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pintm1551
 */
public class A6Q4 {

    public static double CompInterest(int n, double r, double p) {              
        double balance = p * Math.pow((r + 1), n);                              //Equation for compound interest        
        return balance;                                                         //Return balance
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);                                 //Create Scanner
        System.out.println("Input a principle");                                //Asks print principle
        double p = input.nextDouble();                                             //Recieves number
        System.out.println("Input a interest rate");                            //Asks print interest rate
        double r = input.nextDouble();                                             //Recieves number
        System.out.println("Input the amount of years");                        //Asks print input years
        int n = input.nextInt();                                                //Recieves number
        System.out.println("The compound interest is " + CompInterest(n, r, p));  //states compound interest
    }
}
