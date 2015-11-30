
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
public class Question6 {
    
    // create a method that will determine the last digit of a number when given that number
    public static int lastDigit(int number) {

        // To determine last digit of a number, the digit is not impacted
        // by whether number is positive or negative so make the number 
        // a positive number to simplify the later loop
        if ( number < 0 ) {
            number = number * -1;
        }
        
        // create a variable to find the last digit of the number
        // as a number divided by 10 will have a remainder of the last digit
        int digit = number % 10;
        
        // return the last digit
        return digit;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will return the last digit of a number using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what number they would like to find the last digit of and store this in a variable
        System.out.print("To determine the last digit of a number, enter the number: ");
        int number = input.nextInt();
        
        // create a variable to store the return of the method lastDigit and display the result
        int lastDigitAnswer = lastDigit(number);
        System.out.println("The last digit is " + lastDigitAnswer);
        
        // close the scanner
        input.close();
    }

}
