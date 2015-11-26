
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pircn0556
 */
public class Q1 {
    public static double circleArea(double r){
        //Formula for finding a circle's area
        double area = Math.PI*Math.pow(r, 2);
        return area;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
         //finding area of circle
        System.out.println("Please enter the radius of the circle");
        double radius = input.nextDouble();
        double answer = circleArea(radius);
        System.out.println("The area of the circle is "+answer);
    }
}
