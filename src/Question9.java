
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
        
        // create a variable to store what the last digit of a number is
        int remainder;
        
        // create a variable to store the last digit of the number
        int lastDigit;
        
        // while the digits so far in the number are odd then continue to check the rest of the number
        while(odd){
            
            // the last digit of the number is the remainder of the number divided by 10
            // this will eliminate the numbers before and keep the last digit
            lastDigit = number % 10;
            
            // the remainder of the last digit divided by 2 will indentify if the number is digit odd or even
            remainder = lastDigit % 2;
            
            // if the remainder is equal to 0 then the last digit is even
            // if it is not even to 0 then it is still odd
            if(remainder != 0 && number > 0){

                // take off the remainder of the number that was just checked
                // this will continue to the next number
                number = (number - lastDigit) / 10;
                
                // if the number now equals 0 then the loop should break
                if(number == 0){
                    break;
                }
                
            // if the remainder is equal to 0 then the number is not all odd
            // therefore odd is false
            }else{
                odd = false;
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
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        // create a variable to store the outcome of the method allDigitsOdd
        boolean answer = allDigitsOdd(number);
        
        // if the number is all odd then output this to the user
        if(answer == true){
            System.out.println("The number is all odd");
        
        // if the number is not all odd output this to the user
        } else{
            System.out.println("The number is not all odd");
        }
        
        // close the scanner
        input.close();
    }
    
}
