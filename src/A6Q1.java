
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author halll7908
 */
public class A6Q1 {

    public static double circleArea(double r) {
        double ans = (Math.PI * (r * r));
        return ans;
    }

    public static void main(String[] args) {
        /**
         * @param args the command line arguments
         */
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter the radius to calculate the area of the circle.");
        double r = input.nextInt();
        double circleArea = circleArea(r);
        System.out.println("The area is " + circleArea);
    }
}