
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q6 {
    
    public static int lastDigit (int n){
        
        //find the remainder when the number is divided by ten
        int i = n%10;
        
        //return that number
        return i;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        //make a new Scanner
        Scanner input = new Scanner (System.in);
        
        //tell the user to enter a number
        System.out.println("Please enter a number.");
        
        //store the number
        int n = input.nextInt();
        
        //activate the method and store the returned value as a new int
        int lastDigit = lastDigit (n);
        
        //tell user the last digit
        System.out.println("The last digit of the number that was entered is " + lastDigit);
        
        //close the scanner
        input.close();
        
    }
}
