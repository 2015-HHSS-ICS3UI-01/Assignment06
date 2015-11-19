
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
    Double area = Math.PI*radius*radius;
    return area;
}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a radius for your circle.");
        double radius = input.nextDouble();
        double answer = CircleA(radius);
        System.out.println("Therefore the area of the circle is " + answer);
    }
}
