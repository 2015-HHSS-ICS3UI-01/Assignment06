
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A6Q1 { 
    //calculate the area of a circle
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area; }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //input scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        
        System.out.println("The area of the circle is: ");
        System.out.println(circleArea(radius));
    }
}
