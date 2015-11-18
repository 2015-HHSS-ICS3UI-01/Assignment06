
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creates scanner
        Scanner in = new Scanner(System.in);
        // Asks human for radius
        System.out.println("Please enter the radius");
        double radius = in.nextInt();
                double pi = 3.14159265359;
                // Identifies the variable and sends it to circleArea method to do its job!
        double x = circleArea(radius,pi);
        // once the answer is back to main method, the main method then blurts out the answer
        System.out.println("The Area of the circle is " + (Math.round(x*100)/100.0));
    }
    // This is his assistant called "assistant method" DO YOUR WORK SLAVE!
    public static double circleArea(double radius, double pi){
    // Does the calculations his boss tells him (main method)
    double area = (pi)*((radius)*(radius));
    // Gives the boss the answer as he begs for mercy.
    return area;
            
}
    
}
// Main method is the main chunk, sort of like a brain while the other methods are different body parts sending back info