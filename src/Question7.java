
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question7 {

    public static void firstDigit(int number){
        int firstNumber = number/10;
        System.out.println("The first digit of your number is " + firstNumber);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        firstDigit(number);
    }
}
