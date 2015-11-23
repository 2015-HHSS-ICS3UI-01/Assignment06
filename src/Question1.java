
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question1 {

public static double CircleA(double radius){
    //The formula for finding the area of a circle.
    Double area = Math.PI*radius*radius;
    //The answer is returned to the main method.
    return area;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius for your circle.");
        //The user enters a radius of their choosing.
        double radius = input.nextDouble();
        //The answer is solved through a process in the CircleA method above.
        double answer = CircleA(radius);
        System.out.println("Therefore the area of the circle is " + answer);
    }
}
