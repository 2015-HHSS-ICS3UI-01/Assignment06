
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
        
        // create a variable to find the last digit of the number
        // the program will get rid of the digits before 
        // as a number divided by 10 will have a remainder of the last digit
        int lastNumber = number % 10;
        
        // return the last digit
        return lastNumber;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will return the last digit of a number using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user what number they would like to find the last digit of and store this in a variable
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        // create a variable to store the return of the method lastDigit and display the result
        int lastDigitAnswer = lastDigit(number);
        System.out.println("The last digit is " + lastDigitAnswer);
        
        // close the scanner
        input.close();
    }

}
