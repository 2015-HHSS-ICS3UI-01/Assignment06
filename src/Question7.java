
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class Question7 {
    
    // create a method that will determine the first digit of a number when given the  number requested by the user
    public static int firstDigit(int number) {
        
        // To determine first digit of a number, the digit is not impacted
        // by whether number is positive or negative so make the number 
        // a positive number to simplify the later loop
        if ( number < 0 ) {
            number = number * -1;
        }
        
        // To determine the first digit of the number, continue dividing the 
        // number by 10 until the result can no longer be divided by 10.
        while ( number >= 10) {
            number = number / 10;
        }
   
        return number;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will obtain a number and determine the first digit of that number using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user the number they wish to find the first digit of and store this in a variable
        System.out.print("To determine the first digit of a number, enter the number: ");
        int number = input.nextInt();
        
        // create a variable to store outcome of the mehtod firstDigit and display the outcome
        int firstDigitAnswer = firstDigit(number);
        System.out.println("The first digit is " + firstDigitAnswer);
        
        // close the scanner
        input.close();
    }
    
}
