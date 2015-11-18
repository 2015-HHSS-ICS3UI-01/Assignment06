
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
        int lastDigit;
        
        // while the number is still all odd digits then continue to try to find even digits
        while(odd == true){
            // the last digit of the number is the remainder of the number divided by 2
            // this will identify if the last digit is even or odd
            lastDigit = number % 2;
            
            // if the last digit of the number is not 0 then it is still odd 
            if(lastDigit != 0){
                // the number then should be decreased by a digit
                // to do this the number should be subtracted by the last digit of the number
                // then divided by 10 to bring it down a digit
                number = (number - lastDigit) / 10;
                if(number == 0){
                    odd = false;
                    break;
                }
            } else{
                break;
            }
        }
        
        return odd;
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        boolean answer = allDigitsOdd(number);
        
        if(answer == false){
            System.out.println("The number is all odd");
        } else{
            System.out.println("The number is not all odd");
        }
        
        input.close();
    }
    
}
