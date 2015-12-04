

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moraj0721
 */
public class A6Q7 {

    public static void firstDigit (int numBer){
       
        //get the first digit from the number
        while(numBer > 9){
                
         numBer = numBer/10;
        }
        
        System.out.println("The first digit of your number is " + numBer);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make the scanner
        Scanner input = new Scanner(System.in);
        
        //ask the user for the number that he wants the first digit from
        System.out.println("Enter the number you want the first digit from.");
        int numBer = input.nextInt();
        
        //run the firstDigit procedure
        firstDigit(numBer);
    }
}
