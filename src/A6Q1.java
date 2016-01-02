

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author watsk8668
 */
public class A6Q1 {

    //function type method to calculate the area of a circle
    public static double circleArea(double radius) {
        //calculate the area of the circle (A=πr^2)
        double area = Math.PI * radius * radius;
        //return the area
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //enter the area & print the area to the screen
        System.out.println(circleArea(3));

    }
}
