
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question4 {

    public static double CompoundInterest(double initial, double rate, int year) {

        //Calculate the input (rate)
        double newbalance = Math.pow((1 + rate / 100.0), year) * initial;
        newbalance = Math.round(newbalance * 100) / 100.0;
        //Return the newbalance with intrest
        return newbalance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creat a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //Ask for the initial amount  
        System.out.println("Whats is the intial account balance ");

        //Allow the user to input their starting amount  
        double startingamount = input.nextDouble();

        //ask user the interest rate  
        System.out.println("what is the interest rate ");
        //user enters the interest amount  
        double percent = input.nextDouble();

        //Ask for how many years the will be compounding 
        System.out.println("Please enter the length of time");
        int year = input.nextInt();
        //Create double to store the FINAL ANSWER        
        double ans = CompoundInterest(startingamount, percent, year);

        //Output the new balance 
        System.out.println("The new balence of the account is " + ans);
    }

}
