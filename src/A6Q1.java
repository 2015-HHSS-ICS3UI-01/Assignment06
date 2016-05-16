
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author voigr4865
 */
public class A6Q1 {

    public static double area(int r) {//the main method that lets all of this happen
        double ans = Math.pow(r, 2) * Math.PI;//after the radius is entered it takes thye radius and squares it then times it by 5
        return ans;//returns the answer
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);//main scanner to input numbers
        System.out.println("Please enter the radius of the circle");//asks the user to input the radius
        int r = input.nextInt();//the integer for the radius
        double area = area(r);//uses the formula in the main method to find the area of a circle
        System.out.println("The area of the circle is " + area);//prints the area of the circle


    }
}
