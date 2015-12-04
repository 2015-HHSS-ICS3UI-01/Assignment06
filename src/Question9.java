
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mitrm7692
 */
public class Question9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);
        //Asks user for a number
        System.out.println("Please enter a number");
        //created integer for number
        int num = input.nextInt();
        //Uses boolean method with entered number
        boolean allDigitsOdd = allDigitsOdd(num);
        //if all digits are odd
        if (allDigitsOdd) {
            //Outputs "All the entered digits are odd."
            System.out.println("All the digits are odd.");
            //If allDigitsOdd is false
        } else {
            //Outputs "All of the entered digits are not odd."
            System.out.println("All the digits are not odd.");
        }
    }

    public static boolean allDigitsOdd(int randNum) {
        //created boolean digits start true
        boolean digits = true;
        //while the random number is greater than nine the loop runs
        while (randNum > 1) {
            //Looks at the last digit of the entered number
            int lastNum = randNum % 10;
            //if the digits are odd
            if (lastNum == 1
                    || lastNum == 3
                    || lastNum == 5
                    || lastNum == 7
                    || lastNum == 9) {
                //the boolean is true
                digits = true;
            } else {
                //if the digits are not odd the boolean is false
                digits = false;
                //stops method
                break;
            }
            //Divides the number by 10 to check for the next number
            randNum = randNum / 10;
        }
        //returns value of boolean digits
        return digits;
    }
}
