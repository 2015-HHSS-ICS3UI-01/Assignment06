
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class A6Q6 {

   
    
    public static int A6Q6(int d) { 
      return Math.abs(d-((int)(d/10))*10);
}
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter an interger: ");
        int d = input.nextInt();
        
        System.out.println("The last digit is: " + d);
        
    }
}
