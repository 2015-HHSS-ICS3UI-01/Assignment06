
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner 
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a number you want to return: ");
        int number = in.nextInt();

        // Finding out the final number after using the first Digit method
        int result = firstDigit(number);
        System.out.println(result);

    }

    // Using the Return Method
    public static int firstDigit(int number) {

        // Divides the intial number typed in by 10
        int result = number / 10; 

        // If the first digit is negative then you multiply that number with a negative
        if (result < 1) {
            result = (result) * (-1);
        }
        // The intial number continuesly divides by 10 
        while (result > 10) {
            result = result / 10;

            // if the first digit equals a number less then 10 then it stops 
            if (result <= 10) {
                break;
            }
        }
        System.out.println("The First Number is: ");
        // Returns the answer 
        return result;



    }
}
