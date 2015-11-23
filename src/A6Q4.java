
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class A6Q4 {
    
    public static double compoundinterest(double initial,double rate,int year){
        
       //do calculation based on users input 
        double newbal=Math.pow((1+rate/100.0),year)*initial;
        newbal=Math.round(newbal*100)/100.0;
        //return the new balence 
        return newbal;

        
    }
    
    
    
    
    
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //new scanner
         Scanner input = new Scanner(System.in);
         //asker user intial amount of account 
         System.out.println("Whats is the intial account balance ");
         
         // user enters initail value of accont 
         double initial=input.nextDouble();
         
         //ask user the interest rate 
         System.out.println("what is the interest rate ");
         //user enters the interest amount 
         double rate=input.nextDouble();
         
        
         
         //ask user the amount of years 
         System.out.println("How many years");
         //user enters amount of years 
         int year=input.nextInt();
          //craete double to store final answer in        
         double ans = compoundinterest(initial,rate,year);
         
        //let user know the new balence of the account 
         System.out.println("The new balence of the account is " + ans);
         
         
    }
    
}
