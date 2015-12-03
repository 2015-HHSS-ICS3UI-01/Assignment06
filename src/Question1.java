/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double radius = 5;
        double radiussquared = (radius * radius);
        double ans = circleArea(3.14159265359, radiussquared);
        System.out.println(ans);
        
    }
//created a new method called circleArea that multiplies pi and the radius(given) squared

    public static double circleArea(double pi, double radiussquared) {

        //created a variable named area that is equal to pi multiplied by the radius(given) squared
        double area = (pi * radiussquared);
        //returns area to the screen     
        return area;
    }
}
