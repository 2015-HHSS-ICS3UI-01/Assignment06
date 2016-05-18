/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static double interest(double p, double r, double n) { //p = principle amount, r =interest rate, n = number of years
        //use formula B=P(1+r)^n  
        double balance = p * Math.pow((1 + r), n); // sub in variables
        return balance; //return calculated balance
    }

    public static void main(String[] args) {
        // TODO code application logic here
        double interest = interest(100, 0.4, 4); //input variables for p, r, and n
        System.out.println(interest);//print answer to test method
    }
}
