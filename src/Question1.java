
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class Question1 {

//create return type method that takes the radius    
    public static double areaCircle(double rad) {
        //area = pi*radius squared
        double area = Math.PI * rad * rad;
        //return area to main method
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create scanner
        Scanner input = new Scanner(System.in);
        //get radius from user, store in variable 'radius'
        System.out.println("Input radius of Circle: ");
        double radius = input.nextDouble();
        //send radius to 'areaCircle' method
        areaCircle(radius);
        //output area of circle returned from method
        System.out.println("The area of the circle is: " + areaCircle(radius));


    }
}
