
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author howen2217
 */
public class Question7 {
    //create a method to find the first digit of a number

    public static void firstDigit(int number) {
        int firstdigit = number;
        //divid the first digit by 10 until it is less than 10
        while (firstdigit > 10 || firstdigit < -10) {
            firstdigit = firstdigit / 10;
        }
        //if it's a negative convert to a positive
        if (firstdigit < 0) {
            firstdigit = firstdigit * -1;
        }
        System.out.println("The first digit of " + number + " is " + firstdigit);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //input number and insert it into the method
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a number");
        int number = input.nextInt();
        firstDigit(number);
    }
}
