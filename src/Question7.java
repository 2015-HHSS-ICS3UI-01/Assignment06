

import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mitrm7692
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //Asks user to enter a random number
        System.out.println("Enter a random number");
        //Creates line for random number
        int randNum=input.nextInt();
        //runs new method with chosen number
        int firstDigit=firstDigit(randNum);
        //outputs last digit of random number
        System.out.println("The last digit of the entered number is "+firstDigit );
    }
    //Created method to find first digit of number
    public static int firstDigit(int num){
        //if number is negative it multiplies it by -1
        if(num<0){
            //If the entered number is negative it will multiply it by -1 to make it positive
            num=num*-1;
        }
        //while the entered number is greater than 9 it runs while loop
        while(num>9){
            //while number is greater than 9 it gets the first digit from number
            num=num/10;
        }
        //Returns the first digit of entered number
        return num;
    }
}
