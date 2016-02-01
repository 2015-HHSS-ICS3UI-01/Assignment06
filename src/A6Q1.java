/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fitws6356
 */
public class A6Q1 {

    public static double circleArea(double radius) {
        //create the method and return type
        //the area of a circle = 3.14(radius)^2
        double circleArea = Math.pow(radius, 2) * 3.14;
        return circleArea;
    }

    public static void main(String[] args) {
        //create the input for the radius
        double answer = circleArea(2);
        System.out.println(answer);

    }
}