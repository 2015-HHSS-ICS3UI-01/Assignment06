
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    //create a new method for finding the area
    public static double areaCircle(double r){
        //calculate the area
        double area= Math.PI*r*r;
        //return the value to the main method 
        return area;
    }

    public static void main(String[] args) {
        //create a new scanenr
        Scanner input=new Scanner(System.in);
        //Asks for radius of circle
        System.out.println("Please enter the radius of the circle");
        //input line for radius 
        double radius = input.nextDouble();
        //inputs radius of circle into area calculation
        double answer = areaCircle(radius);
        //tells user area of circle
        System.out.println("The area of the circle us "+ answer);
    } 
}
