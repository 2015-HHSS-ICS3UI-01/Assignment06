
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q1 {
    
    public static double areaCircle (double r){
        double area = Math.PI*Math.pow(r, 2);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Please enter the radius");
        
        double radius = input.nextDouble();
        
        double answer = areaCircle (radius);
        
        System.out.println("The area of the circle is " + answer);
    }
}                                                                 
