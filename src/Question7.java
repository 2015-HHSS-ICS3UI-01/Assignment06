
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
    
    public static int firstDigit(int number) {
        
        int firstNumber = number;
        
        int lastNumber;
        
        while(firstNumber >= 10){
            lastNumber = number % 10;
            firstNumber = (firstNumber - lastNumber) / 10;
        }
        
        return firstNumber;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner for input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        
        int firstDigitAnswer = firstDigit(number);
        System.out.println("The first digit is " + firstDigitAnswer);
        
        input.close();
    }
    
}
