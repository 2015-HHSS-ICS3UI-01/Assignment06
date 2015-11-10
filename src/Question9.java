
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

    public static boolean allDigitsOdd(int number) {
        boolean odd = false;
        int lastDigit;
        while(odd == false){
            lastDigit = number % 2;
            if(lastDigit != 0){
                number = (number - lastDigit) / 10;
                if(number == 0){
                    break;
                }
            } else{
                odd = true;
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
        
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        
        boolean answer = allDigitsOdd(number);
        
        if(answer == false){
            System.out.println("The number is all odd");
        } else{
            System.out.println("The number is not all odd");
        }
    }
    
}
