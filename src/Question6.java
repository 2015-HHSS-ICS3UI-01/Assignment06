
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class Question6 {

    public static void lastDigit(int number){
        int lastNumber = number%10;
        System.out.println("The last digit of your number is " + lastNumber);
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = input.nextInt();
        lastDigit(number);
    }
}
