/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    public static double Circlearea(double radius) {
        double area = Math.PI * (radius * radius); //formula for area of circle
        return area;                                // returns area calculated
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Circlearea(3); // enter radius of circle
    }
}
