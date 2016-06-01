


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A6Q4 {

    public static double compoundInterest(double i, double r, double n) {
        double balance = i*Math.pow(1+r, n);
        return balance;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double balance = compoundInterest(3, 2, 2);
        System.out.println(balance);
    }
}
