
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kulla6503
 */
public class A6Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // New Scanner
        Scanner in = new Scanner(System.in);

        // Output our sentence to the user letting them know what they entered
        System.out.println("Enter a number you want to return: ");
        int number = in.nextInt();

        // Finding out the final number after using the lastDigit method
        int result = lastDigit(number);
        System.out.println(result);
    }

    // Using Last Digit Method
    public static int lastDigit(int number) {
        {
            int result = number % 10;
            if (result > 0) {
                return result;
            } else {
                int answer = (result * -1);
                return answer;
            }
        }
    }
}
