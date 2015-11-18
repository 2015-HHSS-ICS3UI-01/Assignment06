
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hadik9595
 */
public class A6Q9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // generates scanner
        Scanner in = new Scanner(System.in);
        //asks for a digit
        System.out.println("Enter any digit thou desirest!");
        int digit = in.nextInt();
        // Boolean type method returning either true or false statements also this is a cue of execution
        boolean answer = allDigitsOdd(digit);
        System.out.println(answer);
        
    }// An assistant type boolean metohd used to determine if digit is odd or not
    public static boolean allDigitsOdd(int digit){
        
        // just named digit divided to initialize it
        int divided = digit;
        
        // This int is used for selecting last number of digit
        int answer = divided%10;
        
         // A while loop that functions as long as the last digit (answer) is an odd number
       while(answer == 1 || answer == 3 || answer == 5 || answer == 7 || answer == 9){
           
           // This if statement is used crunch down the digit into a single number
           if(divided > 10){
               // divides it by 10 to eliminate last number
              divided = (divided/10);
              // Picks out the new last number then the process repeats
              answer = divided%10;}
           
          // IF no even number found, then it returns as a true statement
           else {
               return true;
               
           }
               
       }
       // returns the statement false if it's an even number located in digit
        return false;
        
    }
}
