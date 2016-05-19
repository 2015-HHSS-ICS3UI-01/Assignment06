
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dhila4674
 */
public class A6Q4 {

    /**
     * @param args the command line arguments
     */
    public static double compoundinterest(double A, double P, double R, double I){
        A = P* Math.pow((1+R), I);
        return A;
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("enter variables");
        double P = input.nextDouble();
        double R = input.nextDouble();
        double I = input.nextDouble();
        double A = 1;
        double compoundinterest = compoundinterest(A,P,R,I);
        System.out.println("your compound interest is " + compoundinterest);
    }
}
