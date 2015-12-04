
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author moraj0721
 */
public class A6Q1 {

    public static double areaCircle(double r) {
        //Calculate the area of the circle
        double area = Math.PI * r * r;
        return area;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a scanner
        Scanner input = new Scanner(System.in);

        // ask the user for the radius
        System.out.println("Please enter the radius of the circle");
        double r = input.nextDouble();
        double answer = areaCircle(r);

        //Give the area of the circle
        System.out.println("The area of the circle is " + answer);
    }
}
