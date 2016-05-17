
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author RARES
 */
public class Question9 {

    public static boolean DigitsOdd(int number) {
        //Create a loop to repeat the code while the statement remains true 
        while (true) {
            //Look for an odd digit at the end of the number 
            int lastDigit = number % 10;
            if (lastDigit == 9
                    || lastDigit == 7
                    || lastDigit == 5
                    || lastDigit == 3
                    || lastDigit == 1) {
                //Remove last digit and look at second last digit
                number = number / 10;

            }//Look for an even digit at the end of the number 
            if (lastDigit == 8
                    || lastDigit == 6
                    || lastDigit == 4
                    || lastDigit == 2) {

                //If there is an odd number return = false  
                return false;
            }
            //When there are no more numbers to look for end the loop
            if (number == 0) {
                break;
            }
        }
        //If the is an even number return = true
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a new scanner to recieve input
        Scanner input = new Scanner(System.in);
        //Ask for a number
        System.out.println("Please enter a number ");
        //Allow input of the person's number 
        int number = input.nextInt();
        //Send answer back to the bmetho
        boolean num = DigitsOdd(number);
        //Output answer
        System.out.println("" + num);
    }

}
