
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Question1 {
    
    // create method to find the cicle area when given the radius
    public static double circleArea(double radius){
        
        // create variable for the area of the circle
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        
        // return area back
        return areaOfCircle;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will use a method to calculate 
        // the area of a circle when given the radius
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what the radius is and store the data using a variable of the radius
        System.out.print("Enter the radius of the circle to determine the area: ");
        double radius = input.nextDouble();
        
        // create variable to store the area of the circle
        double circleAreaAnswer = circleArea(radius);
        
        // output what the area of the circle is
        System.out.println("The area of the circle is " + circleAreaAnswer);
        
        //close scanner
        input.close();
    }
    
}
