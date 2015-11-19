
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question6 {
    
    public static int lastDigit(int digit){
        digit = digit%10;
        return digit;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Input a number:");
        int number = input.nextInt();
        int lastNumber = lastDigit(number);
        System.out.println("The last number is " + lastNumber);
    }
}
