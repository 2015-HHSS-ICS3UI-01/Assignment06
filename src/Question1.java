
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question1 {

    //Returns the area of the circle aka method to find area of the circle (...to be outputed at the end of the code...) 
    public static void circleArea(double radius) {
        //Calculation to find the area: Pi*(Radius^2)  
        double area = Math.PI * Math.pow(radius, 2);
        //Output the area of the circle
        System.out.println("The area of the circle is " + area + " cm^2 ");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner for input
        Scanner input = new Scanner(System.in);
        //Ask the the person for a radius measurement
        System.out.println("Please enter the radius of the circle");
        //New variable to store the value of the radius
        double radius = input.nextDouble();
        //Return is then outputed to the screen here
        circleArea(radius);
    }
}
