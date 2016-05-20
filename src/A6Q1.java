
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rahmf8586
 */
public class A6Q1 {

    public static double circleArea(double radius) {
        double area = Math.PI * (radius * radius);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the radius of a circle:");
        
        double rad = input.nextDouble();
        
        double radius = circleArea (rad);
        
        System.out.println("The area of the circle is " + radius);
    }
}
