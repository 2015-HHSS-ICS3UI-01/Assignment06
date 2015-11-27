
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pircn0556
 */
public class Q7 {

    public static int firstDigit(int first) {
        //Finds number to be able to find first digit
        while (first > 10) {
            //If number is greater than 10, divides by 10 to make smaller
            if (first > 10) {

                first = first / 10;
                //If number is already within 0 and 10 it breaks
            } else if (first < 10 && first >= 0) {
                break;
            }
        }
        //Returns number, able to output
        return first;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        //user inputs number
        int first = input.nextInt();
        //Does the method "first digit" to number
        first = firstDigit(first);
        //Outputs number
        System.out.println("The first digit is " + first);
    }
}
