
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static double circleArea(double radius) {
        double area = 3.14 * Math.pow(radius, 2);
        return area;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle.");
        double awn = circleArea(input.nextDouble());
        System.out.println("The area of that circle is " + awn);
    }
}
