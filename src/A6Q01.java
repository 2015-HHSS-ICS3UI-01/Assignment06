
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author iorgs3184
 */
public class A6Q01 {

    // 
    public static double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new scanner
        Scanner input = new Scanner(System.in);
        //Asks user for radius of circle
        System.out.println("Please enter the radius of the circle ");
        double radius = input.nextDouble();

        //answer is sent to method then calculated
        double answer = circleArea(radius);

        //tells user the area of the circle
        System.out.println("The area of the circle is " + answer);
    }
}
