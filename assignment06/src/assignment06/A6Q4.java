/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A6Q4 {
    public static double compoundInterest(double intial, double interest, int years){
        double newBalance=intial*(1+interest)*Math.pow(interest,years);
        return newBalance;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the intial princpal");
        double intial=input.nextDouble();
        System.out.println("Please enter the interest");
        double interest=input.nextDouble();
        System.out.println("Please enter the years the money was stored");
        int years=input.nextInt();
        double balance=compoundInterest(intial,interest,years);
        System.out.println("your new balance is $"+balance);
    }
}
