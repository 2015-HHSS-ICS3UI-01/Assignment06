/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        compoundInterest(500, 0.2, 2);
        //created a variable called answer that is equal to the method
        double answer = compoundInterest(500, 0.2, 2);
        System.out.println(answer);
        
    }
    //created a method that will give the balance of an account after the 
    //compound interest is added
    public static double compoundInterest(double principle, double rate, int years){
        //created a variable that is equal to "rate" plus one
        double rateofprinciple = 1+rate;
        //created a new variable that is equal to "rateofprinciple" to the power of "years"
        double numberofyears = Math.pow(rateofprinciple, years);
        //created a variable that is equal to principle multiplied by "numberofyears"
        double balance = principle * numberofyears;
        //returns "balance" to the main method
        return balance;
         
        
        
    }
}
