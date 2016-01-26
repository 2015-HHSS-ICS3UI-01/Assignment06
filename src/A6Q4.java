
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A6Q4 {
public static void compoundInterest(double ip, double ir, double ny ){
  
double s1 = ir + 1;
double s2 = Math.pow(s1, ny);
double s3 = s2 * ip;
  
System.out.println("Your balance is " + s3);
}
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
Scanner input = new Scanner(System.in);        

System.out.println("Enter the intitial bank balance");
double ip = input.nextDouble();

System.out.println("Enter the interest rate in %");
double ir = input.nextDouble();

System.out.println("Enter the numbero of years");
double ny = input.nextDouble();

compoundInterest (ip, ir, ny);
     }
}
