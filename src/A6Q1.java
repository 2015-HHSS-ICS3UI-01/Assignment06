
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A6Q1 {
 public static double areaCircle(double r){
        double area = Math.PI*r*r;
        return area;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the radius of the circle");
        double r = input.nextDouble();
        double answer = areaCircle(r);
        System.out.println("The area of the circle is " + answer);
    }
}
