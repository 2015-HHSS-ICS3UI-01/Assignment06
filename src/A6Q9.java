
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sevcm7279
 */
public class A6Q9 {
    
    public static void allDigitsOdd (int e){
            
        //determine if all of the digits are odd
        
        //start counting the odd digits at zero
            int t = 0;
            
            while (e > 0){
        //find the first number        
                int i = e%10;
        //if it is odd        
                if (i == 1 || i == 3 || i == 5 | i == 7 || i == 9){
        //divide by ten to move to the next digit            
                    e = e/10;
        //add a count to show that that is an odd number            
                    t = t +1;
        //if the number becomes zero or below, break            
                        if (e <= 0){
                            break;}
        //if the digit found is an even number, make the count zero and break                
                }else{ t = 0; break;}
                
            }
        //if the count of odd numbers is greater than zero then it is true
                if ( t > 0){
                    System.out.println("True");
        //if the count of odd numbers is zero then it is false            
                }else if (t == 0){
                    System.out.println("False");
           }
    }
        
        
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // make a scanner
        Scanner input = new Scanner (System.in);
        
        //tell the user to enter a set of digits
        System.out.println("Please enter a set of digits. (i.e. 5678554)");
        
        //store the digits in a variable
        int e = input.nextInt();
        
        //activate the method to determine if all of the digits are odd
        allDigitsOdd (e);
        
        //close the scanner
        input.close();
    }
}
