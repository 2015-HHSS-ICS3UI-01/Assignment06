/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import java.util.Scanner;

/**
 *
 * @author godie2014
 */
public class CircleArea {

    /**
     * @param args the command line arguments
     */
    public static double areaCircle(double r) {

       
        double area = Math.PI * Math.pow(r, 2);
        return area;
    }
    // add main method

    public static void main(String[] args) {
        //import scanner
        Scanner input = new Scanner(System.in);
        //ask user to enter the radius
        System.out.println("Enter the radius");
       
        double radius = input.nextDouble();
      
        double answer = areaCircle(radius);
        //tell user the area of the circle
        System.out.println("The area of the circle is " + answer);
        //close scanner
        input.close();


    }
}
