
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author whitb0039
 */
public class Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //make a new scanner
        Scanner in = new Scanner(System.in);

        //ask for the grade
        System.out.println("Please enter the number:");

        //input the grade
        int number = in.nextInt();

        //run the method
        int firstDigit = FirstDigit(number);
        
        //output the first digit
        System.out.println("The first digit is " + firstDigit);
    }

    public static int FirstDigit(int firstNumber) {
        if(firstNumber <0){ //if the number is a negative
            firstNumber = firstNumber*-1; //make it a positive
        }
        while(firstNumber > 9){ //while the number is 2 digits
            firstNumber = firstNumber / 10; //divide it by 10 until it is 1 digit
        }
        
        //return the first number
        return firstNumber;
    }
}
