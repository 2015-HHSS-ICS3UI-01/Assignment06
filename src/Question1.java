
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will use a method to calculate 
        // the area of a circle when given the radius
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what the radius is and collect the data using a variable of the radius
        System.out.print("What is the radius: ");
        double radius = input.nextDouble();
        
        // output what the area of the circle is
        System.out.println("The area of the circle is " + circleArea(radius));
        
        //close scanner
        input.close();
    }
    
    // create method to find the cicle area
    public static double circleArea(double radius){
        
        // create variable for the area of the circle and return it
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        return areaOfCircle;
    }
}
