
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author preej0747
 */
public class Question9 {

    public static void allDigitsOdd(int number) {
        for(;number > 0; number = number/10){
            int digit = number % 10;
            if (digit == 0 || digit == 2 || digit == 4 || digit == 6 || digit == 8) {
                System.out.println("False");
            } else {
                System.out.println("True");
            }

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        allDigitsOdd(number);
    }
}
