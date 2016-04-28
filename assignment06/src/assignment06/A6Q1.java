/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment06;

import static assignment06.A6Q1.circleArea;
import java.util.Scanner;

/**
 *
 * @author fostp4040
 */
public class A6Q1 {
     public static double circleArea(double radius){
        double PI=Math.PI;
        double area=PI*(radius*radius);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the radius of the circle:");
        double radius=input.nextInt();
        double area=circleArea(radius);
        System.out.println("The area of the circle is " +area);
    }
}
