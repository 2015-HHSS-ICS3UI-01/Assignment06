
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class A6Q1 {                                                     
    public static double circleArea(int r){                          //area of a circle function
        double ans = Math.PI * Math.pow(r,2);
        return ans;                                                  //returns answer
    } 
    public static void main(String[] args) {
        System.out.println("Input a radius");                         //Asks to print radius
        Scanner input = new Scanner(System.in);                       //Create Scanner
        int r = input.nextInt();                                      //Recieves radius
       System.out.println(" A circle with a radius of " + r + " has an area of " + circleArea(r));  //prints statement         
    }
}
