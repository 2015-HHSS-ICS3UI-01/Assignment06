
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);

        // Asking user to enter the radius of the circle 
        System.out.println("Please enter the radius: ");

        // Different variables that have certain values 
        double radius = in.nextInt();
        double pi = 3.14;
        double answer = circleArea(radius, pi);

        //Output our sentence to the user letting them know what they entered
        System.out.println("The Area is " + Math.round(answer * 100) / 100);
    }

    // Method using CircleArea
    public static double circleArea(double radius, double pi) {

        // Calculation for the area of the circle 
        double area = (pi) * ((radius) * (radius));
        return area;
    }
}
