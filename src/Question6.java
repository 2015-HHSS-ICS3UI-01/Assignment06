
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //Asks user to enter a random number
        System.out.println("Enter a random number");
        //Creates line for random number
        int randNum = input.nextInt();
        //runs new method with chosen number
        int lastDigit = lastDigit(randNum);
        //outputs last digit of random number
        System.out.println("The last digit of the entered number is " + lastDigit);
    }
    //Created new method for finding last digit of random number
    public static int lastDigit(int num) {
        //If the number is a negative it runs the if statement
        if (num < 0) {
            //If the entered number is negative it will multiply it by -1 to make it positive
            int number = num * -1;
            //returns the last digitof entered number
            return number % 10;
        }
        //returns the last digit of entered number
        return num % 10;
    }
}
