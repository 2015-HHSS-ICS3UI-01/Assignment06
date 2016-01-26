
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
      //Create the Scanner
        Scanner in = new Scanner(System.in);
 
        //Create the parameters for the intergers
      double principal;
      double rate;
      double Years;
      double compoundInterest;
   
      //Begin finding the users "principal"
      System.out.print("Enter your Principal amount: "); 
      principal = in.nextDouble();
 
      //Begin finding the users "rate"
      System.out.print("Enter your Rate: "); 
      rate = in.nextDouble();
 
      //Begin finding the users "Years"
      System.out.print("Enter your Years: "); 
      Years = in.nextDouble();
 
      //Calculate the new balance of the compund interest with all of the parameters put together
      compoundInterest = principal * Math.pow((1 + rate/100),Years); 
   
      System.out.println("Your Compound Interest is: "
     + compoundInterest);
   
   }
 
}

        
    

