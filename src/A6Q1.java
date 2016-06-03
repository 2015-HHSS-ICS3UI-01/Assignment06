/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q1 {
    
    public static double circleArea(double r){
        // get the area
        double area = Math.PI*r*r;
        // return the area
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        //ask them for the radius of the circle
        System.out.println("Please enter the radius of the circle:");
        double radius = input.nextDouble();
        double answer = circleArea(radius);
        //tell them the area of the circle
        System.out.println("The area of the circle is " + answer);
               
    }
}
