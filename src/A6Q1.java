
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

    public static double circleArea(int radius) {
        // Finding the area of the cirle using user's input of radius
        double ans = ((radius * radius) * Math.PI);
        // Returns the answers
        return ans;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Save the user's input
        Scanner input = new Scanner(System.in);
        // Ask the user's their circle's radius
        System.out.println("Please enter you circle's radius");
        int circleArea = input.nextInt();
        double ans = circleArea(circleArea);
        // Output the user's answer (area of their circle)
        System.out.println("Your circle's area is " + ans);
    }
}
