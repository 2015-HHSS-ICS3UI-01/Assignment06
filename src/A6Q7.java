/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author dhalt0019
 */
public class A6Q7 {

    public static int firstDigit(int num) {
        
        // if number is negative, multiply it by -1 to make it a positive
         if (num < 0) {

            num = num * (-1);
        }
         // if the number is greater then 10, keep dividing by 10 until its 1 digit
         while ( num >= 10){
             
             num = num / 10;
         }
         
         return num;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Scanner input = new Scanner(System.in);
        // ask the user for a number
        System.out.println("Please enter a number");
        int num = input.nextInt();
        int FD = firstDigit(num);
        // give them the first digit of their number
        System.out.println("The first digit of your number is " + FD);
    }
}
