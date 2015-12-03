
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            
             // get two random double numbers
            double x = Math.random();
            double y = Math.random();

   // print the numbers and print the higher one
   System.out.println("Random number 1:" + x);
   System.out.println("Random number 2:" + y);
   System.out.println("Highest number:" + Math.max(x, y));
   }
            
    }

