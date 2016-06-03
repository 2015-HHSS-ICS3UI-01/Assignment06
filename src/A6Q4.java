/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q4 {

    public static double compoundinterest(double initial, double interest, int year) {

        // get the total balance
        double totalbal = Math.pow((1+interest/100.0),year) * initial;
        totalbal = Math.round(totalbal*100)/100.0;
        // return the total balance
        return totalbal;
    }  

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        // ask them for their initial balance
        System.out.println("Please enter the initial balance amount");
        double initial = input.nextDouble();
        // ask them for the interest rate
        System.out.println("Please enter the interest rate");
        double interest = input.nextDouble();
        // ask them for the number of years
        System.out.println("Please enter the number of years");
        int year = input.nextInt();
        // store their answer in a double variable
        double answer = compoundinterest(initial, interest, year);
        // tell them their new total balance
        System.out.println("Your total balance is " + answer);
    }
}
