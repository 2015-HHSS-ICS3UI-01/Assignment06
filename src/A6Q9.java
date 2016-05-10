
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tatad6701
 */
public class A6Q9 {

    public static void allDigitsOdd(int nums) {
        // Change a number to string
        String number = Integer.toString(nums);
        // Create boolean
        boolean allOdd = true;
        // For loop checks all numbers of the user's input from the beginning
        for (int i = 0; i > number.length(); i++) {
            char lastNum = number.charAt(i);
            // check if last digit is odd, if it is, then remove digit by dividing by 10
            if (lastNum == 1 || lastNum == 3 || lastNum == 5 || lastNum == 7) {
            } else {
                // If all numbers aren't the ones listed above, then the method is false (all numbers are even)
                allOdd = false;
            }
        }
        if (allOdd == true) {
            // Print out true if all numbers are odd
            System.out.println("True");
        } else {
            // Print out false if there is a even number
            System.out.println("False");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create new Scanner 
        Scanner input = new Scanner(System.in);
        // Ask the user to enter a number
        System.out.println("Please enter a number");
        // Save the user's input under variable 'userInput'
        int userInput = input.nextInt();
        // 'Return' the method from above
        allDigitsOdd(userInput);
    }
}
