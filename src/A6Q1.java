
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A6Q1 {

    /**
     * @param args the command line arguments
     */
    
    public static double circleArea(int r1){
        double ans = Math.PI*(r1*r1);
        return ans;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the radius.");
        int r1 = input.nextInt();
        
        //use the area equation
        double area = circleArea(r1);
        System.out.println("The area of the circle is " + area);
    }
}

