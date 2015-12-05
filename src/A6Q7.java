
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q7 {
    
    public static int firstDigit (int n){
    
            while (n >= 10 || n <= -10){
            n = n/10;
            }
            
        
      return n;  
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //make a scanner
        Scanner input = new Scanner(System.in);
        
        //tell the user to input a number
        System.out.println("Please enter a number");
        
        //store the number the user enetered in an integer
        int n = input.nextInt();
        
        //activate the method and retru the first digit
        int firstDigit = firstDigit(n);
        
        //tell the user the first digit of the number they entered
        System.out.println("The first digit of the number that was entered is "+firstDigit);
        
        //close the scanner
        input.close();
        
        
    }}

