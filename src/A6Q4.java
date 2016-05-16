/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author voigr4865
 */
public class A6Q4 {
    
    public static void compoundInterest(double p, double r, int n){//the main method that allows for all of this to happen
        double b = (p * (Math.pow((1 + r), n)));//takes p and multiplies it by the power of 1 plus r and the exponent is n
        System.out.println("Your balance is " + b);//print outs the balance
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        // TODO code application logic here
        compoundInterest(1000, 0.15, 2);//where the numbers are inputted 
    }
}
