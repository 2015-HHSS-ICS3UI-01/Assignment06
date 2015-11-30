
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
public class Question9 {

    // create a method to determine if all the digits in a number are odd when given a number
    public static boolean allDigitsOdd(int number) {
                
        // create a variable to determine if the number is completely odd or not
        // it will first start to be true as the numbers have not been checked yet
        boolean odd = true;

        // create a variable to store the last digit of the number
        int lastDigit;
        
        // Support negative number parm by convert to postive number, this doesn't 
        // impact whether the digits are odd or even
        if ( number < 0) {
            number = number * -1;
        }
        
        // while the digits so far in the number are odd then continue to check the rest of the number
        while( odd ){
            
            // the last digit of the number is the remainder of the number divided by 10
            // this will eliminate the numbers before and keep the last digit
            lastDigit = number % 10;
            
            // the remainder of the last digit divided by 2 will indentify if the number is digit odd or even
            int remainder = lastDigit % 2;
            if (  remainder == 0 ) {
                // digit is even
                odd = false;                          
            } else {
                // digit is even
                odd = true;
            }
            
            // determine if there are remaining digits in the number to check
            // there are additional digits to check if the remaining number is greater than 10
            if ( number > 10 ) {
                // more digits remain, eliminate digit by deviding by 10 and repeat
                number = number / 10;
            } else {
                // else no more digits in number to check, break out of the loop
                break;
            }
        }
        // return whether the number is all odd or not
        return odd;       
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a program that will use a method to inform the user if a number is all odd or not when given a number
        
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        // ask the user to enter a number and store this in a variable
        System.out.print("To determine if a number is odd, enter a number: ");
        int number = input.nextInt();
        
        // create a variable to store the outcome of the method allDigitsOdd
        boolean answer = allDigitsOdd(number);
        
        // if the number is all odd digits then output this to the user
        if(answer == true){
            System.out.println("The number has all odd digits");
        
        // if the number is not all odd digits output this to the user
        } else{
            System.out.println("The number does not have all odd digits");
        }
        
        // close the scanner
        input.close();
    }
    
}
