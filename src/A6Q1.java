
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A6Q1 {

    public static double area(double radius) {
        //calculate area which is πr^2
        double ans = Math.PI * Math.pow(radius, 2);
        return ans;
    }

    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            //aske user for radius of circle
            System.out.println("Please input radius of circle");
            double rad = input.nextDouble();
            //bring area from method above
            double ans = area(rad);
            //print the area
            System.out.println("Area of your circle is " + ans);
        }
    }
}
