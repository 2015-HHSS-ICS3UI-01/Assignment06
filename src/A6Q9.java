
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
            int t = 0;
        //determine if all of the digits are odd
        while (e > 0){
           
           int i = e%10;
           if (i == 1 || i == 3 || i == 5 || i == 7 || i == 9){
               e = e - i;
               t = t ++;
           }else if (i == 0 || i == 2 || i == 4 || i == 6 || i == 8){ 
               System.out.println("false");
               t = 0;
               break;
           }
            
        }
        if (t > 0){
        System.out.println("true");
        
        
    }}
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
