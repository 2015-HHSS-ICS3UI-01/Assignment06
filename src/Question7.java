
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
    // create a mthod that will determine the first digit of a number when given the  number requested by the user
    public static int firstDigit(int number) {
        
        // store in a variable that will determine the first digit of the number
        int firstNumber = number;
        
        // store in a variable the last digit of a number
        int lastNumber;
        
        // while the first number is greater than 10 then continue the process of finding the first digit
        while(firstNumber >= 10){
            // the program will get rid of the digits before the last digit
            // as a number divided by 10 will have a remainder of the first digit
            lastNumber = number % 10;
            // the first digit number will decrease a digit to continue the process of obtaining just the first digit
            // by subtracting the last digit by the first digit to get the last digit of the number to a value of 0
            // and then dividing it by 10 to get rid of that last digit
            firstNumber = (firstNumber - lastNumber) / 10;
        }
        // return the first digit
        return firstNumber;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will obtain a number and determine the first digit of that number using a method
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user the number they wish to find the first digit of and store this in a variable
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        // create a variable to store outcome of the mehtod firstDigit and display the outcome
        int firstDigitAnswer = firstDigit(number);
        System.out.println("The first digit is " + firstDigitAnswer);
        
        // close the scanner
        input.close();
    }
    
}
