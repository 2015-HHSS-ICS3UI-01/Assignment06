
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question1 {

    public static double circleArea (double r){
    double area = Math.PI*r*r;
    return area;
    
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the radius of a circle:");
        double radius = input.nextDouble();
        double answer = circleArea(radius);
        System.out.println("The area of the circle is: " + answer);
    }
}
