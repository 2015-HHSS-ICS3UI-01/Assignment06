
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stahc1596
 */
public class Question9 {

    public static int allDigitsOdd(int digit){
        int n = 0;
            digit = digit%10;
            if(digit == 0 || digit == 2 || digit == 4 || digit == 6 || digit == 8){
                n = 1;
            }else{
                n = 0;
            }return n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        while (true){
            int choice = allDigitsOdd(number);
            number = number/10;
            if (choice == 1){
                System.out.println("False");
                break;
           }else if (number < 10){
                System.out.println("True");
                break;
           }
        }
        }
        
    }

