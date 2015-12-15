
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author whitb0039
 */
public class Q1 {

    public static void circleArea(double r) {
        // TODO code application logic here

        //the double pi*radius^2 
        double area = Math.PI * Math.pow(r, 2);
        //return the value of the double area
        
        //output the answer
        System.out.println("The area of the circle is " + area + " cm² ");

    }

    /**
     * @param args the command line arguments
     */
    //create a method to find the area of a circle
    public static void main(String[] args) {
        //import a scanner
        Scanner input = new Scanner(System.in);
        //ask user for radius
        System.out.println("Please enter the radius of the circle");
        //the radius is the next value entered
        double r = input.nextDouble();
        //the double value of the answer
        circleArea(r);
    }
}
