
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A6Q1 {

    public static double circleArea(int r) {    // creating the method
        double ans = (Math.PI * (r * r));       // the formula to calculate the area of the circle
        return ans;                             // returning the answer 
    }

    public static void main(String[] args) { // the main method

        Scanner input = new Scanner(System.in); // creating a scanner    

        System.out.println("Hello person, please enter the radius of the circle.");     // asking for the radius of the circle
        int r = input.nextInt();        // inputting the radius of the circle
        System.out.println("The area of your circle is " + circleArea(r));      // emitting the area of the circle
    }
}
