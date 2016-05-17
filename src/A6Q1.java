
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q1 {
    // Method created to return area of circle with radius given as an input
    public static double circleArea(double radius) {
        // Calculating the area of the cirle using user's input of the radius
        double ans = ((radius * radius) * Math.PI);
        // Returns the variable 'ans' of the method
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create new scanner
        Scanner input = new Scanner(System.in);
        // Ask the user their circle's radius
        System.out.println("Please enter you circle's radius.");
        // Save input of user to variable 'circleArea'
        double circleAns = input.nextDouble();
        // Connecting the method to rest of code
        double ans = circleArea(circleAns);
        // Output the user's answer (area of their circle)
        System.out.println("Your circle's area is " + ans + "cm squared.");
    }
}
