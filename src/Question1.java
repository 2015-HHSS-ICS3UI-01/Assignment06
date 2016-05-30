
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question1 {
    //created a method to find the circle area when given radius

    public static void circleArea(double radius) {
        //multiple the radius by 2PI to get the area and output it
        double area = Math.PI * radius * 2;
        //print area
        System.out.println("The area of the circle is " + area);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //get radius from user
        System.out.println("Please enter a radius");
        double radius = input.nextDouble();
        //put the radius into the method
        circleArea(radius);

    }
}
