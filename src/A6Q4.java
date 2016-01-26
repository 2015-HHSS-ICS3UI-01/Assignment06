
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A6Q4 { 
    //make a function
     public static void compoundinterest(double initial,double interest,int years){
      
    //create integer for total balance and insert integers into the equation
         double rate = interest + 1;
    double balance = ((initial)*(Math.pow(rate, years)));
    
    //output balance
         System.out.println("Your accounts balance is " + balance);
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner in = new Scanner(System.in);
        
        //ask for inital principle being added
        System.out.println("What is the initial principle being added into the account?");
        double initial = in.nextDouble();
        
        //ask for the interst rate
        System.out.println("What is the interest rate of the account?");
        double interest = in.nextDouble();
        
        //ask for the number of years you are investing for
        System.out.println("How many years are you investing for?");
        int years = in.nextInt();
        
        //run the function
        compoundinterest(initial,interest,years);
       
    }
}
